package p0207;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		// Array List ,  Linked List
		int[] nums = new int[3];
		ArrayList<Integer> list = new ArrayList<>(); //<>안의 데이터타입의 배열, 뒷쪽<>는 안쓰는게 1.8부터 표준
		
		ArrayList list2 =new ArrayList(); //어떤 데이터타입도 대입 가능하면 사용하기 번거롭기떄문에 이렇게는 안씀
		
		System.out.println(list.size());
		list.add(10);
		list.add(5);
		list.add(999);
		list.add(0);
		list.add(null);
		System.out.println(list.size());
		list.remove(1);	// 1번째 방의 리스트를 지움, 사실 1번째 뒤에 있는것들을 떙겨오고 마지막 방을 없앰.
		System.out.println(list.size());
		
	}
}
