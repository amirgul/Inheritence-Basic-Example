public class Main
{

    public static void main(String[] args)
    {
        Employee first = new Employee("ahad", 36000, 1996, "12345");
        Employee second = new Employee("bilal", 12000, 1992, "1234");
        System.out.println(first);
        System.out.println();
        System.out.println(second);



    }
    public static void display(Employee one, Employee two)
    {
        if(one.getIdentificationNumber().equalsIgnoreCase(two.getIdentificationNumber()))
        {
            System.out.println("Both id's are same: means one employee");
        }
        else
            System.out.println("Two different employee");
    }
}
