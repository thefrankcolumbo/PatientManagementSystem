
package passwordUserID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import soft252amartin.EPersonType;

public class RemoveUserTest {
    
    public RemoveUserTest() {
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
     * Test of removeUser method, of class RemoveUser.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        String userID = "T0002";
        EPersonType personType = EPersonType.Test;
        boolean expResult = true;
        boolean result = RemoveUser.removeUser(userID, personType);
        assertEquals(expResult, result);
    }
    
}
