package p0204;

public class Food {	//Food 뒤에 extends Object가 생략되어있다

	int price;
	String name;
	public String toString() {
		return "Menu : " + name + ", Pirce : " + price;
	}
	
	public static void main(String[] args) {
		Food f = new Food();
		f.name = "참치김밥";
		f.price = 5000;
		// String str = f.toString();  println()에서 object가 매개변수로 들어가면 toString()을 해주므로 생략가능
		System.out.println(f);
		
	}
}
