package p0203;

public class Loop {

	public static void main(String[] args) {
		// 반복문
		// for(시작과 끝이 명확할때), while(언제 끝날지 불분명할때), do while
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}

		int i = 1;
		while (i++ < 10) {
			System.out.println(i);
		}
	}
}
