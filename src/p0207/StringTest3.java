package p0207;

import java.util.ArrayList;

public class StringTest3 {

	public static void main(String[] args) {
		// list에 1~100까지 순서대로 추가
		// 반복문으로 차례대로 출력
		// 단 3,6,9가 있는 스트링은 "ZZ"으로 출력

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			list.add(i + 1 + "");
		}
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			str = str.replace("3", "짝");
			str = str.replace("6", "짝");
			str = str.replace("9", "짝");
			System.out.println(str);
		}

//		for (int i = 0; i < list.size(); i++) {
//			String str = list.get(i);
//			if (str.contains("3") || str.contains("6") || str.contains("9")) {
//				System.out.println("ZZ");
//			} else {
//				System.out.println(str);
//			}
//		}
	}
}
