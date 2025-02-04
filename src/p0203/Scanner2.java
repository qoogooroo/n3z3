package p0203;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number : ");
		String str = s.nextLine();
		System.out.println("Your number : " + str);
	}
}
