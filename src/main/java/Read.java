import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class Read {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","");
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Persons");

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
