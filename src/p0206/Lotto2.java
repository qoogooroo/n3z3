package p0206;

public class Lotto2 {
	static boolean exists(int[] x, int y) {
		for(int i = 0; i < x.length; i++) {
			if(x[i] == y) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] userNums = new int[] {1,2,3,4,5,6};
		int[] lottoNums = new int[] {2,5,8,18,34,41};
		int sekai = 0;
		for(int i = 0; i<lottoNums.length; i++) {
			if(exists(userNums, lottoNums[i])) {
				sekai++;
			}
		}
		System.out.println("result : " + sekai);
	}
}
