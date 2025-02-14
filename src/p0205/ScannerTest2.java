package p0205;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 1~10까지 난수를 생성
		// s.nextLine()으로 값을 받고
		// up and down게임 완성
		
		System.out.println("COM minding a number...");
		Random r = new Random();
		int rNum = r.nextInt(10) + 1;
		
		System.out.print("Choose your number : ");
		String numStr = s.nextLine();
		int num = Integer.parseInt(numStr);
		
		while(true) {
			if (rNum == num) {
				System.out.println("You Win!!");
				break;
			} else {
				if(rNum > num) {
					System.out.println("UP!");
				} else {
					System.out.println("Down!");
				}
				System.out.print("Think again... : ");
				numStr = s.nextLine();
				num = Integer.parseInt(numStr);
			}
		}
	}
}
