package viewData;

import static viewData.ViewData.retrieveCalender;
import static viewData.ViewData.retrieveCalenderForADoctor;


public class ViewCalender 
{
    public static String[] getCalenderForADoctor(String doctorID)
    {
        return retrieveCalenderForADoctor(getPath(),doctorID);
    }
    public static String[] getCalender()
    {
        return retrieveCalender(getPath());
    }
    private static String getPath()
    {
        return "res\\Appoinments\\Appointments.csv";
    }
}
