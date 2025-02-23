package p0220;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p0219.DBCon;

public class FoodInfoRepository {
//FOOD_INFO table
	public FoodInfoVO selectFoodInfo(int fiNum) {
		String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO"
				+ " WHERE FI_NUM = ?";
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setInt(1,fiNum);
			try(ResultSet resultSet = preparedStatement.executeQuery();) {
				if(resultSet.next()) {
					FoodInfoVO food = new FoodInfoVO();
					food.setFiNum(resultSet.getInt("FI_NUM"));
					food.setFiName(resultSet.getString("FI_NAME"));
					food.setFiPrice(resultSet.getInt("FI_PRICE"));
					return food;
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<FoodInfoVO> selectFoodInfoList(FoodInfoVO foodInfo){
		List<FoodInfoVO> foodInfoList = new ArrayList<>();
		String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO WHERE 1=1 ";
		if(foodInfo!=null) {
			if(foodInfo.getFiName()!=null && foodInfo.getFiName().length()!=0) {
				sql += " AND FI_NAME LIKE CONCAT('%',?,'%')";
			}
			if(foodInfo.getFiPrice()!=0) {
				sql += " AND FI_PRICE=?";
			}
		}
		try(Connection connection = DBCon.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			if(foodInfo!=null) {
				if(foodInfo.getFiName()!=null && foodInfo.getFiName().length()!=0) {
					preparedStatement.setString(1, foodInfo.getFiName());
				}
				if(foodInfo.getFiPrice()!=0) {
					if(foodInfo.getFiName()!=null && foodInfo.getFiName().length()!=0) {
						preparedStatement.setInt(2, foodInfo.getFiPrice());
					}else {
						preparedStatement.setInt(1, foodInfo.getFiPrice());
					}
				}
			}
			try(ResultSet resultSet = preparedStatement.executeQuery();) {
				while(resultSet.next()) {
					FoodInfoVO food = new FoodInfoVO();
					food.setFiNum(resultSet.getInt("FI_NUM"));
					food.setFiName(resultSet.getString("FI_NAME"));
					food.setFiPrice(resultSet.getInt("FI_PRICE"));
					foodInfoList.add(food);
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foodInfoList;
	}
	
	public int insertFoodInfo(FoodInfoVO foodInfo) {
		return 0;
	}

	public int updateFoodInfo(FoodInfoVO foodInfo) {
		return 0;
	}
	
	public int deleteFoodInfo(int fiNum) {
		return 0;
	}
	
	public static void main(String[] args) {
		FoodInfoRepository fiRepo = new FoodInfoRepository();
//		FoodInfoVO food = fiRepo.selectFoodInfo(1);
//		System.out.println(food);
		
		FoodInfoVO food = new FoodInfoVO();
		food.setFiName("밥");
		food.setFiPrice(3500);
		List<FoodInfoVO> foodInfo = fiRepo.selectFoodInfoList(food);
		for(FoodInfoVO i : foodInfo) {
			System.out.println(i);
		}
	}
}
