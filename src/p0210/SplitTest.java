package p0210;

public class SplitTest {

	public static void main(String[] args) {
		String s = "123+456";
		
		String[] ss = s.split("\\+");
		
		for(int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);	
		}
		
	}
}
