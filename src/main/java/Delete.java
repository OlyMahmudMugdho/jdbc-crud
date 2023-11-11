import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/test";
			String username = "root";
			String password = "";
			Connection conn = DriverManager.getConnection(url,username,password);
			
			PreparedStatement ps = conn.prepareStatement("DELETE FROM Persons WHERE ID=?");
			
			ps.setInt(1, 1004);
			
			ps.execute();
			System.out.println("item deleted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
