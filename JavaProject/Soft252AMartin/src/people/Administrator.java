
package people;

import passwordUserID.MakeUser;
import passwordUserID.RemoveUser;
import soft252amartin.EPersonType;

public class Administrator extends Person implements IViewDoctorRatings, ICreateAccount
{
    
    public Administrator(String UniqueIdentifier)
    {
        super(UniqueIdentifier, "Administrator");
    }
    /**
     * Method to create a new Administrator.
     * Parameter DOB must be in "dd/MM/YYYY" format.
     * Parameter Password must be in plain text.
     * If Administrator created successfully then Method will return true.
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
    public String createAdministrator(String givenName, String surname, String addressLine1, 
            String addressLine2, String addressLine3, String addressPostcode, 
            String DOB, String password)
    {
        return MakeUser.makeAUser(givenName, surname, addressLine1, 
                addressLine2, addressLine3, addressPostcode, DOB, 
                EPersonType.Administrator, DOB);
    }
    /**
     * Method to remove a current Administrator.
     * If doctor removal is unsuccessful then Method will return False.
     * If userID for doctor does not exist then Method will return False.
     * Else Method will return True.
     * @param userID
     * @return boolean
     */
    public boolean removeAdministrator(String userID)
    {
        return RemoveUser.removeUser(userID, EPersonType.Administrator);
    }
    /**
     * Method to create a new Doctor.
     * Parameter DOB must be in "dd/MM/YYYY" format.
     * Parameter Password must be in plain text.
     * If Doctor created successfully then Method will return true.
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
    public String createDoctor(String givenName, String surname, String addressLine1, 
            String addressLine2, String addressLine3, String addressPostcode, 
            String DOB, String password)
    {
        return MakeUser.makeAUser(givenName, surname, addressLine1, 
                addressLine2, addressLine3, addressPostcode, DOB, 
                EPersonType.Doctor, DOB);
    }
    /**
     * Method to remove a current Doctor.
     * If doctor removal is unsuccessful then Method will return False.
     * If userID for doctor does not exist then Method will return False.
     * Else Method will return True.
     * @param userID
     * @return boolean
     */
    public boolean removeDoctor(String userID)
    {
        return RemoveUser.removeUser(userID, EPersonType.Doctor);
    }
//    public Vector listAllCurrentDoctors()
//    {
//        
//    }
    /**
     * Method to create a new Secretary.
     * Parameter DOB must be in "dd/MM/YYYY" format.
     * Parameter Password must be in plain text.
     * If Secretary created successfully then Method will return true.
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
    public String createSecretary(String givenName, String surname, 
            String addressLine1, String addressLine2, String addressLine3, 
            String addressPostcode, String DOB, String password)
    {
        return MakeUser.makeAUser(givenName, surname, addressLine1, 
                addressLine2, addressLine3, addressPostcode, DOB, 
                EPersonType.Secretary, DOB);
    }
    /**
     * Method to remove a current Secretary.
     * If Secretary removal is unsuccessful then Method will return False.
     * If userID for Secretary does not exist then Method will return False.
     * Else Method will return True.
     * @param userID
     * @return boolean
     */
    public boolean removeSecretary(String userID)
    {
        return RemoveUser.removeUser(userID, EPersonType.Secretary);
    }
    private void provideDoctorFeedBack(String userID)
    {
        
    }
    @Override
    public void viewDoctorRatings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createAccount(String givenName, String surname, String addressLine1, String addressLine2, String addressLine3, String addressPostcode, String DOB) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
