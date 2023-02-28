package doTienLuong.Bai06;

public class ThongTinDangKyXe {
	private String chuXe;
	private String loaiXe;
	private double triGiaXe;
	private double dungTichXiLanh;
	public ThongTinDangKyXe(String chuXe, String loaiXe, double triGiaXe, double dungTichXiLanh) {
		this.chuXe = chuXe;
		this.loaiXe = loaiXe;
		this.triGiaXe = triGiaXe;
		this.dungTichXiLanh = dungTichXiLanh;
	}
	public String getChuXe() {
		return chuXe;
	}
	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public double getTriGiaXe() {
		return triGiaXe;
	}
	public void setTriGiaXe(double triGiaXe) {
		this.triGiaXe = triGiaXe;
	}
	public double getDungTichXiLanh() {
		return dungTichXiLanh;
	}
	public void setDungTichXiLanh(double dungTichXiLanh) {
		this.dungTichXiLanh = dungTichXiLanh;
	}
	public String toString() {
		return String.format("Chu xe ten %s, mua xe gia %.1ftr.vnd" ,chuXe,triGiaXe);
	}
	
}
