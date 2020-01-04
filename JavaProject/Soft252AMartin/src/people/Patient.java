
package people;

import static changeData.AddDataToDoctorFile.addDoctorReview;
import static viewData.ViewPatientNotes.viewPatientNotes;


public class Patient extends Person implements IViewDoctorRatings, IViewPatientHistory, IViewAppointment
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
    
    private void viewPrescription()
    {
        
    }
    
    private void requestsAccountTermination()
    {
        
    }

    @Override
    public void viewDoctorRatings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] viewPatientHistory(String userID) 
    {
        return viewPatientNotes(userID);
    }

    @Override
    public void viewAppointment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
