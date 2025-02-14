package p0206;

class Test2 {
	public int toInt() {
		return 1;
	}
	public String toString() {
		return "abc";
	}
}
public class StringTest2 extends Test2{

	public static void main(String[] args) {
		StringTest2 st = new StringTest2();
		int i = st.toInt();
		System.out.println(i);		// 1
		
		Object o = new StringTest2();
		String str = o.toString();
		System.out.println(o);		//abc
		System.out.println(str);	//abc	println에서 toString해주니까
		
	}
}
