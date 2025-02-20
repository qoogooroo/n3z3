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

public class FoodInfoCRUD {

	static List<Map<String, String>> getFoods() {
		
		List<Map<String, String>> foodInfos = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//Driver 선언
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String username = "root";
		String password = "r1r2r3";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				
				String[] columns = { "FI_NUM", "FI_NAME", "FI_PRICE" };
				Map<String, String> foodInfo = new HashMap<>();
				for (int i = 0; i < columns.length; i++) {
					foodInfo.put(columns[i], resultSet.getString(columns[i]));
				}
				foodInfos.add(foodInfo);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return foodInfos;
	}
	
	static void insertFood() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String username = "root";
		String password = "r1r2r3";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO FOOD_INFO(FI_NAME,FI_PRICE)";
			sql += " VALUES ('생선까쓰', 8000)";
			int result = statement.executeUpdate(sql);
			if(result>=1) {
				System.out.println("입력 성공!");
			}else {
				System.out.println("입력 실패..");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static void deleteFood() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String username = "root";
		String password = "r1r2r3";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM FOOD_INFO";
			sql += " WHERE FI_NAME = '생선까쓰'";
			int result = statement.executeUpdate(sql);
			if(result>=1) {
				System.out.println("삭제 성공!");
			}else {
				System.out.println("삭제 실패..");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static void updateFood() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String username = "root";
		String password = "r1r2r3";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			String sql = "UPDATE FOOD_INFO";
			sql += " SET FI_NAME = '돈까스'";
			sql += " WHERE FI_NAME = '생선까쓰'";
			int result = statement.executeUpdate(sql);
			if(result>=1) {
				System.out.println("수정 성공!");
			}else {
				System.out.println("수정 실패..");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

	public static void main(String[] args) {

		insertFood();
//		deleteFood();
		updateFood();
		List<Map<String, String>> foodInfos = getFoods();
		for(Map<String, String> i : foodInfos) {
			System.out.println(i);
		}
//		
	}
}
