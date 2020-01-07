package viewData;

import soft252amartin.EPersonType;
import static viewData.ViewData.getAllPersonsPerticulars;

public class ViewAllSecretarys 
{
    public static String[] getAllSecretaryInfo()
    {
        return getAllPersonsPerticulars(EPersonType.Secretary);
    }
}
