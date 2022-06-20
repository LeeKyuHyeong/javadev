package oop01;

public class PointTest {

	public static void main(String[] args) {
		
		Point2D p = new Point2D();
		//p.x = 6;
		p.setX(6);
		//p.y = 3;
		p.setY(3);
		System.out.printf("x = %d, y = %d",p.getX(), p.getY());
		
	}

}
