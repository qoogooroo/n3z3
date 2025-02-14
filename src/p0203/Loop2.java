package p0203;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		// 1부터 num까지 출력하는 반복문
		// num부터 1까지 출력하는 반복문
		
		Scanner s = new Scanner(System.in);
		System.out.print("Input a point number : ");
		String numStr = s.nextLine();
		int num = Integer.parseInt(numStr);
		
		System.out.println("오름차순");
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
		System.out.println("내림차순");
		for(int i = num; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
