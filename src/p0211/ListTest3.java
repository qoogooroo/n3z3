package p0211;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTest3 {

	public static void main(String[] args) {

		ArrayList<String> strs = new ArrayList<>();

		while (strs.size() < 6) {
			int rNum = (int) (Math.random() * 45) + 1;
			String rStr = Integer.toString(rNum);
			if (strs.indexOf(rStr) == -1) {
				strs.add(rStr);
			}
		}

		Scanner scan = new Scanner(System.in);
		System.out.print("','로 구분된 6개 숫자 입력(1~45) : ");
		String userInput = scan.nextLine();
		String[] userLottoStrs = userInput.split(",");

		int count = 0;
		for (int i = 0; i < userLottoStrs.length; i++) {
			if (strs.indexOf(userLottoStrs[i]) != -1) {
				count++;
			}
		}
		
		System.out.println(strs);
		System.out.println("Count : " + count);
	}
}
