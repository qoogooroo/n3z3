package p0213;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	static void printList(List<String> list) {	//ArrayList<E> 와 LinkedList<E> 는 List<E> interface 를 implements 받았다.
		for(String str:list) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		// list map set
		// array list, linked list
		// 리스트 안의 데이터가 자주 바뀐다면 linked list 하지만 실질적으로 잘 안쓰임
		ArrayList<String> als = new ArrayList<>();
		//List<String> als = new ArrayList<>(); 로 더 많이씀
		LinkedList<String> lls = new LinkedList<>();
		//List<String> lls = new LinkedList<>();
		als.add("9");
		als.add("2");
		als.add("5");
		lls.add("9");
		lls.add("2");
		lls.add("5");
		printList(als);
		printList(lls);
		
		
	}
}
