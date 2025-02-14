package p0210;

public class Gugudan2 {

	public static void main(String[] args) {
		String dan = "1";
		// dan에 따라 구구단 출력
		int intDan = Integer.parseInt(dan);
		for( int i = 1; i <= 9; i++) {
			System.out.println(intDan + " X " + i + " = " + (intDan * i));
		
		}
	}
}
