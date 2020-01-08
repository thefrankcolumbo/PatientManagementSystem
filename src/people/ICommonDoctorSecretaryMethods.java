
package people;


public interface ICommonDoctorSecretaryMethods 
{
    public boolean createAppointment(String patientID, String doctorID, int rowNumber);
    public String[] getMedicineList();
    public String[] getCalenderForSpeficDoctor(String userID);
}
