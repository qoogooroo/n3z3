package p0210.review;

import java.util.Scanner;

public class Gugudan3 {
	
	static void printXXDan(int x) {
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= x; j++) {
				System.out.print(i + " X " + j + " = " + i * j);
				if(j != x) {
					System.out.print(", ");
					if(i * j <= 9) {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input to print a time talbe : ");
		String strDan = scanner.nextLine();
		int dan = Integer.parseInt(strDan);
		System.out.println(strDan + strDan + "Dan Start!");
		printXXDan(dan);
	}
}
