package p0203;

public class Condition {

	public static void main(String[] args) {
		int age = 25;
		if(age<10) {
			System.out.println("Baby");
		}else {
			if(age<20) {
				System.out.println("10s");
			}else {
				System.out.println("Adult");	
			}
		}
	}
}
