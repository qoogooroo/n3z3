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

public class GameInfoCRUD {
	
	/*
		@statement
			1. connection (연결)
			2. statement 생성
			3. sql 생성
			4. statement 로 sql execute
		@PreparedStatement
			1. connection
			2. sql
			3. sql 을 준비한 PreparedStatement 새성
			4. sql 의 ? 에 값을 Binding
			5. PreparedStatement execute
	*/	
	
	public int insertGameInfo(String giName, int giPrice, String giGenre, String giDesc) {
		
		
		String sql = "INSERT INTO GAME_INFO(GI_NAME, GI_PRICE, GI_GENRE, GI_DESC) VALUES (?, ?, ?, ?)";
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setString(1, giName);
			preparedStatement.setInt(2, giPrice);
			preparedStatement.setString(3, giGenre);
			preparedStatement.setString(4, giDesc);
			return preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}
	
	public int updateGameInfo(int giNum, String giName, int giPrice, String giGenre, String giDesc) {
		String sql = "UPDATE GAME_INFO SET GI_NAME = ?, GI_PRICE = ?, GI_GENRE = ?, GI_DESC = ? WHERE GI_NUM = ?";
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setString(1, giName);
			preparedStatement.setInt(2, giPrice);
			preparedStatement.setString(3, giGenre);
			preparedStatement.setString(4, giDesc);
			preparedStatement.setInt(5, giNum);
			return preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteGameInfo(int giNum) {
		String sql = "DELETE FROM GAME_INFO WHERE GI_NUM = ?";
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setInt(1, giNum);
			return preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Map<String,String>> selectGameInfo() {
		List<Map<String,String>> infos = new ArrayList<>();
		String sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO";
		String[] metaData = {"GI_NUM", "GI_NAME", "GI_PRICE", "GI_GENRE", "GI_DESC"};
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();){
			while(resultSet.next()) {
				Map<String,String> info = new HashMap<>();
				for(int i = 0; i < metaData.length; i++) {
					info.put(metaData[i], resultSet.getString(metaData[i]));
				}
				infos.add(info);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return infos;
	}
	
	public static void main(String[] args) {
		GameInfoCRUD giCRUD = new GameInfoCRUD();
		System.out.println(giCRUD.insertGameInfo( "Slay the Spire", 36000, "Roguelike", "2 will be coming"));
//		System.out.println(giCRUD.updateGameInfo(5, "WOW", 19800, "RPG", "waiting season2.."));
//		System.out.println(giCRUD.deleteGameInfo(6));
		List<Map<String,String>> giInfos = giCRUD.selectGameInfo();
		for(Map<String,String> i : giInfos) {
			System.out.println(i);
		}
	}
}
