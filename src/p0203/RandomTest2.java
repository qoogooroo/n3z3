package p0203;

import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {
		Random r = new Random();
		// 1부터 10까지의 난수 6개를 int 배열변수에 저장 후
		// 반복문을 이용하여 출력

		int[] rNums = new int[6];

		for (int i = 0; i < rNums.length; i++) {
			rNums[i] = r.nextInt(10) + 1;
			for (int j = 0; j < i; j++) {		//중복된 수 발견시 난수 재생성
				if(rNums[i] == rNums[j]) {
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
