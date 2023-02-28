package phamThanhTien.bai01;

public class ToaDo {
	private int x;
	private int y;
	private String ten;
	
	public ToaDo() {
		x=0;
		y=0;
		ten="O";
		
	}
	public ToaDo(int x, int y, String ten) {
		this.x=x;
		this.y=y;
		this.ten=ten;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		
		return String.format("%s(%d,%d)", ten, x, y);
		
	}
		
}
