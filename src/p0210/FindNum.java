package p0210;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int rNum = random.nextInt(100) + 1;
		String rNumStr = Integer.toString(rNum);
		int count = 0;
		while (true) {
			System.out.print("Input : ");
			String str = scanner.nextLine();
			count++;
			if(str.equals(rNumStr)) {
				System.out.println("You Win! (count : " + count + ")");
				break;
			}else if(Integer.parseInt(str)>rNum) {
				System.out.println("Down!");
			}else {
				System.out.println("Up!");
			}
		}
		System.out.println("System has shut down.");
	}
}
