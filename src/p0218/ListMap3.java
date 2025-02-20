package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap3 {
	

	static List<Map<String,String>> getUserInfos() {

		List<Map<String,String>> infos = new ArrayList<>();
		Map<String,String> info1 = new HashMap<>();
		info1.put("UI_NUM", "2");
		info1.put("UI_NAME", "성룡");
		info1.put("UI_ID", "SUNG");
		info1.put("UI_PWD", "123");
		infos.add(info1);
		Map<String,String> info2 = new HashMap<>();
		info2.put("UI_NUM", "3");
		info2.put("UI_NAME", "강길동");
		info2.put("UI_ID", "333");
		info2.put("UI_PWD", "12345");
		infos.add(info2);
		
		return infos;
	}
	
	public static void main(String[] args) {
		List<Map<String,String>> infos = getUserInfos();
		for(Map<String,String> i : infos) {
			System.out.println(i);
		}
	
	}
	
}
