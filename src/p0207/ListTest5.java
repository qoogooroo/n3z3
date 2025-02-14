package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest5 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		// nums에 1~100난수 10개 추가(중복가능)
		// 반복문을 사용해 출력하지만
		// 값에 3or6or9 이 있으면 ZZ을 출력

		Random r = new Random();

		while (nums.size() < 10) {
			nums.add(r.nextInt(100) + 1);
		}

		System.out.println(nums);

		for (int i = 0; i < nums.size(); i++) {
			int r1 = i % 10;
			int r2 = i / 10;

			if ((r1 != 0 && r1 % 3 == 0) || (i > 10 && r2 % 3 == 0)) {
				System.out.println("nums[" + i + "] : ZZ");
			} else {
				System.out.println("nums[" + i + "] : " + nums.get(i));
			}
		}

//		for (int i = 0; i < nums.size(); i++) {
//			if(nums.get(i)%10 == 3 || nums.get(i)%10 == 6 || nums.get(i)%10 == 9 ||
//					nums.get(i)/10 == 3 || nums.get(i)/10 == 6 || nums.get(i)/10 == 9) {
//				System.out.println("nums[" + i + "] : ZZ");
//			}else {
//				System.out.println("nums[" + i + "] : " + nums.get(i));
//			}
//		}
	}
}
