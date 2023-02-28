package nguyenThanhTien.bai02;

public class Point {
	private float x;
	private float y;
	
	public void setX(float X) {
		x=X;
	}
	public float getX() {
		return x;
	}
	
	public void setY(float Y) {
		y=Y;
	}
	public float getY() {
		return y;
	}
	
	public Point() {
		x=0;
		y=0;
	}
	
	public Point(float x, float y) {
		this.x=x;
		this.y=y;
	}
	
	public Point negate() {
		Point p = new Point();
		p.x = -x;
		p.y = -y;
		return p;
	}
	
	public float getDistance() {
		return (float) Math.sqrt(x*x + y*y);
	}
	
	public String toString() {
		return String.format("x = %.2f, y = %.2f, Khoang cach = %.2f",x,y,getDistance());
	}
}
