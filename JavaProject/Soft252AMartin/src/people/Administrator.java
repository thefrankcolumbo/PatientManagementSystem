
package people;

import passwordUserID.MakeUser;
import passwordUserID.RemoveUser;
import soft252amartin.EPersonType;
import static viewData.ViewAllAdmins.getAllAdminsInfo;
import viewData.ViewAllDoctors;
import static viewData.ViewAllDoctors.getAllDoctorsInfo;
import viewData.ViewAllSecretarys;
import static viewData.ViewAllSecretarys.getAllSecretaryInfo;
import static viewData.ViewDoctorReviews.getDoctorReview;

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
     * @param givenName String
     * @param surname String
     * @param addressLine1 String
     * @param addressLine2 String
     * @param addressLine3 String
     * @param addressPostcode String
     * @param DOB String
     * @param password String
     * @return String userID
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
     * An attempt to remove the current administrator will return false.
     * Else Method will return True.
     * @param userID String
     * @return boolean
     */
    public boolean removeAdministrator(String userID)
    {
        if(userID != this.uniqueIdentifier) 
            return RemoveUser.removeUser(userID, EPersonType.Administrator);
        else return false;
    }
    public String[] viewAdmins()
    {
        return getAllAdminsInfo();
    }
    /**
     * Method to create a new Doctor.
     * Parameter DOB must be in "dd/MM/YYYY" format.
     * Parameter Password must be in plain text.
     * If Doctor created successfully then Method will return true.
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
    public String[] viewDoctors()
    {
        return getAllDoctorsInfo();
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
     * @param userID String
     * @return boolean
     */
    public boolean removeSecretary(String userID)
    {
        return RemoveUser.removeUser(userID, EPersonType.Secretary);
    }
    public String[] viewSecretaries()
    {
        return getAllSecretaryInfo();
    }
    private void provideDoctorFeedBack(String userID)
    {
        
    }
    /**
     * Method to get the reviews of a spefic Doctor.
     * Returns an array of reviews.
     * If there is no reviews then an array with 1 element will be returned containing "NO REVIEW'S"
     * @param userID String
     * @return String[]
     */
    @Override
    public String[] viewDoctorRatings(String userID) 
    {
        return getDoctorReview(userID);
    }

    @Override
    public void createAccount(String givenName, String surname, String addressLine1, String addressLine2, String addressLine3, String addressPostcode, String DOB) {
        
    }

}
