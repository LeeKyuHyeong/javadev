package oop11.api;

class ObjectTest03 {
	public static void main(String[] args) {
		
		String str1 = new String("실수란 신이");
		String str2 = new String("실수란 신이");
		
		System.out.println(str1==str2 ? "같다" : "다르다");
		System.out.println(str1.toString()==str2.toString() ? "같다" : "다르다");
		System.out.println(str1.hashCode()==str2.hashCode() ? "같다" : "다르다");
		System.out.println(str1.equals(str2) ? "같다" : "다르다");
		
	}
	
}
