package p0204;

public class Array {

	public static void main(String[] args) {
		// 배열
		// 반드시 사이즈를 지정해줘야만함
		// 사이즈를 늘리거나 줄이려고 다시 선언하면 초기화가 되기때문에 스왑을 통해 변경해야함
		int[] nums = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		
		// 사이즈 늘리기(스왑)
		int[] tmps = nums;
		nums = new int[4];
		for(int i = 0; i < tmps.length; i++) {
			nums[i] = tmps[i];
		}
		
		// 사이즈 줄이기(스왑)
		tmps = nums;
		nums = new int[3];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = tmps[i];
		}
	}
}
