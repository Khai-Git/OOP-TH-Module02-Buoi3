package nguyenTienDat.bai06;

public class Test_ThongTinDangKyXe {
	public static void main(String[] args) {
		try {
			ThongTinDangKyXe xe1 = new ThongTinDangKyXe("Nguyễn Thị Loan", "Future Neo", 100, 35000000f);
			ThongTinDangKyXe xe2 = new ThongTinDangKyXe("Lê Minh Tính",	"Ford Ranger", 3000, 250000000f);
			ThongTinDangKyXe xe3 = new ThongTinDangKyXe("Nguyễn Minh Triết", "Landscape", 1500, 1000000000f);
			System.out.println(ThongTinDangKyXe.getTieuDe());
			System.out.println(xe1);
			System.out.println(xe2);
			System.out.println(xe3);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
