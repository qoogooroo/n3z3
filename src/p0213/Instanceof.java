package p0213;

import java.util.ArrayList;
import java.util.List;

interface Color {
	void printColor();
}
class Red implements Color {
	public void printColor() {
		System.out.println("Red");
	}
	void feature() {
		System.out.println("Bloody~");
	}
}
class Black implements Color {
	public void printColor() {
		System.out.println("Black");
	}
	void dark() {
		System.out.println("Dark of darkness~");
	}
}
class White implements Color {
	public void printColor() {
		System.out.println("White");
	}
	void bright() {
		System.out.println("Holy shine~");
	}
}
public class Instanceof {
	// A InstanceOf a    a 를 A 라고 불러도 되는가 ? 라는 의미
	public static void main(String[] args) {
		List<Color> colors = new ArrayList<>();
		colors.add(new Red());
		colors.add(new Black());
		colors.add(new White());
		for(Color c : colors) {
			c.printColor();
			if(c instanceof Red) {
				Red r = (Red)c;
				r.feature();
			}else if(c instanceof Black) {
				Black b = (Black)c;
				b.dark();
			}
		}
	}
}
