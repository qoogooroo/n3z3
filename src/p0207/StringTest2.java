package p0207;

import java.util.ArrayList;

public class StringTest2 {

	public static void main(String[] args) {
		// list에 1~100까지의 값을 순서대로 추가
		// 반복문을 사용하여 출력
		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			list.add(i + 1 + "");
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).replace("3", "ZZ"));
		}
		
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).contains("3")) {
//				System.out.println("ZZ");
//			}else {
//				System.out.println(list.get(i));
//			}
//		}
		
//		for (int i = 0; i < list.size(); i++) {
//			int num = Integer.parseInt(list.get(i));
//			if (num % 10 == 3 || num / 10 == 3) {
//				System.out.println("ZZ");
//			}else {
//				System.out.println(list.get(i));
//			}
//		}
	}
}
