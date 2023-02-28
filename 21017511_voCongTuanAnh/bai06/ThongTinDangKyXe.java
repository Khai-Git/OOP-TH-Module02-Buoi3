package bai06;

public class ThongTinDangKyXe {
      private String chuXe;
      private String loaiXe;
      private double dungTichXyLanh;
      private double giaXe;
	public ThongTinDangKyXe() {
		chuXe = "";
		loaiXe = "";
		giaXe = 0;
		dungTichXyLanh =0;
	}
	public ThongTinDangKyXe(String chuXe, String loaiXe, double dungTichXyLanh,double giaXe) {
		setChuXe(chuXe);
		setLoaiXe(loaiXe);
		setDungTichXyLanh(dungTichXyLanh);
		setGiaXe(giaXe);
	}
	
	public String getChuXe() {
		return chuXe;
	}
	public void setChuXe(String chuXe) {
		if(!chuXe.equals(""))
		{
			
			this.chuXe = chuXe;
		}
		else
		{
			this.chuXe = "0";
		}
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		if(!loaiXe.equals(""))
		{
			
			this.loaiXe = loaiXe;
		}
		else
		{
			this.loaiXe ="0";
		}
	}
	public double getGiaXe() {
		return giaXe;
	}
	public void setGiaXe(double giaXe) {
		if(giaXe >= 0)
		{
			
			this.giaXe = giaXe;
		}
		else
		{
			this.giaXe = 0;
		}
	}
	public double getDungTichXyLanh() {
		return dungTichXyLanh;
	}
	public void setDungTichXyLanh(double dungTichXyLanh) {
		if(dungTichXyLanh >= 0)
		{
			
			this.dungTichXyLanh = dungTichXyLanh;
		}
		else
		{
			this.dungTichXyLanh = 0;
		}
	}
	
	public double tinhThue() {
		if(dungTichXyLanh < 100)
		{
			return giaXe * 0.01;
		}
		else if(dungTichXyLanh >= 100 && dungTichXyLanh <= 200)
		{
			return giaXe * 0.03;
		}
		else
		{
			return giaXe * 0.05;
		}
	}
	
	public String tieuDe() {
		return String.format("%-30s%-19s%-17s%-30s%-30s", "Ten chu xe","Loai xe","Dung tich","Tri gia","Thue phai nop");
	}

	public String toString() {
		return String.format("%-30s%-20s%-17.2f%-30.2f%-30.2f", chuXe, loaiXe,dungTichXyLanh, giaXe, tinhThue());
	}
	
	
      
      
      
}
