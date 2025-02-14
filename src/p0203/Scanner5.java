package p0203;

import java.util.Scanner;

public class Scanner5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number : ");
		String numStr = s.nextLine();
		System.out.println("Your number : " + numStr);

		// 쓴 숫자부터 시작하여 0까지 출력하는 반복문

		int max = Integer.parseInt(numStr);
		for (int i = max; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
