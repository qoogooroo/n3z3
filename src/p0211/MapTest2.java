package p0211;

import java.util.HashMap;

public class MapTest2 {

	public static void main(String[] args) {
		//cons. 없는 키값을 입력하면 값이 null이 나옴
		//그것이 어느쪽이 잘못해서 나온 값인지 알기 어려움
		//cons2. 다른 데이터타입을 저장 할 수 없음
		//pros. key값을 만들면 바로 생성됨(선언하지 않아도됨)
		HashMap<String,String> map = new HashMap<>();
		map.put("이름","홍길동");
		map.put("age", "33");
		map.put("address", "한양");
		map.put("job", "도적");
		System.out.println(map);
		//ArrayList 순서대로 저장하고 출력할떄 가장 빠르기 때문에 순서가 중요하면 사용
		//index에 관여하지 않아도 알아서 해줌
		//그래서 구성원(elements)가 중요
		//HashMap key, value 가 중요
		//순서가 없어서 입력한 순서와 결과를 출력해주는 순서가 다름
	}
}
