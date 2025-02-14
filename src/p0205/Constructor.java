package p0205;

public class Constructor {
	/* 원래 있지만 생략된 녀석 (생성자)
	 * public Constructor() {
	 * 
	 * }
	 */
	
	public Constructor() {
		// 생성자는 대문자로 시작하고 데이터 타입이 없음
		// 할거 없으면 구지 안씀
		// 매개변수 다르게해서 오버로딩가능
		// 생성자를 따로 추가해주면 기본생성자는 사라짐
		System.out.println("You made constructor memories.");
		System.out.println("~~~");
		System.out.println("~~~");
		System.out.println("~~~");
		System.out.println("My works done! can do next task!");
	}
	public static void main(String[] args) {
		Constructor c = new Constructor();
		System.out.println(c);
	}
}
