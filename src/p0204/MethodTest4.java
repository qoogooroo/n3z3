package p0204;

public class MethodTest4 {
	int money = 1000;
	
	void saveMoney(int money) {
		this.money += money;	//같은 변수명이지만 멤버변수를 지칭할때 this.var
	}
	public static void main(String[] args) {
		MethodTest4 mt = new MethodTest4();
		mt.saveMoney(500);				// this.money = mt.money
		System.out.println(mt.money);	// 1500
		
		MethodTest4 mt1 = new MethodTest4();
		mt1.saveMoney(5000);			// this.money = mt1.money
		System.out.println(mt1.money);	// 6000
		mt1.saveMoney(300);				
		System.out.println(mt1.money);	// 6300
	}
}