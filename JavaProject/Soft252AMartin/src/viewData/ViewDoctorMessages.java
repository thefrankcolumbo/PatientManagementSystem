package viewData;

import soft252amartin.EPersonType;
import soft252amartin.ERequiredDataWithinFile;
import static viewData.ViewData.getMessages;

public class ViewDoctorMessages 
{
    public static String[] getDoctorMessages()
    {
        String path = "res\\" + EPersonType.Doctor + "\\" + ERequiredDataWithinFile.MESSAGE + ".csv";
        return getMessages(path);
    }
}
