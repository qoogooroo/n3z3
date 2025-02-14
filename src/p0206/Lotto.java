package p0206;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		
		//난수생성
		int[] rNums = new int[6];
		for (int i = 0; i < rNums.length; i++) {
			rNums[i] = (int) (Math.random() * 45) + 1;
			for (int j = i - 1; j >= 0; j--) { // 중복된 수 발견시 난수 재생성
				if (rNums[i] == rNums[j]) {
					System.out.println("Duplication! at #" + i);
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < rNums.length; i++) {
			System.out.println(rNums[i]);
		}

		//입력
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
			System.out.println("nums[" + i + "] : " + nums[i]);
		}

		//결과 출력
		int atari = 0;
		for (int i = 0; i < rNums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (rNums[i] == nums[j]) {
					atari++;
				}
			}
		}
		System.out.println("result : " + atari);

	}
	/*
	 * int[] nums = new int[6]; // 1~45 난수 생성 후 반복문으로 nums각 배열에 대입하고 출력하기
	 * 
	 * for (int i = 0; i < nums.length; i++) { int rNum = (int) (Math.random() * 8)
	 * + 1; for (int j = 0; j < i; j++) { if (rNum == nums[j] && i!= 0) {
	 * System.out.println("Duple at " + i); i--; break; }else { nums[i] = rNum; }
	 * 
	 * }
	 * 
	 * }
	 * 
	 * for (int i = 0; i < nums.length; i++) { System.out.println(nums[i]); } }
	 */
}
