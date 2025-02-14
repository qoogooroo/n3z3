package p0207;

public class Laboratory {
	public static void main(String[] args) {

		int[] nums = new int[6]; // 1~45 난수 생성 후 반복문으로 nums각 배열에 대입하고 출력하기
		for (int i = 0; i < nums.length; i++) {
			int rNum = (int) (Math.random() * 8) + 1;
			if (i == 0) {
				nums[i] = rNum;
			}
			for (int j = 0; j < i; j++) {
				if (rNum == nums[j]) {
					System.out.println("Duple at #" + i);
					i--;
					break;
				} else {
					nums[i] = rNum;
				}
			}
		}
		//IntSort.printBubleSort(nums);
	}

}
