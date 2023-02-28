package doTienLuong.Bai05;
import java.lang.Math;
public class HinhTamGiac {
	private float cA;
	private float cB;
	private float cC;
	
	public HinhTamGiac(float cA, float cB, float cC) {
		this.cA=cA;
		this.cB=cB;
		this.cC=cC;
	}
	public float getCA() {
		return cA;
	}
	public void setCA(float cA) {
		this.cA= cA;
	}
	public float getCB() {
		return cB;
	}
	public void setCB(float cB) {
		this.cB=cB;
	}
	public float getCC() {
		return cC;
	}
	public void setCC(float cC) {
		this.cC = cC;
	}	
	public float tinhChuVi() {
		return  cA+cB+cC;
	}
	public float tinhDienTich() {
		return (float) Math.sqrt(tinhChuVi()*(tinhChuVi()-cA)*(tinhChuVi()-cB)*(tinhChuVi()-cC));
	}
	public String toString() {
		return String.format("Chung ta co\nChu vi = %.1f\nDien tich = %.1f",tinhChuVi(),tinhDienTich());
	}

}
