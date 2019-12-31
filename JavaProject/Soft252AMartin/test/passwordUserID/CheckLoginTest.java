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
public class CheckLoginTest {
    
    public CheckLoginTest() {
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
        CheckLogin checkLogin = new CheckLogin();
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
        CheckLogin checkLogin = new CheckLogin();
        boolean result = checkLogin.checkUserNameAndPassword(userName, inputPassword);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkUserNameAndPassword method, of class checkLogin.
     */
    @Test
    public void testCheckUserNameAndPassword03() {
        System.out.println("FAIL checkUserNameAndPassword T0002 password");
        String userName = "T0002";
        String inputPassword = "password";
        boolean expResult = false;
        CheckLogin checkLogin = new CheckLogin();
        boolean result = checkLogin.checkUserNameAndPassword(userName, inputPassword);
        assertEquals(expResult, result);
    }
    
}
