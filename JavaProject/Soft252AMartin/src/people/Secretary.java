
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
    private void approvePatientAccount()
    {
        
    }
    private void giveMedication()
    {
        
    }
    private void orderMedicines()
    {
        
    }
    /**
     * Method to create a new Patient. Password must be in plain text.
     * Parameter DOB must be in "dd/MM/YYYY" format.
     * Parameter Password must be in plain text.
     * If Patient created successfully then Method will return true.
     * Else Method will return false.
     * @param givenName
     * @param surname
     * @param addressLine1
     * @param addressLine2
     * @param addressLine3
     * @param addressPostcode
     * @param DOB
     * @param password
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
     * @param userID
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
