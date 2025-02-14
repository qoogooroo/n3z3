package p0210.review;

public class Gugudan2 {

	public static void main(String[] args) {
		String strDan = "3";
		int dan = Integer.parseInt(strDan);
		for(int i = 1; i <= 9; i++) {
			System.out.print(dan + " X " + i + " = " + dan * i);
			if(i != 9) {
				System.out.print(", ");
				if(dan * i <= 9) {
					System.out.print(" ");
				}
			}else {
				System.out.println();
			}
		}
	}
}
