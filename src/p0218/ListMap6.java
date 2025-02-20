package p0218;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap6 {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String username = "root";
		String password = "r1r2r3";
		
		
		Connection connection = null;
		//
		List<Map<String,String>> userInfos = new ArrayList<>();
		///
		
		try {
			connection = DriverManager.getConnection(url,username,password);
			Statement statement = connection.createStatement();
			String sql = "SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO";
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				//
				Map<String,String> userInfo = new HashMap<>();
				String[] columns = {"UI_NUM", "UI_NAME", "UI_ID", "UI_PWD"};
				for(int i = 0; i < columns.length; i++) {
					userInfo.put(columns[i], resultSet.getString(columns[i]));
				}
				userInfos.add(userInfo);
				///
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		for(Map<String,String> i : userInfos) {
			System.out.println(i);
		}
	}
}
