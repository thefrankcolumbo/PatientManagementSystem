package changeData;

import static changeData.AddDataToFile.addToFile;
import soft252amartin.EPersonType;
import soft252amartin.ERequiredDataWithinFile;

public class MessagePatient 
{
    /**
     * Method to make a message for a patient.
     * Returns true is message made successfully.
     * @param patientID String
     * @param message String
     * @return boolean
     */
    public static boolean makePatientMessage(String patientID, String message)
    {
        String newData = ERequiredDataWithinFile.MESSAGE + ", " + message;
        return addToFile(patientID, newData, EPersonType.Patient);
    }
}
