package dangPhamThienKhai.Bai04;

public class DiemSinhVien {
	private int msv;
	private String hoTen;
	private double diemLT;
	private double diemTH;
	
	public DiemSinhVien() {
		this.msv = 0;
		this.hoTen = "Chua biet";
		this.diemLT = 0;
		this.diemTH = 0;
	}

	public DiemSinhVien(int msv, String hoTen, double diemLT, double diemTH) {
		super();
		setMsv(msv);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}

	public int getMsv() {
		if (msv > 0)
			return msv;
		return 0;
	}

	public void setMsv(int msv) {
		this.msv = msv;
	}

	public String getHoTen() {
		if (hoTen.length() != 0)
			return hoTen;
		return null;
	}

	public void setHoTen(String hoTen) {
		if (hoTen.isEmpty())
			this.hoTen = "Chua biet";
		this.hoTen = hoTen;
	}

	public double getDiemLT() {
		if (diemLT >= 0 && diemLT <= 10)
			return diemLT;
		return 0;
	}

	public void setDiemLT(double diemLT) {
		this.diemLT = diemLT;
	}

	public double getDiemTH() {
		if (diemTH >= 0 && diemTH <= 10)
			return diemTH;
		return 0;
	}

	public void setDiemTH(double diemTH) {
		this.diemTH = diemTH;
	}
	
	public double diemTB() {
		return (diemLT + diemTH) / 2;
	}

	@Override
	public String toString() {
		return String.format("%-7d%-25s%10.2f%10.2f%10.2f",msv,hoTen,diemLT,diemTH,diemTB());
	}
	
	
}