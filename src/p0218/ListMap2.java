package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap2 {

	static List<Map<String, Integer>> getInfos() {
		Map<String, Integer> info1 = new HashMap<>();
		info1.put("year", 2018);
		info1.put("week", 1);
		info1.put("TV", 2301);
		info1.put("Online", 378);
		info1.put("Newspaper", 692);
		Map<String, Integer> info2 = new HashMap<>();
		info2.put("year", 2018);
		info2.put("week", 2);
		info2.put("TV", 445);
		info2.put("Online", 393);
		info2.put("Newspaper", 451);
		Map<String, Integer> info3 = new HashMap<>();
		info3.put("year", 2018);
		info3.put("week", 3);
		info3.put("TV", 172);
		info3.put("Online", 489);
		info3.put("Newspaper", 693);
		Map<String, Integer> info4 = new HashMap<>();
		info4.put("year", 2018);
		info4.put("week", 4);
		info4.put("TV", 172);
		info4.put("Online", 459);
		info4.put("Newspaper", 584);
		Map<String, Integer> info5 = new HashMap<>();
		info5.put("year", 2018);
		info5.put("week", 5);
		info5.put("TV", 1808);
		info5.put("Online", 108);
		info5.put("Newspaper", 584);	
		List<Map<String, Integer>> infos = new ArrayList<>();
		infos.add(info1);
		infos.add(info2);
		infos.add(info3);
		infos.add(info4);
		infos.add(info5);
		return infos;
	}
	
	public static void main(String[] args) {
		
		List<Map<String,Integer>> x = getInfos();
		
		for(Map<String, Integer> i:x) {
			System.out.println(i);
		}
	}
}
