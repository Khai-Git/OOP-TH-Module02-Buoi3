package lePhuocThai.bai02;

public class Test2 {
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(1,6);

		System.out.println("toa do p1 = "+p1);
		System.out.println("toa do p2 = "+p2);
		System.out.println("Khoang cach cua p1 den toa do goc O: "+ p1.getDistance());
		System.out.println("Khoang cach cua p1 den toa do goc O: "+ p2.getDistance());

	    System.out.println("p2 sau khi negate: " + p2.negate());
  	}
}
