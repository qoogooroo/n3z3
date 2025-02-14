package p0207;

public class WrapperClass {

	public static void main(String[] args) {
		byte b1 = 1;
		Byte b2 = 1;
		short s1 = 1;
		Short s2 = 1;
		int i1 = 1;
		Integer i2 = 1;
		long l1 = 1;
		Long l2 = 1L;	//참조형이라 롱데이터 타입이라고 알려줘야만 작동하는 녀석
		
		float f1 = 1.1F;
		Float f2 = 1.1F;
		double d1 = 1.1;
		Double d2 = 1.1;
		
		char c1 = 'a';
		Character c2 = 'a';
		
		boolean bl1 = true;
		Boolean bl2 = true;
		
		
		String str = "123";
		int num = Integer.parseInt(str);
		str = Integer.toString(123);
		str = "1.1";
		double num2 = Double.parseDouble(str);
	}
}
