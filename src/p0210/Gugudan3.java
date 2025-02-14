package p0210;

import java.util.Scanner;

public class Gugudan3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number to print a timestalbe : ");
		String strDan = s.nextLine();
		int dan = Integer.parseInt(strDan);
		System.out.println(strDan + strDan + "단!");
		for(int i = 1; i <= dan; i++) {
			for(int j = 1; j <= dan; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
	}
}
