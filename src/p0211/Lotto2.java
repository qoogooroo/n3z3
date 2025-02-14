package p0211;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto2 {

	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<>();
		Random r = new Random();
		while (lotto.size() < 6) {
			int rNum = r.nextInt(45) + 1;
			if (lotto.indexOf(rNum) == -1) {
				lotto.add(rNum);
			}
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("로또번호를 ',' 기준으로 입력 : ");
		String manualLotto = scan.nextLine();
		System.out.println("Your Lotto : " + manualLotto);
		String[] userLotto = manualLotto.split(",");
		
		int count = 0;
		for(int i = 0; i < userLotto.length; i++) {
			int userNum = Integer.parseInt(userLotto[i]);
			if(lotto.indexOf(userNum)!=-1) {
				count++;
			}
//			for(int j = 0; j < lotto.size(); j++) {
//				if(userNum == lotto.get(j)) {
//					count++;
//					break;
//				}
//			}
		}
		
		System.out.println(lotto);
		System.out.println("Count : " + count);
	}
}
