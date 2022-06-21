package oop04b;

public class AnimalTest {
	public static void main(String[] args) {
		//Dog d = new Dog();
		//상위클래스로 참조가능
		Animal d = new Dog();
		//하위클래스의 메소드나 변수 사용 불가능
		//d.bark();
		
		Dog d1 = (Dog)d;
		d1.bark();
		
		//다형성 Polymorphism
		//상속 관계일 때 하위 클래스 타입의 객체(인스턴스)들을 상위 클래스 타입의 변수로 참조 가능!!!!!!!!!!!!
	}
}
