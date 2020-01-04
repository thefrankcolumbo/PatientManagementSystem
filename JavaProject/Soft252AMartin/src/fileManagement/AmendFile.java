
package fileManagement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Simple file to amend .txt and .csv files
 * @author Alex Martin
 */
public class AmendFile 
{
    /**
     * Apends a string starting on the next line to a .txt file.
     * directoryPath MUST be full path and file name:
     * e.g. /tmp/afolder/afile.txt
     * @param directoryPath
     * @param stringText 
     */
    public static void apendStringToFile(String directoryPath, String stringText)
    {
        try 
        {
            String text = "\r\n" + stringText;
            Files.write(Paths.get(directoryPath), text.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) 
        {
            System.out.println("START ERROR JavaFileManagement.FileManagement.amendFile");
            System.out.println("Exception: " + e);
            System.out.println("directoryPath: " + directoryPath);
            System.out.println("stringText: " + stringText);
            System.out.println("END ERROR JavaFileManagement.FileManagement.amendFile");
        }
    }
    /**
     * Remove the whole line from a txt file with the exact match from lineContent String
     * @param directoryPath
     * @param stringText 
     */
    public static void removeLine(String directoryPath, String stringText)
    {
        try 
        {
            File file = new File(directoryPath);
            List<String> out = Files.lines(file.toPath())
                    .filter(line -> !line.contains(stringText))
                    .collect(Collectors.toList());
            Files.write(file.toPath(), out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
        }
        catch (IOException ex)
        {
            System.out.println("START ERROR JavaFileManagement.FileManagement.removeLine");
            System.out.println("Exception: " + ex);
            System.out.println("directoryPath: " + directoryPath);
            System.out.println("stringText: " + stringText);
            System.out.println("END ERROR JavaFileManagement.FileManagement.removeLine");
        }
    }
}
