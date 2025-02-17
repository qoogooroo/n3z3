package p0217;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//
public class SelectFoodInfo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String username = "root";
		String password = "r1r2r3";
		Connection connection = null;	//close() 하기위해 선언만 밖에서
		try {
			connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO";
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {			// ResultSet.next() 다음으로 시선을 내리기. 다음이 없으면 false
				System.out.println(resultSet.getInt("FI_NUM") + "\t" + resultSet.getString("FI_NAME") 
				+ "\t" + resultSet.getInt("FI_PRICE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {		// 정상동작이건 오류건 어쨋든 실행하기, 위에서 return 되더라도 return 직전에 finally 가 실행됨 (try catch 뒤에만 쓸 수 있음)
			if(connection != null) {		// 방어코드 만일 connection 의 초기화에 실패했을경우 null 로 남있다면 null.close() 는 없으니까 체크
				try {
					connection.close();			//정상 동작 후 코스트 절약을 위해 종료
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}	
		}
	}
}
