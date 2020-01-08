package people;

import static changeData.MakeAppoinment.createAnAppointment;
import static changeData.MessagePatient.makePatientMessage;
import passwordUserID.MakeUser;
import passwordUserID.RemoveUser;
import soft252amartin.EPersonType;
import static changeData.UpdateMedicine.upDateMedicineQuantity;
import static viewData.ViewCalender.getCalender;
import static viewData.ViewCalender.getCalenderForADoctor;
import static viewData.viewSecretaryMessages.getSecretaryMessages;


public class Secretary extends Person implements ICommonDoctorSecretaryMethods, ICreateAccount
{
    public String[] messages;
    public Secretary(String UniqueIdentifier)
    {
        super(UniqueIdentifier, "Secretary");
        setMessages(getOpenMessages());
    }
    private String[] getOpenMessages()
    {
        return getSecretaryMessages();
    }
    /**
     * Method to get the entire appointment calender for all doctors.
     * The elements of the string will be:
     * Date, Time frame, Doctor A0001 availability, Doctor A0002 availability, etc etc.
     * @return String
     */
    public String[] getCalenderForAllDoctors()
    {
        return getCalender();
    }
    
    /**
     * Method to change the quantity of a medicine in the medicine file list.
     * Will return true if quantity changed.
     * @param medicineName String
     * @param newQuantity String
     * @return boolean
     */
    public boolean changeMedicineQuantity(String medicineName, String newQuantity)
    {
        return upDateMedicineQuantity(medicineName, newQuantity);
    }
    /**
     * Method to message Patient.
     * Returns true if message sent successfully.
     * @param patientID String
     * @param message String
     * @return boolean
     */
    public boolean messagePatient(String patientID, String message)
    {
        return makePatientMessage(patientID, message);
    }
    private void giveMedication()
    {
        
    }
    private void orderMedicines()
    {
        
    }
    /**
     * Method to create a new Patient. 
     * Parameter DOB must be in "dd/MM/YYYY" format.
     * Parameter Password must be in plain text.
     * If Patient created successfully then Method will return true.
     * Else Method will return false.
     * @param givenName String
     * @param surname String
     * @param addressLine1 String
     * @param addressLine2 String
     * @param addressLine3 String
     * @param addressPostcode String
     * @param DOB String
     * @param password String
     * @return boolean
     */
    public String createPatient(String givenName, String surname, String addressLine1, 
            String addressLine2, String addressLine3, String addressPostcode, 
            String DOB, String password)
    {
        return MakeUser.makeAUser(givenName, surname, addressLine1, 
                addressLine2, addressLine3, addressPostcode, DOB, 
                EPersonType.Patient, DOB);
    }
    /**
     * Method to remove a current Patient.
     * If doctor removal is unsuccessful then Method will return False.
     * If userID for Patient does not exist then Method will return False.
     * Else Method will return True.
     * @param userID String
     * @return boolean
     */
    public boolean removePatient(String userID)
    {
        return RemoveUser.removeUser(userID, EPersonType.Patient);
    }
    /**
     * Method to create an appointment.
     * Parameter row number refers to the row number in the calender display on the GUI.
     * Returns true on successful appointment made.
     * @param patientID String
     * @param doctorID String
     * @param rowNumber integer
     * @return boolean
     */
    @Override
    public boolean createAppointment(String patientID, String doctorID, int rowNumber) 
    {
        String appointmentDetails =  createAnAppointment(patientID, doctorID, rowNumber);
        boolean success = messagePatient(patientID, appointmentDetails);
        return success;
    }

    @Override
    public void createAccount(String givenName, String surname, String addressLine1, String addressLine2, String addressLine3, String addressPostcode, String DOB) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Method to get a list of all medicines and their details.
     * If there are no medicines then an array of one element is returned containing "NO MEDICINES"
     * @return String[]
     */
    @Override
    public String[] getMedicineList() 
    {
        return viewData.ViewMedicineList.getMedicinesList();
    }

    public String[] getMessages() {
        return messages;
    }

    private void setMessages(String[] messages) {
        this.messages = messages;
    }

    @Override
    public String[] getCalenderForSpeficDoctor(String userID) 
    {
        return getCalenderForADoctor(userID);
    }

}
