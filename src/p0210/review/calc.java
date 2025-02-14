package p0210.review;

public class calc {
	
	static void printPlus(int x, int y) {
		System.out.println(x + y);
	}
	static void printMinus(int x, int y) {
		System.out.println(x - y);
	}
	static void printMult(int x, int y) {
		System.out.println(x * y);
	}
	static void printDiv(int x, int y) {
		System.out.println(x / y);
	}
	static void printMod(int x, int y) {
		System.out.println(x % y);
	}

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 13;

		printPlus(n1, n2);
		printMinus(n1, n2);
		printMult(n1, n2);
		printDiv(n1, n2);
		printMod(n1, n2);
	}
}
