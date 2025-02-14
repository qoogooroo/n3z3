package p0207;

import java.util.ArrayList;

public class ListTest6 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		// list 1~100 난수를 10개 집어넣고 출력
		while (list.size() < 10) {
			list.add((int) (Math.random() * 100) + 1 + "");
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println("list[" + i + "] : " + list.get(i));
		}
	}
}
