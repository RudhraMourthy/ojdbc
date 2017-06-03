import java.util.*;
import java.sql.*;
public class Database {
	
	public static void main(String [] args) {
		try
		{
			Connection con = null;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//con = DriverManager.getConnection("Jdbc:Oracle:thin:@orcl.rmk.ac.in:1521:orcl","scott","tiger");
	if(con != null)
	System.out.println("Connection successfull");
	else
		System.out.println("Connection not successfull");	
	con.close();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	

}

