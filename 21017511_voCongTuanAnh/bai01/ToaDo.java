package bai01;

public class ToaDo {
    private int x;
    private int y;
    private String ten;

    public ToaDo() {
        this.x = 0;
        this.y = 0;
        this.ten = "O";
    }

    public ToaDo(int x, int y, String ten) {
        setX(x);
        setY(y);
        setTen(ten);
    }
    
    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		if(ten.equals("")) {
			this.ten = "";
		}
		else
		{
			this.ten = ten;	
		}
	}

    
    public String toString() {
        return String.format("Toa do "+this.ten + "="+"(" + this.x + "," + this.y + ")");
    }
}
         
