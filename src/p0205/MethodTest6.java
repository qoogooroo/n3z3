package p0205;

public class MethodTest6 {
	/*
	 * 오버로딩
	 * 1. 같은 영역
	 * 2. 같은 메소드명
	 * 3. 매개변수의 갯수가 다름, 데이터타입이 다름, 순서가 다름
	*/	
	int test() {
		return 1;
	}
	static void test(int num) {
		
	}

	public static void main(String[] args) {
		test(10);
	}
}
