package p0214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDB {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String username = "root";
		String password = "r1r2r3";
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM FOOD_INFO";
			sql += " WHERE FI_NAME = '해장라면'";
			int result = statement.executeUpdate(sql);
			if(result >= 1) {
				System.out.println("삭제 성공!");
			} else {
				System.out.println("삭제 실패..");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
