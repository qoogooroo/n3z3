package p0204;

public class MethodTest2 {
	static boolean isDuple(int[] nums, int rNum) {	//is, has, nexthas 리턴값이 boolean인 method명
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] == 0) {
				return false;
			}
			if(nums[i] == rNum) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = new int[6];
		
		for(int i = 0; i < nums.length; i ++) {
			int rNum = (int)(Math.random()*6) + 1;
			if(isDuple(nums,rNum)) {
				i--;
				continue;		//아랫부분 반복문 무시하고 증감부로 가기
			}
			nums[i] = rNum;
		}
		
		for(int i = 0; i < nums.length; i ++) {
			System.out.println(nums[i]);
		}
	}
}
