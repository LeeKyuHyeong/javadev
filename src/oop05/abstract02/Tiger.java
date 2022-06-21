package oop05.abstract02;

public class Tiger extends Animal {
	public void attack() {
		System.out.println("호랑이의 공격");
	}

	@Override
	public void sleep() {
		System.out.println("호랑이 꿀잠");
	}
}
