package p0206;

import java.util.Scanner;

public class StringTest8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Input 6 numbers that saparated with , in 1 to 45 : ");
		String str = s.nextLine();
		System.out.println("Your numbers : " + str);

		String[] strs = str.split(",");
		int[] nums = new int[strs.length];
		for (int i = 0; i < strs.length; i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print("nums[" + i + "] : " + nums[i] + "  ");
		}
	}
}
