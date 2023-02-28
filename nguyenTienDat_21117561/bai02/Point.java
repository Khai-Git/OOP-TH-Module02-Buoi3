package nguyenTienDat.bai02;

public class Point {
	private float x;
	private float y;
	public Point() {
		x=0;
		y=0;
	}
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
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
	public Point negate() {
		Point a =new Point(-x,-y);
		return a;
	}
	public double getDistance() {
		return Math.hypot(x,y);
	}
	public String toString() {
		return String.format("Point (%.1f,%.1f)",x,y);
	}
}
