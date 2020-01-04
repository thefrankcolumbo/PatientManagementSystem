package viewData;

import soft252amartin.ERequiredData;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import soft252amartin.EPersonType;

public class ViewDataTest 
{
    
    public ViewDataTest() {
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
     * Test of getData method, of class ViewData.
     */
    @Test
    public void testGetData01() {
        System.out.println("This test is for no doctor reviews present");
        String userID = "T1000";
        EPersonType personType = EPersonType.Test;
        ERequiredData requiredData = ERequiredData.REVIEW;
        String[] expResult = {"NO REVIEW'S"};
        String[] result = ViewData.getData(userID, personType, requiredData);
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of getData method, of class ViewData.
     */
    @Test
    public void testGetData02() {
        System.out.println("This test is for one doctor review present");
        String userID = "T2000";
        EPersonType personType = EPersonType.Test;
        ERequiredData requiredData = ERequiredData.REVIEW;
        String[] expResult = {"REVIEW,5,blah blah blah"};
        String[] result = ViewData.getData(userID, personType, requiredData);
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of getData method, of class ViewData.
     */
    @Test
    public void testGetData03() {
        System.out.println("This test is for more than one doctor review present");
        String userID = "T2001";
        EPersonType personType = EPersonType.Test;
        ERequiredData requiredData = ERequiredData.REVIEW;
        String[] expResult = {"REVIEW,1,this doctor is crap", "REVIEW,5,this doctor is great"};
        String[] result = ViewData.getData(userID, personType, requiredData);
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of getData method, of class ViewData.
     */
    @Test
    public void testGetData04() {
        System.out.println("This test is for no patient notes present");
        String userID = "T1000";
        EPersonType personType = EPersonType.Test;
        ERequiredData requiredData = ERequiredData.NOTES;
        String[] expResult = {"NO NOTES'S"};
        String[] result = ViewData.getData(userID, personType, requiredData);
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of getData method, of class ViewData.
     */
    @Test
    public void testGetData05() {
        System.out.println("This test is for one patient notes present");
        String userID = "T1001";
        EPersonType personType = EPersonType.Test;
        ERequiredData requiredData = ERequiredData.NOTES;
        String[] expResult = {"NOTES,the patient is breathing"};
        String[] result = ViewData.getData(userID, personType, requiredData);
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of getData method, of class ViewData.
     */
    @Test
    public void testGetData06() {
        System.out.println("This test is for more than one patient notes present");
        String userID = "T1002";
        EPersonType personType = EPersonType.Test;
        ERequiredData requiredData = ERequiredData.NOTES;
        String[] expResult = {"NOTES,the patient is breathing", "NOTES,the patient is dead"};
        String[] result = ViewData.getData(userID, personType, requiredData);
        assertArrayEquals(expResult, result);
    }
}
