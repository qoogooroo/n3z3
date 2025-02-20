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

public class FoodInfoCRUD {

	public int insertFoodInfo(String fiName, int fiPrice) {
		String sql = "INSERT INTO FOOD_INFO(FI_NAME, FI_PRICE) VALUES (?, ?)";
		try(Connection connection = DBCon.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);){
			ps.setString(1, fiName);
			ps.setInt(2, fiPrice);
			return ps.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateFoodInfo(int fiNum, String fiName, int fiPrice) {
		String sql = "UPDATE FOOD_INFO SET FI_NAME = ?, FI_PRICE = ? WHERE FI_NUM = ?";
		try(Connection connection = DBCon.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);){
			ps.setString(1,fiName);
			ps.setInt(2,fiPrice);
			ps.setInt(3,fiNum);
			return ps.executeUpdate(sql);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteFoodInfo(int fiNum) {
		String sql = "DELETE FROM FOOD_INFO WHERE FI_NUM = ?";
		try(Connection connection = DBCon.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);){
			ps.setInt(1, fiNum);
			return ps.executeUpdate(sql);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Map<String,String>> selectFoodInfo() {
		List<Map<String,String>> infos = new ArrayList<>(); 
		String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO";
		String[] metaData = {"FI_NUM", "FI_NAME", "FI_PRICE"};
		try(Connection connection = DBCon.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet resultSet = ps.executeQuery();){
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
		FoodInfoCRUD fiCRUD = new FoodInfoCRUD();
//		System.out.println(fiCRUD.insertFoodInfo("주먹밥", 2000));
//		System.out.println(fiCRUD.updateFoodInfo(18, "야채김밥", 4500));
//		System.out.println(fiCRUD.deleteFoodInfo(16));
		List<Map<String,String>> infos = fiCRUD.selectFoodInfo();
		for(Map<String,String> i : infos) {
			System.out.println(i);
		}
	}
}
