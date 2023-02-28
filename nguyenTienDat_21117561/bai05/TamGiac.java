package nguyenTienDat.bai05;

public class TamGiac {
	private float ma;
	private float mb;
	private float mc;

	public TamGiac() {
		ma = 0;
		mb = 0;
		mc = 0;
	}

	public TamGiac(float ma, float mb, float mc) {
		if ((ma > 0) && (mb > 0) && (mc > 0) && (ma + mb > mc) && (ma + mc > mb)&& (mb + mc > ma)) {
			setMa(ma);
			setMb(mb);
			setMc(mc);
		} else {
			ma = 0;
			mb = 0;
			mc = 0;
		}
	}

	public float getMa() {
		return ma;
	}

	public void setMa(float ma) {
		this.ma = ma;
	}

	public float getMb() {
		return mb;
	}

	public void setMb(float mb) {
		this.mb = mb;
	}

	public float getMc() {
		return mc;
	}

	public void setMc(float mc) {
		this.mc = mc;
	}

	public float tinhChuVi() {
		float chuvi;
		chuvi = ma + mb + mc;
		return chuvi;
	}

	public double tinhDienTich() {
		float p;
		p = (ma + mb + mc) / 2;
		return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
	}

	public void xetTamGiac() {
		if ((ma > 0) && (mb > 0) && (mc > 0) && (ma + mb > mc) && (ma + mc > mb)&& (mb + mc > ma)) {
			if ((ma == mb) && (mb == mc)) {
				System.out.println("La Tam Giac Deu"); 
			}
			else if (ma == mb || mb == mc || ma == mc) {
					System.out.println("La Tam Giac Can");
			}
			else {
				System.out.println("La Tam Giac Thuong");
			}
		} else {
			System.out.println("Khong phai tam giac");
		}
	}
	public String toString() {
		return String.format("Cac canh ma=%.2f, mb= %.2f, mc=%.2f, Chu Vi = %.2f, Dien tich= %.2f", ma,mb,mc,tinhChuVi(),tinhDienTich());
	}
	
}
