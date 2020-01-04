package viewData;

import soft252amartin.ERequiredData;
import soft252amartin.EPersonType;
import static viewData.ViewData.getData;

public class ViewPatientNotes 
{
    /**
     * Method to get the notes of a Patient.
     * Will return an array with one element containing "NO NOTES'S" if there are no notes
     * @param userID String
     * @return String[]
     */
    public static String[] viewPatientNotes(String userID)
    {
        String[] data = getData(userID, EPersonType.Patient, ERequiredData.NOTES);
        return data;
    }
}
