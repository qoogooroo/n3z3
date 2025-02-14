package p0206;

public class StringTest6 {
	public static void main(String[] args) {

		String str = "Korea Republic of";
		System.out.println(str.length());	// 길이
		str = str.toUpperCase();	// 대문자변환
		System.out.println(str);
		str = str.toLowerCase();	// 소문자변환
		System.out.println(str);

		boolean startK = str.startsWith("K");
		System.out.println(startK);
		boolean endF = str.endsWith("f");
		System.out.println(endF);
		
		str = "k,o,r,e,a";				//"." 과 몇몇 특수문자(|, ., *...)는 \\붙여줘야 작동 ex) split("\\.") 
		String[] strs = str.split(",");  //매개변수 기준으로 잘라서 String[]으로 만들어줌
		
		for(int i = 0; i < strs.length ; i ++) {
			System.out.print("str[" + i + "] : " + strs[i] + "  ");
		}
		
		str = "";
		boolean isBlank = str.isBlank();	// 빈문자열 판단, null은 주소값마저 없어서 판단할수 없기때문에 error
		System.out.println(isBlank);
		boolean isEmpty = str.isEmpty();	// 빈문자열 판단
		System.out.println(isEmpty);
	}
}
