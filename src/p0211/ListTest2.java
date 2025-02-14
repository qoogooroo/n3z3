package p0211;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(7);
		nums.add(1);
		nums.add(5);
		
		System.out.println(nums);
		
		//nums에서 가장 작은 값을 찾은 뒤에(반복문)
		//0번째방과 값을 바꾼뒤에 출력
		
		int min = 0;
		for(int i = 0; i < nums.size(); i++) {			//부분적으로 실행 = 드래그 후 ctrl shift i
			if(min == 0) {
				min = nums.get(i);
			} else if(min > nums.get(i)) {
				min = nums.get(i);
			}
		}
		System.out.println(nums.indexOf(min));
		nums.set(nums.indexOf(min), nums.get(0));
		nums.set(0, min);
		System.out.println(nums);
	}
}
