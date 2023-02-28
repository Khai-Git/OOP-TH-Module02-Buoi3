package duongVanQuy.Bai03;

public class Cylinder {
	private double banKinh;
	private double chieuCao;
	public Cylinder() {
		banKinh = 0;
		chieuCao = 0;
	}
	public Cylinder(double banKinh, double chieuCao) {
		
		this.banKinh = banKinh;
		this.chieuCao = chieuCao;
	}
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	public double getChieuCao() {
		return chieuCao;
	}
	public void setChieuCao(double chieuCao) {
		this.chieuCao = chieuCao;
	}
	public double getTinhDienTichXunhQuanh() {
        return 2 * Math.PI * banKinh * chieuCao;
    }
	public double getTinhDienTichToanPhan() {
        return 2 * Math.PI * banKinh * (banKinh + chieuCao);
    }

    public double getTinhTheTich() {
        return Math.PI * banKinh * banKinh * chieuCao;
    }

}
