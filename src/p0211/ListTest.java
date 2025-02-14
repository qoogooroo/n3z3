package p0211;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();	//pros)순서대로 할떄 가장 빠름
		nums.add(3);
		nums.add(2);
		nums.add(1);
		nums.add(10);
		nums.add(7);
		nums.add(5);
		
		int tmp = nums.get(0);
		nums.set(0, nums.get(2));
		nums.set(2, tmp);
		
		tmp = nums.get(3);
		nums.set(3, nums.get(5));
		nums.set(5, tmp);
		
		System.out.println(nums);
		
		
		
//		System.out.println(nums);
//		int tmp = nums.get(2);
//		nums.set(2,  nums.get(0));		// ArrayList.set(index, var)
//		nums.set(0, tmp);
//		System.out.println(nums);
	}
}
