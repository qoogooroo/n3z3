package p0205;

public class MethodTest5 {
	static int money = 100;
	
	static void saveMoney(int money) {
		MethodTest5.money += money;			//static 멤버변수 치징할땐 클래스명.변수명
	}
	
	int num = 1000;
	void addNum(int num) {
		this.num += num;					//none-static 멤버변수 지칭할땐 메모리 생성후 this.변수명
	}
	public static void main(String[] args) {
		saveMoney(10);
		System.out.println(MethodTest5.money);
		
		MethodTest5 mt = new MethodTest5();
		mt.addNum(10);
		System.out.println(mt.num);
	}
}
