package dangPhamThienKhai.Bai03;

import java.util.Scanner;

public class CylinderDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hinh tru tron Cylinder");
		
		System.out.print("Nhap ban kinh: ");
		double r = sc.nextDouble();
		System.out.print("Nhap chieu cao: ");
		double h = sc.nextDouble();
		
		Cylinder c = new Cylinder(r, h);
		
		System.out.println("Dien tich xung quanh = " + c.Sxq());
		System.out.println("Dien tich xung quanh = " + c.Stp());
		System.out.println("Dien tich xung quanh = " + c.VCylinder());
	}
}
