package p0206;


class Test {
	void test() {
		System.out.println("I am Test ~ ");				//1
	}
	
}
public class StringTest extends Test {

	void test() {
		System.out.println("Hi, I'm StringTest.");		//2
	}
	public static void main(String[] args) {
		StringTest st = new StringTest();
		st.test();						//2
		
		Test t = new Test();
		t.test();						//1
		
		Test t2 = new StringTest();
		t2.test();						//2
		
		Object o = new StringTest();
		//o.test()						//Object에 test가 없어서 아래에 잇는줄 모름
		
		
		//println은 var.toString() 하는것
		//
	}
}
