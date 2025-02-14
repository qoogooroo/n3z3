package p0204;

class GrandFather {
	String name = "Grandfa";
}
class Mother extends GrandFather{
	private int money = 100000; // private는 아무리 상속을 줬다고 해도 다른 클래스에선 사용 불가능
	int age;
	void test() {
		System.out.println("Extend Test");
	}
}
public class Extends extends Mother{	// extends(상속,예약어)는 하나만 상속 가능함 둘이상은 안됨
	String adress = "asdf";
	public static void main(String[] args) {
		Extends e = new Extends();
		e.test();
		System.out.println(e.age);
		// System.out.println(e.money);
	}
}
