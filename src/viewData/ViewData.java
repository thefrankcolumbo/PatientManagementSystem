package viewData;

import soft252amartin.ERequiredDataWithinFile;
import static fileManagement.ReadFile.getLineContainingReturnList;
import static fileManagement.ReadFile.readFileContent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import soft252amartin.EPersonType;

public class ViewData 
{
    public static String[] retrieveCalender(String path)
    {
        return getAllDataFromFile(path, "ERROR CALL ADMINISTRATOR");
    }
    protected static String[] getMessages(String path)
    {
        return getAllDataFromFile(path, "NO MESSAGES");
    }
    protected static String[] getMedicineList(String path)
    {
        return getAllDataFromFile(path, "NO MEDICINES");
    }
    protected static String[] retrieveCalenderForADoctor(String path,String doctorID)
    {
        // get the column number for that doctor
        int column = getDoctorColumnNumber(doctorID);
        //create a temporary array of all the calender
        String[] tempStrings = retrieveCalender(path);
        int numberOfLines = tempStrings.length;
        //create a list
        List<String> contents = new ArrayList<>();
        // create another temp array to holde each line of calender
        String[] tempArray;
        // create a temporary string to put wanted parts of the array element into
        String tempString = "";
        for (String element : tempStrings)
        {
            tempArray = element.split(",");
            tempString = tempArray[0] + "," + tempArray[1] + "," + tempArray[2] + "," + tempArray[column];
            contents.add(tempString);
            tempString = "";
        }
        return convertListToStringArray(contents, numberOfLines);
    }
    protected static String[] getData(String userID, EPersonType personType, ERequiredDataWithinFile requiredData)
    {
        List<String> contents = new ArrayList<>();
        String[] data;
        String path = getPathName(userID, personType);
        contents = getLineContainingReturnList(path, requiredData.toString());
        int lengthOfList = contents.size();
        if (lengthOfList != 0)
        {
            data = convertListToStringArray(contents, lengthOfList);
            return data;
        }
        else
        {
            String[] noData = {"NO " + requiredData.toString() + "'S"};
            return noData;
        }
    }
    protected static String[] getAllPersonsPerticulars(EPersonType personType)
    {
        String[] dataRequired = getAllFileNamesInFolder(personType);
        for (String element: dataRequired)
        {
            element = element + getUserPerticulars(personType, element);
        }
        return dataRequired;
    }
    ////////////////////////////////////////////////////////////////////////////
    // private methods
    private static String getUserPerticulars(EPersonType personType, String userID)
    {
        String path = "res\\" + personType + "\\" + userID + ".csv";
        String[] tempArray = getAllDataFromFile(path, "");
        return tempArray[0];
    }
    private static String[] getAllFileNamesInFolder(EPersonType personType)
    {
        String path = "res//" + personType;
        List<String> results = new ArrayList<String>();
        File[] files = new File(path).listFiles();

        for (File file : files) 
        {
            if (file.isFile()) 
            {
                results.add(file.getName().replace(".csv", ""));
            }
        }
        
        return convertListToStringArray(results, results.size());
    }
    private static int getDoctorColumnNumber(String doctorID)
    {
        // remove starting letter
        String tempString = doctorID.substring(1, 5);
        // return the remaining 4 numbers as an int
        return (Integer.valueOf(tempString)+2);
    }
    private static String[] getAllDataFromFile(String path, String noDataMessage)
    {
        List<String> contents = new ArrayList<>();
        String[] data;
        contents = readFileContent(path);
        int lengthOfList = contents.size();
        if (lengthOfList != 0)
        {
            data = convertListToStringArray(contents, lengthOfList);
            return data;
        }
        else
        {
            String[] noData = {noDataMessage};
            return noData;
        }
    }
    private static String[] convertListToStringArray(List list, int sizeOfList)
    {
        String[] fred = new String[sizeOfList];
        for (int x = 0; x < sizeOfList; x++)
        {
            fred[x] = list.get(x).toString();
        }
        return fred;
    }
    private static String getPathName(String userID, EPersonType personType)
    {
        return ("res\\" + personType + "\\" + userID + ".csv");
    }
}
