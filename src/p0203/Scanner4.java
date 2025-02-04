package p0203;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		// 1단을 출력해주세요.
		/*
		 * 1 X 1 = 1 
		 * 1 X 2 = 2 
		 * ... 
		 * ... 
		 * 1 X 9 = 9
		 * 
		 */
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number : ");
		String numStr = s.nextLine();
		int num = Integer.parseInt(numStr);
		
		System.out.println("print " + num + " times table");

		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}
	}
}
