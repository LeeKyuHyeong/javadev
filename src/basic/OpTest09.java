package basic;

public class OpTest09 {

	public static void main(String[] args) {
		//자바는 타입에 민감한 언어 <-> (javascript)
		
		double d = 10;					//자동 형변환
		//System.out.println(d);		
		
		int i = (int)3.141592;				//강제 형변환
		//System.out.println(i);
		
		System.out.println((int)(Math.random() * 6) + 1);
		
		
	}

}
