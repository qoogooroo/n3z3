package p0219;

class Base {
	int x = 3;
	int getX() {
		return x * 2;
	}
}

class Derivate extends Base {
	int x = 7;
	int getX() {
		return x * 3;
	}
}

public class Gs2{
	public static void main(String[] args) {
		Base a = new Derivate();
		Base ab = new Base();
		Derivate b = new Derivate();
		System.out.println(a instanceof Derivate);
		System.out.println(a.getX());
		System.out.println(a.x);
		System.out.println(b.getX());
		System.out.println(b.x);
	}
}
