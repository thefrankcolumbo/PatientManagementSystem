package changeData;

import static changeData.AddDataToFile.addToFile;
import soft252amartin.EPersonType;
import soft252amartin.ERequiredDataWithinFile;
import static viewData.ViewDoctorReviews.getDoctorReview;

public class MessageDoctor 
{
    /**
     * Method to make a message for a patient.
     * Returns true is message made successfully.
     * @param doctorID String
     * @param message String
     * @return boolean
     */
    public static boolean makeDoctorMessage(String doctorID)
    {
        String newData = ERequiredDataWithinFile.MESSAGE + ", " + getDoctorReviews(doctorID);
        return addToFile(doctorID, newData, EPersonType.Doctor);
    }
    private static String getDoctorReviews(String DoctorID)
    {
        String[] array = getDoctorReview(DoctorID);
        String message = "";
        for (String element : array)
        {
            message = message + element +"\n";
        }
        return message;
    }
}
