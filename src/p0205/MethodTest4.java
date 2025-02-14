package p0205;



public class MethodTest4 {

	static void printTimeTable(int num) {
		for (int i = 1; i <10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
	}
	public static void main(String[] args) {
		for (int i = 1; i < 10; i ++) {
			printTimeTable(i);
		}
	}
}
