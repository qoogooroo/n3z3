package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap1 {

	static List<Map<String, String>> getUserInfo() {
		Map<String, String> map1 = new HashMap<>(); // Map 은 HashMap 의 인터페이스
		map1.put("이름", "홍길동");
		map1.put("나이", "22");
		map1.put("id", "hong");
		Map<String, String> map2 = new HashMap<>();
		map2.put("이름", "임꺾정");
		map2.put("나이", "33");
		map2.put("id", "lim");
		Map<String, String> map3 = new HashMap<>();
		map3.put("이름", "유관순");
		map3.put("나이", "16");
		map3.put("id", "yu");
		List<Map<String, String>> maps = new ArrayList<>();
		maps.add(map1);
		maps.add(map2);
		maps.add(map3);

		return maps;
	}

	public static void main(String[] args) {

		List<Map<String, String>> users = getUserInfo();
		
		for(Map<String,String> m : users) {
			System.out.println(m);
		}
//		for(int i = 0; i < users.size(); i++) {
//			Map<String, String> m = users.get(i);
//			System.out.print("이름 : " + m.get("이름") + "\t");
//			System.out.print("나이 : " + m.get("나이") + "\t\t");
//			System.out.println("ID : " + m.get("id"));
//		}
	}
}
