
package people;

import soft252amartin.EPersonType;

public class Administrator extends Person implements IViewDoctorRatings, ICreateAccount
{
    
    public Administrator(String UniqueIdentifier)
    {
        super(UniqueIdentifier, "Administrator");
    }
    private void createDoctor()
    {
        
    }
    private void removeDoctor()
    {
        
    }
    private void createSecretary()
    {
        
    }
    private void removeSecretary()
    {
        
    }
    private void provideDoctorFeedBack()
    {
        
    }
    @Override
    public void viewDoctorRatings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createAccount(String givenName, String surname, String addressLine1, String addressLine2, String addressLine3, String addressPostcode, String DOB) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
