
package people;

import static changeData.AddDataToDoctorFile.addDoctorReview;
import static viewData.ViewDoctorReviews.getDoctorReview;
import static viewData.ViewPatientNotes.viewPatientNotes;
import static viewData.ViewPatientPrescription.viewPrescriptionList;

public class Patient extends Person 
        implements IViewDoctorRatings, IViewPatientHistory, IViewAppointment, IMessageSecretary
{
    public Patient(String UniqueIdentifier)
    {
        super(UniqueIdentifier, "Patient");
    }
    /**
     * Method to add doctor review to the doctors data file.
     * Returns True if amendment successfully added.
     * Returns False if amendment fails.
     * @param userID String
     * @param newData String
     * @return boolean
     */
    public boolean rateDoctor(String userID, String[] newData)
    {
        return addDoctorReview(userID, newData);
    }
    private void resquestAppointment()
    {
        
    }
    /**
     * Method to get the patients prescription.
     * returns a String array of prescriptions on file
     * @return String[]
     */
    public String[] viewPrescription()
    {
        return viewPrescriptionList(this.uniqueIdentifier);
    }
    
    private void requestsAccountTermination()
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
    /**
     * Method to get this patients history.
     * Will return an array of notes.
     * If there is no notes then an array with 1 element will be returned containing "NO NOTES'S"
     * @param userID this patients UserID.
     * @return String[]
     */
    @Override
    public String[] viewPatientHistory(String userID) 
    {
        return viewPatientNotes(this.uniqueIdentifier);
    }

    @Override
    public void viewAppointment() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Method to send message to all Secretaries.
     * Return true if message sent.
     * Return false if unsuccessful.
     * @param message
     * @return boolean
     */
    @Override
    public boolean messageSecretary(String message) 
    {
        return changeData.MessageSecretary.addMessage(message);
    }
}
