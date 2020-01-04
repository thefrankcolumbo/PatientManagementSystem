
package viewData;

import soft252amartin.EPersonType;
import static viewData.ViewData.getData;

public class ViewPatientNotes 
{
    public static String[] viewPatientNotes(String userID)
    {
        String[] data = getData(userID, EPersonType.Patient, ERequiredData.NOTES);
        return data;
    }
}
