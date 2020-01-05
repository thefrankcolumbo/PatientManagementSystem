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

    /**
     * Test of prescribeMedication method, of class Doctor.
     */
    @Test
    public void testPrescribeMedication() {
        System.out.println("Test of prescribeMedication method, of class Doctor. TBCO");
        // set up variables
//        String medicineName = "";
//        String quantity = "";
//        String timeFrame = "";
//        String notes = "";
//        String patientID = "";
//        Doctor instance = new Doctor("D0001");
//        
//        boolean result = instance.prescribeMedication(medicineName, quantity, timeFrame, notes, patientID);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

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
        String allTestData = medicineName + "," + "0" + "," + unitDefinition + "," + medicineNotes;
        String path = "res\\Medication\\medicine.csv";
        Doctor instance = new Doctor("D0001");
        // run method
        boolean result = instance.createNewMedicine(medicineName, unitDefinition, medicineNotes);
        // check to see if test medicine has been added
        List conformation = new ArrayList<>();
        conformation = fileManagement.ReadFile.getLineContainingReturnList(path, medicineName);
        boolean conformationResult = false;
        if(conformation.get(0).equals(allTestData)) conformationResult = true;
        System.out.println(conformation.get(0));
        //test
        assertEquals(conformationResult, result);
        // now remove the test data
        if(conformationResult) fileManagement.AmendFile.removeLine(path, medicineName);
    }

    /**
     * Test of askSecretaryToOrderMedicine method, of class Doctor.
     */
    @Test
    public void testAskSecretaryToOrderMedicine() {
        System.out.println("askSecretaryToOrderMedicine");
        String medicineName = "";
        Doctor instance = null;
        boolean expResult = false;
        boolean result = instance.askSecretaryToOrderMedicine(medicineName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewPatientHistory method, of class Doctor.
     */
    @Test
    public void testViewPatientHistory() {
        System.out.println("viewPatientHistory");
        String userID = "";
        Doctor instance = null;
        String[] expResult = null;
        String[] result = instance.viewPatientHistory(userID);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewAppointment method, of class Doctor.
     */
    @Test
    public void testViewAppointment() {
        System.out.println("viewAppointment");
        Doctor instance = null;
        instance.viewAppointment();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAppointment method, of class Doctor.
     */
    @Test
    public void testCreateAppointment() {
        System.out.println("createAppointment");
        Doctor instance = null;
        instance.createAppointment();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of messageSecretary method, of class Doctor.
     */
    @Test
    public void testMessageSecretary() {
        System.out.println("messageSecretary");
        String message = "";
        Doctor instance = null;
        boolean expResult = false;
        boolean result = instance.messageSecretary(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedicineList method, of class Doctor.
     */
    @Test
    public void testGetMedicineList() {
        System.out.println("getMedicineList");
        Doctor instance = null;
        String[] expResult = null;
        String[] result = instance.getMedicineList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
