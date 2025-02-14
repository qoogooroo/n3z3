package p0210;

public class Loop {

	public static void main(String[] args) {
		// 1~9단까지 출력하는 2중 for문

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " X " + j + " = " + (i * j));
				if (j != 9) {
					System.out.print(", ");
					if (i * j < 10) {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
