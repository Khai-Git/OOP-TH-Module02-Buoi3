package nguyenTienDat.bai02;

public class Test_Point {
	public static void main(String[] args) {
		Point s=new Point(5,10);
		System.out.println(s.toString());
		System.out.println("Diem doi xung qua tam O co toa do "+s.negate());
		System.out.println("Khoang Cach tu tam O den diem la: "+s.getDistance());
		
	}
}
