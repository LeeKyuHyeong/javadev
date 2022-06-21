package oop09.exception;

public class ExceptionTest01 {
	public static void main(String[] args) {
		
		String str = null;
		
		try {
			str.charAt(0);
			
		}catch(Exception e) {
			e.printStackTrace();	//throwable 에서 상속받은 메서드
		} finally {
			System.out.println("finally 블럭");
		}
			
		System.out.println("종료");
		
	}
}
