import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
		
		
		PreparedStatement pst = conn.prepareStatement("DELETE FROM FRIENDS WHERE FRND_ID =?");

		Scanner scan1 = new Scanner(System.in);  
		  
		
		System.out.println("Enter friend id : ");		
		int fid = scan1.nextInt();
		
		pst.setInt(1,fid);
		
		int rows = pst.executeUpdate();
		System.out.println("rows are deleted "+rows);
		
		pst.close();
		conn.close();
		
		}
		catch(SQLException e)
		{
		System.out.println("some sql problem "+e);	
		}
		}
}


