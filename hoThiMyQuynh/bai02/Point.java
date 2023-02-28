package hoThiMyQuynh.bai02;

public class Point {
	private float x;
	private float y;
	public Point(float x, float y) {
		
		this.x = x;
		this.y = y;
	}
	public Point() {
		this.x = 10;
		this.y = 7;
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
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public Point negate() {
		Point p =new Point();
		p.x=-x;
		p.y=-y;
		return p;
		
	}
	public float getDistance()
	{
		return (float) Math.sqrt(x*x+y*y);
		
	}
}
