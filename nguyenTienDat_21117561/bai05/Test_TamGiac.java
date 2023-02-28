package nguyenTienDat.bai05;

public class Test_TamGiac {
	public static void main(String[] args) {
		// TH1
		TamGiac h1 = new TamGiac(0, 5, 0);
		System.out.println("Hinh thu 1: "+h1.toString());
		h1.xetTamGiac();
		// TH2
		TamGiac h2 = new TamGiac(2, 3, 4);
		System.out.println("Hinh thu 2: "+h2.toString());
		h2.xetTamGiac();
		// TH3
		TamGiac h3 = new TamGiac(5, 5, 6);
		System.out.println("Hinh thu 3: "+h3.toString());
		h3.xetTamGiac();
		TamGiac h4 = new TamGiac(5, 5, 5);
		System.out.println("Hinh thu 4: "+h4.toString());
		h4.xetTamGiac();
		TamGiac h5 = new TamGiac(-3, 5, 3);
		System.out.println("Hinh thu 5: "+h5.toString());
		h5.xetTamGiac();
	}
}
