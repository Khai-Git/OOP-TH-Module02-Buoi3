package dangPhamThienKhai.Bai02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Bai01.ToaDo;
/**
 * Bài 2.
Vẽ lược đồ lớp UML cho lớp Point để tạo ra đối tượng điểm trong không gian hai chiều. Biết
lớp chứa một constructor mặc định; một constructor đủ tham số; các phương thức get/set; hàm toString() trả về
thông tin toạ độ; hàm negate() để tạo ra điểm đối xứng qua gốc O; hàm getDistance() trả về khoảng cách đến
toạ độ gốc O.
 * @author BeekaiPC
 *
 */
public class PointDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ban muon nhap bao nhieu toa do: ");
		int n = sc.nextInt();
		List<Point> arr = new ArrayList<Point>();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Nhap ten toa do thu " + (i+1) + " : ");
			String ten = sc.nextLine();
			System.out.print("Nhap toa do a: ");
			double a = sc.nextDouble();
			System.out.print("Nhap toa do b: ");
			double b = sc.nextDouble();
			
			Point td = new Point(ten, a, b);
			arr.add(td);
		}
		
		for (Point p : arr) {
			System.out.println(p);
			System.out.println("Khoang cach tu toa do " + p.getTen() + " den toa do diem O la : " + p.getDistance());
			System.out.println("Diem doi xung cua toa do " + p.getTen() + " qua toa do diem goc O la : " + p.negate());
			System.out.println();
		}
	}
}