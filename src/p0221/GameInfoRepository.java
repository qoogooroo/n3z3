package p0221;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p0219.DBCon;

public class GameInfoRepository {

	public List<GameInfoVO> selectGameInfoList(GameInfoVO gameInfo){
		List<GameInfoVO> gameInfoList = new ArrayList<>();
		String sql = " SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO WHERE 1=1";
		List<Object> params = new ArrayList<>();
		if(gameInfo != null) {
			if(gameInfo.getGiName() != null) {
				sql += " AND GI_NAME LIKE CONCAT('%',?,'%')";
				params.add(gameInfo.getGiName());
			}
			if(gameInfo.getGiPrice() != 0) {	//만약 price = 0 인 경우를 출력 하고 싶다면 data type 을 int 가 아닌 Integer 로 설정
				sql += " AND GI_PRICE = ?";
				params.add(gameInfo.getGiPrice());
			}
			if(gameInfo.getGiGenre() != null) {
				sql += " AND GI_GENRE LIKE CONCAT('%',?,'%')";
				params.add(gameInfo.getGiGenre());
			}
			if(gameInfo.getGiDesc() != null) {
				sql += " AND GI_DESC LIKE CONCAT('%',?,'%')";
				params.add(gameInfo.getGiDesc());
			}
		}
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			if(gameInfo != null) {
				for(int i = 0; i < params.size(); i++) {
					preparedStatement.setObject(i+1, params.get(i));
				}
			}
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				GameInfoVO game = new GameInfoVO();
				game.setGiNum(resultSet.getInt("GI_NUM"));
				game.setGiName(resultSet.getString("GI_NAME"));
				game.setGiPrice(resultSet.getInt("GI_PRICE"));
				game.setGiGenre(resultSet.getString("GI_GENRE"));
				game.setGiDesc(resultSet.getString("GI_DESC"));
				gameInfoList.add(game);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gameInfoList;
	}
	
	public GameInfoVO selectGameInfo (int giNum) {
		String sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO WHERE FI_NUM = ?";	
		System.out.println(sql);
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setInt(1, giNum);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				GameInfoVO game = new GameInfoVO();
				game.setGiNum(resultSet.getInt("GI_NUM"));
				game.setGiName(resultSet.getString("GI_NAME"));
				game.setGiPrice(resultSet.getInt("GI_PRICE"));
				game.setGiGenre(resultSet.getString("GI_GENRE"));
				game.setGiDesc(resultSet.getString("GI_DESC"));
				return game;
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int insertGameInfo(GameInfoVO gameInfo) {
		String sql = " INSERT INTO GAME_INFO(GI_NAME, GI_PRICE, GI_GENRE, GI_DESC)"
				+" VALUES(?,?,?,?)";
		try (Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setString(1, gameInfo.getGiName());
			preparedStatement.setInt(2, gameInfo.getGiPrice());
			preparedStatement.setString(3, gameInfo.getGiGenre());
			preparedStatement.setString(4, gameInfo.getGiDesc());
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateGameInfo(GameInfoVO gameInfo) {
		String sql = " UPDATE GAME_INFO SET GI_NAME = ?, GI_PRICE = ?, GI_GENRE = ?, GI_DESC = ? WHERE GI_NUM = ?";
		try (Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setString(1, gameInfo.getGiName());
			preparedStatement.setInt(2, gameInfo.getGiPrice());
			preparedStatement.setString(3, gameInfo.getGiGenre());
			preparedStatement.setString(4, gameInfo.getGiDesc());
			preparedStatement.setInt(5, gameInfo.getGiNum());
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteGameInfo(int giNum) {
		String sql = " DELETE FROM GAME_INFO WHERE GI_NUM = ?";
		try (Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setInt(1, giNum);
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] args) {
		GameInfoRepository giRepo = new GameInfoRepository();
		GameInfoVO gameInfo = new GameInfoVO();
//		gameInfo.setGiNum(8);
//		gameInfo.setGiName("B");
//		gameInfo.setGiPrice(0);
//		GameInfoVO gameInfoA = new GameInfoVO();
//		gameInfoA.setGiName("They are billions");
//		gameInfoA.setGiPrice(26000);
//		gameInfoA.setGiGenre("Base Building");
//		gameInfoA.setGiDesc("Yeeeeeeee");
//		gameInfoA.setGiNum(10);
//		System.out.println(giRepo.deleteGameInfo(10));
		List<GameInfoVO> gameInfoList =giRepo.selectGameInfoList(gameInfo);
		for(GameInfoVO i : gameInfoList) {
			System.out.println(i);
		}
	}
}
