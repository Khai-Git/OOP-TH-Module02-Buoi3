package nguyenTienDat.bai03;

public class Test_Cylinder {
	public static void main(String[] args) {
		Cylinder n= new Cylinder(5, 7);
		System.out.println(n.toString());
		System.out.println("Dien tich Xung Quang = "+n.tinhDienTichXungQuanh());
		System.out.println("Dien tich toan phan = "+ n.tinhDienTichToanPhan());
		System.out.println("The tich = "+n.tinhTheTich());
			
	}
}
