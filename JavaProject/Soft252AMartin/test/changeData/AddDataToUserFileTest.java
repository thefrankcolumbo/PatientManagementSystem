/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changeData;

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
public class AddDataToUserFileTest {
    
    public AddDataToUserFileTest() {
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
     * Test of addToFile method, of class AddDataToUserFile.
     */
    @Test
    public void testAddToFile() {
        System.out.println("addToFile");
        String userID = "T0002";
        String newData = "mary,has,a,little,lamb";
        EPersonType personType = EPersonType.Test;
        AddDataToUserFile.addToFile(userID, newData, personType);
    }
    
}
