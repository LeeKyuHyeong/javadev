package oop11.api;

public class ObjectTest01 {
	public static void main(String[] args) {
	
		Point p1 = new Point();
		
		System.out.println("클래스 이름 : " + p1.getClass());
		System.out.println("해쉬 코드 : " + p1.hashCode());
		System.out.println("인스턴스 참조값 : " + p1.toString());
		
		Point p2 = new Point();
		
		System.out.println("클래스 이름 : " + p2.getClass());
		System.out.println("해쉬 코드 : " + p2.hashCode());
		System.out.println("인스턴스 참조값 : " + p2.toString());
		
	}
}

class Point{
	int age;
	
}