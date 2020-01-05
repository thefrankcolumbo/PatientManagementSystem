package people;

import static fileManagement.ReadFile.readFileContent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import soft252amartin.EPersonType;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class Person 
{
    protected String title;
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
    protected Person(String uniqueIdentifier, String type) 
    {
        this.uniqueIdentifier = uniqueIdentifier;
        loadPerson(type);
        setAge();
    }
    private void loadPerson (String type)
    {
        List data = getDataFromFile(type);
        loadData(data);
    }
    private void loadData(List data)
    {
        String tempString = data.toString();
        tempString = tempString.replace("[", "");
        tempString = tempString.replace("]", "");
        String[] userData = tempString.split(",");
        setTitle(userData[0]);
        setGivenName(userData[1]);
        setSurname(userData[2]);
        setAddressLine1(userData[3]);
        setAddressLine2(userData[4]);
        setAddressLine3(userData[5]);
        setAddressPostcode(userData[6]);
        setDOB(userData[7]);
        setPersonType(EPersonType.valueOf(userData[8]));
    }
    private List getDataFromFile(String type)
    {
        String path = "res\\" + type + "\\" + this.uniqueIdentifier + ".csv";
        List list = new ArrayList<>(readFileContent(path));
        return list;
    }
    ////////////////////////////////////////////////////////////////////////////
    // private setters
    private void setPersonType(EPersonType personType) 
    {
        this.personType = personType;
    }
    private void setAge()
    {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
            Date dateOfBirth = sdf.parse(this.DOB);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateOfBirth);
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH) + 1;
            int date = calendar.get(Calendar.DATE);
            LocalDate l1 = LocalDate.of(year, month, date);
            LocalDate now1 = LocalDate.now();
            Period diff1 = Period.between(l1, now1);
            this.age = (int)diff1.getYears();
        } 
        catch (ParseException ex) 
        {
            // log ???
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    // protected setters
    protected void setTitle(String title) 
    {
        this.title = title;
    }
    protected void setGivenName(String givenName) 
    {
        this.givenName = givenName;
    }
    protected void setSurname(String surname) 
    {
        this.surname = surname;
    }
    protected void setAddressLine1(String addressLine1) 
    {
        this.addressLine1 = addressLine1;
    }
    protected void setAddressLine2(String addressLine2) 
    {
        this.addressLine2 = addressLine2;
    }
    protected void setAddressLine3(String addressLine3) 
    {
        this.addressLine3 = addressLine3;
    }
    protected void setAddressPostcode(String addressPostcode) 
    {
        this.addressPostcode = addressPostcode;
    }
    protected void setDOB(String DOB) 
    {
        this.DOB = DOB;
    }
    private void setUniqueIdentifier(String uniqueIdentifier) 
    {
        this.uniqueIdentifier = uniqueIdentifier;
    }
    ////////////////////////////////////////////////////////////////////////////
    // public getters
    public String getTitle() 
    {
        return title;
    }
    public String getGivenName() 
    {
        return givenName;
    }
    public String getSurname() 
    {
        return surname;
    }
    public String getAddressLine1() 
    {
        return addressLine1;
    }
    public String getAddressLine2() 
    {
        return addressLine2;
    }
    public String getAddressLine3() 
    {
        return addressLine3;
    }
    public String getAddressPostcode() 
    {
        return addressPostcode;
    }
    public String getUniqueIdentifier() 
    {
        return uniqueIdentifier;
    }
    public String getDOB() 
    {
        return DOB;
    }
    public int getAge() 
    {
        return age;
    }
    public EPersonType getPersonType() 
    {
        return personType;
    }

    
    
}
