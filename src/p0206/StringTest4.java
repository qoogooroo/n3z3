package p0206;

public class StringTest4 {

	public static void main(String[] args) {
		String str = "안녕하세요";
		int idx = str.indexOf("세");
		System.out.println(idx);
		idx = str.indexOf("안녕");
		System.out.println(idx);
		idx = str.indexOf("하세요");
		System.out.println(idx);
		idx = str.indexOf("하세요@");
		System.out.println(idx);
		idx = str.indexOf("ㅎ");
		System.out.println(idx);

		System.out.println(str.replace("안", "An"));
		System.out.println(str.replace("요", "Yo"));
		System.out.println(str);
		str = str.replace("안", "An");
		str = str.replace("녕", "Nyeong");
		str = str.replace("요", "Yo");
		System.out.println(str);
		
		str = "안녕하세요";
		System.out.println(str.substring(0,2));
		System.out.println(str.substring(1,1));
		
	}
}
