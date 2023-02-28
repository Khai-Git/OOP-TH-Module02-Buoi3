package nguyenThanhTien.bai06;

public class TestDangKyXe {
	public static void main(String agrs[]) {
		ThongTinDangKyXe xe1=new ThongTinDangKyXe("Nguyen Thu Loan","Future Neo",100,35000000);
		ThongTinDangKyXe xe2=new ThongTinDangKyXe("Le Minh Tinh","Ford Ranger",3000,250000000);
		ThongTinDangKyXe xe3=new ThongTinDangKyXe("Nguyen Minh Triet","Landscape",1500,100000000);
		System.out.println(ThongTinDangKyXe.getTieuDe());
		System.out.println(xe1);
		System.out.println(xe2);
		System.out.println(xe3);
	}
}
