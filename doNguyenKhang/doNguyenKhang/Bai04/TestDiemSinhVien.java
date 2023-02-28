package doNguyenKhang.Bai04;

import java.util.Scanner;

public class TestDiemSinhVien {

	public static void main(String[] args) {
			DiemSinhVien sv1 = new DiemSinhVien(11111, "Nguyen Van A", 9.2f, 8.2f);
			DiemSinhVien sv2 = new DiemSinhVien();
			sv2.setMaSV(22222);
			sv2.setHoTen("Nguyen van B");
			sv2.setDiemLT(5.2f);
			sv2.setDiemTH(3.2f);
			DiemSinhVien sv3;
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ma so cua sinh vien sv3: ");
			int masv = sc.nextInt();
			System.out.println("Nhap ho va ten cua sinh vien sv3: ");
			sc = new Scanner(System.in);
			String hoten = sc.nextLine();
			System.out.println("Nhap diem ly thuyet cua sinh vien sv3: ");
			sc = new Scanner(System.in);
			float diemlt = sc.nextFloat();
			System.out.println("Nhap diem thuc hanh cua sinh vien sv3: ");
			sc = new Scanner(System.in);
			float diemth = sc.nextFloat();
			sv3 = new DiemSinhVien(masv, hoten, diemlt, diemth);
			System.out.println(sv1);
			System.out.println(sv2);
			System.out.println(sv3);
			sc.close();
			}

}
