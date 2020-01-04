package changeData;

import soft252amartin.EPersonType;
import static fileManagement.AmendFile.appendStringToFile;
import soft252amartin.ERequiredData;

public class AddDataToFile 
{
    /**
     * Method to add data to the next line of a current user data file.
     * Returns True if successful.
     * Returns False if unsuccessful or file doesn't exist.
     * @param userID
     * @param newData
     * @param personType
     * @return boolean
     */
    protected static boolean addToFile(String userID, String newData, EPersonType personType)
    {
        //make path
        String path = ("res\\" + personType + "\\" + userID + ".csv");
        try 
        {
            //append to file
            appendStringToFile(path, newData);
            return true;
        } 
        catch (Exception e) 
        {
            //log file ??
            return false;
        }
    }
    /**
     * Method to add a message to a message file.
     * Returns true if successful.
     * Returns false if unsuccessful or file does not exist.
     * @param newData
     * @param requiredData
     * @param personType
     * @return 
     */
    protected static boolean addToFile(String newData, ERequiredData requiredData, EPersonType personType)
    {
        //make path
        String path = ("res\\" + personType + "\\" + requiredData.toString() + ".txt");
        try 
        {
            //append to file
            appendStringToFile(path, newData);
            return true;
        } 
        catch (Exception e) 
        {
            //log file ??
            return false;
        }
    }
}
