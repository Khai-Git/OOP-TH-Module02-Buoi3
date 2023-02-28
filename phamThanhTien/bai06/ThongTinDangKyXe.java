package phamThanhTien.bai06;

public class ThongTinDangKyXe {
	private String chuxe;
	private String loaixe;
	private double trigia;
	private int dungtichxylanh;
	
	public ThongTinDangKyXe() {
		this.chuxe="Unknown";
		this.loaixe="Unknown";
		this.trigia=0;
		this.dungtichxylanh=0;
	}
	public ThongTinDangKyXe(String chuxe, String loaixe, float trigia, int dungtichxylanh) {
		this.chuxe=chuxe;
		this.loaixe=loaixe;
		this.trigia=trigia;
		this.dungtichxylanh=dungtichxylanh;
	}
	/**
	 * @return the chuxe
	 */
	public String getChuxe() {
		return chuxe;
	}
	/**
	 * @param chuxe the chuxe to set
	 */
	public void setChuxe(String chuxe) {
		this.chuxe = chuxe;
	}
	/**
	 * @return the loaixe
	 */
	public String getLoaixe() {
		return loaixe;
	}
	/**
	 * @param loaixe the loaixe to set
	 */
	public void setLoaixe(String loaixe) {
		this.loaixe = loaixe;
	}
	/**
	 * @return the trigia
	 */
	public double getTrigia() {
		return trigia;
	}
	/**
	 * @param trigia the trigia to set
	 */
	public void setTrigia(float trigia) {
		this.trigia = trigia;
	}
	/**
	 * @return the dungtichxylanh
	 */
	public int getDungtichxylanh() {
		return dungtichxylanh;
	}
	/**
	 * @param dungtichxylanh the dungtichxylanh to set
	 */
	public void setDungtichxylanh(int dungtichxylanh) {
		this.dungtichxylanh = dungtichxylanh;
	}
//	public void tinhThue() {
//		if(dungtichxylanh < 100)
//			trigia * 0.01;
//		else if (dungtichxylanh <200 )
//			trigia* 0.03;
//	}
}
