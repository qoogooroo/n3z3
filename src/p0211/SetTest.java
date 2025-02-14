package p0211;

import java.util.ArrayList;
import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		//set도 arraylist처럼 elements가 중요함
		//차이점 : set은 중복된 값이 안됨
		//순서 없음
		
		//입출력이 빨라야함 = arraylist
		//중복만 제거하면 됨 = set
		
		ArrayList<String> str = new ArrayList<>();
		str.add("a");
		str.add("a");
		str.add("a");
		System.out.println(str.size()); //3
		
		HashSet<String> set = new HashSet<>();
		set.add("a");
		set.add("a");
		set.add("a");
		System.out.println(set.size());	//1
		System.out.println(set);
	}
}
