package p0207;

public class StringTest {

	static String str = "a";
	
	public static void main(String[] args) {
		String str1 = "Hello~";
		String str2 = "Hello~";
		System.out.println(str1==str2); // true
		
		String str3 = new String("Hello~"); // 원래 이게 FM이지만 위처럼해도
		System.out.println(str1 == str3); // false
		System.out.println(str2 == str3); // false
		System.out.println(str1.equals(str3)); //true
		System.out.println(str2.equals(str3)); //true
		
		String str4 = null;
		//System.out.println(str4.equals("Hello~")); NullPointerException
		System.out.println(str4!=null && str4.equals("Hello~")); // false
		System.out.println("Hello~".equals(str4)); // false
		
		StringTest t1 = new StringTest();
		StringTest t2 = new StringTest();
		System.out.println(t1.equals(t2));			// false
		System.out.println(t1.str.equals(t2.str));	// true
		// .equals는 원래 Object 클래스내에 있지만, String 클래스에서 오버라이딩되어있다.
	}
}