package nguyenThanhTien.bai01;
public class TestToaDo {
	public static void main(String[] args) {
		try {
		ToaDo t1 = new ToaDo();
		System.out.println(t1);
		ToaDo t2 = new ToaDo(9,2,"");
		ToaDo t3 = new ToaDo(2,4,"T");
		System.out.println(t2);
		System.out.println(t3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
