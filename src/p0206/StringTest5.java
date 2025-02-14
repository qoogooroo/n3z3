package p0206; 

public class StringTest5 {

	public static void main(String[] args) {
		String str = " 우 리 나 라 ";
		int idx = str.indexOf(" ");
		System.out.println(idx);
		idx = str.lastIndexOf(" ");
		System.out.println(idx);
		
		System.out.println(str.replace(" ", "")); 	// 공백 전체 제거
		System.out.println(str.trim());				// 앞 뒤 공백 제거
		
		idx = str.indexOf("나");
		idx = str.indexOf("랅");		// idxOf != -1 이면 글자가 있다고 할 수 있다
		
		boolean hasRam = str.contains("람");
		System.out.println(hasRam);	// 있는지없는지 판별에는 .contains(String x)를 더 많이씀
		
	}
}
