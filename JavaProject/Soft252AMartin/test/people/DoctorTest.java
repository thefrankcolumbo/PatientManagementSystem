package people;

import static fileManagement.ReadFile.getLineContainingReturnList;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DoctorTest {
    
    public DoctorTest() {
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
    ////////////////////////////////////////////////////////////////////////////
    //////////Passed ///////////////////////////////////////////////////////////
    /**
     * Test of makeNotes method, of class Doctor.
     */
    @Test
    public void testMakeNotes() {
        System.out.println("Test of makeNotes method, of class Doctor.");
        // set up variables
        String userID = "P0001";
        String newData = "this is test notes";
        String path = ("res\\Patient\\P0001.csv");
        boolean expResult = true;
        // set up doctor object
        Doctor instance = new Doctor("D0001");
        String testString = "NOTES," + instance.surname + "," + newData;
        // run method
        instance.makeNotes(userID, newData);
        // check to see if test notes have been added
        // read the contents of the tested file
        List list = new ArrayList<>(getLineContainingReturnList(path, testString));
        boolean conformationResult = false;
        // test to see if the test notes are there
        if(list.get(0).equals(testString)) conformationResult = true;
        // test results
        assertEquals(conformationResult, expResult);
        // remove test notes
        if(conformationResult) fileManagement.AmendFile.removeLine(path, testString);
    }
    //////////Passed ///////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    //////////Passed ///////////////////////////////////////////////////////////
    /**
     * Test of createNewMedicine method, of class Doctor.
     */
    @Test
    public void testCreateNewMedicine() {
        System.out.println("createNewMedicine");
        // set up variables
        String medicineName = "testtest";
        String unitDefinition = "kg";
        String medicineNotes = "testing notes";
        String allTestData = medicineName + "," + "0" + "," + unitDefinition 
                + "," + medicineNotes;
        String path = "res\\Medication\\medicine.csv";
        Doctor instance = new Doctor("D0001");
        // run method
        boolean result = instance.createNewMedicine(medicineName, 
                unitDefinition, medicineNotes);
        // check to see if test medicine has been added
        List conformation = new ArrayList<>();
        conformation = fileManagement.ReadFile.getLineContainingReturnList
        (path, medicineName);
        boolean conformationResult = false;
        if(conformation.get(0).equals(allTestData)) conformationResult = true;
        System.out.println(conformation.get(0));
        //test
        assertEquals(conformationResult, result);
        // now remove the test data
        if(conformationResult) fileManagement.AmendFile.removeLine
        (path, medicineName);
    }
    //////////Passed ///////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    //////////Passed ///////////////////////////////////////////////////////////
    /**
     * Test of askSecretaryToOrderMedicine method, of class Doctor.
     */
    @Test
    public void testAskSecretaryToOrderMedicine() {
        System.out.println("Test of askSecretaryToOrderMedicine method, of class Doctor.");
        String medicineName = "testMedicine";
        String path = "res\\Secretary\\MESSAGE.csv";
        String testString = "MESSAGE,Please order more " + medicineName;
        Doctor instance = new Doctor("D0001");
        boolean expResult = true;
        // run method
        instance.askSecretaryToOrderMedicine(medicineName);
        // check if message is there 
        List list = new ArrayList<>(getLineContainingReturnList(path, testString));
        boolean conformationResult = false;
        // test to see if the test notes are there
        if(list.get(0).equals(testString)) conformationResult = true;
        // test results
        assertEquals(conformationResult, expResult);
        // remove test notes
        if(conformationResult) fileManagement.AmendFile.removeLine(path, testString);
    }
    //////////Passed ///////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    //////////Passed ///////////////////////////////////////////////////////////
    /**
     * Test of viewPatientHistory method, of class Doctor.
     */
    @Test
    public void testViewPatientHistory() {
        System.out.println("Test of viewPatientHistory method, of class Doctor.");
        String userID = "P1000";
        Doctor instance = new Doctor("D0001");
        String[] expResult = {"NOTES,Lecter,Has paranoia that people are going "
                + "to be murdered. Also is donning colourful suede footwear "
                + "white suit and is eating cheeseburgers. Suspect King Complex "
                + "dieases","NOTES,Jekyll,Has paranoia that people are going to "
                + "be murdered. Is also weeping and has RSI casued by hours of "
                + "tearing up holiday photos. Suspect Broken Heart disease"};
        String[] result = instance.viewPatientHistory(userID);
        assertArrayEquals(expResult, result);
    }
    //////////Passed ///////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    //////////Passed ///////////////////////////////////////////////////////////
    /**
     * Test of messageSecretary method, of class Doctor.
     */
    @Test
    public void testMessageSecretary() {
        System.out.println("Test of messageSecretary method, of class Doctor.");
        String message = "test message test message test message";
        String path = "res\\Secretary\\MESSAGE.csv";
        String testString = "MESSAGE,test message test message test message";
        Doctor instance = new Doctor("D0001");
        boolean expResult = true;
        // run method
        instance.messageSecretary(message);
        // check if message is there 
        List list = new ArrayList<>(getLineContainingReturnList(path, testString));
        boolean conformationResult = false;
        // test to see if the test notes are there
        if(list.get(0).equals(testString)) conformationResult = true;
        // test results
        assertEquals(conformationResult, expResult);
        // remove test notes
        if(conformationResult) fileManagement.AmendFile.removeLine(path, testString);
    }
    //////////Passed ///////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    //////////Passed ///////////////////////////////////////////////////////////
    /**
     * Test of proposeAppointment method, of class Doctor.
     */
    @Test
    public void testProposeAppointment() {
        System.out.println("Test of proposeAppointment method, of class Doctor.");
        String patientID = "P0001";
        Doctor instance = new Doctor("D0001");
        String path = "res\\Secretary\\MESSAGE.csv";
        String message = "test test test";
        boolean expResult = true;
        String testString = "MESSAGE,I " + instance.uniqueIdentifier + " " 
                + instance.surname + " would like an appointment with " 
                + patientID + " at " + message;
        boolean result = instance.proposeAppointment(patientID, message);
        assertEquals(expResult, result);
        // check if message is there 
        List list = new ArrayList<>(getLineContainingReturnList(path, testString));
        boolean conformationResult = false;
        // test to see if the test notes are there
        if(list.get(0).equals(testString)) conformationResult = true;
        // test results
        assertEquals(conformationResult, expResult);
        // remove test notes
        if(conformationResult) fileManagement.AmendFile.removeLine(path, testString);
    }
    //////////Passed ///////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
}
