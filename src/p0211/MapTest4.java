package p0211;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapTest4 {
//
	//		여러가지 테스트 해볼것@
	//		
	public static void main(String[] args) {
		ArrayList<HashMap<String,Integer>> list = new ArrayList<>();
		HashMap<String,Integer> map = new HashMap<>(); 
		//14Line을 여기에 쓰면 반복문이후에 [{번호=2},{번호=2}] 
		for(int i = 1; i <= 2; i++) {
			//HashMap<String,Integer> map = new HashMap<>();
			//list = [{번호=1},{번호=2}]
			map.put("번호", i);
			list.add(map);
		}
		
		System.out.println(list);
		
		for(HashMap<String,Integer> m:list) {
			System.out.println(m);
		}
	}
}
