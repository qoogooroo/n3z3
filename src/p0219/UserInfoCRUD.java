package p0219;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfoCRUD {

	public int insertUserInfo(String uiName, String uiId, String uiPwd) {
		String sql = "INSERT INTO USER_INFO(UI_NAME, UI_ID, UI_PWD) VALUES('%s','%s','%s')";
		sql = String.format(sql, uiName, uiId, uiPwd);
		try (Connection connection = DBCon.getConnection(); 
				Statement statement = connection.createStatement();) {
			return statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int insertUserInfo2(String uiName, String uiId, String uiPwd) {
		String sql = "INSERT INTO USER_INFO(UI_NAME, UI_ID, UI_PWD) VALUES(?,?,?)";
		try(Connection connection = DBCon.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);){
			ps.setString(1, uiName);
			ps.setString(2, uiId);
			ps.setString(3, uiPwd);
			return ps.executeUpdate();
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		
		return 0;
	}

	public int updateUserInfo(int uiNum, String uiName, String uiId, String uiPwd) {
		String sql = "UPDATE USER_INFO SET UI_NAME = '%s', UI_ID = '%s', UI_PWD = '%s' WHERE UI_NUM = '%d'";
		sql = String.format(sql, uiName, uiId, uiPwd, uiNum);
		try (Connection connection = DBCon.getConnection(); 
				Statement statement = connection.createStatement();) {
			return statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateUserInfo2(int uiNum, String uiName, String uiId, String uiPwd) {
		String sql = "UPDATE USER_INFO SET UI_NAME = ?, UI_ID = ?, UI_PWD = ? WHERE UI_NUM = ?";
		sql = String.format(sql, uiName, uiId, uiPwd, uiNum);
		try (Connection connection = DBCon.getConnection(); 
				PreparedStatement ps = connection.prepareStatement(sql);) {
			ps.setString(1,uiName);
			ps.setString(2,uiId);
			ps.setString(3,uiPwd);
			ps.setInt(4,uiNum);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteUserInfo(int uiNum) {
		String sql = "DELETE FROM USER_INFO WHERE UI_NUM = '%d'";
		sql = String.format(sql, uiNum);
		try (Connection connection = DBCon.getConnection(); 
				Statement statement = connection.createStatement();) {
			return statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteUserInfo2(int uiNum) {
		String sql = "DELETE FROM USER_INFO WHERE UI_NUM = ?";
		try(Connection connection = DBCon.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);){
			ps.setInt(1, uiNum);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public List<Map<String,String>> selectUserInfo(String type, String str) {
		List<Map<String,String>> info = new ArrayList<>();
		String sql = "SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO";
		if("1".equals(type)) {
			sql += " WHERE UI_NAME LIKE '%" + str + "%'";
		}else if("2".equals(type)) {
			sql += " WHERE UI_ID LIKE '%" + str + "%'";
		}else if("3".equals(type)) {
			sql += " WHERE UI_PWD LIKE '%" + str + "%'";
		}
		String[] metaData = {"UI_NAME", "UI_ID", "UI_PWD"}; 
		try (Connection connection = DBCon.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);) {
			while(resultSet.next()) {
				Map<String,String> data = new HashMap<>();
				for(int i = 0; i < metaData.length; i++) {
					data.put(metaData[i], resultSet.getString(metaData[i]));
				}
				info.add(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return info;
	}
	
	public List<Map<String,String>> selectUserInfo2(String type, String str){
		List<Map<String,String>> userInfos = new ArrayList<>();
		String sql = "SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO";
		String[] metaData = {"UI_NAME", "UI_ID", "UI_PWD"};
		if("1".equals(type)) {
			sql += " WHERE UI_NAME LIKE CONCAT('%',?,'%')";
		}else if("2".equals(type)) {
			sql += " WHERE UI_ID LIKE CONCAT('%',?,'%')";
		}else if("3".equals(type)) {
			sql += " WHERE UI_PWD LIKE CONCAT('%',?,'%')";
		}
		try(Connection con = DBCon.getConnection();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, str);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Map<String,String> data = new HashMap<>();
				for(int i = 0; i < metaData.length; i++) {
					data.put(metaData[i], rs.getString(metaData[i]));
				}
				userInfos.add(data);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return userInfos;
	}

	public static void main(String[] args) {
		UserInfoCRUD uiCRUD = new UserInfoCRUD();
//		System.out.println(uiCRUD.insertUserInfo2("임시인", "tmpman", "qwer1234"));
//		System.out.println(uiCRUD.updateUserInfo2(7, "임시인", "tmpman2", "qwer1234"));
		System.out.println(uiCRUD.deleteUserInfo2(7));
//		List<Map<String,String>> infos = uiCRUD.selectUserInfo("1","*");
//		List<Map<String,String>> infos = uiCRUD.selectUserInfo2("1", "김");
//		for(Map<String,String> i : infos) {
//			System.out.println(i);
//		}
		
	}
}
