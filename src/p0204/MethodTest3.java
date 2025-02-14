package p0204;

import java.util.Scanner;

public class MethodTest3 {
	int coffeePrice = 1000;
	int getCoffee(int money) {
		return money - coffeePrice;
	}
	public static void main(String[] args) {
		MethodTest3 mt = new MethodTest3();
		// getCoffee 2000을 넣고 호출했을때 커피값을 뺀 나머지 잔돈을 출력하는 코딩
		
		Scanner s = new Scanner(System.in);
		System.out.print("Input money : ");
		String strNum = s.nextLine();
		int inputPrice = Integer.parseInt(strNum);
		
		System.out.println("Your change : " + mt.getCoffee(inputPrice));
	}
}
