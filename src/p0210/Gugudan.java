package p0210;

public class Gugudan {

	static void printGugudan(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.print(dan + " X " + i + " = " + (dan * i));
			if (i != 9) {
				System.out.print(", ");
				if( dan * i < 10 ) {
					System.out.print(" ");
				}
			} else {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			printGugudan(i);
		}
	}
}
