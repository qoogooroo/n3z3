package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest4 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		// nums의 1~45까지 난수를 추가하고
		// nums의 각 index에 어떤 값이 있는지 출력하기

		Random r = new Random();
		while (nums.size() < 10) {
			int rNum = r.nextInt(10) + 1;
			if (nums.indexOf(rNum) == -1) {
				nums.add(rNum);
			} else {
				System.out.println("Duple@");
			}
		}
		
//		for (int i = 1; i <= 10; i++) {
//			int rNum = r.nextInt(10) + 1;
//			if (nums.indexOf(rNum) != -1) {
//				System.out.println("Duple at index #" + i);
//				i--;
//				continue;
//			} 
//			nums.add(rNum);
//		}
		
//		for (int i = 1; i <= 10; i++) {
//			int rNum = r.nextInt(10) + 1;
//			if (nums.indexOf(rNum) == -1) {
//				nums.add(rNum);
//			} else {
//				System.out.println("Duple at index #" + i);
//				i--;
//			}
//		}
		
//		for (int i = 0; i < 10; i++) {
//			nums.add(r.nextInt(10) + 1);
//			for (int j = 0; j < i; j++) {
//				if(nums.get(i) == nums.get(j)) {
//					System.out.println("Duple at index #" + i);
//					nums.remove(i);
//					i--;
//					break;
//				}
//			}
//		}
		
		System.out.println(nums);
		for (int i = 0; i < nums.size(); i++) {
			System.out.println("nums[" + i + "] : " + nums.get(i));
		}
	}
}
