package hoThiMyQuynh.bai01;

public class ToaDo {
	private String name;
	private float x;
	private float y;
	public ToaDo(String name, float x, float y) {
		
		this.name = name;
		this.x = x;
		this.y = y;
	}
	public ToaDo() {
		this.name="a1";
		this.x=9;
		this.y=6;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "ToaDo [name=" + name + ", x=" + x + ", y=" + y + "]";
	}
	
	
	
	

}
