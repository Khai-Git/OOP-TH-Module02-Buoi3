package hoThiMyQuynh.bai03;

public class Test {

	public static void main(String[] args) {
		Cylinder c= new Cylinder(7, 8);
		float xq= c.dienTichXungQuanh();
		float tp=c.dienTichToanPhan();
		float tt=c.theTich();
		
		System.out.println(c);
		System.out.println("Dien tich xung quanh:"+xq);
		System.out.println("Dien tich toan phan:"+tp);
		System.out.println("The tich:"+tt);
		
	}

}
