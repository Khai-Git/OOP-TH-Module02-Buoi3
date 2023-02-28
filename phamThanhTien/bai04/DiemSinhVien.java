package phamThanhTien.bai04;

public class DiemSinhVien {
	private int masv;
	private String hoten;
	private float diemlythuyet;
	private float diemthuchanh;
	
	public DiemSinhVien(){
		setMasv(masv);
		setHoten(hoten);
		setDiemlythuyet(diemlythuyet);
		setDiemthuchanh(diemthuchanh);
	}
	public DiemSinhVien(int masv, String hoten, float diemlythuyet, float diemthuchanh) {
		this.masv=masv;
		this.hoten=hoten;
		this.diemlythuyet=diemlythuyet;
		this.diemthuchanh=diemthuchanh;
	}
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		if( masv > 0)
			this.masv = masv;
		else
			masv = 0;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		if(hoten != " ")
			this.hoten = hoten;
		else
			hoten = "Unknown";
	}
	public float getDiemlythuyet() {
		return diemlythuyet;
	}
	public void setDiemlythuyet(float diemlythuyet) {
		if(diemlythuyet >= 0 && diemlythuyet <= 10)
			this.diemlythuyet = diemlythuyet;
		else
			diemlythuyet = 0;
	}
	public float getDiemthuchanh() {
		return diemthuchanh;
	}
	public void setDiemthuchanh(float diemthuchanh) {
		if(diemthuchanh >= 0 && diemthuchanh <=10)
			this.diemthuchanh = diemthuchanh;
		else 
			diemthuchanh = 0;
	}
	public float tinhDiemTrungBinh() {
		
		return (diemlythuyet + diemthuchanh)/2;
	}
	@Override
	public String toString() {
		return String.format("%8d%20s%7.2f%7.2f%7.2f", masv, hoten, diemlythuyet, diemthuchanh, tinhDiemTrungBinh());
	}
}
