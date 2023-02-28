package doTienLuong.Bai01;
public class ToaDo {
	private float x;
	private float y;
	private String ten;
	
	public ToaDo(float x, float y, String ten) {
		this.x=x;
		this.y=y;
		this.ten =ten;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x=x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("x = %.1f, y = %.1f, toado= %s(%.1f,%.1f)",x,y,ten,x,y);
	}
	
}
