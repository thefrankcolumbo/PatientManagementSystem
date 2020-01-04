
package changeData;

import static changeData.AddDataToUserFile.addToFile;
import soft252amartin.EPersonType;


public class AddDataToDoctorFile 
{
    public static boolean addDoctorReview(String userID, String newData)
    {
        return addToFile(userID, newData, EPersonType.Doctor);
    }
}
