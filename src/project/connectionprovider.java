package project;
import java.sql.*;

public class connectionprovider {
	public static Connection getCon()throws Exception
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123456");
			return con;
			
			
		}
		catch(Exception e)
		{
			return null;
		}
//			finally {
//			 try {
//			        if (con != null) {
//			            con.close();
//			        }
//			      } catch (SQLException ex) {
//			          System.out.println(ex.getMessage());
//			      }
//		}
	}
}
