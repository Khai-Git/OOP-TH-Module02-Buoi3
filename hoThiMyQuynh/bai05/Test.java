package hoThiMyQuynh.bai05;

public abstract class Test {

	public static void main(String[] args) {
		TamGiac t =new TamGiac();
		TamGiac t1 =new TamGiac(3, 4, 5);
		TamGiac t2 =new TamGiac(4, 4, 5);
		TamGiac t3 =new TamGiac(7, 4, 5);
		System.out.print(t1.toString());
	}

}
