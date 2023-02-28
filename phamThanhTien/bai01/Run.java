package phamThanhTien.bai01;

public class Run {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo();
		ToaDo td2 = new ToaDo(2, 5, "A");
		ToaDo td3 = new ToaDo(10, 20, "C");
		System.out.println(td1.toString());
		System.out.println(td2.toString());
		System.out.println(td3.toString());
	}
}
