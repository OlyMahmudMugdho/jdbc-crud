import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306","root","");
			PreparedStatement ps = conn.prepareStatement("CREATE DATABASE test");
			ps.execute();
			System.out.println("DB created");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
