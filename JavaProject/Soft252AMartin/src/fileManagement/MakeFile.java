
package fileManagement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Simple library to make a file. ONLY tested with .txt and .csv
 * @author Alex Martin
 */
public class MakeFile 
{
    /**
     * Create a text file form List. directory MUST be path e.g. "/temp/".
     * FileName must include type e.g. "aTextFile.txt"
     * @param fileContents - List
     * @param fileName
     * @param directory 
     */
    public static void makeFile 
        (List fileContents, String fileName, String directory)
    {
        fileMaker(fileContents, fileName, directory);
    }
    /**
     * Create a text file form String[]. directory MUST be path e.g. "/temp/"
     * FileName must include type e.g. "aTextFile.txt"
     * @param fileContents - String[]
     * @param fileName
     * @param directory 
     */
    public static void makeFile 
        (String[] fileContents, String fileName, String directory)
    {
        fileMaker(fileContents, fileName, directory);
    }
    /**
     * Method to create an empty file.
     * Parameter fileNameAndDirectory must be full
     * e.g. /temp/anotherfolder/test.txt
     * @param fileNameAndDirectory 
     */
    public static void makeFile (String fileNameAndDirectory)
    {
        fileMaker(fileNameAndDirectory);
    }
            /**
     * Create a text file form String[]. directory MUST be path e.g. "/temp/"
     * FileName must include type e.g. "aTextFile.txt"
     * @param fileContents - String
     * @param fileName
     * @param directory 
     */
    public static void makeFile 
        (String fileContents, String fileName, String directory)
    {
        fileMaker(fileContents, fileName, directory);
    }
    /**
     * Create a text file form List. directory MUST be path e.g. "/temp/"
     * FileName must include type e.g. "aTextFile.txt"
     * @param fileContents - List
     * @param fileName
     * @param directory
     * @return 
     */
    public static boolean makeFileReturnBool 
        (List fileContents, String fileName, String directory)
    {
        boolean success = fileMaker(fileContents, fileName, directory);
        return success;
    }
    /**
     * Create a text file form String[]. directory MUST be path e.g. "/temp/"
     * FileName must include type e.g. "aTextFile.txt"
     * @param fileContents - String[]
     * @param fileName
     * @param directory
     * @return 
     */
    public static boolean makeFileReturnBool 
        (String[] fileContents, String fileName, String directory)
    {
        boolean success = fileMaker(fileContents, fileName, directory);
        return success;
    }
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    private static boolean fileMaker
        (List fileContents, String fileName, String directory)
    {
        boolean success = false;
        try 
        {
            File file = new File(directory + fileName );
            try (BufferedWriter output = new BufferedWriter(new FileWriter(file))) {
                for(int x = 0; x <fileContents.size();x++)
                {
                    output.write(fileContents.get(x).toString());
                    output.newLine();
                }
            }
            success = true;
        }
        catch ( IOException e ) 
        {
            e.printStackTrace();
        }
        return success;
    }
    private static boolean fileMaker
        (String[] fileContents, String fileName, String directory)
    {
        boolean success = false;
        try 
        {
            File file = new File(directory + fileName );
            try (BufferedWriter output = new BufferedWriter(new FileWriter(file))) {
                for(int x = 0; x <fileContents.length;x++)
                {
                    output.write(fileContents[x]);
                    output.newLine();
                }
            }
            success = true;
        }
        catch ( IOException e ) 
        {
            e.printStackTrace();
        }
        return success;
    }
    private static boolean fileMaker
        (String fileContents, String fileName, String directory)
    {
        boolean success = false;
        try 
        {
            File file = new File(directory + fileName );
            try (BufferedWriter output = new BufferedWriter(new FileWriter(file))) {
                output.write(fileContents);
                output.newLine();
            }
            success = true;
        }
        catch ( IOException e ) 
        {
            e.printStackTrace();
        }
        return success;
    }
        private static boolean fileMaker(String fileNameAndDirectory)
    {
        boolean success = false;
        try 
        {
            File file = new File(fileNameAndDirectory );
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.close();
            success = true;
        }
        catch ( IOException e ) 
        {
            e.printStackTrace();
        }
        return success;
    }
}
