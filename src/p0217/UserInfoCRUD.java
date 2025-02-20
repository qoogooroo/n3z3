package p0217;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfoCRUD {
//select insert update delete
	//userinfo 에서만 연결해서 사용할거니까 private로 구현
	private final static String URL = "jdbc:mysql://localhost:3306/ezen";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "r1r2r3";
	private final static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static Connection connection = null;
	
	static { //초기화 블럭 (static 이니까 UserInfoCRUD 의 존재를 알면 main 메소드 전에 바로 실행해줌)
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// .close() 는 이후에 따로
	}
	public static void close() {
		if (connection != null){
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static int insertUserInfo(String uiName, String uiId, String uiPwd) { //바뀐 row 수 를 리턴
		try {
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO USER_INFO(UI_NAME, UI_ID, UI_PWD)";
			sql += " VALUES('" + uiName + "','" + uiId + "','" + uiPwd + "')";
			return statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public static int deleteUserInfo(int uiNum) {
		try {
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM USER_INFO";
			sql += " WHERE UI_NUM=" + uiNum;
			return statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public static int updateUserInfo(String updates) {
		try {
			Statement statement = connection.createStatement();
			String sql = "UPDATE USER_INFO SET" + updates;
			return statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public static List<Map<String,String>> selectUserInfo(){
		List<Map<String,String>> users = new ArrayList<>();
		
		try {
			Statement statement = connection.createStatement();
			String sql = "SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO";
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				Map<String,String> user = new HashMap<>();
				user.put("UI_NUM", resultSet.getString("UI_NUM"));
				user.put("UI_NAME", resultSet.getString("UI_NAME"));
				user.put("UI_ID", resultSet.getString("UI_ID"));
				user.put("UI_PWD", resultSet.getString("UI_PWD"));
				users.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;
	}
	public static void main(String[] args) {
//		int result = insertUserInfo("홍길동", "Hong", "r1r2r3");
//		int result = deleteUserInfo(6);
		int result = updateUserInfo(" UI_ID = '333' WHERE UI_NAME = '강길동'");
		System.out.println("rows :" + result);
	}
	
}

//TDD Test Driven Developmnet (테스트 주도 개발) 실패를 가정하고 개발하기
//일부러 실패한 코드를 만들고 방어코드를 만들기
//시간은 오래걸려도 완성도는 높아진다