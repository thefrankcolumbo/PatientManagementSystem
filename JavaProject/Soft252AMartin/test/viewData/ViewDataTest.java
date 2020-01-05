package viewData;

import fileManagement.AmendFile;
import soft252amartin.ERequiredDataWithinFile;
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
        ERequiredDataWithinFile requiredData = ERequiredDataWithinFile.REVIEW;
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
        ERequiredDataWithinFile requiredData = ERequiredDataWithinFile.REVIEW;
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
        ERequiredDataWithinFile requiredData = ERequiredDataWithinFile.REVIEW;
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
        ERequiredDataWithinFile requiredData = ERequiredDataWithinFile.NOTES;
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
        ERequiredDataWithinFile requiredData = ERequiredDataWithinFile.NOTES;
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
        ERequiredDataWithinFile requiredData = ERequiredDataWithinFile.NOTES;
        String[] expResult = {"NOTES,the patient is breathing", "NOTES,the patient is dead"};
        String[] result = ViewData.getData(userID, personType, requiredData);
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of getMedicineList method, of class ViewData.
     */
    @Test
    public void testGetMedicineList01() {
        System.out.println("Test to retrieve all listed medicines");
        String path = "res\\Test\\medicinesList.csv";
        String[] expResult = 
        {"medicine name1,units remaining,unit definition,medicine notes",
            "medicine name2,units remaining,unit definition,medicine notes",
            "medicine name3,units remaining,unit definition,medicine notes",
            "medicine name4,units remaining,unit definition,medicine notes",
            "medicine name5,units remaining,unit definition,medicine notes",
            "medicine name6,units remaining,unit definition,medicine notes",
            "medicine name7,units remaining,unit definition,medicine notes",
            "medicine name8,units remaining,unit definition,medicine notes",
            "medicine name9,units remaining,unit definition,medicine notes",
            "medicine name10,units remaining,unit definition,medicine notes"};
        String[] result = ViewData.getMedicineList(path);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getMessages method, of class ViewData.
     */
    @Test
    public void testGetMessages() {
        System.out.println("Test of getMessages method, of class ViewData, test file has no data. ");
        // set up variables
        EPersonType personType = EPersonType.Test;
        String path = "res\\" + personType + "\\" + ERequiredDataWithinFile.MESSAGE + ".csv";
        String[] expResult = {"NO MESSAGES"};
        //delete contents of test file
        AmendFile.removeFileContents(path);
        // test method
        String[] result = ViewData.getMessages(personType, path);
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of getMessages method, of class ViewData.
     */
    @Test
    public void testGetMessages01() {
        System.out.println("Test of getMessages method, of class ViewData, test file has data. ");
        // set up variables
        EPersonType personType = EPersonType.Test;
        String path = "res\\" + personType + "\\" + ERequiredDataWithinFile.MESSAGE + ".csv";
        String[] expResult = {"","this is the first test message.", "this is the second test message."};
        String testLine01 = "this is the first test message.";
        String testLine02 = "this is the second test message.";
        //delete contents of test file
        AmendFile.removeFileContents(path);
        // add contents to file
        AmendFile.appendStringToFile(path, testLine01);
        AmendFile.appendStringToFile(path, testLine02);
        // test method
        String[] result = ViewData.getMessages(personType, path);
        assertArrayEquals(expResult, result);
        // delete file contents
        AmendFile.removeFileContents(path);
    }

}
