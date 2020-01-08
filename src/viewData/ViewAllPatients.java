package viewData;

import soft252amartin.EPersonType;
import static viewData.ViewData.getAllPersonsPerticulars;

public class ViewAllPatients 
{
    public static String[] getAllPatientInfo()
    {
        return getAllPersonsPerticulars(EPersonType.Patient);
    }
}
