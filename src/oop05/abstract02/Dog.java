package oop05.abstract02;

public class Dog extends Animal {
	public void bark() {
		System.out.println("왈왈");
	}

	@Override
	public void sleep() {
		System.out.println("개 꿀잠");		
	}
}
