package changeData;

import soft252amartin.EPersonType;
import static fileManagement.AmendFile.appendStringToFile;
import static fileManagement.AmendFile.removeFileContents;
import static fileManagement.AmendFile.removeLine;
import static fileManagement.ReadFile.getLineContainingReturnList;
import java.util.ArrayList;
import java.util.List;
import soft252amartin.ERequiredDataWithinFile;
import static viewData.ViewData.retrieveCalender;

public class AddDataToFile 
{
    /**
     * Method to add data to the next line of a current user data file.
     * Returns True if successful.
     * Returns False if unsuccessful or file doesn't exist.
     * @param userID
     * @param newData
     * @param personType
     * @return boolean
     */
    protected static boolean addToFile(String userID, String newData, EPersonType personType)
    {
        //make path
        String path = ("res\\" + personType + "\\" + userID + ".csv");
        try 
        {
            //append to file
            appendStringToFile(path, newData);
            return true;
        } 
        catch (Exception e) 
        {
            //log file ??
            return false;
        }
    }
    /**
     * Method to add a message to a message file.
     * Returns true if successful.
     * Returns false if unsuccessful or file does not exist.
     * @param newData
     * @param requiredData
     * @param personType
     * @return 
     */
    protected static boolean addToFile(String newData, ERequiredDataWithinFile requiredData, EPersonType personType)
    {
        //make path
        String path = ("res\\" + personType + "\\" + requiredData.toString() + ".csv");
        try 
        {
            //append to file
            appendStringToFile(path, newData);
            return true;
        } 
        catch (Exception e) 
        {
            //log file ??
            return false;
        }
    }
    protected static boolean addNewMedicine(String medicineName, String quantity, 
            String unitDefinition, String medicineNotes, String path)
    {
        String[] tempArray = {medicineName,quantity,unitDefinition,medicineNotes};
        String newData = makeCSVFormat(tempArray);
        try 
        {
            //append to file
            appendStringToFile(path, newData);
            return true;
        } 
        catch (Exception e) 
        {
            //log file ??
            return false;
        }
    }
    protected static boolean changeMedicineDetails(String medicineName, String newQuantity, String path)
    {
        List dataLine = new ArrayList<>();
        String[] newDataLine;
        boolean success = checkMedicineName(medicineName);
        if(success) 
        {
            dataLine = getLineContainingReturnList(path, medicineName);
            newDataLine = updateQuantity(dataLine, newQuantity);
            removeLine(path, medicineName);
            success = addNewMedicine(newDataLine[0], newDataLine[1], 
                    newDataLine[2], newDataLine[3], path);
        }
        return success;
    }
    protected static String changeCalender(String patientID, String doctorID, int rowNumber, String path)
    {
        // place the calender into a temp variable
        String[] holdingStringArray = retrieveCalender(path);
        //put calender into a 2d array
        int numberOfRows = holdingStringArray.length;
        String[] tempArray = holdingStringArray[5].split(",");
        int numberOfColumns = tempArray.length;
        String[][] two2Array = new String[numberOfRows][numberOfColumns];
        // set up 2d varriables
        int outerCounter = 0;
        int innerCounter = 0;
        String[] tempString;
        int columnForDoctorID = 0;
        //put into a 2d array and get column number
        for (String elements: holdingStringArray)
        {
            tempString = elements.split(",");
            innerCounter = 0;
            for(String element : tempString)
            {
                two2Array[outerCounter][innerCounter] = element;
                if(element.contentEquals(doctorID)) columnForDoctorID = innerCounter;
                innerCounter++;
            }
            outerCounter++;
            tempString = null;
        }
        // update appointment calendar
        two2Array[rowNumber][columnForDoctorID] = doctorID;
        // empty orginal file
        removeFileContents(path);
        // add the temp array back into the file
        String dataForFile = "";
        for(outerCounter = 0; outerCounter < two2Array.length; outerCounter++)
        {
            for(int count = 0; count < numberOfColumns; count++)
            {
                dataForFile = dataForFile + two2Array[outerCounter][count] + ",";
            }
            appendStringToFile(path, dataForFile.substring(0, dataForFile.length()-1));
            dataForFile = "";
        }
        // make string to return
        String returnValue = "the appointment is on " + two2Array[rowNumber][1] + " at " + two2Array[rowNumber][2];
        return returnValue;
    }
    ////////////////////////////////////////////////////////////////////////////
    // private methods
    private static int getDoctorColumnNumber(String doctorID, String[] array)
    {
        //check for empty line
        boolean number = false;
        int count = 0;
        String[] tempString;
        while(!number)
        {
            tempString = array[count].split(",");
            if(!tempString.toString().isEmpty())
            {
                number = true;
                break;
            }
            tempString = null;
            count++;
        }
        //get column number
        int column = 0;
        String[] anotherTempString = array[count].split(",");
        for (int x = 3; x < anotherTempString.length; x++)
        {
            if(anotherTempString[x].equalsIgnoreCase(doctorID)) column = x;
        }
        return column;
    }
    private static String makeCSVFormat(String[] array)
    {
        String data= "";
        String comma = ",";
        for (String element: array)
        {
            data = data + element + comma;
        }
        //removes the last comma
        return data.substring(0, data.length() - 1);
    }
    private static String[] updateQuantity(List dataLine, String newQuantity)
    {
        String[] tempArray = dataLine.get(0).toString().split(",");
        tempArray[1] = newQuantity;
        return tempArray;
    }
    ////////////////////////////////////////////////////////////////////////////
    // TO BE UPDATED ///////////////////////////////////////////////////////////
    private static boolean checkMedicineName(String name)
    {
        return true;
    }
}
