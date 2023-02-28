package lePhuocThai.bai04;

public class DiemSinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;
    
    
	public DiemSinhVien() {
		this.maSV = 1;
		this.hoTen = "chua biet";
		this.diemLT = 0.0f;
		this.diemTH = 0.0f;
	}


	public DiemSinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}


	public int getMaSV() {
		return maSV;
	}


	public void setMaSV(int maSV) {
		if(maSV > 0)
		{
			
			this.maSV = maSV;
		}
		else
		{
			this.maSV = 1;
		}
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		if(!hoTen.equals(""))
		{
			this.hoTen = hoTen;	
		}
		else
		{
			this.hoTen = "chua biet";
		}
	}


	public float getDiemLT() {
		return diemLT;
	}


	public void setDiemLT(float diemLT) {
		if(diemLT >=0 && diemLT <= 10)
		{
			
			this.diemLT = diemLT;
		}
		else
		{
			this.diemLT = 0;
		}
	}


	public float getDiemTH() {
		return diemTH;
	}


	public void setDiemTH(float diemTH) {
		if(diemTH >= 0 && diemTH <= 10)
		{
			
			this.diemTH = diemTH;
		}
		else
		{
			this.diemTH = 0;
		}
		
	}
	
	public float getdiemTrungBinh() {
		return (diemLT + diemTH)/2;
	}

    public String getTieuDe() {
    	return String.format("%-10s %-30s %-10s %-10s %-10s","MaSV","HoTen","DiemLT","DiemTH","DiemTB");
    }

	public String toString() {
		return String.format("%-10s %-30s %-10.2f %-10.2f %-10.2f",maSV, hoTen, diemLT, diemTH, getdiemTrungBinh());
	}
	
	
	
	
	
	
	
    
    
    
}
