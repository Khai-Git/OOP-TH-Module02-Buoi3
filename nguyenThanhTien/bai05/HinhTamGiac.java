package nguyenThanhTien.bai05;

public class HinhTamGiac {
	private double ma;
	private double mb;
	private double mc;
	public HinhTamGiac() {
		ma=0;
		mb=0;
		mc=0;
	}
	public HinhTamGiac(float ma, float mb, float mc) {
		this.ma = ma;
		this.mb = mb;
		this.mc = mc;
	}
	
	public double tinhChuVi() {
		return (ma+mb+mc);
	}
	public String getLoai() {
		if(ma+mb>mc && ma+mc>mb && mb+mc>ma) {
			if(ma==mb && ma==mc)
				return String.format("Deu");
			else if((ma==mb && ma!=mc) ||(ma==mc && ma!=mb) ||(mb==mc && mb!=ma))
				return String.format("Can");
			else
				return String.format("Thuong");
		}
		else
			return String.format("Khong phai tam giac");
		
	}
	public double tinhDienTich() {
			return Math.sqrt((tinhChuVi()/2)*((tinhChuVi()/2)-ma)*((tinhChuVi()/2)-mb)*((tinhChuVi()/2)-mc));
	}
	public double getMa() {
		return ma;
	}
	public void setMa(double ma) {
		this.ma = ma;
	}
	public double getMb() {
		return mb;
	}
	public void setMb(double mb) {
		this.mb = mb;
	}
	public double getMc() {
		return mc;
	}
	public void setMc(double mc) {
		this.mc = mc;
	}
	public static String getTieuDe() {
		return String.format("%-30s%-15s%-15s","Loai tam giac","Dien tich","Chu vi");
	}
	public String toString() {
		return String.format("%-30s%-15.1f%-15.1f",getLoai(),tinhDienTich(),tinhChuVi());
	}
}

