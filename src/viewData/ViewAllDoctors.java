package viewData;

import soft252amartin.EPersonType;
import static viewData.ViewData.getAllPersonsPerticulars;


public class ViewAllDoctors 
{
    public static String[] getAllDoctorsInfo()
    {
        return getAllPersonsPerticulars(EPersonType.Doctor);
    }
}
