package p0217;

class Test {
	static {
		System.out.println("4");
	}
	static void test() {
		System.out.println("5, im test's test method.");
	}
}

public class Scope {
	public Scope() {
		System.out.println("1, You create my memory.");
	}
	static {
		// initialize block
		// 접근제어자, 데이터타입, 이름이 없는 블록
		// 'static 여부'는 결정 할 수 있다
		// none static 이면 메모리생성시 생성자 전에 실행됨
		// static 이면 main 전에 실행됨
		
		System.out.println("2, When I execute?");

	}
	
	public static void main(String[] args) {
		
		System.out.println("3");
		new Scope();
		Test.test();
	}
}
