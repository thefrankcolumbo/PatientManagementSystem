
package passwordUserID;

import static fileManagement.AmendFile.appendStringToFile;
import static fileManagement.MakeFile.makeFile;
import soft252amartin.EPersonType;

public class MakeUser 
{
    /**
     * Method to create a new user. 
     * The new userID will be returned.
     * A new entry onto the userID password table will be created.
     * Password must be in plain text.
     * @param givenName String
     * @param surname String
     * @param addressLine1 String
     * @param addressLine2 String
     * @param addressLine3 String
     * @param addressPostcode String
     * @param DOB String
     * @param personType EPersonType
     * @param password String
     * @return String
     */
    public static String makeAUser(String givenName, String surname, String addressLine1, 
            String addressLine2, String addressLine3, String addressPostcode, 
            String DOB, EPersonType personType, String password)
    {
        // get a unique ID
        String userID = createUniqueIdentifier(String.valueOf(personType).substring(0, 1));
        // hash user password and make entry on to userID/Password table
        createUserIDAndHashedPassword(userID, password);
        // create the data string for the user file
        String dataString = createDataArray(givenName, surname, addressLine1, addressLine2, addressLine3, 
                addressPostcode, DOB, personType, userID);
        // make the new file for the user
        createDataFile(dataString, userID, String.valueOf(personType));
        
        return userID;
    }
    private static String createUniqueIdentifier(String letter)
    {
        CheckUserAndPasswords checkUserAndPasswords = new CheckUserAndPasswords();
        String userID = checkUserAndPasswords.checkForNextAvailableUserID(letter);
        return userID;
    }
    private static String createDataArray(String givenName, String surname, String addressLine1, 
            String addressLine2, String addressLine3, String addressPostcode, 
            String DOB, EPersonType personType, String userID)
    {
        String dataString = (givenName + "," + surname + "," + addressLine1 
                + "," + addressLine2 + "," + addressLine3 + "," 
                + addressPostcode + "," + DOB + "," + String.valueOf(personType) 
                + "," + userID);
        return dataString;
    }
    private static String[] cleanData (String[] dataArray)
    {
        for (String element: dataArray)
        {
            element = element.replace(",", "");
            element = element.replace("\\", "");
        }
        return dataArray;
    }
    private static void createDataFile(String dataString, String userID, String personType)
    {
        String path = "res\\" + personType + "\\" + userID + ".csv";
        makeFile(dataString, path, "");
    }
    private static void createUserIDAndHashedPassword(String userID, String password)
    {
        CheckUserAndPasswords checkUserAndPasswords = new CheckUserAndPasswords();
        String hashedPassword = checkUserAndPasswords.hashPassword(password);
        addUserAndPasswordToUserPasswordTable(userID, hashedPassword);
    }
    private static void addUserAndPasswordToUserPasswordTable(String userID, String hashedPassword)
    {
        String lineToBeWritten = userID.trim() + " " + hashedPassword.trim();
        String path = "res\\resources\\userIDPasswordTable.txt";
        appendStringToFile(path, lineToBeWritten);
    }
}
