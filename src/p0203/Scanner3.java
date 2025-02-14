package p0203;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number : ");
		String numStr = s.nextLine();
		int num = Integer.parseInt(numStr);
		System.out.println("10 X Your number : " + (num * 10));
	}
}
