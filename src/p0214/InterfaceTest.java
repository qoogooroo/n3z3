package p0214;

interface Test{
	void test();
}
public class InterfaceTest {

	public static void main(String[] args) {
		Test t = new Test() {
			public void test() {
				System.out.println("im test");
			} 
		};
		t.test();
	}
}
