package p0206;

public class Lotto3 {
	public static void main(String[] args) {
		int[] userNums = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] lottoNums = new int[] { 2, 5, 8, 18, 34, 41 };
		int sekai = 0;

		for (int i = 0; i < lottoNums.length; i++) {
			for (int j = 0; j < userNums.length; j++) {
				if(lottoNums[i] == userNums[j]) {
					sekai++;
					break;
				}
			}
		}
		System.out.println("result : " + sekai);
	}
}
