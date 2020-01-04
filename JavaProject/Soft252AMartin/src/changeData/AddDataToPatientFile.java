
package changeData;

import static changeData.AddDataToUserFile.addToFile;
import soft252amartin.EPersonType;

public class AddDataToPatientFile 
{
    public static boolean addPatientReview(String userID, String newData)
    {
        return addToFile(userID, newData, EPersonType.Patient);
    }
}
