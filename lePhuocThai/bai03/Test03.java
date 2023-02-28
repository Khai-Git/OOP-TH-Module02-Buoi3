package lePhuocThai.bai03;



public class Test03 {
	public static void main(String[] args) {
			Cylinder a=new Cylinder();
			Cylinder b=new Cylinder(9,10);
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("Dien tich xung quanh hinh tru:"+b.Tinhdientichxungquanh());
			System.out.println("Dien tich toan phan hinh tru: "+b.Tinhdientichtoanphan());
			System.out.println("The tich  hinh tru:"+b.Tinhthetich());
		


	}
}
