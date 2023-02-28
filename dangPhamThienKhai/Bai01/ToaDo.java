package dangPhamThienKhai.Bai01;

public class ToaDo {
	private double x;
	private double y;
	private String ten;
	
	public ToaDo() {
		this.x = 0;
		this.y = 0;
		this.ten = null;
	}

	public ToaDo(double x, double y, String ten) {
		super();
		this.x = x;
		this.y = y;
		this.ten = ten;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getThongTin() {
		return ten + "(" + x + "," + y + ")";
	}
	
	@Override
	public String toString() {
		return "ToaDo [x=" + x + ", y=" + y + ", ten=" + ten + "]";
	}
}