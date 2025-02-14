package p0214;

public class Switch {

	public static void main(String[] args) {
		int age = 20;
		if (age < 10) {
			System.out.println("kid");
		} else if (age < 20) {
			System.out.println("teen");
		}

		age /= 10;
		switch (age) {
		case 0:
			System.out.println("kid");
			break;
		case 1:
			System.out.println("teen");
			break;
		case 2:
			System.out.println("Adult");
			break;
		default:
			System.out.println("granny");
		}
	}
}
