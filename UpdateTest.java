import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class UpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
		
		
		PreparedStatement pst = conn.prepareStatement("UPDATE FRIENDS SET FRND_NAME=?, FRND_TYPE=? WHERE FRND_ID=?");

		 
		Scanner scan2 = new Scanner(System.in);   
		Scanner scan3 = new Scanner(System.in);   
		Scanner scan1 = new Scanner(System.in);  
		
		System.out.println("Enter friend name : ");			String fnm = scan2.next();
		System.out.println("Enter friend type : ");			String ftyp = scan3.next();
		System.out.println("Enter friend id : ");			int fid = scan1.nextInt();
	
		
		pst.setString(1,fnm);
		pst.setString(2,ftyp);
		pst.setInt(3,fid);
		
		int rows = pst.executeUpdate();
		System.out.println("rows are UPDATED "+rows);
		
		pst.close();
		conn.close();
		
		}
		catch(SQLException e)
		{
		System.out.println("some sql problem "+e);	
		}
		}
		
	}


