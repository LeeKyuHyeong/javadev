package oop04;

public class PointTest {

	public static void main(String[] args) {
		//upCasting(형변환) 
		Point2D up = new Point3D();
		
		up.x = 10;
		//up.z = 30;
		
		//downCasting
		Point3D down = (Point3D)up;
		down.z = 30;
	}

}
