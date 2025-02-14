package p0205;

class Human{
	void work() {
		System.out.println("Human must work.");
	}
}

public class Father extends Human{
	public Father() {
		System.out.println("Constructor of Class Father.");
	}
	
	public static void main(String[] args) {
		Father f = new Father();
		f.work();
	}

}
