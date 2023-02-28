package dangPhamThienKhai.Bai04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 * Bài 4. Viết lớp đối tượng DiemSinhVien
 * @author BeekaiPC
 *
 */
public class DiemSinhVienDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ban muon nhap bao nhieu sinh vien? ");
		System.out.print("Nhap: ");
		int n = sc.nextInt();
		List<DiemSinhVien> arr = new ArrayList<DiemSinhVien>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap ma so cua sinh vien sv" + (i+1) + ":");
			int masv = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhap ho va ten cua sinh vien sv" + (i+1) + ":");
			String tensv = sc.nextLine();
			System.out.println("Nhap diem ly thuyet cua sinh vien sv" + (i+1) + ":");
			double diemlt = sc.nextDouble();
			System.out.println("Nhap diem thuc hanh cua sinh vien sv" + (i+1) + ":");
			double diemth = sc.nextDouble();
			
			DiemSinhVien dsv = new DiemSinhVien(masv, tensv, diemlt, diemth);
			arr.add(dsv);
		}
		
		System.out.println(String.format("%-7s%-25s%10s%10s%10s","masv","hoten","diemlt","diemth","diemtb"));
		
		for(DiemSinhVien dsv : arr) {
			System.out.println(dsv);
		}
	}
}