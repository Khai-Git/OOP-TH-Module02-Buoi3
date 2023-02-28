package bai06;

public class TestThongTinDangKyXe {
	public static void main(String[] args) {
		
			ThongTinDangKyXe tieuDe = new ThongTinDangKyXe();
			ThongTinDangKyXe a1 = new ThongTinDangKyXe("Nguyễn Thu Loan", "Future Neo", 100, 35000000.00);
			ThongTinDangKyXe a2 = new ThongTinDangKyXe("Lê Minh Tín", "Ford Ranger", 3000, 250000000.00);
			ThongTinDangKyXe a3 =new ThongTinDangKyXe("Nguyen Minh Triet","Landscape",1500,1000000000.00);
			System.out.println(tieuDe.tieuDe());
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);

		
	}
}
