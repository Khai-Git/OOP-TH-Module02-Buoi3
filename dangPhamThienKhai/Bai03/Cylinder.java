package dangPhamThienKhai.Bai03;

public class Cylinder {
	private double r;
	private double h;
	
	public Cylinder() {
		super();
	}

	public Cylinder(double r, double h) {
		super();
		this.r = r;
		this.h = h;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double Sxq() {
		return 2 * Math.PI * r * h;
	}
	
	public double Stp() {
		return 2 * Math.PI * r * (r + h);
	}
	
	public double VCylinder() {
		return Math.PI * Math.pow(r, 2) * h;
	}
	
	@Override
	public String toString() {
		return "Cylinder [r=" + r + ", h=" + h + "]";
	}
}
