
package passwordUserID;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class CheckLogin 
{
    private String[] userPasswordList = null;
    private int userPasswordListElement;
    
    public CheckLogin()
    {
        setUserPasswordList();
    }
    
    /**
     * Checks a user name exists and then if the input password matches.
     * Will return true if:
     * 1) username exists
     * 2) the password matches the username
     * Will return false in all other circumstances
     * @param userName
     * @param inputPassword
     * @return boolean
     */
    public boolean checkUserNameAndPassword(String userName, String inputPassword)
    {
        boolean success = checkUserNameExists(userName);
        if (success) success = masterCheckPassword(inputPassword);
        
        return success;
    }
    private boolean checkUserNameExists(String userName)
    {
        boolean success = false;
        for (int x = 0; x < userPasswordList.length; x++)
        {
            if (userName.equals(userPasswordList[x].substring(0,5)))
            {
                userPasswordListElement = x;
                success = true;
            }
        }
        return success;
    }
    private boolean masterCheckPassword(String inputPassword)
    {
        String userInputHash = hashInputPassword(inputPassword);
        String password = userPasswordList[userPasswordListElement].substring(6, 38);
        if (password.equals("X")) return false;
        return userInputHash.equals(password);
    }
    private String hashInputPassword(String inputPassword)
    {
        String generatedHash = null;
        try 
        {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(inputPassword.getBytes());
            //Get the hash's bytes 
            byte[] bytes = md.digest();
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedHash = sb.toString();
        }
        catch (NoSuchAlgorithmException e) 
        {
            generatedHash = "X";
        }
        return generatedHash;
    }
    private void setUserPasswordList()
    {
        try 
        {
            File file = new File("res\\resources\\userIDPasswordTable.txt");
            FileInputStream fis = new FileInputStream(file);
            byte[] byteArray = new byte[(int)file.length()];
            fis.read(byteArray);
            String data = new String(byteArray);
            userPasswordList = data.split("\r\n");
        } 
        catch (Exception e) 
        {
            // log file????
        }
    }
}
