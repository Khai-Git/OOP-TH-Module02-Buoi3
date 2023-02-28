package nguyenThanhTien.bai04;
import java.util.Scanner;
public class TestCau4b {
	public static void main(String agrs[]) {
		DiemSinhVien sv1 = new DiemSinhVien(21097981,"Nguyen Thanh Tien",9,10);
		DiemSinhVien sv2 = new DiemSinhVien(21102234,"Tran Van An",8,9);
		//Tao bien tham chieu sv3
		DiemSinhVien sv3;
		//Nhap du lieu cua sv3
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so cua sinh vien thu 3: ");
		int maSinhVien = sc.nextInt();
		System.out.println("Nhap ho va ten cua sinh vien thu 3: ");
		sc = new Scanner(System.in);
		String hoTen = sc.nextLine();
		System.out.println("Nhap diem li thuyet cua sinh vien thu 3: ");
		sc = new Scanner(System.in);
		float diemLT = sc.nextFloat();
		System.out.println("Nhap diem thuc hanh cua sinh vien thu 3: ");
		sc = new Scanner(System.in);
		float diemTH = sc.nextFloat();
		//Gan gia tri cho sv3
		sv3 = new DiemSinhVien(maSinhVien,hoTen,diemLT,diemTH);
		System.out.println(DiemSinhVien.getTieuDe());
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		sc.close();
		
	}
}
