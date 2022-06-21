package oop05.abstract02;

public class Cat extends Animal {
	public void jump() {
		System.out.println("고양이 짬푸!");
	}

	@Override
	public void sleep() {
		System.out.println("고양이 꿀잠");
	}
}
