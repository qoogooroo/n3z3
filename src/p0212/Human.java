package p0212;

public class Human {
	//POJO : 멤버변수는 private, get set메소드에 다른 기능을 넣지 않음,메소드를 통해 값을 지정하고 출력
	private String name;
	private int age;
	private String address;
	private double weight;
	// 모든 멤버변수는 private 으로 서언한다
	// 대신 값을 셋팅하고 get set 할 수 있는 public method 를 만든다
	
	public void setName(String name) {
		this.name = name;	//멤버변수 name = 12번라인 매개변수 name
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	//println = toString()실행하는거니까 오버라이딩해서 의미있는 메소드로 만들어주기
	public String toString() {
		return "[name = " + name + ", age = " + age 
				+ ", address = " + address + ", weight = " + weight + "]";
	}
}

class Excute{
	
	public static void main(String[] args) {
		Human h = new Human();
		// name = 홍길동, age = 30, address = 서울, weight = 70.5
		// set 후 출력
		h.setName("홍길동");
		h.setAge(30);
		h.setAddress("서울");
		h.setWeight(70.5);
		
		System.out.println("Name : " + h.getName());
		System.out.println("Age : " + h.getAge());
		System.out.println("Address : " + h.getAddress());
		System.out.println("Weight : " + h.getWeight());
		
		System.out.println(h);
	}
}
