package nguyenHoangAnh.Bai03;

public class TestCylinder {
	public static void main(String[] args) {		
		Cylinder c1 = new Cylinder(2.0, 5.0);

        System.out.println("Ban Kinh = " + c1.getBanKinh());
        System.out.println("Chieu Cao = " + c1.getChieuCao());
        System.out.println("Dien Tich Xung Quanh = " + c1.getTinhDienTichXunhQuanh());
        System.out.println("Dien Tich Toan Phan = " + c1.getTinhDienTichToanPhan());
        System.out.println("The Tich = " + c1.getTinhTheTich());
        c1.setBanKinh(3.0);
        c1.setChieuCao(7.0);
        System.out.println("Ban Kinh = " + c1.getBanKinh());
        System.out.println("Chieu Cao = " + c1.getChieuCao());
        System.out.println("Dien Tich Toan Phan = " + c1.getTinhDienTichToanPhan());
        System.out.println("Dien Tich Toan Phan = " + c1.getTinhDienTichToanPhan());
        System.out.println("The Tich = " + c1.getTinhTheTich());
    }
}
