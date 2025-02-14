package p0210;


public class Calc {

	// 리턴하지 않으면서 메모리 생성하지 않을때
	static void printPlus(int x, int y) {
		System.out.println(x + y);
	}
	// 리턴하면서 메모리 생성하지 않을떄
	static int plus(int x, int y) {
		return x + y;
	}

	static void printMinus(int x, int y) {
		System.out.println(x - y);
	}
	static int minus(int x, int y) {
		return x - y;
	}
	
	static void printMult(int x, int y) {
		System.out.println(x * y);
	}
	static int mult(int x, int y) {
		return x * y;
	}
	
	static void printDiv(int x, int y) {
		System.out.println(x / y);
	}
	static int div(int x, int y) {
		return x / y;
	}
	
	static void printMod(int x, int y) {
		System.out.println(x % y);
	}
	static int mod(int x, int y) {
		return x % y;
	}
	
	public static void main(String[] args) {
		
		int n1 = 1;
		int n2 = 2;
		printPlus(n1, n2);
		int result = plus(n1, n2);
		System.out.println(result);
		printMinus(n1, n2);
		result = minus(n1, n2);
		System.out.println(result);
		printMult(n1, n2);
		result = mult(n1, n2);
		System.out.println(result);
		printDiv(n1, n2);
		result = div(n1, n2);
		System.out.println(result);
		printMod(n1, n2);
		result = mod (n1, n2);
		System.out.println(result);
	}
}
