package viewData;

import soft252amartin.EPersonType;
import soft252amartin.ERequiredDataWithinFile;
import static viewData.ViewData.getData;

public class ViewPatientMessages 
{
    /**
     * Method to get patient messages.
     * If there are no messages then NO MESSAGES is return as the only element in array
     * @param userID String
     * @return String[]
     */
    public static String[] getPatientMessages(String userID)
    {
        return getData(userID, EPersonType.Patient, ERequiredDataWithinFile.MESSAGE);
    }
}
