package p0205;

public class Loop2 {

	public static void main(String[] args) {
		// 1~100까지 출력하는 반복문
		// 5의 배수일때 MS 아닐떄는 숫자 출력
		// 3이라는 숫자가 있을때는 ZZ 출력
		// 조건을 모두 만족하면 MZ
		
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && (i % 10 == 3 || i / 10 == 3)) {
				System.out.println("MZ");
			} else if(i % 5 == 0) {
				System.out.println("MS");
			} else if ( i % 10 == 3 || i / 10 == 3) 
				System.out.println("ZZ");
			else {
				System.out.println(i);
			}
		}
	}
}
