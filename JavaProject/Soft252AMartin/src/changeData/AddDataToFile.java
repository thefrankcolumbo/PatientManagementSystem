package changeData;

import soft252amartin.EPersonType;
import static fileManagement.AmendFile.appendStringToFile;
import static fileManagement.AmendFile.removeLine;
import static fileManagement.ReadFile.getLineContainingReturnList;
import java.util.ArrayList;
import java.util.List;
import soft252amartin.ERequiredDataWithinFile;

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
