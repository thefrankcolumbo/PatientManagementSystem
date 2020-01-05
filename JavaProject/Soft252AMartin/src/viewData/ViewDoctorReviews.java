package viewData;

import soft252amartin.ERequiredDataWithinFile;
import soft252amartin.EPersonType;
import static viewData.ViewData.getData;

public class ViewDoctorReviews 
{
    /**
     * Method to get the reviews of a doctor.
     * Will return an array with one element containing "NO REVIEW'S" if there are no notes
     * @param userID String
     * @return String[]
     */
    public static String[] getDoctorReview(String userID)
    {
        String[] data = getData(userID, EPersonType.Doctor, ERequiredDataWithinFile.REVIEW);
        return data;
    }
    
}
