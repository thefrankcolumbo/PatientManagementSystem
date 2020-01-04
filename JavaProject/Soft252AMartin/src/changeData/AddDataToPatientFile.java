
package changeData;

import static changeData.AddDataToUserFile.addToFile;
import soft252amartin.EPersonType;

public class AddDataToPatientFile 
{
    public static boolean addPatientReview(String userID, String newData[])
    {
        String cleanedData = cleanNewData(newData);
        return addToFile(userID, cleanedData, EPersonType.Patient);
    }
    private static String cleanNewData(String[] newData)
    {
        String cleanedData = "NOTES,";
        for (String element : newData)
        {
            cleanedData = cleanedData + element;
        }
        return cleanedData;
    }
}
