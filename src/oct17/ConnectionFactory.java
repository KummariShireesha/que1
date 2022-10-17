package oct17;
import java.sql.*;
public class ConnectionFactory 
{
static Connection connection=null;
public static Connection getConnection()
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
	    Statement statement=connection.createStatement();
	    return connection;
		
	}
	catch(Exception e) {
		System.out.println(e);
	
	//return connection;
	}
	return connection;
}
}
