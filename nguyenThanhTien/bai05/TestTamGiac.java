package nguyenThanhTien.bai05;

public class TestTamGiac {
	public static void main(String agrs[]) {
		HinhTamGiac t1 = new HinhTamGiac();
		HinhTamGiac t2 = new HinhTamGiac(6,1,7);
		HinhTamGiac t3 = new HinhTamGiac(6,5,8);
		HinhTamGiac t4 = new HinhTamGiac(8,8,10);
		HinhTamGiac t5 = new HinhTamGiac(6,6,6);
		System.out.println(HinhTamGiac.getTieuDe());
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
	}
}
