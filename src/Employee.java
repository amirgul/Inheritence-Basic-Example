public class Employee extends Person
{
    private double annualSalery;
    private int hireDate;
    private String identificationNumber;
    public Employee()
    {
        super();
        annualSalery = 0;
        hireDate = 0;
        identificationNumber = "none";
    }
    public Employee(String name, double initialAnnualSalery, int initialHireDate, String initialId)
    {
        super(name);
        annualSalery = initialAnnualSalery;
        hireDate = initialHireDate;
        identificationNumber = initialId;
    }
    public void set(String newName, double newSalery, int newHireDate, String newID)
    {
        setName(newName);
        annualSalery = newSalery;
        hireDate = newHireDate;
        identificationNumber = newID;
    }
    public double getAnnualSalery()
    {
        return annualSalery;
    }
    public int getHireDate()
    {
        return hireDate;
    }
    public String getIdentificationNumber()
    {
        return identificationNumber;
    }
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("annualSalery: " + annualSalery);
        System.out.println("HireDate: " + hireDate);
        System.out.println("identificationNumber: " + identificationNumber);
    }

    public boolean equals(Object otherObject)
    {
        boolean isTrue = false;
        if((otherObject != null) &&(otherObject instanceof Employee))
        {
            Employee otherEmployee = (Employee)otherObject;
            isTrue = hasSameName(otherEmployee)
                    &&annualSalery == otherEmployee.annualSalery
                    &&hireDate == otherEmployee.hireDate
                    &&identificationNumber.equalsIgnoreCase(otherEmployee.identificationNumber);
        }
        return isTrue;
    }
    public String toString()
    {
        return "name: " + getName() +" \n annualSalery: "+ annualSalery + " \n hireDate: " + hireDate + " \n identificationNumber: " + identificationNumber;
    }

}
