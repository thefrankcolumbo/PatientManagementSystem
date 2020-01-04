
package changeData;

import static changeData.AddDataToUserFile.addToFile;
import soft252amartin.EPersonType;


public class AddDataToDoctorFile 
{
    public static boolean addDoctorReview(String userID, String[] newData)
    {
        String cleanedData = cleanNewData(newData);
        return addToFile(userID, cleanedData, EPersonType.Doctor);
    }
    private static String cleanNewData(String[] newData)
    {
        String cleanedData = "REVIEW,";
        for (String element : newData)
        {
            cleanedData = cleanedData + element;
        }
        return cleanedData;
    }
}
