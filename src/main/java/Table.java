import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Table {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","");
			PreparedStatement ps = conn.prepareStatement("CREATE TABLE Persons(ID int, FirstName varchar(255), LastName varchar(255))");
			ps.execute();
			System.out.println("Table Created");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
