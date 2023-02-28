package nguyenThanhTien.bai04;

public class DiemSinhVien {
	private int maSinhVien;
	private String hoTen;
	private float diemLT;
	private float diemTH;
	
	public DiemSinhVien() {
		maSinhVien = 1;
		hoTen = "Unknown";
		diemLT = 0;
		diemTH = 0;
	}
	
	public DiemSinhVien(int maSinhVien, String hoTen, float diemLT, float diemTH) {
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		if(maSinhVien>0 )
			this.maSinhVien = maSinhVien;
		else
			maSinhVien = 1;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if(!hoTen.equals(" "))
			this.hoTen = hoTen;
		else
			hoTen = "Unknown";
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		if(diemLT >= 0 && diemLT <=10)
			this.diemLT = diemLT;
		else
			diemLT = 0;
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		if(diemTH>=0 && diemLT<=0)
			this.diemTH = diemTH;
		else
			diemTH = 0;
	}
	public float diemTB() {
		return (diemLT + diemTH)/2;
	}
	public static String getTieuDe() {
		return String.format("%-10s%-30s%-15s%-10s","Ma SV","Ho ten","Diem LT","Diem TH");
	}
	public String toString() {
		return String.format("%-10s%-30s%-15s%-10s",maSinhVien,hoTen,diemLT,diemTH);
	}
}