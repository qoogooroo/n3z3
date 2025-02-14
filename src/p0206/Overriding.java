package p0206;

class Mother {
	void work() {
		System.out.println("Mother is working.");
	}
}

public class Overriding extends Mother{
	void work() {
		System.out.println("I'm working.");
	}
	public static void main(String[] args) {
		// 상속관계
		// 같은 메소드명
		// 같은 데이터 타입
		// 접근제어자의 권한이 넓거나 같음
		// static 여부 맞춰야함
		Overriding o = new Overriding();
		o.work();	//Overrding의 work()
		
		Mother m = new Overriding();
		m.work();	//Overrding의 work()
	}
}
