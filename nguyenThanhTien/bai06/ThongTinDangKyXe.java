package nguyenThanhTien.bai06;

public class ThongTinDangKyXe {
	private String chuXe;
	private String loaiXe;
	private float triGiaXe;
	private float dungTich;
	public ThongTinDangKyXe() {
		chuXe="Unknown";
		loaiXe="Unknown";
		triGiaXe=0;
		dungTich=0;
	}
	public ThongTinDangKyXe(String chuXe, String loaiXe, float triGiaXe, int dungTichXylanh) {
		this.chuXe = chuXe;
		this.loaiXe = loaiXe;
		this.triGiaXe = triGiaXe;
		this.dungTich = dungTichXylanh;
	}
	
	public float tinhThueTruocBa() {
		if(dungTich<100)
			return (1/100)*triGiaXe;
		else if(dungTich>=100 && dungTich<=200)
			return (3/100)*triGiaXe;
		else 
			return (5/100)*triGiaXe;
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
	public float getTriGiaXe() {
		return triGiaXe;
	}
	public void setTriGiaXe(float triGiaXe) {
		this.triGiaXe = triGiaXe;
	}
	public float getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	public static String getTieuDe() {
		return String.format("%-30s%-30s%-20s%-20s%-20s","Ten chu xe","Loai xe","Dung tich","Tri gia","Thue phai nop");
	}
	public String toString() {
		return String.format("%-30s%-30s%-20s%-20s%-20.2f",chuXe,loaiXe,dungTich,triGiaXe,tinhThueTruocBa());
	}
}
