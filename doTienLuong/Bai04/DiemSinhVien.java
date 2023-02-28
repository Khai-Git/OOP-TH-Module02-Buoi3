package doTienLuong.Bai04;

public class DiemSinhVien {
	private int maSV;
	private String hoTen;
	private float diemLT;
	private float diemTH;
	public DiemSinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}
//	public DiemSinhVien() {
//		setMaSV(maSV);
//		setHoTen(hoTen);
//		setDiemLT(diemLT);
//		setDiemTH(diemTH);
//	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		if(maSV<0)
			this.maSV= 0;
		else 
			this.maSV=maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		if(hoTen.isEmpty())
			this.hoTen = "No Name";
		else 
			this.hoTen = hoTen;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		if(diemLT<0 || diemLT>10) {
			this.diemLT = 0;
		}
		else {
			this.diemLT = diemLT;
		}
			
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		if(diemTH<0 || diemTH>10)
			this.diemTH = 0;
		else 
			this.diemTH=diemTH;
	}
	public float tinhDiemTrungBinh() {
		return (diemLT+diemTH)/2;
	}
	public String toString() {
		return String.format("Ho va ten: %s\nDiem thi Average= %.1f",hoTen,tinhDiemTrungBinh());
	}
}
