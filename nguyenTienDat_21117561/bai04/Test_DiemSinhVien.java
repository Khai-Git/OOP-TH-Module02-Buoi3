package nguyenTienDat.bai04;

import java.util.Scanner;

public class Test_DiemSinhVien {
	private static Scanner sc;

	public static void main(String[] args) {
		DiemSinhVien sv1 = new DiemSinhVien(21117561, "Nguyễn Tiến Đạt", 6.5f, 8.5f);
		DiemSinhVien sv2 = new DiemSinhVien(22222222,"Lê Thị Bông", 7.5f,8.0f);
		DiemSinhVien sv3;
		sc = new Scanner(System.in);
		System.out.println("Nhập mã số của sinh viên sv3: ");
		int maSV = sc.nextInt();
		System.out.println("Nhập họ? và tên của sinh viên sv3: ");
		sc = new Scanner(System.in);
		String hoTen = sc.nextLine();
		System.out.println("Nhập điểm lý thuyết của sinh viên sv3: ");
		sc = new Scanner(System.in);
		float diemLT = sc.nextFloat();
		System.out.println("Nhập điểm thực hành của sinh viên sv3: ");
		sc = new Scanner(System.in);
		float diemTH = sc.nextFloat();
		sv3 = new DiemSinhVien(maSV,hoTen,diemLT,diemTH);
		System.out.println(DiemSinhVien.getTieuDe());
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}
}
