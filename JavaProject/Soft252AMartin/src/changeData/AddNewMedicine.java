package changeData;

import static changeData.AddDataToFile.addNewMedicine;

public class AddNewMedicine 
{
    /**
     * Method to create a new medicine.
     * This medicine will be created will a 'in stock value of zero'.
     * The medicineName can not be the same as any other listed medicine - boolean false will be returned.
     * The parameter unitDefinition is to describe the units the medicine comes in e.g. tables, ml(millilitres).
     * The parameter medicineNotes are there for explanitory notes that might be required.
     * All on these parameters are manditory - else boolean false will be returned.
     * Boolean True will be return on successful creation.
     * @param medicineName String
     * @param unitDefinition String
     * @param medicineNotes String
     * @return boolean
     */
    public static boolean addANewMedicine(String medicineName, String unitDefinition,
            String medicineNotes)
    {
        String path = "res\\Medication\\medicine.csv";
        return addNewMedicine(medicineName, "0", unitDefinition,medicineNotes, path);
    }
}
