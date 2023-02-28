package dangPhamThienKhai.Bai02;

public class Point {
	private String ten;
	private double a;
	private double b;
	
	public Point() {
		this.ten = null;
		this.a = 0;
		this.b = 0;
	}

	public Point(String ten, double a, double b) {
		super();
		this.ten = ten;
		this.a = a;
		this.b = b;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	public double getDistance() {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
	
	@Override
	public String toString() {
		return "Point [ten=" + ten + ", a=" + a + ", b=" + b + "]" + " or " + ten + "(" + a + "," + b + ")";
	}

	public Point negate() {
		double adx = -a;
		double bdx = -b;
		String tendx = ten + "DoiXung";
		
		Point dx = new Point(tendx, adx, bdx);
		
		return dx;
//		return "Point [ten=" + tenDX + ", a=" + adx + ", b=" + bdx + "]"  + " or " + ten + "(" + adx + "," + bdx + ")";
	}
}