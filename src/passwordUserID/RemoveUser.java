
package passwordUserID;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import soft252amartin.EPersonType;

public class RemoveUser 
{
    /**
     * Method to remove a user.
     * will return true on successful removal
     * This is a permanent removal.
     * @param userID String
     * @param personType EPersonType
     * @return boolean
     */
    public static boolean removeUser(String userID, EPersonType personType)
    {
        boolean userRemoved = removeUserFromUserIDAndPasswordTable(userID);
        removeUserData(userID, personType);
        if(userRemoved) userRemoved = checkUserDataFileHasBeenDeleted(userID, personType);
        if(userRemoved) userRemoved = checkUserHasBeenDeletedFromUserIDPasswordTable(userID);
        return userRemoved;
    }
    private static boolean removeUserFromUserIDAndPasswordTable(String userID)
    {
        try 
        {
            File path = new File("res\\resources\\userIDPasswordTable.txt");
            File tempFile = new File("res\\resources\\userIDPasswordTableTemp.txt");
            
            BufferedReader reader = new BufferedReader(new FileReader(path));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.isEmpty())continue;
                if (!line.startsWith(userID)) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            reader.close();
            writer.close();
            path.delete();
            tempFile.renameTo(path);
            return true;
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
            Logger.getLogger(RemoveUser.class.getName()).log(Level.SEVERE, null, ex);
            return  false;
        }
    }
    private static void removeUserData(String userID, EPersonType personType)
    {
        File file = new File("res\\" + personType + "\\" + userID + ".csv");
        file.delete();
    }
    private static boolean checkUserHasBeenDeletedFromUserIDPasswordTable(String UserID)
    {
        CheckUserAndPasswords checkUserAndPasswords = new CheckUserAndPasswords();
        return !checkUserAndPasswords.checkUserNameExist(UserID);
    }
    private static boolean checkUserDataFileHasBeenDeleted(String userID, EPersonType personType)
    {
        File file = new File("res\\" + personType + "\\" + userID + ".csv");
        return !file.exists();
    }
}
