package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		for(int i = 0; i<10; i++) {
			nums.add(r.nextInt(100)+1);
		}
		System.out.println(nums);	//ArrayList는 toString()이 정의되어 있어서 안의 값들을 출력해줌
									// 원래 참조형 println()하면 toString()해서 메모리값 찍어줌
		
		
		nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		System.out.println("2를 어디서 찾았냐면 : #" + nums.indexOf(2));
		System.out.println("5를 어디서 찾았냐면 : #" + nums.indexOf(5));
		
		
		//pros) 순서대로 출력하기 제일 빠름
		//cons) 데이터 삭제할때 오래걸림 (뒤에 있는 값을 일일히 땡겨와야하니까), 이걸 해결하는게 LinkedList
		
		
	}
}
