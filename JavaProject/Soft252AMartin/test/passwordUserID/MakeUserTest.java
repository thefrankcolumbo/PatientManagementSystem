
package passwordUserID;

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import soft252amartin.EPersonType;

public class MakeUserTest {
    
    public MakeUserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of makeAUser method, of class MakeUser.
     */
    @Test
    public void testMakeAUser01() {
        System.out.println("make An Administrator User");
        String givenName = "GivenName";
        String surname = "surname";
        String addressLine1 = "addressLine1";
        String addressLine2 = "addressLine2";
        String addressLine3 = "addressLine3";
        String addressPostcode = "addressPostcode";
        String DOB = "DOB";
        EPersonType personType = EPersonType.Administrator;
        String password = "password";
        CheckUserAndPasswords checkUserAndPasswords = new CheckUserAndPasswords();
        String expResult = checkUserAndPasswords.checkForNextAvailableUserID("A");
        String result = MakeUser.makeAUser(givenName, surname, addressLine1, 
                addressLine2, addressLine3, addressPostcode, DOB, personType, 
                password);
        assertEquals(expResult, result);
        checkUserIDAndPasswordInTable(result, password);
    }
    /**
     * Test of makeAUser method, of class MakeUser.
     */
    @Test
    public void testMakeAUser02() {
        System.out.println("make A Doctor User");
        String givenName = "GivenName";
        String surname = "surname";
        String addressLine1 = "addressLine1";
        String addressLine2 = "addressLine2";
        String addressLine3 = "addressLine3";
        String addressPostcode = "addressPostcode";
        String DOB = "DOB";
        EPersonType personType = EPersonType.Doctor;
        String password = "password";
        CheckUserAndPasswords checkUserAndPasswords = new CheckUserAndPasswords();
        String expResult = checkUserAndPasswords.checkForNextAvailableUserID("D");
        String result = MakeUser.makeAUser(givenName, surname, addressLine1, 
                addressLine2, addressLine3, addressPostcode, DOB, personType, 
                password);
        assertEquals(expResult, result);
        checkUserIDAndPasswordInTable(result, password);
    }
    /**
     * Test of makeAUser method, of class MakeUser.
     */
    @Test
    public void testMakeAUser03() {
        System.out.println("make An Patient User");
        String givenName = "GivenName";
        String surname = "surname";
        String addressLine1 = "addressLine1";
        String addressLine2 = "addressLine2";
        String addressLine3 = "addressLine3";
        String addressPostcode = "addressPostcode";
        String DOB = "DOB";
        EPersonType personType = EPersonType.Patient;
        String password = "password";
        CheckUserAndPasswords checkUserAndPasswords = new CheckUserAndPasswords();
        String expResult = checkUserAndPasswords.checkForNextAvailableUserID("P");
        String result = MakeUser.makeAUser(givenName, surname, addressLine1, 
                addressLine2, addressLine3, addressPostcode, DOB, personType, 
                password);
        assertEquals(expResult, result);
        checkUserIDAndPasswordInTable(result, password);
    }
    /**
     * Test of makeAUser method, of class MakeUser.
     */
    @Test
    public void testMakeAUser04() {
        System.out.println("make An Secretary User");
        String givenName = "GivenName";
        String surname = "surname";
        String addressLine1 = "addressLine1";
        String addressLine2 = "addressLine2";
        String addressLine3 = "addressLine3";
        String addressPostcode = "addressPostcode";
        String DOB = "DOB";
        EPersonType personType = EPersonType.Secretary;
        String password = "password";
        CheckUserAndPasswords checkUserAndPasswords = new CheckUserAndPasswords();
        String expResult = checkUserAndPasswords.checkForNextAvailableUserID("S");
        String result = MakeUser.makeAUser(givenName, surname, addressLine1, 
                addressLine2, addressLine3, addressPostcode, DOB, personType, 
                password);
        assertEquals(expResult, result);
        checkUserIDAndPasswordInTable(result, password);
    }
    /**
     * Test of makeAUser method, of class MakeUser.
     */
    @Test
    public void testMakeAUser05() {
        System.out.println("make A Test User");
        String givenName = "GivenName";
        String surname = "surname";
        String addressLine1 = "addressLine1";
        String addressLine2 = "addressLine2";
        String addressLine3 = "addressLine3";
        String addressPostcode = "addressPostcode";
        String DOB = "DOB";
        EPersonType personType = EPersonType.Test;
        String password = "password";
        CheckUserAndPasswords checkUserAndPasswords = new CheckUserAndPasswords();
        String expResult = checkUserAndPasswords.checkForNextAvailableUserID("T");
        String result = MakeUser.makeAUser(givenName, surname, addressLine1, 
                addressLine2, addressLine3, addressPostcode, DOB, personType, 
                password);
        assertEquals(expResult, result);
        checkUserIDAndPasswordInTable(result, password);
    }
    private void checkUserIDAndPasswordInTable(String userID, String hashedPassword)
    {
        System.out.println("Test to check userID and hashed password had been added to the table");
        CheckUserAndPasswords checkUserAndPasswords = new CheckUserAndPasswords();
        boolean matchedUserNameAndPassword = checkUserAndPasswords.checkUserNameAndPassword(userID, hashedPassword);
        boolean expectedResult = true;
        assertEquals(matchedUserNameAndPassword, expectedResult);
    }
    
}
