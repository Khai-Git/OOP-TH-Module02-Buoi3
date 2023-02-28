package hoThiMyQuynh.bai03;

public class Cylinder {
	private float banKinh;
	private float chieuCao;
	
	public Cylinder(float banKinh, float chieuCao) {
	
		this.banKinh = banKinh;
		this.chieuCao = chieuCao;
	}
	public Cylinder() {
		this.banKinh = 9;
		this.chieuCao = 8;
	
	}
	public float getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(float banKinh) {
		this.banKinh = banKinh;
	}
	public float getChieuCao() {
		return chieuCao;
	}
	public void setChieuCao(float chieuCao) {
		this.chieuCao = chieuCao;
	}
	
	
	public float dienTichXungQuanh() {
		
		return (float) (2*3.14*chieuCao*banKinh) ;
		
	}
	public float dienTichToanPhan() {
		return (float)(2*3.14*banKinh)*(chieuCao+banKinh);
	}
	
	public float theTich() {
		return (float)(3.14*chieuCao*(banKinh*banKinh));
	}
	@Override
	public String toString() {
		return "Cylinder [banKinh=" + banKinh + ", chieuCao=" + chieuCao + "]";
	}
	
	
}
