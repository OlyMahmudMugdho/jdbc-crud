import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","");
			PreparedStatement ps = conn.prepareStatement("INSERT INTO Persons(ID,FirstName,LastName) VALUES(?,?,?)");
			ps.setInt(1, 1002);
			ps.setString(2, "Mila");
			ps.setString(3, "Mefta");
			ps.execute();
			System.out.println("data added");
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
