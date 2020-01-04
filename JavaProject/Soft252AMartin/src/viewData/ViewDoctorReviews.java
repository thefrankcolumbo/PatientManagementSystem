
package viewData;

import soft252amartin.EPersonType;
import static viewData.ViewData.getData;

public class ViewDoctorReviews 
{
    public static String[] getDoctorReview(String userID)
    {
        String[] data = getData(userID, EPersonType.Doctor, ERequiredData.REVIEW);
        return data;
    }
    
}
