
package people;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import soft252amartin.EPersonType;

public class AdministratorTest 
{
    Administrator instance = null;
    
    public AdministratorTest() 
    {
        instance = new Administrator("A9999");
    }
    @BeforeClass
    public static void setUpClass() 
    {
        
    }
    @AfterClass
    public static void tearDownClass() 
    {
        
    }
    @Before
    public void setUp() 
    {
        
    }
    @After
    public void tearDown() 
    {
        
    }
    @Test
    public void testViewAdminTitle()
    {
        System.out.println("testViewAdminTitle");
        String expectedString = "mr";
        assertEquals(instance.getTitle(), expectedString);
    }
    @Test
    public void testViewAdminGivenName()
    {
        System.out.println("testViewGivenName");
        String expectedString = "banana";
        assertEquals(instance.getGivenName(), expectedString);
    }
    @Test
    public void testViewAdminSurname()
    {
        System.out.println("testViewAdminSurname");
        String expectedString = "man";
        assertEquals(instance.getSurname(), expectedString);
    }
    @Test
    public void testViewAdminAddressLine1()
    {
        System.out.println("testViewAdminAddressLine1");
        String expectedString = "29 Acacia Road";
        assertEquals(instance.getAddressLine1(), expectedString);
    }
    @Test
    public void testViewAdminAddressLine2()
    {
        System.out.println("testViewAdminAddressLine2");
        String expectedString = "clacton";
        assertEquals(instance.getAddressLine2(), expectedString);
    }
    @Test
    public void testViewAdminAddressLine3()
    {
        System.out.println("testViewAdminAddressLine3");
        String expectedString = "london";
        assertEquals(instance.getAddressLine3(), expectedString);
    }
    @Test
    public void testViewAdminPostCode()
    {
        System.out.println("testViewAdminAddressPostcode");
        String expectedString = "SW1A 1AA";
        assertEquals(instance.getAddressPostcode(), expectedString);
    }
    @Test
    public void testViewAdminDOB()
    {
        System.out.println("testViewAdminDOB");
        String expectedString = "03/10/1983";
        assertEquals(instance.getDOB(), expectedString);
    }
    @Test
    public void testViewAdminType()
    {
        System.out.println("testViewAdminType");
        EPersonType type = EPersonType.Administrator;
        assertEquals(instance.getPersonType(), type);
    }
    /**
     * Test of viewDoctorRatings method, of class Administrator.
     */
    @Test
    public void testViewDoctorRatings() {
        System.out.println("viewDoctorRatings");
        
        instance.viewDoctorRatings();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAccount method, of class Administrator.
     */
    @Test
    public void testCreateAccount() {
        System.out.println("createAccount");
        String givenName = "";
        String surname = "";
        String addressLine1 = "";
        String addressLine2 = "";
        String addressLine3 = "";
        String addressPostcode = "";
        String DOB = "";
        Administrator instance = null;
        instance.createAccount(givenName, surname, addressLine1, addressLine2, addressLine3, addressPostcode, DOB);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
