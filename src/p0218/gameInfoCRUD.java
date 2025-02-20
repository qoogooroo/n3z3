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

public class gameInfoCRUD {
	
	static int insertGameInfo(String title, int price, String genre, String describe) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
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
			String sql = "INSERT INTO GAME_INFO(GI_NAME, GI_PRICE, GI_GENRE, GI_DESC)";
			sql += "VALUES('" + title + "'," + price + ",'" + genre + "','" + describe + "')";
			return statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return 0;
	}

	static List<Map<String,String>> getGameInfo() {
		List<Map<String,String>> info = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
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
			String sql = "select GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC from GAME_INFO";
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				Map<String,String> data = new HashMap<>();
				String[] metaData = {"GI_NUM", "GI_NAME", "GI_PRICE", "GI_GENRE", "GI_DESC"};
				for(int i = 0; i < metaData.length; i++) {
						data.put(metaData[i], resultSet.getString(metaData[i]));	
				}
				info.add(data);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return info;
	}
	
	static int updateGameInfo(int giNum, String title, int price, String genre, String describe) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
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
			String sql = "update GAME_INFO"
					+ " set GI_NAME = '"+title+"'"
					+ " ,GI_PRICE="+price
					+ " ,GI_GENRE='"+genre+"'"
					+ " ,GI_DESC='"+describe+"'"
					+ " where GI_NUM="+giNum+"";
			return statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
	
	static int deleteGameInfo(int giNum) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
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
			String sql = "DELETE FROM GAME_INFO"
					+" WHERE GI_NUM = " + giNum;
			return statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	
	public static void main(String[] args) {
//		insertGameInfo("PUBG",0,"FPS",".");
		
//		System.out.println(updateGameInfo(2,"pubg3",1,"moba",".."));
		
//		System.out.println(deleteGameInfo(2));
		
		List<Map<String,String>> info = getGameInfo();
		for(Map<String,String> i:info) {
			System.out.println(i);
		}
	}
}
