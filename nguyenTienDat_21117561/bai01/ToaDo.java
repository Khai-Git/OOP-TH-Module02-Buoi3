package nguyenTienDat.bai01;

public class ToaDo {
	private float x;
	private float y;
	private String ten;
	public ToaDo() {
		x=0;
		y=0;
		ten="O";
	}
	public ToaDo(float x, float y, String ten) {
		this.x = x;
		this.y = y;
		setTen(ten);
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
	public String getTen(String ten) {
		return ten;
	}
	public void setTen(String ten) {
		if(!ten.equals(""))
			this.ten=ten;
		else
			this.ten="unknow";
	}
	public String toString() {
		return String.format("%s(%.1f,%.1f)",ten,x,y);
	}
}
