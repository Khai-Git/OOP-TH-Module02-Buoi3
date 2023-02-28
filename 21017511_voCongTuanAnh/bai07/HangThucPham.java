package bai07;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;
    
    
    
	public HangThucPham() throws Exception {
		this("Lỗi!", "xxx", 0, LocalDate.now(), LocalDate.now());
	
	}



	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}
	
	
	
	public HangThucPham(String maHang) {
		this.maHang = maHang;
	}
	
	
	
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) throws Exception{
		if(!maHang.trim().equals(""))
		{
			
			this.maHang = maHang;
		}
		else
		{
			throw new Exception("Lỗi!");
		}
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) throws Exception {
		if(!tenHang.trim().equals(""))
		{
			this.tenHang = tenHang;	
		}
		else
		{
			throw new Exception("xxx");
		}
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) throws Exception {
		if(donGia >=0)
		{
			this.donGia = donGia;	
		}
		else
		{
			throw new Exception("Đơn giá lớn hơn hoặc bằng 0");
		}
		
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat.isBefore(LocalDate.now()))
		{
			this.ngaySanXuat = ngaySanXuat;
		}
		else
		{
			this.ngaySanXuat = LocalDate.now();
		}
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(ngayHetHan.isAfter(ngaySanXuat))
		{
			this.ngayHetHan = ngayHetHan;
		}
		else
		{
			this.ngayHetHan = this.ngaySanXuat;
		}
	}
	
	public String daHetHan() {
		{
			if (this.ngayHetHan.isBefore(LocalDate.now())) {
				return "Hàng hết hạn";
			} else {
				return "";
			}
		}
	}
	
	
	public String tieuDe() {
		return String.format("%-15s%-15s%-15s%-20s%-20s", "mahang","tenhang","dongia", "ngaysanxuat","ngayhethan");
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("yyyy MM dd");
		return String.format("%-15s%-15s%-15.2f%-20s%-20s%-20s",maHang,tenHang,donGia,ngaySanXuat.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),ngayHetHan.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),daHetHan());

	}
	
    
    
}
