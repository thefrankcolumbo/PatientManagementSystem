
package fileManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Simple file reader
 * @author Alex Martin
 */
public class ReadFile 
{
    /**
     * returns all the lines within a file that contain the param searchFor
     * @param pathName
     * @param searchFor
     * @return List
     */
    public static List getLineContainingReturnList(String pathName, String searchFor)
    {
        List<String> contents = new ArrayList<>();
        BufferedReader br = null;
        try 
        {
            br = new BufferedReader(new FileReader(pathName));
            String line;
            while ((line = br.readLine()) != null) 
            {
                if (line.contains(searchFor)) contents.add(line);
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                if (br != null) 
                {
                    br.close();
                }
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }
        }
        return contents;
    }
    /**
     * returns contents of a file in a list. pathName MUST be directory and name e.g. "/tmp/afile.txt"
     * @param pathName
     * @return 
     */
    public static List readFileContent(String pathName)
    {
        List<String> contents = new ArrayList<>();
        BufferedReader br = null;
        try 
        {
            br = new BufferedReader(new FileReader(pathName));
            String line;
            while ((line = br.readLine()) != null) 
            {
                contents.add(line);
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                if (br != null) 
                {
                    br.close();
                }
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }
        }
        return contents;
    }
}

