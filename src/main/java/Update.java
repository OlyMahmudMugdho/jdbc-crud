import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			PreparedStatement ps = conn.prepareStatement("UPDATE Persons SET ID=? WHERE ID=?");
			ps.setInt(1, 1001);
			ps.setInt(2, 101);
			
			ps.execute();
			System.out.println("data updated");
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
