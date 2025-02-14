package p0207;

public class Array {
	static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	public static void main(String[] args) {
		// 배열
		// pros) 메모리 효율성 측면에서 좋음(메모리주소를 바로옆에 쭈루룩 만들어줌)
		// cons) 한번 정한 크기를 바꿀 수 없다.

		int[] nums = new int[] { 10, 5, 2, 8 };
		printArray(nums);
		int[] tmpNums = nums;
		nums = new int[5];
		for (int i = 0; i < tmpNums.length; i++) {
			nums[i] = tmpNums[i];
		}
		printArray(nums);
				
	}
}
