
package passwordUserID;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import soft252amartin.EPersonType;


public class MakeUser 
{
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
    private static void createDataFile(String dataString, String userID, String personType)
    {
        String path = "res\\" + personType + "\\" + userID + ".txt";
        File file = new File(path);
        try 
        {
            file.createNewFile();
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(dataString);
            bw.close();
        } 
        catch (Exception e) 
        {
            System.out.println("catch at createDataFile " + e);
            // log file ??
        }
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
        try 
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter("res\\resources\\userIDPasswordTable.txt", true));
            
            bw.write(lineToBeWritten);
            bw.newLine();
            bw.flush();
        } 
        catch (Exception e) 
        {
            System.out.println("catch at addUserAndPasswordToUserPasswordTable");
        }
    }
}
