package p0213;


public class InterfaceTest implements Action{
	// 만약 상속 주는 쪽에서 Action 을 implement 하고 있고 methods 를 구성 했다면 상속 받는 쪽은 구현하지 않아도 된다.
	public void eat() {
		System.out.println("eating");
	}
	public void play() {
		System.out.println("playing");
	}
	public void work() {
		System.out.println("working");
	}
	public void sleep() {
		System.out.println("sleeping");
	}
 	public static void main(String[] args) {
		Action a = new InterfaceTest();
		a.eat();
		a.play();
		a.work();
	}
}
