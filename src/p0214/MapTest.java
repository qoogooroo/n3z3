package p0214;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Map<String,String> map = new HashMap<>();
		
		list.add("홍길동");
		System.out.println(list.get(0));
		list.remove(0);
		
		
		map.put("이름","홍길동");
		System.out.println(map.get("이름"));
		map.remove("이름");
		System.out.println(map.get("이름")); //null
		System.out.println(map==null);//false 비어있지만 null 은아님
		System.out.println(map.size()==0);//true
		System.out.println(map.isEmpty());//true
	}
}
