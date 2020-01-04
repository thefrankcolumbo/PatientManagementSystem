package viewData;

import soft252amartin.ERequiredData;
import static fileManagement.ReadFile.getLineContainingReturnList;
import java.util.ArrayList;
import java.util.List;
import soft252amartin.EPersonType;

public class ViewData 
{
    protected static String[] getData(String userID, EPersonType personType, ERequiredData requiredData)
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
