package nguyenTienDat.bai04;

public class DiemSinhVien {
	private int maSV;
	private String hoTen;
	private float diemLT;
	private float diemTH;
	public DiemSinhVien() {
		maSV=0;
		hoTen="Khong Xac dinh";
		diemLT=0;
		diemTH=0;
	}
	public DiemSinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		if(maSV>0)
			this.maSV = maSV;
		else 
			this.maSV=1;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		if(!hoTen.equals(""))
			this.hoTen = hoTen;
		else 
			this.hoTen="Ten khong xac dinh";
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		if(diemLT >= 0 && diemLT <= 10)
			this.diemLT = diemLT;
		else
			this.diemLT = 0;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		if(diemTH >= 0 && diemTH <= 10)
			this.diemTH = diemTH;
		else
			this.diemTH = 0;
	}
	public double tinhDiemTrungBinh() {
		return (diemLT+diemTH)/2;
	}
	public static String getTieuDe() {
		return String.format("%-10s%-30s%-15s%-15s%-10s","MaSV", "HoTen","DiemLT","DiemTH","DiemTB");
	}
	public String toString() {
		return String.format("%-10d%-30s%-15.2f%-15.2f%-10.2f", maSV, hoTen, 
		diemLT, diemTH, tinhDiemTrungBinh());
	}
}
