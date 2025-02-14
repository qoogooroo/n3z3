package p0204;

public class StaticTest {
	int num;	// 멤버변수
	String str;
	static int num2;		//static은 실행하면서 기억해야하기 때문에 로딩이 늘어나고 메모리에도 좋지 못함
	
	public static void main(String[] args) {
		System.out.println(num2);	//0
		StaticTest st = new StaticTest();
		System.out.println(st.num);	// 0
		System.out.println(st.str);	// null
		st.num = 10;
		System.out.println(st.num); // 10
	}
}
