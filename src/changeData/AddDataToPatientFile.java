package changeData;

import static changeData.AddDataToFile.addToFile;
import soft252amartin.EPersonType;
import soft252amartin.ERequiredDataWithinFile;

public class AddDataToPatientFile 
{
    /**
     * Method to add data to the next line of a current patients user file
     * Returns True if successful.
     * Returns False if unsuccessful or file doesn't exist.
     * @param userID String
     * @param newData String
     * @param doctorSurname String
     * @return boolean
     */
    public static boolean addPatientNotes(String userID, String newData, String doctorSurname)
    {
        String cleanedData = cleanNewDataForNotes(newData, doctorSurname);
        return addToFile(userID, cleanedData, EPersonType.Patient);
    }
    /**
     * Method to add a new prescription to a patients notes.
     * @param medicineName
     * @param quantity
     * @param timeFrame
     * @param notes
     * @param patientID
     * @return 
     */
    public static boolean addPatientPrescriptionToNotes(String medicineName, 
            String quantity, String timeFrame, String notes, String patientID)
    {
        String newData = createPrescriptionString(medicineName, quantity, timeFrame, notes);
        return addToFile(patientID, newData, EPersonType.Patient);
    }
    private static String createPrescriptionString(String medicineName, 
            String quantity, String timeFrame, String notes)
    {
        String entryType = ERequiredDataWithinFile.PRESCRIPTION.toString();
        String comma = ",";
        String status = "OPEN";
        String dataString = entryType + comma + status + comma + medicineName 
                + comma + quantity + comma + timeFrame + comma + notes;
        return dataString;
    }
    private static String cleanNewDataForNotes(String newData, String doctorSurname)
    {
        String entryType = ERequiredDataWithinFile.NOTES.toString();
        String comma = ",";
        String dataString = entryType + comma + doctorSurname + comma + newData;
        return dataString;
    }
}
