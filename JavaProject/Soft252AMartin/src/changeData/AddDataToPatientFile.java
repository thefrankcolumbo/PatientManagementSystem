package changeData;

import static changeData.AddDataToFile.addToFile;
import soft252amartin.EPersonType;

public class AddDataToPatientFile 
{
    /**
     * Method to add data to the next line of a current patients user file
     * Returns True if successful.
     * Returns False if unsuccessful or file doesn't exist.
     * @param userID String
     * @param newData String[]
     * @return boolean
     */
    public static boolean addPatientReview(String userID, String newData[])
    {
        String cleanedData = cleanNewData(newData);
        return addToFile(userID, cleanedData, EPersonType.Patient);
    }
    private static String cleanNewData(String[] newData)
    {
        String cleanedData = "NOTES,";
        for (String element : newData)
        {
            cleanedData = cleanedData + element;
        }
        return cleanedData;
    }
}
