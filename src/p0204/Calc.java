package p0204;

public class Calc {
	
	int add(int n1, int n2) {
		return n1 + n2;
	}
	int sub(int n1, int n2) {
		return n1 - n2;
	}
	int mult(int n1, int n2) {
		return n1 * n2;
	}
	int div(int n1, int n2) {
		return n1 / n2;
	}
	int rem(int n1, int n2) {
		return n1 % n2;
	}

	public static void main(String[] args) {
		Calc c = new Calc();
		int result = c.add(1, 2);
		System.out.println(result);
		result = c.sub(1, 2);
		System.out.println(result);
		result = c.mult(1, 2);
		System.out.println(result);
		result = c.div(1, 2);
		System.out.println(result);
		result = c.rem(1, 2);
		System.out.println(result);
	}
}
