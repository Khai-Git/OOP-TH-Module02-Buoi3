package phanMinhPhu_bai01;

public class ToaDo {


		private double x;
		private double y;
		private String ten;
		public ToaDo(double x, double y, String ten) {
			
			this.x = x;
			this.y = y;
			this.ten = ten;
		}
		public ToaDo() {
			x = 0;
			y = 0;
			ten = "no String";
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
		@Override
		public String toString() {
			return "ToaDo [x=" + x + ", y=" + y + ", ten=" + ten + "]";
		}
		
			
		
	}

	

