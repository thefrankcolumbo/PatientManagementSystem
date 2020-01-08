
package passwordUserID;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
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
        System.out.println("result " + result);
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
