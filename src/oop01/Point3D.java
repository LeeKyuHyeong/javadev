package oop01;

public class Point3D extends Point2D {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public void print() {
		super.print();
		System.out.printf(", z = %d\n", this.getZ());
	}

	public Point3D() {		
		this(10, 20, 30);
		//System.out.println("Point3d() 수행중");
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		//System.out.println("Point3d(x, y, z) 수행중");
	}
}
