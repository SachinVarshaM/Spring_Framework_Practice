import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBCon {
	
	public ResultSet ResultSetCon()
	{
		ResultSet rs=null;
		 try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sachin","root","admin");
				Statement stmt=con.createStatement();
				 rs=stmt.executeQuery("select productprice from Sale where pdate=date");
				 
				return rs;	 
			} catch (Exception e) {
				  System.out.println(e.getMessage());
			}
		  return null;
		
	}

}
