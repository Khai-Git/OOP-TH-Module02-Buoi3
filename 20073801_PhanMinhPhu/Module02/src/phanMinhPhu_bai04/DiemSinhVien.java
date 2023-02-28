package phanMinhPhu_bai04;


public class DiemSinhVien {
		private int maSV;
		private String hoTen;
		private float diemLT;
		private float diemTH;

		public DiemSinhVien() {
		maSV = 0;
		hoTen = "no HoTen";
		diemTH = 0;
		diemLT = 0;
		}

		public DiemSinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemLT(diemTH);
		}

		public int getMaSV() {
		return maSV;
		}

		public void setMaSV(int maSV) {
		if (maSV <= 0)
		this.maSV = 1;
		else
		this.maSV = maSV;
		}

		public String getHoTen() {
		return hoTen;
		}

		public void setHoTen(String hoTen) {
		if (!hoTen.trim().equals(""))
		this.hoTen = hoTen;
		else
		this.hoTen = "chua biet";
		}

		public float getDiemLT() {
		return diemLT;
		}

		public void setDiemLT(float diemLT) {
		if (diemLT >= 0 && diemLT <= 10)
		this.diemLT = diemLT;
		else
		this.diemLT = 0;
		}

		public float getDiemTH() {
		return diemTH;
		}

		public void setDiemTH(float diemTH) {
		if (diemTH >= 0 && diemTH <= 10)
		this.diemTH = diemTH;
		else
		this.diemTH = 0;
		}

		public float getDiemTB() {
		return (diemLT + diemTH)/2;
		}

		@Override
		public String toString() {
		return String.format("%-5s %-30s %10.2f %10.2f %10.2f", maSV, hoTen, diemLT, diemTH, getDiemTB());
		}

}



