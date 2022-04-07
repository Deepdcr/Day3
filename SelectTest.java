
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
			Statement st = 	conn.createStatement();
			
			ResultSet result = st.executeQuery("SELECT * FROM friends");
			while(result.next()) {
				int x = result.getInt(1);
				String y = result.getString(2);
				String z = result.getString(3);
				System.out.println("Friend id   : "+x);
				System.out.println("Friend name : "+y);
				System.out.println("Friend type : "+z);
				System.out.println("------------------------------");
			}
			//6. close the statements, connection
			st.close();
			conn.close();
		}
		catch(SQLException e) {
			System.out.println("Some sql problem : "+e);
		}
	}

}
