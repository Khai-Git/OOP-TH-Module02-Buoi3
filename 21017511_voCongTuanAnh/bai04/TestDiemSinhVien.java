package bai04;

import java.util.Scanner;

public class TestDiemSinhVien {
   public static void main(String[] args) {
	   DiemSinhVien sv3 = new DiemSinhVien();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Nhap ma so SV3:");
	   sv3.setMaSV(sc.nextInt());
	   sc.nextLine();
	   System.out.println("Nhap ho va ten sv3:");
	   sv3.setHoTen(sc.nextLine());
	   System.out.println("Nhap diem ly thuyet sv3:");
	   sv3.setDiemLT(sc.nextFloat());
	   System.out.println("Nhap diem thuc hanh sv3:");
	   sv3.setDiemTH(sc.nextFloat());
	   System.out.println(sv3.getTieuDe());
	   
	   DiemSinhVien sv2 = new DiemSinhVien(2222,"vo cong tuan anh",8,9);
	   DiemSinhVien sv1 = new DiemSinhVien(3333,"le van hoang",7,10);
	   
	   System.out.println(sv1);
	   System.out.println(sv2);
	   System.out.println(sv3);
	   
   }
}
