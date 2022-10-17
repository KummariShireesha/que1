package oct17;
import java.util.Scanner;
public class Provider
{
	static Scanner sc = new Scanner(System.in);
    public static void operations()
    {
        System.out.println("Enter \n1.Insert\n2.Display\n3.Delete\n4.Update");
        int n = sc.nextInt();
        if(n==1)
        {
        System.out.println("Provide the detrails to add in data base");
        Provider.addData();
        }
        else if(n==2)
        {
        System.out.println("Your Data in Database is : ");
        Provider.displaydata();
        }
        else if(n==3)
        {
            deleteData();
            System.out.println("Data deleted");
        }
        else if(n==4)
        {
        	updateEmployee();
            System.out.println("");
        }
        else
        {
            System.out.println("Invalid selection\nSelect again");
            operations();
        }
    }
public static void addData() {
	System.out.println("====addData====");
Scanner sc=new Scanner(System.in);
System.out.println("enter your name");
String un=sc.next();
System.out.println("enter your password");
String password=sc.next();
Employee employee=new Employee();
employee.setUserName(un);
employee.setPassword(password);
EmployeeService service=new EmployeeService();
service.addEmployee(employee);

}
	private static void deleteData()
	{
		System.out.println("====deleteData======");
		 Scanner sc1=new Scanner(System.in);
		    Employee employee1 = new Employee();
		    System.out.println("Enter user name:");
			employee1.setUserName(sc1.next());
		    EmployeeService service1 = new EmployeeService();
		   service1.deleteEmployee(employee1);
	}
	private static void displaydata() 
	{
		System.out.println("===Displaying the data===");
        Employee employee=new Employee();
        EmployeeService service=new EmployeeService();
        service.displayEmployee();
		}
private static void updateEmployee()
{
	System.out.println("==updated==");
	Scanner sc2=new Scanner(System.in);
	Employee employee=new Employee();
	System.out.println("enter Username");
	employee.setUserName(sc2.next());
	System.out.println("enter password");
	employee.setPassword(sc2.next());
	EmployeeService service=new EmployeeService();
	service.updateEmployee(employee);
	
}
	public static void main(String []args) 
	{
		Employee employee=new Employee();
		//Provider.addData();
		//Provider.deleteData();
		//Provider.displaydata();
		Provider.operations();
	}
}