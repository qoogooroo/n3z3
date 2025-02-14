package p0206;

import java.util.Scanner;

public class NumBaseball {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] bNums = new int[3];
		int[] pNums = new int[3];

		// 난수 생성
		/*
		 * for (int i = 0; i < bNums.length; i++) { int nNum = (int) (Math.random() *
		 * 10) + 1; for(int j = 0; j <bNums.length; j++) { if (nNum == bNums[i]) {
		 * System.out.println("Duble at #" + i); i--; break; } else { bNums[i] = nNum; }
		 * } }
		 */
		for (int i = 0; i < bNums.length; i++) {
			bNums[i] = (int) (Math.random() * 10) + 1;
			for (int j = 0; j < i; j++) { // 중복된 수 발견시 난수 재생성
				if (bNums[i] == bNums[j]) {
					System.out.println("Duplication! at #" + i);
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < bNums.length; i++) {
			System.out.println(bNums[i]);
		}

		while (true) {
			// 숫자 입력받기, 정수로 저장
			System.out.print("Input picther's numbers : ");
			String numStr = s.nextLine();
			String[] pNumsStrs = numStr.split(",");
			for (int i = 0; i < pNumsStrs.length; i++) {
				pNums[i] = Integer.parseInt(pNumsStrs[i]);
			}
			for (int i = 0; i < pNumsStrs.length; i++) {
				System.out.println(pNums[i]);
			}

			// 숫자 비교하기
			int ball = 0;
			int strike = 0;
			for (int i = 0; i < bNums.length; i++) {
				for (int j = 0; j < pNums.length; j++) {
					if (bNums[i] == pNums[j]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
						break;
					}
				}
			}

			// 결과 출력, 게임 종료 판정
			System.out.println("Ball : " + ball + ", Strike : " + strike);
			if (strike == 3) {
				System.out.println("You WIN@");
				break;
			}
		}

	}
}
