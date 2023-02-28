package lePhuocThai.bai03;

public class Cylinder {
	private float r,h;
	public Cylinder() {
		this.r=0;
		this.h=0;
	}
public Cylinder(float r,float h) {
		setR(r);
		setH(h);
	}
	public float getR() {
		return r;
	}
	public void setR(float r) {
		if(r>0) {
			this.r = r;	
		}else {
			this.r=0;
		}
	
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		if(h>0) {
			this.h = h;	
		}else {
			this.h=0;
		}
	}
	public float Tinhdientichxungquanh() {
		return (float) (2*3.14*r*h);
	}
	public float Tinhthetich() {
		return (float) (3.14*r*r*h);
	}
	public float Tinhdientichtoanphan() {
		return (float) (2*3.14*r*r)+(float)(2*3.14*r*h);
	}
	public String toString() {
		return String.format("r = " + this.r +" , "+ "h = " + this.h);
	}
	
	
}
