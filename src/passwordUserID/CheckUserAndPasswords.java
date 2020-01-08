package passwordUserID;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Vector;

public class CheckUserAndPasswords 
{
    private String[] userPasswordList = null;
    private Vector usedIDVector;// = null;
    private int userPasswordListElement;
    private String userID;
    
    public CheckUserAndPasswords()
    {
        setUserPasswordList();
    }
    
    /**
     * Checks a user name exists and then if the input password matches.
     * Will return true if:
     * 1) username exists
     * 2) the password matches the username
     * Will return false in all other circumstances
     * @param userName String
     * @param inputPassword String
     * @return boolean
     */
    public boolean checkUserNameAndPassword(String userName, String inputPassword)
    {
        boolean success = checkUserNameExists(userName);
        if (success) success = masterCheckPassword(inputPassword);
        return success;
    }
    /**
     * method to hash a string
     * @param unhashedPassword String
     * @return String
     */
    public String hashPassword(String unhashedPassword)
    {
        return hashInputPassword(unhashedPassword);
    }
    /**
     * check if user name already exists
     * @param userName String
     * @return boolean
     */
    public boolean checkUserNameExist(String userName)
    {
        return checkUserNameExists(userName);
    }
    /**
     * Checks for the next available userID for a spefic PersonType
     * @param personType String
     * @return String
     */
    public String checkForNextAvailableUserID(String personType)
    {
        String freeNumber = "0001";
        System.out.println(userPasswordList.length);
        System.out.println(userPasswordList[0]);
        if(userPasswordList[0] != null)
        {
            usedIDVector = new Vector();
            getCurrentUsedID(personType);
            freeNumber = createNextUserID();
        }
        
        return personType + freeNumber;
    }
    private String createNextUserID()
    {
        boolean freeNumber = false;
        int nextFreeNumber = 0;
        while (!freeNumber)
        {
            nextFreeNumber++;
            freeNumber = !usedIDVector.contains(nextFreeNumber);
        }
        String freeNumberString = String.valueOf(nextFreeNumber);
        return ("0000" + freeNumberString).substring(freeNumberString.length());
    }
    private void getCurrentUsedID(String personType)
    {
       
        for (int x = 0; x < userPasswordList.length; x++)
        {
            if (personType.equals(userPasswordList[x].substring(0,1)))
            {
                int y = Integer.parseInt(userPasswordList[x].substring(1,5));
                usedIDVector.add(y);
            }
        }
    }
    private boolean checkUserNameExists(String userName)
    {
        boolean success = false;
         if(userPasswordList[0] != null)
        {
            for (int x = 0; x < userPasswordList.length; x++)
            {
                if (userName.equals(userPasswordList[x].substring(0,5)))
                {
                    userPasswordListElement = x;
                    this.userID = userName;
                    success = true;
                }
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
