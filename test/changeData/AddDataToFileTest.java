package changeData;

import static changeData.AddDataToFile.addToFile;
import static fileManagement.AmendFile.removeFileContents;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import soft252amartin.EPersonType;
import soft252amartin.ERequiredDataWithinFile;

public class AddDataToFileTest 
{
    
    public AddDataToFileTest() {
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
     * Test of addToFile method, of class AddDataToFile.
     */
    @Test
    public void testAddToFile01() {
        System.out.println("Test to a");
        String userID = "";
        String newData = "";
        EPersonType personType = null;
        boolean expResult = false;
        boolean result = AddDataToFile.addToFile(userID, newData, personType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToFile method, of class AddDataToFile.
     */
    @Test
    public void testAddToFile02() 
    {
        System.out.println("Test Add Message to message file in test folder");
        String newData = "this is a test message";
        String path = ("res\\Test\\MESSAGE.txt");
        ERequiredDataWithinFile requiredData = ERequiredDataWithinFile.MESSAGE;
        EPersonType personType = EPersonType.Test;
        // removes the contents of the test file
        removeFileContents(path);
        // add test contents to file
        addToFile(newData, requiredData, personType);
        // read the contents of the test file
        List list = new ArrayList<>(fileManagement.ReadFile.readFileContent(path));
        // convert list to string
        String fileMessage = list.toString();
        boolean result = fileMessage.contains(newData);
        assertEquals(true, result);
    }
    /**
     * Test of addNewMedicine method, of class AddDataToFile.
     */
    @Test
    public void testAddNewMedicine01() 
    {
        System.out.println("Test to check that a medicine is added to the medicine list");
        //set up variables
        String medicineName = "testtest";
        String quantity = "5";
        String unitDefinition = "kg";
        String medicineNotes = "testing notes";
        String comma = ",";
        String allTestData = medicineName + comma + quantity + comma + unitDefinition + comma + medicineNotes;
        String path = "res\\Test\\medicinesList.csv";
        //add test data to file
        boolean result = AddDataToFile.addNewMedicine(medicineName, quantity, unitDefinition, medicineNotes, path);
        // check test data has been added
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
     * Test of changeMedicineDetails method, of class AddDataToFile.
     */
    @Test
    public void testChangeMedicineDetails() {
        System.out.println("Test to check that a quantity of medicine has been amended");
        // set up test variables
        String medicineName = "medicine name4";
        String newQuantity = "20";
        String path = "res\\Test\\medicinesList.csv";
        // set up original test data varaibles
        String originalMedicineName = medicineName;
        String originalQuantity = "units remaining";
        String originalUnitDefinition = "unit definition";
        String orginalMedicineNotes = "medicine notes";
        String comma = ",";
        String newDataLine = originalMedicineName + comma + newQuantity + comma 
                + originalUnitDefinition + comma + orginalMedicineNotes;
        String orginalDataLine = originalMedicineName + comma + originalQuantity 
                + comma + originalUnitDefinition + comma + orginalMedicineNotes;
        // change quantity
        boolean result = AddDataToFile.changeMedicineDetails(medicineName, newQuantity, path);
        // check test data has been changed
        List conformation = new ArrayList<>();
        conformation = fileManagement.ReadFile.getLineContainingReturnList(path, medicineName);
        boolean conformationResult = false;
        if(conformation.get(0).equals(newDataLine)) conformationResult = true;
        //the test
        assertEquals(conformationResult, result);
        // undo changes
        result = AddDataToFile.changeMedicineDetails(medicineName, originalQuantity, path);
    }


    /**
     * Test of changeCalender method, of class AddDataToFile.
     */
    @Test
    public void testChangeCalender() {
        System.out.println("Test of changeCalender method, of class AddDataToFile.");
        String patientID = "P0001";
        String doctorID = "D0001";
        int rowNumber = 50;
        String path = "res\\Test\\Appointments.csv";
        String expResult = "the appointment is on 09/01/2020 at 10 to 11";
        String result = AddDataToFile.changeCalender(patientID, doctorID, rowNumber, path);
        assertEquals(expResult, result);
    }
}
