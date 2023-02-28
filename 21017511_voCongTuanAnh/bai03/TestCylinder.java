package bai03;

public class TestCylinder {
  public static void main(String[] args) {
	 Cylinder a1 = new Cylinder();
	 Cylinder a2 = new Cylinder(2,4);
	 
	 
	 
	 System.out.println("a1 = " +a1);
	 System.out.println("a2 = " +a2);
	 
	 System.out.println("dien tich xung quanh a2  = "+a2.tinhDienTichXungQuanh());
	 System.out.println("dien tich toan phan a2 = "+a2.tinhDienTichToanPhan());
	 System.out.println("the tich a2 = "+ a2.tinhTheTich());
    
  }
}
