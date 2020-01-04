package people;

import passwordUserID.MakeUser;
import passwordUserID.RemoveUser;
import soft252amartin.EPersonType;


public class Secretary extends Person implements ICreateAppointment, ICreateAccount
{
    public Secretary(String UniqueIdentifier)
    {
        super(UniqueIdentifier, "Secretary");
        
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

    @Override
    public void createAppointment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createAccount(String givenName, String surname, String addressLine1, String addressLine2, String addressLine3, String addressPostcode, String DOB) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
