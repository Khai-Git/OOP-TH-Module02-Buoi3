package dangPhamThienKhai.Bai05;

public class HinhTamGiac {
	private double ma;
	private double mb;
	private double mc;
	public HinhTamGiac() {
		this.ma = 0;
		this.mb = 0;
		this.mc = 0;
	}
	public HinhTamGiac(double ma, double mb, double mc) {
		super();
		setMa(ma);
		setMb(mb);
		setMc(mc);
	}
	public double getMa() {
		return ma;
	}
	public void setMa(double ma) {
		if(ma < 0) {
			ma = 0;
		}
		this.ma = ma;
	}
	public double getMb() {
		return mb;
	}
	public void setMb(double mb) {
		if(mb < 0) {
			mb = 0;
		}
		this.mb = mb;
	}
	public double getMc() {
		return mc;
	}
	public String checkTamGiac() {
		if(ma+mb>mc || ma+mc>mb || mc+mb>ma) {//Tam giac thuong
			return "thuong";
		} else if(ma == 0 && mb == 0 && mc == 0) { //Tam giac can
			return "Khong phai tam giac";
		} else if(ma==mb && mb==mc) {//Tam giac deu
			return "deu";
		} else if(ma==mb || ma==mc || mc==mb) { //Khong phai tam giac
			return "can";
		} else {
			return "Ngoai le";
		}
	}
	public double Ptg() {
		return ma+mb+mc;
	}
	public double Stg() {
		double p = (ma+mb+mc)/2;
		
		return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
	}
	public double Stgdeu() {
		return Math.pow(ma, 2) * Math.sqrt(3) / 4;
	}
	public void setMc(double mc) {
		if(mc < 0) {
			mc = 0;
		}
		this.mc = mc;
	}
//	@Override
//	public String toString() {
//		return "HinhTamGiac [ma=" + ma + ", mb=" + mb + ", mc=" + mc + ", checkTamGiac()=" + checkTamGiac() + ", Ptg()=" + Ptg() + ", Stg()=" + Stg() + "]";
//	}
	@Override
	public String toString() {
		return String.format("%15.2f|%8.2f|%8.2f|%20s|%17.2f|%17.2f|",ma,mb,mc,checkTamGiac(),Ptg(),Stg());
	}
	
}
