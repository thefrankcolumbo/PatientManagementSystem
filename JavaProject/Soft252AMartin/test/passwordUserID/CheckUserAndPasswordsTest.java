/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordUserID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class CheckUserAndPasswordsTest {
    
    public CheckUserAndPasswordsTest() {
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
     * Test of checkUserNameAndPassword method, of class checkLogin.
     */
    @Test
    public void testCheckUserNameAndPassword01() {
        System.out.println("PASS checkUserNameAndPassword T0001 password");
        String userName = "T0001";
        String inputPassword = "password";
        boolean expResult = true;
        CheckUserAndPasswords checkLogin = new CheckUserAndPasswords();
        boolean result = checkLogin.checkUserNameAndPassword(userName, inputPassword);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkUserNameAndPassword method, of class checkLogin.
     */
    @Test
    public void testCheckUserNameAndPassword02() {
        System.out.println("PASS checkUserNameAndPassword T0002 PASSWORD");
        String userName = "T0002";
        String inputPassword = "PASSWORD";
        boolean expResult = true;
        CheckUserAndPasswords checkLogin = new CheckUserAndPasswords();
        boolean result = checkLogin.checkUserNameAndPassword(userName, inputPassword);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkUserNameAndPassword method, of class checkLogin.
     */
    @Test
    public void testCheckUserNameAndPassword03() {
        System.out.println("FAIL WRONG PASSWORD checkUserNameAndPassword T0002 password");
        String userName = "T0002";
        String inputPassword = "password";
        boolean expResult = false;
        CheckUserAndPasswords checkLogin = new CheckUserAndPasswords();
        boolean result = checkLogin.checkUserNameAndPassword(userName, inputPassword);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkUserNameAndPassword method, of class checkLogin.
     */
    @Test
    public void testCheckUserNameAndPassword04() {
        System.out.println("FAIL USERID DOES NOT EXIST checkUserNameAndPassword T9999 password");
        String userName = "T9999";
        String inputPassword = "password";
        boolean expResult = false;
        CheckUserAndPasswords checkLogin = new CheckUserAndPasswords();
        boolean result = checkLogin.checkUserNameAndPassword(userName, inputPassword);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkUserNameAndPassword method, of class checkLogin.
     */
    @Test
    public void testCheckUserNameAndPassword05() {
        System.out.println("FAIL USERID TO SHORT checkUserNameAndPassword T000 password");
        String userName = "T000";
        String inputPassword = "password";
        boolean expResult = false;
        CheckUserAndPasswords checkLogin = new CheckUserAndPasswords();
        boolean result = checkLogin.checkUserNameAndPassword(userName, inputPassword);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkUserNameAndPassword method, of class checkLogin.
     */
    @Test
    public void testCheckUserNameAndPassword06() {
        System.out.println("FAIL USERID TOO LONG checkUserNameAndPassword T99999 password");
        String userName = "T99999";
        String inputPassword = "password";
        boolean expResult = false;
        CheckUserAndPasswords checkLogin = new CheckUserAndPasswords();
        boolean result = checkLogin.checkUserNameAndPassword(userName, inputPassword);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkUserNameAndPassword method, of class checkLogin.
     */
    @Test
    public void testCheckUserNameAndPassword07() {
        System.out.println("FAIL USERID NOT ENTERED checkUserNameAndPassword  password");
        String userName = "";
        String inputPassword = "password";
        boolean expResult = false;
        CheckUserAndPasswords checkLogin = new CheckUserAndPasswords();
        boolean result = checkLogin.checkUserNameAndPassword(userName, inputPassword);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkUserNameAndPassword method, of class checkLogin.
     */
    @Test
    public void testCheckUserNameAndPassword08() {
        System.out.println("FAIL PASSWORD TOO SHORT checkUserNameAndPassword T9999 pass");
        String userName = "T9999";
        String inputPassword = "pass";
        boolean expResult = false;
        CheckUserAndPasswords checkLogin = new CheckUserAndPasswords();
        boolean result = checkLogin.checkUserNameAndPassword(userName, inputPassword);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkUserNameAndPassword method, of class checkLogin.
     */
    @Test
    public void testCheckUserNameAndPassword09() {
        System.out.println("FAIL PASSWORD NOT ENTERED checkUserNameAndPassword T9999 ");
        String userName = "T9999";
        String inputPassword = "";
        boolean expResult = false;
        CheckUserAndPasswords checkLogin = new CheckUserAndPasswords();
        boolean result = checkLogin.checkUserNameAndPassword(userName, inputPassword);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkForNextAvailableUserID method, of class CheckUserAndPasswords.
     */
    @Test
    public void testCheckUserNameAndPassword10() 
    {
        System.out.println("PASS check for next available userID");
        String personType = "T";
        CheckUserAndPasswords instance = new CheckUserAndPasswords();
        String expResult = "T0003";
        String result = instance.checkForNextAvailableUserID(personType);
        assertEquals(expResult, result);
    }

    /**
     * Test of hashPassword method, of class CheckUserAndPasswords.
     */
    @Test
    public void testCheckUserNameAndPassword11() {
        System.out.println("PASS check password hash");
        String unhashedPassword = "qwerty12345";
        CheckUserAndPasswords instance = new CheckUserAndPasswords();
        String expResult = "85064efb60a9601805dcea56ec5402f7";
        String result = instance.hashPassword(unhashedPassword);
        assertEquals(expResult, result);
    }
    /**
     * Test of hashPassword method, of class CheckUserAndPasswords.
     */
    @Test
    public void testCheckUserNameAndPassword12() {
        System.out.println("FAIL check password hash");
        String unhashedPassword = "qwerty12345";
        CheckUserAndPasswords instance = new CheckUserAndPasswords();
        String expResult = "25064efb60a9601805dcea56ec5402f7";
        String result = instance.hashPassword(unhashedPassword);
        assertNotEquals(expResult, result);
    }
   


    
    
}
