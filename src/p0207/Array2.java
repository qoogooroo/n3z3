package p0207;

public class Array2 {

	public static void main(String[] args) {
		// 1~100까지의 난수를 nums를 대입하지만 짝수일 경우에만 대입하기
		int [] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random()*100) +1;
			if(nums[i]%3 !=0 || nums[i]%5 !=0) {
				i--;
			} 
		}
		Array.printArray(nums);
	}
}
