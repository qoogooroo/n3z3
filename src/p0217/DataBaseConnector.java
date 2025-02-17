package p0217;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//클래스 내부 순서 규칙
//멤버변수
//생성자
//초기화블럭
//메소드
public class DataBaseConnector {
	private static final String URL = "jdbc:mysql://localhost:3306/ezen";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "r1r2r3";
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//어떤 유심 쓸지 얘기해주기
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//throws
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
	public static void main(String[] args) {
		try {
			Connection connection = getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
