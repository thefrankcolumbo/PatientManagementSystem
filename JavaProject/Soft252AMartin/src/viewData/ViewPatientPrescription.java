package viewData;

import soft252amartin.EPersonType;
import soft252amartin.ERequiredDataWithinFile;
import static viewData.ViewData.getData;

public class ViewPatientPrescription 
{
    public static String[] viewPrescriptionList(String userID)
    {
        return getData(userID, EPersonType.Patient, ERequiredDataWithinFile.PRESCRIPTION);
    }
}
