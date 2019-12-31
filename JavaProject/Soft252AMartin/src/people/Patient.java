
package people;


public class Patient extends Person implements IViewDoctorRatings, IViewPatientHistory, IViewAppointment
{
    public Patient(String UniqueIdentifier)
    {
        super(UniqueIdentifier);
        
    }
    private void rateDoctor()
    {
    
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
    public void viewPatientHistory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viewAppointment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
