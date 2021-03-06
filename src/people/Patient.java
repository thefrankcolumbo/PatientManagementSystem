package people;

import static changeData.AddDataToDoctorFile.addDoctorReview;
import static changeData.MessageSecretary.addMessage;
import static viewData.ViewDoctorReviews.getDoctorReview;
import static viewData.ViewPatientMessages.getPatientMessages;
import static viewData.ViewPatientNotes.viewPatientNotes;
import static viewData.ViewPatientPrescription.viewPrescriptionList;

public class Patient extends Person 
        implements IViewDoctorRatings, IViewPatientHistory, IViewAppointment, IMessageSecretary
{
    public String[] messages;
    public Patient(String UniqueIdentifier)
    {
        super(UniqueIdentifier, "Patient");
        setMessages(getOpenMessages());
    }
    private String[] getOpenMessages()
    {
        return getPatientMessages(this.uniqueIdentifier);
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
    /**
     * Method to ask for an appointment.
     * Returns true if message sent successfully.
     * @param userMessage String
     * @return boolean
     */
    public boolean resquestAppointment(String userMessage)
    {
        String message = "Please can I have an appointment " + userMessage 
                + " from " + this.uniqueIdentifier;
        return messageSecretary(message);
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
    /**
     * Method to request account termination.
     * Returns true if message sent successfully.
     * @return boolean
     */
    public boolean requestsAccountTermination()
    {
        String message = "Please delete my account " + this.uniqueIdentifier;
        return messageSecretary(message);
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
        return addMessage(message);
    }
    public String[] getMessages() {
        return messages;
    }

    private void setMessages(String[] messages) {
        this.messages = messages;
    }
}
