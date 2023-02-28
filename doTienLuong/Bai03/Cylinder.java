package doTienLuong.Bai03;
public class Cylinder {
	private double banKinh;
	private double chieuCao;
	
	public Cylinder(double banKinh, double chieuCao) {
		this.banKinh=banKinh;
		this.chieuCao=chieuCao;
	}
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double banKinh) {
		this.banKinh=banKinh;
	}
	public double getChieuCao() {
		return chieuCao;
	}
	public void setChieuCao(double chieuCao) {
		this.chieuCao = chieuCao;
	}
	public double tinhDienTichToanPhan() {
		return 2*3.14*chieuCao*banKinh+2*3.14*banKinh*banKinh;
	}
	public double tinhDienTichXungQuanh() {
		return 2*3.14*banKinh;
	}
	public double tinhTheTich() {
		return 3.14*banKinh*banKinh*chieuCao;
	}
	
	public String toString() {
		return String.format("Dien tich xung quanh = %.1f (cm^2)\nDien tich toan phan = %.1f (cm^2)\nThe tich = %.1f (cm^3)",tinhDienTichXungQuanh(),tinhDienTichToanPhan(),tinhTheTich() );
	}
	
}
