package viewData;

import static viewData.ViewData.getMedicineList;

public class ViewMedicineList 
{
    /**
     * Method to get a list of all medicines and their details.
     * If there are no medicines then an array of one element is returned containing "NO MEDICINES"
     * @return String[]
     */
    public static String[] getMedicinesList()
    {
        String path = "res\\Medication\\medicine.csv";
        return getMedicineList(path);
    }
}
