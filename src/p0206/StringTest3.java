package p0206;

public class StringTest3 {

	public static void main(String[] args) {
		int i = 1;
		System.out.println(i==1);
		double bl = 1;
		System.out.println(bl == 1); //뒤에 1을 자동으로 1.0으로 바꿔서 비교해줌
		
		String str1 = new String("Hi~");
		String str2 = new String("Hi~");
		System.out.println(str1);
		System.out.println(str2);		// Hi~ String에는 toString을 오버라이딩하는 메소드가 있음
		System.out.println(str1 == str2);		//주소값 비교
		System.out.println(str1.equals(str2));	//값 비교
		
		String str3 = "안녕";
		String str4 = "안녕";
		System.out.println(str3 == str4);	//메모리생성을 따로하지 않아서 JVM이 str3안녕 생성할때 만든걸 둘다 바라봄
	}
}
