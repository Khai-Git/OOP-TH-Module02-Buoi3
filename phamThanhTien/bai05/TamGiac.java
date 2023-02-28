package phamThanhTien.bai05;

public class TamGiac {
	private float ma;
	private float mb;
	private float mc;
	public TamGiac() {
		this.ma=0;
		this.mb=0;
		this.mc=0;
	}
	public TamGiac(float ma, float mb, float mc) {
		setMa(ma);
		setMb(mb);
		setMc(mc);
	}
	public float getMa() {
		return ma;
	}
	public void setMa(float ma) {
		if(ma > 0)
			this.ma = ma;
		else
			ma =0;
	}
	public float getMb() {
		return mb;
	}
	public void setMb(float mb) {
		if(mb > 0)
			this.mb = mb;
		else 
			mb = 0;
	}
	public float getMc() {
		return mc;
	}
	public void setMc(float mc) {
		if(mc > 0)
			this.mc = mc;
		else
			mc = 0;
	}
	public float tinhChuVi() {
		
		return this.ma+this.mb+this.mc;
	}
	public float tinhDienTich() {
		return (float) Math.sqrt(tinhChuVi()/2*(((tinhChuVi()/2)-this.ma))*(((tinhChuVi()/2)-this.mb))*(((tinhChuVi()/2)-this.mc)));
	}
//	public void getKieuTamGiac() {
//		if(this.ma == this.mb && this.ma == this.mc && this.mb == this.ma)
//			System.out.println("Tam giac deu.");
//		else if( (this.ma+this.mb) > this.mc || (this.mb + this.mc) >this.ma || (this.ma+ this.mc) > this.mb)
//			System.out.println("Tam giac thuong");
//		else if(this.ma == this.mb || this.ma == this.mc || this.mb == this.ma)
//			System.out.println("Tam giac can ");
//		else
//			System.out.println("Khong phai la tam giac");
//	}
	@Override
	public String toString() {
		return "TamGiac [ma=" + ma + ", mb=" + mb + ", mc=" + mc + ", tinhChuVi()=" + tinhChuVi() + ", tinhDienTich()="
				+ tinhDienTich() + "]";
	}
	

	
	
}
