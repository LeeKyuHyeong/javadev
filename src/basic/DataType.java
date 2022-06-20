package basic;

public class DataType {

	public static void main(String[] args) {

		boolean b1 = false;
		System.out.println("b1 : " + b1);
		
		//char c = 'A';
		char c = 54620;
		System.out.println(c);
		
		//byte b2 = 127;
		byte b2 = 127;
		System.out.println("b2 : " + b2);
		
		//short s = 32768;	에러
		short s = 32767;
		System.out.println("s : " + s);
		
		int i = 2147483647;
		System.out.println("i : " + i);
		
		long l1 = 21612112111L;
		System.out.println("l1 : " + l1);
		
		double d = 3.1415926535;
		System.out.println("d : " + d);
		
		float f = 3.1415926535121231f;
		System.out.println("f : " + f);
		
		String str = "hi";
		System.out.println("그가말했다. \"안녕하세요~!\"");
		System.out.printf("%s 이름~", str);
		
		
	}

}
