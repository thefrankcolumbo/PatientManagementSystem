package viewData;

import soft252amartin.ERequiredDataWithinFile;
import static fileManagement.ReadFile.getLineContainingReturnList;
import static fileManagement.ReadFile.readFileContent;
import java.util.ArrayList;
import java.util.List;
import soft252amartin.EPersonType;

public class ViewData 
{
    protected static String[] getMessages(EPersonType personType, String path)
    {
        String[] data;
        List<String> contents = new ArrayList<>();
        contents = readFileContent(path);
        int lengthOfList = contents.size();
        if (lengthOfList != 0)
        {
            data = convertListToStringArray(contents, lengthOfList);
            return data;
        }
        else
        {
            String[] noData = {"NO MESSAGES"};
            return noData;
        }
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
    protected static String[] getMedicineList(String path)
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
            String[] noData = {"NO MEDICINES"};
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
