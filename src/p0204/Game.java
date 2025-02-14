package p0204;

public class Game {

	public int price;
	public String name;
	public String vendor;
	
	public String toString() {
		return "Title : " + name + ", Present : " + vendor + ", Pirce : " + price;
	}
	
	public static void main(String[] args) {
		// price 14000, name Three Kingdoms, vendor KOEI
		// 값의 개체를 생성하고
		// System.out.println(Object)를 출력했을때
		// 메모리 주소가 아닌 각 값을 출력하는 코드를 완성하기
		
		Game game = new Game();
		game.price = 14000;
		game.name = "Three Kingdoms";
		game.vendor = "KOEI";
		System.out.println(game);
	}
}
