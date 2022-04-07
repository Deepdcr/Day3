import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA"," ");
		Statement st = conn.createStatement();
		ResultSet result = st.executeQuery("select * from friends");
	}

}
