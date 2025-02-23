package p0221;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p0219.DBCon;

public class FoodInfoRepository {

	public List<FoodInfoVO> selectFoodInfoList(FoodInfoVO foodInfo){
		List<FoodInfoVO> foodInfoList = new ArrayList<>();
		String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO WHERE 1=1";
		List<Object> params = new ArrayList<>();
		if(foodInfo != null) {
			if(foodInfo.getFiName()!=null) {
				sql += " AND FI_NAME LIKE CONCAT('%',?,'%')";
				params.add(foodInfo.getFiName());
			}
			if(foodInfo.getFiPrice()!=0) {
				sql += " AND FI_PRICE = ?";
				params.add(foodInfo.getFiPrice());
			}
		}
		System.out.println(sql);
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			if(foodInfo != null) {
				for(int i=0; i<params.size(); i++) {
					preparedStatement.setObject(i+1,params.get(i));
				}
			}
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				FoodInfoVO food = new FoodInfoVO();
				food.setFiNum(resultSet.getInt("FI_NUM"));
				food.setFiName(resultSet.getString("FI_NAME"));
				food.setFiPrice(resultSet.getInt("FI_PRICE"));
				foodInfoList.add(food);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foodInfoList;
	}
	
	public FoodInfoVO selectFoodInfo(int fiNum) {
		String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO WHERE FI_NUM = ?";	
		System.out.println(sql);
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setInt(1, fiNum);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				FoodInfoVO food = new FoodInfoVO();
				food.setFiNum(resultSet.getInt("FI_NUM"));
				food.setFiName(resultSet.getString("FI_NAME"));
				food.setFiPrice(resultSet.getInt("FI_PRICE"));
				return food;
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int deleteFoodInfo(int fiNum) {
		String sql = "DELETE FROM FOOD_INFO WHERE FI_NUM=?";
		try (Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setInt(1, fiNum);
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int insertFoodInfo(FoodInfoVO foodInfo) {
		String sql = "INSERT INTO FOOD_INFO(FI_NAME, FI_PRICE)"
				+ " VALUES(?,?)";
		try (Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setString(1, foodInfo.getFiName());
			preparedStatement.setInt(2, foodInfo.getFiPrice());
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateFoodInfo(FoodInfoVO foodInfo) {
		String sql = "UPDATE FOOD_INFO SET FI_NAME = ?, FI_PRICE = ? WHERE FI_NUM = ?";
		try (Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setString(1, foodInfo.getFiName());
			preparedStatement.setInt(2, foodInfo.getFiPrice());
			preparedStatement.setInt(3, foodInfo.getFiNum());
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public static void main(String[] args) {
		FoodInfoRepository fiRepo = new FoodInfoRepository();
		FoodInfoVO foodInfo = new FoodInfoVO();
		foodInfo.setFiName("참치김치주먹밥");
		foodInfo.setFiPrice(3000);
		foodInfo.setFiNum(20);
//		List<FoodInfoVO> foodInfoList = fiRepo.selectFoodInfoList(foodInfo);
//		for(FoodInfoVO i : foodInfoList){
//			System.out.println(i);
//		}
//		foodInfo = fiRepo.selectFoodInfo(1);
//		System.out.println(foodInfo);
//		System.out.println(fiRepo.insertFoodInfo(foodInfo));
//		System.out.println(fiRepo.deleteFoodInfo(6));
//		System.out.println(fiRepo.updateFoodInfo(foodInfo));
	//	System.out.println(fiRepo.selectFoodInfoList(null));
	}
}
