package p0212;

public class Food {
	/*String 이름(name), int 가격(price), String 분류(type)
	 * 해당 변수를 private로 선언하고
	 * public으로 getter, setter method를 생성
	 * toString을 오버라이딩하여 각 값이 나오는 클래스를 생성
	*/
	private String name;
	private int price;
	private String type;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public String toString() {
		return "[name = " + name + ", price = " + price 
				+ ", type = " + type + "]";
	}
}

class Excute2 {
	public static void main(String[] args) {
		
	}
}