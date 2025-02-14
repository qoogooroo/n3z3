package p0204;

public class Three {

	public static void main(String[] args) {
		// 1부터 100까지 출력하되 숫자에 3이 들어가면 ZZ를 출력

		for (int i = 1; i <= 100; i++) {

			// 10이하 정렬
			if (i < 10 && i != 3) {
				System.out.print(" ");
			}

			if (i % 10 == 3 || i / 10 == 3) {
				System.out.print("ZZ ");
			} else {
				System.out.print(i + " ");
			}

			// 10단위 정렬
			if (i % 10 == 0) {
				System.out.println("");
			}
		}

		// 똑같지만 6이들어가면 ZZ를 출력
		for (int i = 1; i <= 100; i++) {

			// 10이하 정렬
			if (i < 10 && i != 6) {
				System.out.print(" ");
			}

			if (i % 10 == 6 || i / 10 == 6) {
				System.out.print("ZZ ");
			} else {
				System.out.print(i + " ");
			}

			// 10단위 정렬
			if (i % 10 == 0) {
				System.out.println("");
			}
		}
	}
}
