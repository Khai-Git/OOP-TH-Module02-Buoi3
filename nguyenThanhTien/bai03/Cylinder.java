package nguyenThanhTien.bai03;

public class Cylinder {
	private float r;
	private float h;
	public float getR() {
		return r;
	}
	public void setR(float r) {
		this.r = r;
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		this.h = h;
	}
	
	public Cylinder() {
		r=0;
		h=0;
	}
	public Cylinder(float r, float h) {
		this.r=r;
		this.h=h;
	}
	public float tinhDienTichXungQuanh() {
		return (float) (Math.PI*2*r*h);
	}
	public float tinhDienTichToanPhan() {
		return (float) (Math.PI*2*r*(r+h));
	}
	public float tinhTheTich() {
		return (float) (Math.PI*r*r*h);
	}
	public String toString() {
		return String.format("R=%.1f, H=%.1f, DTXQ = %.1f, DTTP = %.1f, V = %.1f",r,h,tinhDienTichXungQuanh(), tinhDienTichToanPhan(), tinhTheTich() );
	}
}