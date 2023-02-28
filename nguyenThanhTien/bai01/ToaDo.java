package nguyenThanhTien.bai01;

public class ToaDo {
	private float x;
	private float y;
	private String ten;
	
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
	public void setTen(String Ten) throws Exception{
		if(Ten.isEmpty() || Ten.equals(" ") || Ten.equals("null"))
			throw new Exception("Khong hop le! Moi nhap lai!");
		else
			this.ten = Ten;
	}
	public String getTen() {
		return ten;
	}
	
	public ToaDo() {
		x=0;
		y=0;
		ten="O";
	}
	
	public ToaDo(float x, float y, String ten) throws Exception {
		this.x=x;
		this.y=y;
		setTen(ten);
	}
	public String toString() {
		return String.format("%s(%.1f,%.1f)",ten,x,y);
	}
}
