package phamThanhTien.bai02;

public class Run {
	public static void main(String[] args) {
		Point p1= new Point();
		Point p2 = new Point(2, 3);
		Point p3 = new Point(-1, 3);
		
		System.out.println(p1.getDistance());
		System.out.println(p2.getDistance());
		System.out.println(p3.getDistance());
		
		System.out.println(p1.negate());
		System.out.println(p2.negate());
		System.out.println(p3.negate());
	}
}
