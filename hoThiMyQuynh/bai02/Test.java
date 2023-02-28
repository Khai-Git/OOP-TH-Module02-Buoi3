package hoThiMyQuynh.bai02;

public class Test {

	public static void main(String[] args) {
		Point p= new Point(7, 8);
		System.out.println(p);
		Point kq= p.negate();
		float kc=p.getDistance();
		System.out.println("Diem doi xung cua toa do tren la:"+kq);
		System.out.println("Khoang cach den toa do goc O la:"+kc);


	}

}
