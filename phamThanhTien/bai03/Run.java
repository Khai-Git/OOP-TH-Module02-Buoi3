package phamThanhTien.bai03;

public class Run {
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder(-4, 12);
		Cylinder c2 = new Cylinder(2, -5);
		Cylinder c3 = new Cylinder(2, 3);
		
		System.out.println("Dien tich xung quanh: "+c1.tinhDienTichXungQuanh());
		System.out.println("Dien tich toan phan: " + c1.tinhDienTichToanPhan());
		System.out.println("The tich: " + c1.tinhTheTich());
		System.out.println("=================================================");
		System.out.println("Dien tich xung quanh: "+c2.tinhDienTichXungQuanh());
		System.out.println("Dien tich toan phan: " + c2.tinhDienTichToanPhan());
		System.out.println("The tich: " + c2.tinhTheTich());
		System.out.println("=================================================");
		System.out.println("Dien tich xung quanh: "+c3.tinhDienTichXungQuanh());
		System.out.println("Dien tich toan phan: " + c3.tinhDienTichToanPhan());
		System.out.println("The tich: " + c3.tinhTheTich());
		
	}
}