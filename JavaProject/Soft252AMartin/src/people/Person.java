
package people;

import java.time.LocalDate;
import java.time.Period;

public abstract class Person 
{
    protected String givenName;
    protected String surname;
    protected String addressLine1;
    protected String addressLine2;
    protected String addressLine3;
    protected String addressPostcode;
    protected String uniqueIdentifier;
    protected String DOB;
    protected int age;
    protected EPersonType personType;
    
    // constructor to get an already existing person
    protected Person(String uniqueIdentifier) 
    {
        getDataFromFile();
        setAge();
    }
    // constructor to create a new person
    protected Person(String givenName, String surname, String addressLine1, 
            String addressLine2, String addressLine3, String addressPostcode, 
            String DOB, EPersonType personType) 
    {
        this.personType = personType;
        createUniqueIdentifier();
        createFile();
        setAge();
    }
    private void getDataFromFile()
    {
        
    }
    private void createUniqueIdentifier()
    {
        
    }
    private void createFile()
    {
        
    }

    private void setPersonType(EPersonType personType) {
        this.personType = personType;
    }
    
    private void setAge()
    {
        LocalDate dob = LocalDate.parse(this.DOB);
        LocalDate curDate = LocalDate.now();
        this.age = Period.between(dob, curDate).getYears();
    }

    
}
