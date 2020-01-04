
package changeData;

import static fileManagement.AmendFile.apendStringToFile;
import soft252amartin.EPersonType;

public class AddDataToUserFile 
{
    protected static void addToFile(String userID, String newData, EPersonType personType)
    {
        //make path
        String path = ("res\\" + personType + "\\" + userID + ".csv");
        //append to file
        apendStringToFile(path, newData);
    }
    
}
