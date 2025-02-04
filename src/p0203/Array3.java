package p0203;

public class Array3 {

	public static void main(String[] args) {
		String str = "3,9";
		String[] strs = str.split(",");		//split : 자주쓰는 method, 해당 문자를 기준으로 문자열을 배열로 나눠줌
		
		// strs[0]값부터 strs[1]값까지 출력하는 반복문
		
		int min = Integer.parseInt(strs[0]);
		int max = Integer.parseInt(strs[1]);
		
		for(int i = min; i <= max; i++) {
			System.out.println(i);
		}
	}
}
