package p0214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDB {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}// Driver
		String url = "jdbc:mysql://localhost:3306/ezen";
		String username = "root";
		String password = "r1r2r3";
		try {
			Connection con = DriverManager.getConnection(url, username, password); 
			Statement stmt = con.createStatement();// statement
			String sql = "INSERT INTO FOOD_INFO(FI_NAME, FI_PRICE)";
			sql += "VALUES('참치김밥',2000)";
			int result = stmt.executeUpdate(sql);//변경된 row 수 리턴
			if(result >= 1) {
				System.out.println("입력성공!");
			}else {
				System.out.println("입력실패!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			//연결하는 서버에 연결이 끊김
			//sql에서 인터넷에 연결 할 수 없음
			//url, username, password 중 하나가 틀림
		}
		
	}
}
