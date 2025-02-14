package p0205;

public class MethodTest2 {
	static int add(int i, int j) {
		return i + j;
	}

	static int sub(int i, int j) {
		return i - j;
	}

	static int mult(int i, int j) {
		return i * j;
	}

	static int div(int i, int j) {
		return i / j;
	}

	static int mod(int i, int j) {
		return i % j;
	}

	public static void main(String[] args) {
		// method는 무적권 Class안에 선언해야함.
		// method 안에 method 선언 불가.

		int n1 = 10;
		int n2 = 4;
		System.out.println(add(n1, n2));
		System.out.println(sub(n1, n2));
		System.out.println(mult(n1, n2));
		System.out.println(div(n1, n2));
		System.out.println(mod(n1, n2));
	}
}
