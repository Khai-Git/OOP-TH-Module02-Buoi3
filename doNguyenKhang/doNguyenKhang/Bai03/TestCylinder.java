package doNguyenKhang.Bai03;

public class TestCylinder {
	public static void main(String[] args) {		
		Cylinder c1 = new Cylinder(2.0, 5.0);

        System.out.println("BanKinh = " + c1.getBanKinh());
        System.out.println("ChieuCao = " + c1.getChieuCao());
        System.out.println("TinhDienTichXungQuanh = " + c1.getTinhDienTichXunhQuanh());
        System.out.println("TinhDienTichToanPhan = " + c1.getTinhDienTichToanPhan());
        System.out.println("TinhTheTich = " + c1.getTinhTheTich());
        c1.setBanKinh(3.0);
        c1.setChieuCao(7.0);
        System.out.println("BanKinh = " + c1.getBanKinh());
        System.out.println("ChieuCao = " + c1.getChieuCao());
        System.out.println("TinhDienTichToanPhan = " + c1.getTinhDienTichToanPhan());
        System.out.println("TinhDienTichToanPhan = " + c1.getTinhDienTichToanPhan());
        System.out.println("TinhTheTich = " + c1.getTinhTheTich());
    }
}
