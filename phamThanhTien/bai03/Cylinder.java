package phamThanhTien.bai03;

public class Cylinder {
	private float r;
	private float h;
	public Cylinder(float r, float h) {
		setR(r);
		setH(h);
	}
	public float getR() {
		return r;
	}
	public void setR(float r) {
		if(r >= 0)
			this.r = r;
		else 
			this.r=0;
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		if(h >= 0 )
			this.h = h;
		else 
			this.h=0;
	}
	public double tinhDienTichXungQuanh() {
		return 2 * Math.PI * r * h;
		
	}
	public double tinhDienTichToanPhan() {
		return tinhDienTichXungQuanh() + (2 * Math.PI * r*r);
	}
	public double tinhTheTich() {
		return Math.PI*r*r*h;
		
	}
}
