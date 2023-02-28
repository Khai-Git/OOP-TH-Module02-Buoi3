package hoThiMyQuynh.bai05;

public class TamGiac {
	private int ma,mb,mc;

	public TamGiac(int ma, int mb, int mc) {
	
		this.ma = ma;
		this.mb = mb;
		this.mc = mc;
	}

	public TamGiac() {

	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public int getMb() {
		return mb;
	}

	public void setMb(int mb) {
		this.mb = mb;
	}

	public int getMc() {
		return mc;
	}

	public void setMc(int mc) {
		this.mc = mc;
	}

	@Override
	public String toString() {
		return "TamGiac [ma=" + ma + ", mb=" + mb + ", mc=" + mc + "]";
	}
	
	public int tinhChuVi() {
		return ma+mb+mc;
		
	}
	public double tinhDienTich(){
        double p=(double)(ma+mb+mc)/2;
        return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));                   
}
	public void xuatCV() {
		System.out.print(tinhChuVi());
	}
	
	public void xuatDT() {
		System.out.print(tinhDienTich());
	}
	

}
