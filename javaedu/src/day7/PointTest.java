package day7;

public class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1, 2, 3);
		System.out.println(p3.getLocation());
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point {
	int z;
	Point3D(int x, int y, int z) {
		super(x,y);	// 조상이 갖고 있는 생성자는 int 형 2개를 넣어줘야 함 -> x,y를 전달한다.
		this.z = z;
	}
	String getLocation() { // 오버라이딩
		return super.getLocation() + ", z :" + z;
	}
}
