package p0204;

public class MethodTest {
	int i;
	static void test() {
		System.out.println("First test");
	}
	static void test(int i) {		// overloading java에서 method의 존재는 "매개변수 데이터타입과 순서까지" 따진다.
		System.out.println("Second test");
	}
	static void test(String i) {
		System.out.println("Third test");
	}
	static void test(int i, String i2) {
		System.out.println("Fourth test");
	}
	static void test(String i2, int i) {
		System.out.println("Fourth test");
	}
	public static void main(String[] args) {
		test();
	}
}
