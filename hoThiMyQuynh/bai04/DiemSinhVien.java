package hoThiMyQuynh.bai04;

public class DiemSinhVien {
	 private int maSV;
	    private String tenSV;
	    private float diemTL, diemTH;
	 
	    public DiemSinhVien() {
	    	this.maSV = 22;
			this.tenSV = "An Vy";
			this.diemTL = 10;
			this.diemTH = 9;
			
		}

		public DiemSinhVien(int maSV, String tenSV, float diemTL, float diemTH) {
		
			setMaSV(maSV);
			setTenSV(tenSV);
			setDiemTL(diemTL);
			setDiemTH(diemTH);
		}

		public int getMaSV() {
	        return maSV;
	    }
	 
	    public void setMaSV(int maSV) {
	    	if(maSV>0)
	        this.maSV = maSV;
	    	else this.maSV=-1;
	    }
	 
	    public String getTenSV() {
	        return tenSV;
	    }
	 
	    public void setTenSV(String tenSV) {
	    	if(!tenSV.equals(""))
	        this.tenSV = tenSV;
	    	else
	    		this.tenSV="XX";
	    }
	 
	    public float getDiemTL() {
	        return diemTL;
	    }
	 
	    public void setDiemTL(float diemTL) {
	    	if(diemTL>0 &&diemTL<=10)
	        this.diemTL = diemTL;
	    	else this.diemTL=0;
	    }
	 
	    public float getDiemTH() {
	        return diemTH;
	    }
	 
	    public void setDiemTH(float diemTH) {
	    	if(diemTH>0 &&diemTH<=10)
		        this.diemTH = diemTH;
		    	else this.diemTH=0;
	    }
	 
	    public float tinhDiemTB() {
	        return (diemTH + diemTL) / 2;
	    }
	 
	
	    @Override
		public String toString() {
			return "DiemSinhVien [maSV=" + maSV + ", tenSV=" + tenSV + ", diemTL=" + diemTL + ", diemTH=" + diemTH
					+ "]";
		}

		public void xuatTT() {
	        System.out.printf("%5d %8s %17f %17f %18f \n", maSV, tenSV, diemTH, diemTL, tinhDiemTB());
	    }
	
	
}
