package bai02;

public class Point {
    private double X;
    private double Y;

    
	public Point() {
		X = 0.0;
		Y = 0.0;
	}


	public Point(double x, double y) {
		setX(x);
		setY(y);
	}

    
	
	public double getX() {
		return X;
	}


	public void setX(double x) {
		X = x;
	}


	public double getY() {
		return Y;
	}


	public void setY(double y) {
		Y = y;
	}


	public Point negate() {
		Point p = new Point();
		p.X = -X;
		p.Y = -Y;
		return p;
	}
	
	public double getDistance() {
		return Math.sqrt(X*X + Y*Y);
	}



	public String toString() {
		return String.format("(%-3.1f %-3.1f)",X,Y);
	
	
	
	}
}
