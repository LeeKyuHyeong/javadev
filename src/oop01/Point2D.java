package oop01;

public class Point2D {
	// 멤버변수 멤버필드 속성 properites 상태
	private int x;
	private int y;

	// 멤버메서드 행위
	public int getX() {
		return x;
	}

	public void setX(int x) { // 매개변수 x
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	// 게터 세터는 정보은닉(Information Hiding) or 캡슐화(Encapsultaion)를 위함이다.
	// 사용자는 내용을 알 필요없고 알기 위해선 메서드를 통해서 접근한다.
	// private 으로 멤버변수를 감싼다 메서드는 public으로 해놓는다.

	public void print() {
		System.out.printf("x = %d, y = %d", this.getX(), this.getY());
	}
	//기본생성자 default생성자
	public Point2D() {

	}
	
	Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
