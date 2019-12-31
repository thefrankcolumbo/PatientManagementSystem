
package people;


public class Secretary extends Person implements ICreateAppointment, ICreateAccount
{
    public Secretary(String UniqueIdentifier)
    {
        super(UniqueIdentifier);
        
    }
    private void approvePatientAccount()
    {
        
    }
    private void giveMedication()
    {
        
    }
    private void orderMedicines()
    {
        
    }
    private void createPatient()
    {
        
    }
    private void removePatient()
    {
        
    }

    @Override
    public void createAppointment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createAccount(String givenName, String surname, String addressLine1, String addressLine2, String addressLine3, String addressPostcode, String DOB) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
