package p0205;

public class MethodTest3 {
	static void setArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 10) + 1;
		}
	}

	static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[5];
		// 1~10 난수 생성후 nums의 각 방에 입력하기
		setArray(nums);
		printArray(nums);
	}
}
