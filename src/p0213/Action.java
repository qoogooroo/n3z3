package p0213;

public interface Action {	
	//interface 안에서는 mothod 의 body 를 구현(정의) 할 수 없다. 선언만 가능
	//interface 안에서 access modifier 안쓰면 자동으로 public 으로 처리됨 (default 아님), interface 자체는 안쓰면 default
	//interface 는 메모리를 생성 할 수 없다.(생성자도 못만듬)
	void eat();
	void play();
	void work();
}
