
package people;

import static changeData.AddDataToPatientFile.addPatientReview;
import static viewData.ViewPatientNotes.viewPatientNotes;

public class Doctor extends Person 
        implements IViewPatientHistory, IViewAppointment, ICommonDoctorSecretaryMethods, IMessageSecretary
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
    /**
     * Method to view a patients history.
     * Returns an array of history events.
     * @param userID String
     * @return String[]
     */
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
    
}
