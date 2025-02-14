package p0211;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {
	// ArrayList의 경우 중복도 상관없이 순서대로 저장된다.(add)

	// 여러 map이 있지만 우선 hashmap
	// key와 value가 중요
	// key값 중복 불가능
	// 순서 없음!

	// 순서가 중요하다면 list, key 값이 중요하다면 map

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("name3", "unknown");
		map.put("name2", "unknown");
		map.put("name1", "unknown");
		map.put("name0", "unknown");
		map.put("name999", "unknown");
		map.put("name888", "unknown");
		System.out.println(map);// 값이 출력되는 순서가 없음
		System.out.println(map.get("name2"));// key값을 통해 값을 가져올 수 있다

		Iterator<String> it = map.keySet().iterator();// key 세트를 들고와서 it에 저장 <> 는 key의 데이터타입
		while (it.hasNext()) {
			String key = it.next();// hadNext() = 다음거 있음?
			System.out.println(key + "," + map.get(key));// .next(); 세트에서 하나 빼오기 (세트에선 빼서 없어짐)
		}

	}

}
