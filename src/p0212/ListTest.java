package p0212;

import java.util.ArrayList;
import java.util.HashMap;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Human> people = new ArrayList<>();
		for(int i = 1; i <= 10; i++) {
			int age = (int)(Math.random() * 100) + 1;
			int weight = (int)(Math.random() * 50) + 50;
			Human h = new Human();
			h.setName("이름" + i);
			h.setAddress("주소" + i);
			h.setAge(age);
			h.setWeight(weight);
			people.add(h);
		}
		System.out.println(people);
		//advenced for 향상된 for문
		//26Line의 람다식 표현
		for(Human h:people) {	//people 의 0부터 다음방이 없을때까지
			System.out.println(h);
		}
//		for(int i = 0; i < people.size(); i++) {
//			Human h = people.get(i);
//			System.out.println(h);
//		}
	}
}
