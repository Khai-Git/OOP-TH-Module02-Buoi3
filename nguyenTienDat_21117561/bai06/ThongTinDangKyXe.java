package nguyenTienDat.bai06;
public class ThongTinDangKyXe {
	private String tenchuxe;
	private String loaixe;
	private int dungtich;
	private float trigiaxe;

	public ThongTinDangKyXe() {
		tenchuxe = "Khong co";
		loaixe = "Khong co";
		dungtich = 0;
		trigiaxe = 0;
	}

	public ThongTinDangKyXe(String tenchuxe, String loaixe, int dungtich, float trigiaxe) throws Exception {
		setTenchuxe(tenchuxe);
		setLoaixe(loaixe);
		setDungtich(dungtich);
		setTrigiaxe(trigiaxe);
	}

	public String getTenchuxe() {
		return tenchuxe;
	}

	public void setTenchuxe(String tenchuxe) {
		this.tenchuxe = tenchuxe;
	}

	public String getLoaixe() {
		return loaixe;
	}

	public void setLoaixe(String loaixe) {
		this.loaixe = loaixe;
	}

	public int getDungtich() {
		return dungtich;
	}
	public void setDungtich(int dungtich) throws Exception {
		if(dungtich>=0) {
			this.dungtich = dungtich;
		}
		else 
		{
			throw new Exception("Lỗi!! Vì giá trị dung tích >=0");
		}
	}

	public double getTrigiaxe() {		
		return trigiaxe;
	}
	public void setTrigiaxe(float trigiaxe) throws Exception {
		if(trigiaxe>=0) {
			this.trigiaxe = trigiaxe;
		}
	else {
			throw new Exception("Lỗi!! Vì Trị giá xe >=0");
		}		
	}
	public double tinhThuePhaiNop()
	{
		if(dungtich<100) {
			return (trigiaxe*0.01f);
		}
		else if((dungtich>=100) && (dungtich<200)) {
			return (trigiaxe*0.03f);
		}
		else 
			return (trigiaxe*0.05f);
	}
	public static String getTieuDe() {
		return String.format("%-20s%-30s%-30s%-30s%-30s","Tên chủ Xe", "Loại Xe","Dung tích","Trị Giá ","Thuế Phải nộp");
	}
	@Override
	public String toString() {
		return String.format("%-20s%-30s%-30d%-30.2f%-30.2f",tenchuxe,loaixe,dungtich,trigiaxe,tinhThuePhaiNop());
	}
	
}
