package p0206;

public class StringTest7 {

	public static void main(String[] args) {
		String str = "1,2,3,4,5,6,7,8,9,10";
		
		// "," 를 기준으로 str을 분리해 int[] nums에 저장한후 출력
		
		String[] strs = str.split(",");
		int[] nums = new int[strs.length];
		for(int i = 0; i < strs.length ; i ++) {
			nums[i] = Integer.parseInt(strs[i]);
		}
		
		for(int i = 0; i < nums.length ; i ++) {
			System.out.println(nums[i]);
		}
	}
}
