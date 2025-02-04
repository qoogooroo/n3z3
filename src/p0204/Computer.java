package p0204;

public class Computer {

	public String cpu;
	public String ram;
	public String ssd;
	public int price;
	
	public String toString() {
		return "CPU : " + cpu + ", RAM : " + ram + ", SSD : " + ssd + ", Price : " + price;
	}
	// Alt Shift S V 오버라이드 단축키
	
	public static void main(String[] args) {
		// cpu i7-13 ram 16GB ssd 2TB price 1100000;
		
		Computer computer = new Computer();
		computer.cpu = "i7-13";
		computer.ram = "16GB";
		computer.ssd = "2TB";
		computer.price = 1100000;
		
		System.out.println(computer);
	}
}
