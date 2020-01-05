package viewData;

import soft252amartin.EPersonType;
import soft252amartin.ERequiredDataWithinFile;
import static viewData.ViewData.getMessages;

public class viewSecretaryMessages 
{
    public static String[] getSecretaryMessages()
    {
        String path = "res\\" + EPersonType.Secretary + "\\" + ERequiredDataWithinFile.MESSAGE + ".csv";
        return getMessages(EPersonType.Secretary, path);
    }
}
