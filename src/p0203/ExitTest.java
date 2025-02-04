package p0203;

public class ExitTest {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if(i == 5) {
				break;	//반복문에만 사용가능.
				// return; main method 종료
				// System.exit(0); 프로그램 종료
			}
		}
		System.out.println("반복문 종료!");
	}
}
