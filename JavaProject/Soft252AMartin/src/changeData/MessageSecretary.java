package changeData;

import static changeData.AddDataToFile.addToFile;
import soft252amartin.EPersonType;
import soft252amartin.ERequiredDataWithinFile;

public class MessageSecretary 
{
   /**
    * Method to send message to all Secretaries.
    * Return true if message sent.
    * Return false if unsuccessful.
    * @param newData
    * @return boolean
    */
   public static boolean addMessage(String newData)
   {
       return addToFile(newData, ERequiredDataWithinFile.MESSAGE, EPersonType.Secretary);
   }
}
