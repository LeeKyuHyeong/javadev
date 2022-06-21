package oop01;

public class PointTest {

	public static void main(String[] args) {
		Point2D p2 = new Point2D(10, 20);
		
		p2.print();
		System.out.println();
		
		
		Point3D p3 = new Point3D();
		//p.x = 6;
		p3.setX(6);
		//p.y = 3;
		p3.setY(3);
		//p.z = 10;
		p3.setZ(10);
		
		p3.print();
		
		Point3D p1 = new Point3D(10, 20, 30);
		p1.print();
		
		
	}
}
