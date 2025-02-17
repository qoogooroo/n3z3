package p0217;

//
//	Exception, RuntimeException
//	무조건 예외처리 / 실행은 해보고 오류 나면 예외처리

class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyException(String str) {
		super(str);
	}
	
}
public class ExceptionTest {

	public static int parseInt(String str) throws MyException {
		try {
			return Integer.parseInt(str);//NumberFormatExcetion 이 발생하므로 catch 로	
		}catch(Exception e) {
			throw new MyException("숫자를 쓰세요");
		}
		
	}
	
	public static void main(String[] args) {
		String str = "삼십삼";
		try {
			int num = parseInt(str);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
