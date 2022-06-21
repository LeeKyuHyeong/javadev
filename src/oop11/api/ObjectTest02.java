package oop11.api;

public class ObjectTest02 {

	public static void main(String[] args) {

		int a = 10;		
		int b = 10;		

		System.out.println(a==b ? "같다" : "다르다");
		
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";
		
		System.out.println(str1==str2 ? "같다" : "다르다");
		System.out.println(str1.toString()==str2.toString() ? "같다" : "다르다");
		System.out.println(str1.hashCode()==str2.hashCode() ? "같다" : "다르다");
		System.out.println(str1.equals(str2) ? "같다" : "다르다");
	}

}
