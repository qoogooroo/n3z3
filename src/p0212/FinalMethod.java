package p0212;

class Mother{
	final void test() {
		System.out.println("Mother test");
	}
}

public class FinalMethod extends Mother {
//	void test() {	//Mother test 가 final 이라 오버라이딩 할 수 없음
//		System.out.println("Just test");
//	}
	public static void main(String[] args) {
		FinalMethod fm = new FinalMethod();
		Mother m = new FinalMethod();
		Object o = new FinalMethod();
		m.test();
	}

}
