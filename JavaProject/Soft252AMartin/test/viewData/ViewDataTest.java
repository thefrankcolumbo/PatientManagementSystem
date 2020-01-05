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
        String[] result = ViewData.getMessages(path);
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
        String[] result = ViewData.getMessages(path);
        assertArrayEquals(expResult, result);
        // delete file contents
        AmendFile.removeFileContents(path);
    }

    /**
     * Test of retrieveCalender method, of class ViewData.
     */
    @Test
    public void testRetrieveCalender() {
        System.out.println("Test of retrieveCalender method, of class ViewData.");
        String path = "res\\Test\\Appointments.csv";
        //String path = "res\\Appointments\\Appointment.csv";
        String[] expResult = 
        {"0,Date,TimeWindow,D0001,D0002,D0003",
        "1,01/01/2020,9 to 10,Holiday,Holiday,Holiday",
        "2,01/01/2020,10 to 11,Holiday,Holiday,Holiday",
        "3,01/01/2020,11 to 12,Holiday,Holiday,Holiday",
        "4,01/01/2020,13 to 14,Holiday,Holiday,Holiday",
        "5,01/01/2020,14 to 15,Holiday,Holiday,Holiday",
        "6,01/01/2020,15 to 16,Holiday,Holiday,Holiday",
        "7,02/01/2020,9 to 10,Holiday,Holiday,Holiday",
        "8,02/01/2020,10 to 11,Holiday,Holiday,Holiday",
        "9,02/01/2020,11 to 12,Holiday,Holiday,Holiday",
        "10,02/01/2020,13 to 14,Holiday,Holiday,Holiday",
        "11,02/01/2020,14 to 15,Holiday,Holiday,Holiday",
        "12,02/01/2020,15 to 16,Holiday,Holiday,Holiday",
        "13,03/01/2020,9 to 10,Free,Free,Free",
        "14,03/01/2020,10 to 11,Free,Free,Free",
        "15,03/01/2020,11 to 12,Free,Free,Free",
        "16,03/01/2020,13 to 14,Free,Free,Free",
        "17,03/01/2020,14 to 15,Free,Free,Free",
        "18,03/01/2020,15 to 16,Free,Free,Free",
        "19,04/01/2020,9 to 10,Weekend,Weekend,Weekend",
        "20,04/01/2020,10 to 11,Weekend,Weekend,Weekend",
        "21,04/01/2020,11 to 12,Weekend,Weekend,Weekend",
        "22,04/01/2020,13 to 14,Weekend,Weekend,Weekend",
        "23,04/01/2020,14 to 15,Weekend,Weekend,Weekend",
        "24,04/01/2020,15 to 16,Weekend,Weekend,Weekend",
        "25,05/01/2020,9 to 10,Weekend,Weekend,Weekend",
        "26,05/01/2020,10 to 11,Weekend,Weekend,Weekend",
        "27,05/01/2020,11 to 12,Weekend,Weekend,Weekend",
        "28,05/01/2020,13 to 14,Weekend,Weekend,Weekend",
        "29,05/01/2020,14 to 15,Weekend,Weekend,Weekend",
        "30,05/01/2020,15 to 16,Weekend,Weekend,Weekend",
        "31,06/01/2020,9 to 10,Free,Free,Free",
        "32,06/01/2020,10 to 11,Free,Free,Free",
        "33,06/01/2020,11 to 12,Free,Free,Free",
        "34,06/01/2020,13 to 14,Free,Free,Free",
        "35,06/01/2020,14 to 15,Free,Free,Free",
        "36,06/01/2020,15 to 16,Free,Free,Free",
        "37,07/01/2020,9 to 10,Free,Free,Free",
        "38,07/01/2020,10 to 11,Free,Free,Free",
        "39,07/01/2020,11 to 12,Free,Free,Free",
        "40,07/01/2020,13 to 14,Free,Free,Free",
        "41,07/01/2020,14 to 15,Free,Free,Free",
        "42,07/01/2020,15 to 16,Free,Free,Free",
        "43,08/01/2020,9 to 10,Free,Free,Free",
        "44,08/01/2020,10 to 11,Free,Free,Free",
        "45,08/01/2020,11 to 12,Free,Free,Free",
        "46,08/01/2020,13 to 14,Free,Free,Free",
        "47,08/01/2020,14 to 15,Free,Free,Free",
        "48,08/01/2020,15 to 16,Free,Free,Free",
        "49,09/01/2020,9 to 10,Free,Free,Free",
        "50,09/01/2020,10 to 11,Free,Free,Free",
        "51,09/01/2020,11 to 12,Free,Free,Free",
        "52,09/01/2020,13 to 14,Free,Free,Free",
        "53,09/01/2020,14 to 15,Free,Free,Free",
        "54,09/01/2020,15 to 16,Free,Free,Free",
        "55,10/01/2020,9 to 10,Free,Free,Free",
        "56,10/01/2020,10 to 11,Free,Free,Free",
        "57,10/01/2020,11 to 12,Free,Free,Free",
        "58,10/01/2020,13 to 14,Free,Free,Free",
        "59,10/01/2020,14 to 15,Free,Free,Free",
        "60,10/01/2020,15 to 16,Free,Free,Free",
        "61,11/01/2020,9 to 10,Weekend,Weekend,Weekend",
        "62,11/01/2020,10 to 11,Weekend,Weekend,Weekend",
        "63,11/01/2020,11 to 12,Weekend,Weekend,Weekend",
        "64,11/01/2020,13 to 14,Weekend,Weekend,Weekend",
        "65,11/01/2020,14 to 15,Weekend,Weekend,Weekend",
        "66,11/01/2020,15 to 16,Weekend,Weekend,Weekend",
        "67,12/01/2020,9 to 10,Weekend,Weekend,Weekend",
        "68,12/01/2020,10 to 11,Weekend,Weekend,Weekend",
        "69,12/01/2020,11 to 12,Weekend,Weekend,Weekend",
        "70,12/01/2020,13 to 14,Weekend,Weekend,Weekend",
        "71,12/01/2020,14 to 15,Weekend,Weekend,Weekend",
        "72,12/01/2020,15 to 16,Weekend,Weekend,Weekend",
        "73,13/01/2020,9 to 10,Free,Free,Free",
        "74,13/01/2020,10 to 11,Free,Free,Free",
        "75,13/01/2020,11 to 12,Free,Free,Free",
        "76,13/01/2020,13 to 14,Free,Free,Free",
        "77,13/01/2020,14 to 15,Free,Free,Free",
        "78,13/01/2020,15 to 16,Free,Free,Free",
        "79,14/01/2020,9 to 10,Free,Free,Free",
        "80,14/01/2020,10 to 11,Free,Free,Free",
        "81,14/01/2020,11 to 12,Free,Free,Free",
        "82,14/01/2020,13 to 14,Free,Free,Free",
        "83,14/01/2020,14 to 15,Free,Free,Free",
        "84,14/01/2020,15 to 16,Free,Free,Free",
        "85,15/01/2020,9 to 10,Free,Free,Free",
        "86,15/01/2020,10 to 11,Free,Free,Free",
        "87,15/01/2020,11 to 12,Free,Free,Free",
        "88,15/01/2020,13 to 14,Free,Free,Free",
        "89,15/01/2020,14 to 15,Free,Free,Free",
        "90,15/01/2020,15 to 16,Free,Free,Free",
        "91,16/01/2020,9 to 10,Free,Free,Free",
        "92,16/01/2020,10 to 11,Free,Free,Free",
        "93,16/01/2020,11 to 12,Free,Free,Free",
        "94,16/01/2020,13 to 14,Free,Free,Free",
        "95,16/01/2020,14 to 15,Free,Free,Free",
        "96,16/01/2020,15 to 16,Free,Free,Free",
        "97,17/01/2020,9 to 10,Free,Free,Free",
        "98,17/01/2020,10 to 11,Free,Free,Free",
        "99,17/01/2020,11 to 12,Free,Free,Free",
        "100,17/01/2020,13 to 14,Free,Free,Free",
        "101,17/01/2020,14 to 15,Free,Free,Free",
        "102,17/01/2020,15 to 16,Free,Free,Free"};
        String[] result = ViewData.retrieveCalender(path);
        assertArrayEquals(expResult, result);
    }
    

    /**
     * Test of retrieveCalenderForADoctor method, of class ViewData.
     */
    @Test
    public void testRetrieveCalenderForADoctor() {
        System.out.println("retrieveCalenderForADoctor");
        String path = "res\\Test\\Appointments.csv";
        String doctorID = "D0002";
        String[] expResult =
        {"0,Date,TimeWindow,D0002",
        "1,01/01/2020,9 to 10,Holiday",
        "2,01/01/2020,10 to 11,Holiday",
        "3,01/01/2020,11 to 12,Holiday",
        "4,01/01/2020,13 to 14,Holiday",
        "5,01/01/2020,14 to 15,Holiday",
        "6,01/01/2020,15 to 16,Holiday",
        "7,02/01/2020,9 to 10,Holiday",
        "8,02/01/2020,10 to 11,Holiday",
        "9,02/01/2020,11 to 12,Holiday",
        "10,02/01/2020,13 to 14,Holiday",
        "11,02/01/2020,14 to 15,Holiday",
        "12,02/01/2020,15 to 16,Holiday",
        "13,03/01/2020,9 to 10,Free",
        "14,03/01/2020,10 to 11,Free",
        "15,03/01/2020,11 to 12,Free",
        "16,03/01/2020,13 to 14,Free",
        "17,03/01/2020,14 to 15,Free",
        "18,03/01/2020,15 to 16,Free",
        "19,04/01/2020,9 to 10,Weekend",
        "20,04/01/2020,10 to 11,Weekend",
        "21,04/01/2020,11 to 12,Weekend",
        "22,04/01/2020,13 to 14,Weekend",
        "23,04/01/2020,14 to 15,Weekend",
        "24,04/01/2020,15 to 16,Weekend",
        "25,05/01/2020,9 to 10,Weekend",
        "26,05/01/2020,10 to 11,Weekend",
        "27,05/01/2020,11 to 12,Weekend",
        "28,05/01/2020,13 to 14,Weekend",
        "29,05/01/2020,14 to 15,Weekend",
        "30,05/01/2020,15 to 16,Weekend",
        "31,06/01/2020,9 to 10,Free",
        "32,06/01/2020,10 to 11,Free",
        "33,06/01/2020,11 to 12,Free",
        "34,06/01/2020,13 to 14,Free",
        "35,06/01/2020,14 to 15,Free",
        "36,06/01/2020,15 to 16,Free",
        "37,07/01/2020,9 to 10,Free",
        "38,07/01/2020,10 to 11,Free",
        "39,07/01/2020,11 to 12,Free",
        "40,07/01/2020,13 to 14,Free",
        "41,07/01/2020,14 to 15,Free",
        "42,07/01/2020,15 to 16,Free",
        "43,08/01/2020,9 to 10,Free",
        "44,08/01/2020,10 to 11,Free",
        "45,08/01/2020,11 to 12,Free",
        "46,08/01/2020,13 to 14,Free",
        "47,08/01/2020,14 to 15,Free",
        "48,08/01/2020,15 to 16,Free",
        "49,09/01/2020,9 to 10,Free",
        "50,09/01/2020,10 to 11,Free",
        "51,09/01/2020,11 to 12,Free",
        "52,09/01/2020,13 to 14,Free",
        "53,09/01/2020,14 to 15,Free",
        "54,09/01/2020,15 to 16,Free",
        "55,10/01/2020,9 to 10,Free",
        "56,10/01/2020,10 to 11,Free",
        "57,10/01/2020,11 to 12,Free",
        "58,10/01/2020,13 to 14,Free",
        "59,10/01/2020,14 to 15,Free",
        "60,10/01/2020,15 to 16,Free",
        "61,11/01/2020,9 to 10,Weekend",
        "62,11/01/2020,10 to 11,Weekend",
        "63,11/01/2020,11 to 12,Weekend",
        "64,11/01/2020,13 to 14,Weekend",
        "65,11/01/2020,14 to 15,Weekend",
        "66,11/01/2020,15 to 16,Weekend",
        "67,12/01/2020,9 to 10,Weekend",
        "68,12/01/2020,10 to 11,Weekend",
        "69,12/01/2020,11 to 12,Weekend",
        "70,12/01/2020,13 to 14,Weekend",
        "71,12/01/2020,14 to 15,Weekend",
        "72,12/01/2020,15 to 16,Weekend",
        "73,13/01/2020,9 to 10,Free",
        "74,13/01/2020,10 to 11,Free",
        "75,13/01/2020,11 to 12,Free",
        "76,13/01/2020,13 to 14,Free",
        "77,13/01/2020,14 to 15,Free",
        "78,13/01/2020,15 to 16,Free",
        "79,14/01/2020,9 to 10,Free",
        "80,14/01/2020,10 to 11,Free",
        "81,14/01/2020,11 to 12,Free",
        "82,14/01/2020,13 to 14,Free",
        "83,14/01/2020,14 to 15,Free",
        "84,14/01/2020,15 to 16,Free",
        "85,15/01/2020,9 to 10,Free",
        "86,15/01/2020,10 to 11,Free",
        "87,15/01/2020,11 to 12,Free",
        "88,15/01/2020,13 to 14,Free",
        "89,15/01/2020,14 to 15,Free",
        "90,15/01/2020,15 to 16,Free",
        "91,16/01/2020,9 to 10,Free",
        "92,16/01/2020,10 to 11,Free",
        "93,16/01/2020,11 to 12,Free",
        "94,16/01/2020,13 to 14,Free",
        "95,16/01/2020,14 to 15,Free",
        "96,16/01/2020,15 to 16,Free",
        "97,17/01/2020,9 to 10,Free",
        "98,17/01/2020,10 to 11,Free",
        "99,17/01/2020,11 to 12,Free",
        "100,17/01/2020,13 to 14,Free",
        "101,17/01/2020,14 to 15,Free",
        "102,17/01/2020,15 to 16,Free"};
        String[] result = ViewData.retrieveCalenderForADoctor(path, doctorID);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getData method, of class ViewData.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        String userID = "";
        EPersonType personType = null;
        ERequiredDataWithinFile requiredData = null;
        String[] expResult = null;
        String[] result = ViewData.getData(userID, personType, requiredData);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


}
