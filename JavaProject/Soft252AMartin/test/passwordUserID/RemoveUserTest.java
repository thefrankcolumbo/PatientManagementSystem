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
import soft252amartin.EPersonType;

/**
 *
 * @author HP
 */
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
        String userID = "D0002";
        EPersonType personType = EPersonType.Doctor;
        boolean expResult = true;
        boolean result = RemoveUser.removeUser(userID, personType);
        assertEquals(expResult, result);
    }
    
}
