package lePhuocThai.bai02;

public class Point {
	private float x,y;
	public Point() {
		this.x=0;
		this.y=0;
	}
	public Point(float x,float y) {
		setX(x);
		setY(y);
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public Float getDistance() {
		return (float) Math.sqrt(x*x+y*y);
	}
	public String toString(){
		return String.format("Toa do x=%.2f , y=%.2f,",x,y);
	}
	public Point negate() {
		Point p=new Point();
		p.x=-x;
		p.y=-y;
		return p;
	}
	
	
	

}
