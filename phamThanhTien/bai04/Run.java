package phamThanhTien.bai04;
import java.util.Scanner;
public class Run {
	public static void main(String[] args) {
		DiemSinhVien sv1 = new DiemSinhVien();
		DiemSinhVien sv2 = new DiemSinhVien(21084401, "Pham Thanh Tien", 8, 9);
		DiemSinhVien sv3 = new DiemSinhVien(21044991, "Ho Thi Thu Thao", 10, 10);
		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap ho ten sinh vien: ");
//		String hoten = sc.nextLine();
//		System.out.println("Nhap ma sinh vien: ");
//		int masv = sc.nextInt();
//		System.out.println("Nhap diem ly thuyet: ");
//		float dlt = sc.nextFloat();
//		System.out.println("Nhap diem thuc hanh: ");
//		float dth = sc.nextFloat();
//		float dtb = (dlt+dth)/2;
		System.out.println(sv1.toString());
		System.out.println(sv2.toString());
		System.out.println(sv3.toString());
		
//		System.out.println("%8d%20s%7.2f%7.2f%7.2f",masv,hoten,dlt,dth,dtb);
	}
}
