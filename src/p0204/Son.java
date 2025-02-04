package p0204;

class Human{
	void work() {
		System.out.println("Working...");
	}
}

public class Son extends Human {
	void work() {
		System.out.println("Son is working...");
	}
	void sleep() {
		System.out.println("Son is sleeping...");
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.work();						//오버라이딩
		s.sleep();
		Human h = new Son();			//메모리로 생성된것 기준으로 오버라이딩이 일어남
		//Son s1 = new Human(); 		//Error
	 	h.work();      					//오버라이딩
	 	// h.sleep();					//상속받은 쪽에 어떤것들이 있는지 잘 몰라서 Error
	 	Son s2 = (Son)h;				//24line을 가능하게 하려면 casting
	 	s2.sleep();
	}
}	
