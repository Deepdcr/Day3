
public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p1 = new Point2D();
		p1.setPoint2D(100, 200);
		p1.showPoint2D();
		
		System.out.println("-------------");

		Point3D p2 = new Point3D();
		p2.setPoint3D(100, 200, 300);
		p2.showPoint3D();
		
		System.out.println("-------------");

		Point4D p3 = new Point4D();
		p3.setPoint4D(100, 200, 300, 400);
		p3.showPoint4D();
		
		System.out.println("-------------");

	}

}

class Point2D {
	int x;
	int y;

	public void setPoint2D(int x, int y) {

		this.x = x;
		this.y = y;
	}

	void showPoint2D() {
		System.out.println("x is " + x);
		System.out.println("y is " + y);
	}

}

class Point3D extends Point2D {
	int z;

	public void setPoint3D(int x, int y, int z) {
		super.setPoint2D(x, y);
		this.z = z;
	}

	void showPoint3D() {
		super.showPoint2D();
		System.out.println("z is " + z);
	}
}

class Point4D extends Point3D {
	int f;

	public void setPoint4D(int x, int y, int z, int f) {
		super.setPoint3D(x, y, z);
		this.f = f;
	}

	void showPoint4D() {
		super.showPoint3D();
		System.out.println("f is " + f);
	}

}
