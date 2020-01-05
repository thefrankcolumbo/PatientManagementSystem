package people;

import static changeData.AddNewMedicine.addANewMedicine;
import static viewData.ViewPatientNotes.viewPatientNotes;
import static changeData.AddDataToPatientFile.addPatientNotes;
import static changeData.AddDataToPatientFile.addPatientPrescriptionToNotes;
import static changeData.MessageSecretary.addMessage;

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
     * The line entered will be in the following format:
     * NOTES,this.doctors surname, notes
     * @param patientID String
     * @param newData String
     * @return boolean
     */
    public boolean makeNotes(String patientID, String newData)
    {
        return addPatientNotes(patientID, newData, this.surname);
    }
    private void proposeAppointment()
    {
        
    }
    /**
     * Method to prescribe medicine to a patient and message to secretary.
     * @param medicineName
     * @param quantity
     * @param timeFrame
     * @param notes
     * @param patientID
     * @return 
     */
    public boolean prescribeMedication(String medicineName, String quantity, 
            String timeFrame, String notes, String patientID)
    {
        boolean success = addPrescriptionToPatientNotes(medicineName, quantity, 
                timeFrame, notes, patientID);
        if(success)success = messageSecretaryToGiveOutPerscription(patientID);
        return success;
    }
    private boolean addPrescriptionToPatientNotes(String medicineName, 
            String quantity, String timeFrame, String notes, String patientID)
    {
        return addPatientPrescriptionToNotes(medicineName, quantity, timeFrame,
                notes, patientID);
    }
    private boolean messageSecretaryToGiveOutPerscription(String patientID)
    {
        String message = patientID + " has a perscription waiting fro you to process";
        return addMessage(message);
    }
    /**
     * Method to create a new medicine.
     * This medicine will be created will a 'in stock value of zero'.
     * The medicineName can not be the same as any other listed medicine - boolean false will be returned.
     * The parameter unitDefinition is to describe the units the medicine comes in e.g. tables, ml(millilitres).
     * The parameter medicineNotes are there for explanitory notes that might be required.
     * All on these parameters are manditory - else boolean false will be returned.
     * Boolean True will be return on successful creation.
     * @param medicineName String
     * @param unitDefinition String
     * @param medicineNotes String
     * @return boolean
     */
    public boolean createNewMedicine(String medicineName, String unitDefinition,
            String medicineNotes)
    {
        return addANewMedicine(medicineName, unitDefinition,medicineNotes);
    }
    /**
     * Method to message secretary to ask for more medicine
     * @param medicineName String
     * @return boolean
     */
    public boolean askSecretaryToOrderMedicine(String medicineName)
    {
        String message = "Please order more " + medicineName;
        return addMessage(message);
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
        return addMessage(message);
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
