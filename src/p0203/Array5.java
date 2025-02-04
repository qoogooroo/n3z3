package p0203;

public class Array5 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		// nums의 for문을 사용하여 2,4,6,8,...,18,20 입력후 출력
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (i+1) * 2;
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
