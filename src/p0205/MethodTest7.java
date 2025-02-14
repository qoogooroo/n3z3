package p0205;

import java.util.Scanner;

public class MethodTest7 {

	static int sum(int max) {
		int res = 0;
		for (int i = 1; i <= max; i++) {
			res += i;
		}
		return res;
	}
	public static void main(String[] args) {
		// 반복문 1~100 더한뒤에 출력하는 코드 ++ 정수를 받아 해당 수까지 더하기
		Scanner s = new Scanner(System.in);
		System.out.print("Input a maximum number : ");
		String numStr = s.nextLine();
		int maxNum = Integer.parseInt(numStr);
		System.out.println(sum(maxNum));
	}
}
