package p0204;

public class Loop {

	public static void main(String[] args) {
		//총 9개의 for문을 사용하여 구구단 1단~ 9단까지 출력
		
		for(int i = 1; i < 10; i++) {
			System.out.println(1 + " X " + i + " = " + 1*i);
		}
		for(int i = 1; i < 10; i++) {
			System.out.println(2 + " X " + i + " = " + 2*i);
		}
		for(int i = 1; i < 10; i++) {
			System.out.println(3 + " X " + i + " = " + 3*i);
		}
		for(int i = 1; i < 10; i++) {
			System.out.println(4 + " X " + i + " = " + 4*i);
		}
		for(int i = 1; i < 10; i++) {
			System.out.println(5 + " X " + i + " = " + 5*i);
		}
		for(int i = 1; i < 10; i++) {
			System.out.println(6 + " X " + i + " = " + 6*i);
		}
		for(int i = 1; i < 10; i++) {
			System.out.println(7 + " X " + i + " = " + 7*i);
		}
		for(int i = 1; i < 10; i++) {
			System.out.println(8 + " X " + i + " = " + 8*i);
		}
		for(int i = 1; i < 10; i++) {
			System.out.println(9 + " X " + i + " = " + 9*i);
		}
		
		// 다중 for문으로 구현
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(j == 1) {
					System.out.println(i + " times talbe!");
				}
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
	}
}
