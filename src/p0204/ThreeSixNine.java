package p0204;

public class ThreeSixNine {

	public static void main(String[] args) {
		// 1부터 100까지 출력하되 숫자에 3,6,9가 들어가면 ZZ를 출력

		for (int i = 1; i <= 100; i++) {
			int n1 = i % 10;
			int n2 = i / 10;

			// 10이하 정렬
			if (i < 10 && i % 3 != 0) {
				System.out.print(" ");
			}

			if ((n1 != 0 && n1 % 3 == 0) || (i > 10 && n2 % 3 == 0)) {
				System.out.print("ZZ ");
			} else {
				System.out.print(i + " ");
			}

			// 10단위 정렬
			if (n1 == 0) {
				System.out.println("");
			}
		}

	}
}
