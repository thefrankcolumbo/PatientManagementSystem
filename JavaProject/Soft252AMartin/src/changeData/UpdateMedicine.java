package changeData;

import static changeData.AddDataToFile.changeMedicineDetails;

public class UpdateMedicine 
{
    /**
     * Method to change the quantity of a medicine in the medicine file list.
     * Will return true if quantity changed.
     * @param medicineName String
     * @param newQuantity String
     * @return boolean
     */
    public static boolean upDateMedicineQuantity(String medicineName, String newQuantity)
    {
        final String PATH = "res\\Medication\\medicine.csv";
        return changeMedicineDetails(medicineName, newQuantity, PATH);
    }
}
