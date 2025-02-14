package p0211;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<>();
		// 1~45의 난수 6개를 lotto에 추가(중복 제거) 후 출력
		Random r = new Random();
		while (lotto.size() < 6) {
			int rNum = r.nextInt(45) + 1;
			if (lotto.indexOf(rNum) == -1) {
				lotto.add(rNum);
			}
		}
		//nums.st(2, nums.get(0));
		System.out.println(lotto);
		
	}
}
