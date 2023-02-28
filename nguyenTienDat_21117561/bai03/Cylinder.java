

package nguyenTienDat.bai03;

public class Cylinder {
	private float r;
	private float h;
	public Cylinder(float r, float h) {
		this.r = r;
		this.h = h;
	}
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
	public double tinhDienTichXungQuanh(){
		return Math.PI * 2 * r * h;
	}
	public double tinhDienTichToanPhan() {
		return Math.PI*2*r*(r+h);
	}
	public double tinhTheTich() {
		return Math.PI*r*r*h;
	}
	@Override
	public String toString() {
		return String.format("Hình trụ có r=%.1f,h= %.1f)",r,h);
	}
	
}
