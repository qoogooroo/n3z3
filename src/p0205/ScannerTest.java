package p0205;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Mind a number : ");
		String numStr = s.nextLine();
		Random r = new Random();
		int rNum = r.nextInt(10) + 1;
		System.out.println("Your number is : " + numStr);
		int num = Integer.parseInt(numStr);
		
		
		if(rNum == num) {
			System.out.println("Win!");
		} else {
			System.out.println("Lose!");
		}
		System.out.println("Random number is : " + rNum);
		
	}
}
