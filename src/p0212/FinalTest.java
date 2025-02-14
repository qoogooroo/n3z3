package p0212;

public class FinalTest {
	//상수명 규칙 : 모두 대문자처리 ex.EXAM_TEST underscore 

	// final class Xx 아래로 상속해주지 못함 대표적으로 String은 final임
	// final xx() 오버라이딩이 안됨
	// final XX 상수가됨
	final int I = 1;

	public static void main(String[] args) {
		final int I = 1;
		// i = 2; 상수는 바꿀 수 없음
		System.out.println(I);
		FinalTest ft = new FinalTest();
		System.out.println(ft.I);
	}
}
