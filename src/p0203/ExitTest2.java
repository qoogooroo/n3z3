package p0203;

public class ExitTest2 {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j<=10; j++ ) {
				System.out.println(i*j);
				if(i == 1) {
					i = 10;	//첫번째 반복문까지 나가기 위해서 조건문에서 false가 되도록 만듬
					break;
					// 혹은 return;
				}
			}
		}
	}
}
