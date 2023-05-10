import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.transform.Result;
public class Evaluacion3_P6 {
	public static void main(String[] args) throws Exception {
		
		Connection conn = null;
		String driver = "com.mysql.cj.jdbc.Driver";
		String db = "Evaluacion3";
		String url = "jdbc:mysql://localhost:3306/" + db;
		String user = "root";
		String pass = "Reyes562";
		System.out.println("Connected to database : " + db);
	
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,pass);
			System.out.println("Connected to database : " + db);
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from tabla_p6");
			while(rs.next()){
				
				System.out.println("ID:" + rs.getString(1)
				+ "\nNombre: "+rs.getString(2));
			}
		} catch (SQLException e) {
			
			System.out.println("SQLException: "+e.getMessage());
			System.out.println("SQLState: "+e.getSQLState());
			System.out.println("VendorError: "+e.getErrorCode());
		}
	
	}
}