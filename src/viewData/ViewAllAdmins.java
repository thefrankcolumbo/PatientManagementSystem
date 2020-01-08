package viewData;

import soft252amartin.EPersonType;
import static viewData.ViewData.getAllPersonsPerticulars;

public class ViewAllAdmins 
{
    public static String[] getAllAdminsInfo()
    {
        return getAllPersonsPerticulars(EPersonType.Administrator);
    }
}
