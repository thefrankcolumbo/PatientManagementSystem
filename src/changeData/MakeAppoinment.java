package changeData;

import static changeData.AddDataToFile.changeCalender;

public class MakeAppoinment 
{
    public static String createAnAppointment(String patientID, String doctorID, int rowNumber)
    {
        return changeCalender(patientID, doctorID, rowNumber, getPath());
    }
    private static String getPath()
    {
        return "res\\Appointments\\Appointments.csv";
    }
}
