
package changeData;

import static fileManagement.AmendFile.apendStringToFile;
import soft252amartin.EPersonType;

public class AddDataToUserFile 
{
    protected static boolean addToFile(String userID, String newData, EPersonType personType)
    {
        //make path
        String path = ("res\\" + personType + "\\" + userID + ".csv");
        try 
        {
            //append to file
            apendStringToFile(path, newData);
            return true;
        } 
        catch (Exception e) 
        {
            //log file ??
            return false;
        }
    }
}
