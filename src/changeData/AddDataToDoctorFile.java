package changeData;

import static changeData.AddDataToFile.addToFile;
import soft252amartin.EPersonType;

public class AddDataToDoctorFile 
{
    /**
     * Method to add data to the next line of a current doctors user file
     * Returns True if successful.
     * Returns False if unsuccessful or file doesn't exist.
     * @param userID String
     * @param newData String[]
     * @return boolean
     */
    public static boolean addDoctorReview(String userID, String[] newData)
    {
        String cleanedData = cleanNewData(newData);
        return addToFile(userID, cleanedData, EPersonType.Doctor);
    }
    private static String cleanNewData(String[] newData)
    {
        String cleanedData = "REVIEW,";
        for (String element : newData)
        {
            cleanedData = cleanedData + element;
        }
        return cleanedData;
    }
}
