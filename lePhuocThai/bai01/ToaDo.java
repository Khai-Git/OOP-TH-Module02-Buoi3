package lePhuocThai.bai01;

public class ToaDo {
	private float x,y;
	private String ten;
	
	public ToaDo(float x, float y, String ten) {
		this.x=x;
		this.y=y;
		setTen(ten);
	}
	public ToaDo() {
		this.x=0;
		this.y=0;
		this.ten="O";
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
	public String getTen() {
		return ten;
	}
	public void setTen(String ten){
		if(ten.equals("")) {
			this.ten="";
		}else {
			this.ten = ten;
		}
		
	}
	public String getThongTin() {
		return String.format("%s[%f,%f]",ten,x,y);
	}
	@Override
	public String toString() {
		return String.format("%s[%f,%f]",ten,x,y);
	}
}
