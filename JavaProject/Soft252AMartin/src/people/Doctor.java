
package people;

import static changeData.AddDataToPatientFile.addPatientReview;
import static viewData.ViewPatientNotes.viewPatientNotes;

public class Doctor extends Person implements IViewPatientHistory, IViewAppointment, ICreateAppointment
{
    public Doctor(String UniqueIdentifier)
    {
        super(UniqueIdentifier, "Doctor");
        
    }
    /**
     * Method to add patient notes to the patients data file.
     * Returns True if amendment successfully added.
     * Returns False if amendment fails.
     * @param userID String
     * @param newData String
     * @return boolean
     */
    public boolean makeNotes(String userID, String newData[])
    {
        return addPatientReview(userID, newData);
    }
    private void proposeAppointment()
    {
        
    }
    private void prescribeMedication()
    {
    
    }
    private void createNewMedicine()
    {
        
    }
    private void askSecretaryToOrderMedicine()
    {
        
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

    @Override
    public void createAppointment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
