package phamThanhTien.bai05;

public class Run {
	public static void main(String[] args) {
		TamGiac tg1 = new TamGiac();
		TamGiac tg2 = new TamGiac(3, 4, 5);
		TamGiac tg3 = new TamGiac(3, 3, 5);
		
		
		System.out.println(tg1.toString());
		System.out.println(tg2.toString());
		System.out.println(tg3.toString());
	}
}
