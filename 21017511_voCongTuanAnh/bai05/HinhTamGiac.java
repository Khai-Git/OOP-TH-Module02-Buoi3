package bai05;

public class HinhTamGiac {
      private double ma;
      private double mb;
      private double mc;
      
	public HinhTamGiac() {
		ma = 0;
		mb = 0;
		mc = 0;
		
	}
	public HinhTamGiac(double ma, double mb, double mc) {
		setMa(ma);
		setMb(mb);
		setMc(mc);
	}
	public double getMa() {
		return ma;
	}
	public void setMa(double ma) {
		if(ma > 0 && ma + mb > mc && ma + mc > mb)
		{
			this.ma = ma;
		}
		else
		{
			this.ma = 0;
		}
	}
	public double getMb() {
		return mb;
	}
	public void setMb(double mb) {
		if(mb > 0 && mb + ma > mc && mb + mc > ma)
		{
			this.mb = mb;
		}
		else
		{
			this.mb = 0;
		}
	}
	public double getMc() {
		return mc;
	}
	public void setMc(double mc) {
		if(mc > 0 && mc + ma > mb && mc + mb > ma)
		{
			this.mc = mc;
		}
		else
		{
			this.mc = 0;
		}
	}
	
	public double tinhChuVi() {
		return ma + mb + mc;
	}
	
	public double tinhDienTich() {
		double  p = (ma + mb + mc )/2;
		return (double)(Math.sqrt(p)*(p-ma)*(p-mb)*(p-mc));
	}
	
	public String getTamGiac() {
		if ((ma + mb > mc) && (ma + mc > mb) && (mb + mc > ma) && (ma > 0) && (mb > 0) && (mc > 0)) {
			if ((ma == mb) && (mb == mc)) {
				return "Tam giac deu";
			} else if ((ma == mb) || (ma == mc) || (mb == mc)) {
				return "Tam giac can";
			} else if ((ma * ma == mb * mb + mc * mc) || (mb * mb == ma * ma + mc * mc)
					|| (mc * mc == ma * ma + mb * mb)) {
				return "Tam giac vuong";
			} else if (((ma * ma + mb * mb == mc * mc) && (ma == mb)) || ((ma * ma + mc * mc == mb * mb) && (ma == mc))
					|| ((mb * mb + mc * mc == ma * ma) && (mb == mc))) {
				return "Tam giac vuong can";
			} else {
				return "Tam giac thuong";
			}
		} else {
			return "Khong phai la tam giac!";
		}
	}
	

	public String getTieuDe() {
		return String.format("%-10s%-10s%-10s%-30s%-15s%-15s","Canh ma","Canh mb","Canh mc","Kieu Tam Giac","Chu vi","Dien tich");
	}
	
	public String toString() {
		return String.format("%-10.1f%-10.1f%-10.1f%-30s%-15.1f%-15.1f",ma,mb,mc,getTamGiac(),tinhChuVi(),tinhDienTich());
	}
      
      
}
