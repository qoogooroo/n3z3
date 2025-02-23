package p0220;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p0219.DBCon;

public class UserInfoRepository {

	public UserInfoVO selectUserInfo(int uiNum) {
		String sql = "SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO"
				+ " WHERE UI_NUM = ?";
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setInt(1,uiNum);
			try(ResultSet resultSet = preparedStatement.executeQuery();) {
				if(resultSet.next()) {
					UserInfoVO user = new UserInfoVO();
					user.setUiNum(resultSet.getInt("UI_NUM"));
					user.setUiName(resultSet.getString("UI_NAME"));
					user.setUiId(resultSet.getString("UI_ID"));
					user.setUiPwd(resultSet.getString("UI_PWD"));
					return user;
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<UserInfoVO> selectUserInfoList(UserInfoVO userInfo){
		List<UserInfoVO> userInfoList = new ArrayList<>();
		String sql = "SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO WHERE 1=1 ";
		if(userInfo!=null) {
			if(userInfo.getUiName()!=null && userInfo.getUiName().length()!=0) {
				sql += " AND UI_NAME LIKE CONCAT('%',?,'%')";
			}
			if(userInfo.getUiId()!=null && userInfo.getUiId().length()!=0) {
				sql += " AND UI_ID LIKE CONCAT('%',?,'%')";
			}
			if(userInfo.getUiPwd()!=null && userInfo.getUiPwd().length()!=0) {
				sql += " AND UI_PWD LIKE CONCAT('%',?,'%')";
			}
		}
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			if(userInfo!=null) {
				if(userInfo.getUiName()!=null && userInfo.getUiName().length()!=0) {
					preparedStatement.setString(1, userInfo.getUiName());
				}
				if(userInfo.getUiId()!=null && userInfo.getUiId().length()!=0) {
					if(userInfo.getUiName()!=null && userInfo.getUiName().length()!=0) {
						preparedStatement.setString(2, userInfo.getUiId());
					}else {
						preparedStatement.setString(1, userInfo.getUiId());
					}
				}
				if(userInfo.getUiPwd()!=null && userInfo.getUiPwd().length()!=0) {
					if(userInfo.getUiId()!=null && userInfo.getUiId().length()!=0) {
						if(userInfo.getUiName()!=null && userInfo.getUiName().length()!=0) {
							
						}
					}
				}
			}
			try(ResultSet resultSet = preparedStatement.executeQuery();) {
				while(resultSet.next()) {
					UserInfoVO user = new UserInfoVO();
					user.setUiNum(resultSet.getInt("UI_NUM"));
					user.setUiName(resultSet.getString("UI_NAME"));
					user.setUiId(resultSet.getString("UI_ID"));
					user.setUiPwd(resultSet.getString("UI_PWD"));
					userInfoList.add(user);
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfoList;
	}
	
	public static void main(String[] args) {
		UserInfoRepository userRepo = new UserInfoRepository();
//		System.out.println(userRepo.selectUserInfo(2));
		UserInfoVO uiVO = new UserInfoVO();
		uiVO.setUiId("동");
		System.out.println(userRepo.selectUserInfoList(uiVO));
	}
}
