package p0214;

public class Constructor {

	public Constructor() {	//기본생성자 없이 8line 의 생성자만 있다면 기본생성자는 자동생성되지 않음
		
	}
	public Constructor(int i) {
		
	}
	public static void main(String[] args) {
		Constructor c = new Constructor();
	}
}
