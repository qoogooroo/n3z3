package p0220;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p0219.DBCon;

public class AgentInfoCRUD {

	public int insertAgentInfo(String aiName, int aiCode, String aiRank) {
		String sql = "INSERT INTO AGENT_INFO(AI_NAME, AI_CODE, AI_RANK) VALUES (?,?,?)";
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setString(1, aiName);
			preparedStatement.setInt(2, aiCode);
			preparedStatement.setString(3, aiRank);
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateAgentInfo(int aiNum, String aiName, int aiCode, String aiRank) {
		String sql = "UPDATE AGENT_INFO SET AI_NAME = ?, AI_CODE = ?, AI_RANK = ? WHERE AI_NUM = ?";
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setString(1, aiName);
			preparedStatement.setInt(2, aiCode);
			preparedStatement.setString(3, aiRank);
			preparedStatement.setInt(4, aiNum);
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteAgentInfo(int aiNum) {
		String sql = "DELETE FROM AGENT_INFO WHERE AI_NUM = ?";
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setInt(1, aiNum);
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Map<String,String>> selectAgentInfo() {
		List<Map<String,String>> infos = new ArrayList<>();
		String sql = "SELECT AI_NUM, AI_NAME, AI_CODE, AI_RANK";
		String[] metaData = {"AI_NUM", "AI_NAME", "AI_CODE", "AI_RANK"};
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery()){
			while(resultSet.next()) {
				Map<String,String> info = new HashMap<>();
				for (int i = 0; i < metaData.length; i++) {
					info.put(metaData[i], resultSet.getString(metaData[i]));
				}
				infos.add(info);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return infos;
	}
	
	
	public static void main(String[] args) {
		AgentInfoCRUD a = new AgentInfoCRUD();
//		System.out.println(a.insertAgentInfo("onion", 6543, "Colonel"));
//		System.out.println(a.updateAgentInfo(5, "Onion", 5432, "Colonel"));
//		System.out.println(a.deleteAgentInfo(5));
		List<Map<String,String>> infos = a.selectAgentInfo();
		for(Map<String,String> i : infos) {
			System.out.println(i);
		}
		
	}
}
