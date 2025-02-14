package p0210;

import java.util.ArrayList;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		//1~50난수로 중복 없이 10개 생성
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		while (nums.size()<10) {
			int rNum = r.nextInt(50)+1;
			if (nums.indexOf(rNum) == -1) {
				nums.add(rNum);
			}
		}
		System.out.println(nums);
	}
}
