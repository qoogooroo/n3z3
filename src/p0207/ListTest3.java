package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		// nums의 1~45까지 난수를 추가하고
		// nums의 각 index에 어떤 값이 있는지 출력하기

		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			nums.add(r.nextInt(45) + 1);
		}
		System.out.println(nums);
		for (int i = 0; i < nums.size(); i++) {
			System.out.println("nums[" + i + "] : " + nums.get(i));
		}
		// ArrayList.get(int x) x 인덱스의 값을 호출 
	}
}
