
package people;


public class Doctor extends Person implements IViewPatientHistory, IViewAppointment, ICreateAppointment
{
    public Doctor(String UniqueIdentifier)
    {
        super(UniqueIdentifier);
        
    }
    private void makeNotes()
    {
        
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
    public void viewPatientHistory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
