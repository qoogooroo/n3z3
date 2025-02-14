package p0205;

public class Test {
	public static void main(String[] args) {
		// 6개 사이즈를 가진 int 배열 nums를 선언하고 1~45의 난수를 대입

		int[] rNums = new int[6];

		for (int i = 0; i < rNums.length; i++) {
			rNums[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) { // 중복된 수 발견시 난수 재생성
				if (rNums[i] == rNums[j]) {
					System.out.println("Duplication! at #" + i);
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < rNums.length; i++) {
			System.out.println(rNums[i]);
		}
	}
}
