package p0210;

import java.util.Scanner;

public class Calc2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Input : ");
			String inputStr = scanner.nextLine();
			if("q".equals(inputStr.toLowerCase())) {
				break;
			}
			if(inputStr.contains(" ")){	
				System.out.println("space not allowed.");
			}else if(inputStr.contains("+")) {
				String[] calcStr = inputStr.split("\\+");
				int n1 = Integer.parseInt(calcStr[0]);
				int n2 = Integer.parseInt(calcStr[1]);
				System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
			}else if(inputStr.contains("-")) {
				String[] calcStr = inputStr.split("-");
				int n1 = Integer.parseInt(calcStr[0]);
				int n2 = Integer.parseInt(calcStr[1]);
				System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
			}else if(inputStr.contains("*")) {
				String[] calcStr = inputStr.split("\\*");
				int n1 = Integer.parseInt(calcStr[0]);
				int n2 = Integer.parseInt(calcStr[1]);
				System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
			}else if(inputStr.contains("/")) {
				String[] calcStr = inputStr.split("/");
				int n1 = Integer.parseInt(calcStr[0]);
				int n2 = Integer.parseInt(calcStr[1]);
				System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
			}else if(inputStr.contains("%")) {
				String[] calcStr = inputStr.split("%");
				int n1 = Integer.parseInt(calcStr[0]);
				int n2 = Integer.parseInt(calcStr[1]);
				System.out.println(n1 + " % " + n2 + " = " + (n1%n2));
			}else{
				System.out.println("Invaild operator!");
			}
		}
		System.out.println("Calculator has shut down.");
	}
}
