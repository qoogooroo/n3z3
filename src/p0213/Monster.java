package p0213;

public abstract class Monster {
	public Monster() {	//생성자는 abstract 불가능
		System.out.println("I'm Monster class");
	}
	public abstract void test();
	public void attack () {
		System.out.println("Attack//");
	}
}

class Randal extends Monster{
	public void test() {	// abstract class 에서 구현 안된 method 를 구현해야만 한다
		System.out.println("I'm overided test");
	}
}

class AbstractTest{
	public static void main(String[] args) {
		//Monster m = new Monster(); abstatct는 메모리 생성 불가능(interface 와 동일한 이유)
	}
}
