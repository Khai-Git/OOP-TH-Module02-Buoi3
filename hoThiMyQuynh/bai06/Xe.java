package hoThiMyQuynh.bai06;

public class Xe {
	private String chuXe,loaiXe;
	private float triGia;
	private int dungTich;
	public Xe(String chuXe, String loaiXe, float triGia, int dungTich) {
	
		this.chuXe = chuXe;
		this.loaiXe = loaiXe;
		this.triGia = triGia;
		this.dungTich = dungTich;
	}
	public Xe() {
		
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
	public float getTriGia() {
		return triGia;
	}
	public void setTriGia(float triGia) {
		this.triGia = triGia;
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	public float tinhThue() {
		if(dungTich<100) 
			return triGia*1/100;
		if(dungTich>100 && dungTich<200)
			return triGia*3/100;
		return triGia*5/100;
	
	}
	@Override
	public String toString() {
		return "Xe [chuXe=" + chuXe + ", loaiXe=" + loaiXe + ", triGia=" + triGia + ", dungTich=" + dungTich
				+ ", tinhThue()=" + tinhThue() + "]";
	}
	

}
