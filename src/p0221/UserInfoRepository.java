package p0221;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p0219.DBCon;

public class UserInfoRepository {

	public List<UserInfoVO> selectUserInfoList(UserInfoVO userInfo){
		List<UserInfoVO> userInfoList = new ArrayList<>();
		String sql = "SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO WHERE 1=1";
		List<Object> params = new ArrayList<>();
		if(userInfo != null) {
			if(userInfo.getUiName() != null) {
				sql += " AND UI_NAME LIKE CONCAT('%',?,'%')";
				params.add(userInfo.getUiName());
			}
			if(userInfo.getUiId() != null) {
				sql += " AND UI_ID LIKE CONCAT('%',?,'%')";
				params.add(userInfo.getUiId());
			}
			if(userInfo.getUiPwd() != null) {
				sql += " AND UI_PWD LIKE CONCAT('%',?,'%')";
			}
		}
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
			if(userInfo != null) {
				for(int i = 0; i < params.size(); i++) {
					preparedStatement.setObject(i+1,params.get(i));
				}
			}
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				UserInfoVO user = new UserInfoVO();
				user.setUiNum(resultSet.getInt("UI_NUM"));
				user.setUiName(resultSet.getString("UI_NAME"));
				user.setUiId(resultSet.getString("UI_ID"));
				user.setUiPwd(resultSet.getString("UI_PWD"));
				userInfoList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfoList;
	}
	
	public UserInfoVO selectUserInfo(int uiNum) {
		String sql = " SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO WHERE UI_NUM = ?";
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
			preparedStatement.setInt(1, uiNum);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				UserInfoVO user = new UserInfoVO();
				user.setUiNum(resultSet.getInt("UI_NUM"));
				user.setUiName(resultSet.getString("UI_NAME"));
				user.setUiId(resultSet.getString("UI_ID"));
				user.setUiPwd(resultSet.getString("UI_PWD"));
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int insertUserInfo(UserInfoVO userInfo) {
		String sql = " INSERT INTO USER_INFO(UI_NAME, UI_ID, UI_PWD)"
				+" VALUES(?,?,?)";
		try (Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setString(1, userInfo.getUiName());
			preparedStatement.setString(2, userInfo.getUiId());
			preparedStatement.setString(3, userInfo.getUiPwd());
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateUserInfo(UserInfoVO userInfo) {
		String sql = " UPDATE USER_INFO SET UI_NAME = ?, UI_ID = ?, UI_PWD = ? WHERE UI_NUM = ?";
		try (Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setString(1, userInfo.getUiName());
			preparedStatement.setString(2, userInfo.getUiId());
			preparedStatement.setString(3, userInfo.getUiPwd());
			preparedStatement.setInt(4, userInfo.getUiNum());
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteUserInfo(int uiNum) {
		String sql = " DELETE FROM USER_INFO WHERE UI_NUM = ?";
		try (Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setInt(1, uiNum);
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] args) {
		UserInfoRepository uiRepo = new UserInfoRepository();
		UserInfoVO userInfo = new UserInfoVO();
		userInfo.setUiName("전사독");
		userInfo.setUiId("인천맨");
		userInfo.setUiPwd("4862");
		userInfo.setUiNum(8);
//		System.out.println(uiRepo.insertUserInfo(userInfo));
//		System.out.println(uiRepo.updateUserInfo(userInfo));
//		System.out.println(uiRepo.deleteUserInfo(8));
//		List<UserInfoVO> uiList = uiRepo.selectUserInfoList(userInfo);
//		for(UserInfoVO i : uiList) {
//			System.out.println(i);
//		}
//		System.out.println(uiRepo.selectUserInfo(5));
		
		
	}
}
