package p0221;


class Test0 {
	int n = 9;
	static int m = 9;
	
	int changeI() {
		n = 7;
		return n;
	}
	int changeI2() {
		m = 6;
		return m;
	}

}

class Test1 extends Test0{
	int n = 8;
	static int m = 11;
	
	int changeI() {
		n = 33;
		return super.n;
	}
	int changeI2() {
		m = 55;
		return m;
	}
	int orgin() {
		return 3;
	}
}

public class Overriding{

	String work() {
		return "over";
	}
	
	public static void main(String[] args) {
		
		Test0 t0 = new Test0();
		System.out.println(t0.changeI());
		System.out.println(t0.n);
		System.out.println(Test0.m);
		System.out.println(t0.changeI2());
		System.out.println(Test0.m);
		Test0 t02 = new Test0();
		System.out.println(t02.m);
		System.out.println(t02.n);
		
		Test0 t03 = new Test1();
		System.out.println(t03.changeI());
		//System.out.println(t03.origin()); Test0 는 origin() 메소드를 모름!
	}
}
