package oct17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class EmployeeService implements EmployeeDao{

	
	private Employee employee;

	@Override
	public void addEmployee(Employee employee) {
		ArrayList<Employee>arrayList=new ArrayList<Employee>();
		
		try 
		{
			Connection con = ConnectionFactory.getConnection();
            Statement stmt= con.createStatement();
            stmt.executeUpdate("Insert into employee(`name`,`password`)values('"+employee.getUserName()+"','"+employee.getPassword()+"')");
			//ResultSet set = statement.executeQuery("select * from employee");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	} 

//	@Override
//	public void updateEmployee()
//	{
//	Scanner scanner=new Scanner(System.in);
//	System.out.println("please enter user password");
//	String password=scanner.next();
//		
//	}

	@Override
	public void deleteEmployee(Employee employee) {
		try
	       {
	            Connection con = ConnectionFactory.getConnection();
	            Statement stmt= con.createStatement();
	           
				stmt.executeUpdate("delete from employee where name='"+employee.getUserName()+"'");
	        }
	        catch (Exception e)
	        {
	            System.out.println(e);
	        }
	}
		// TODO Auto-generated method stub
		
	
		

	@Override
	public void displayEmployee() {
	try 
		{
			Connection con = ConnectionFactory.getConnection();
	        Statement stmt= con.createStatement();
	       
			ResultSet rs=stmt.executeQuery("SELECT * FROM demo.employee");
			while (rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
				
			}
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
	}
@Override
	public void updateEmployee(Employee employee)
	{
		try
		{
			Connection con = ConnectionFactory.getConnection();
	        Statement stmt= con.createStatement();
	        String sql="update employee set password='"+employee.getPassword()+"' where name= '"+employee.getUserName()+"'"; 
//	        PreparedStatement stmt1=con.prepareStatement(sql);
//	         stmt.setString(1,inputpass);
//	         stmt.setString(2,inputname);
	        int i=stmt.executeUpdate(sql);
	        if(i>0)
	        {
	        	System.out.println("updated");
	        }
	        else
	        {
	        	System.out.println("not updated");
	        }}
	        catch(Exception e)
	        {
	        	System.out.println(e);
	        }
	        
		}
		
	

	private void executeUpdate() 
	{
		// TODO Auto-generated method stub
		
	}



	@Override
	public void updateEmployee()
	{
		// TODO Auto-generated method stub
		
	}



	}	
