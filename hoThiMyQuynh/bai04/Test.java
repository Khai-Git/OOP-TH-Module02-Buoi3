package hoThiMyQuynh.bai04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 DiemSinhVien sv1 = new DiemSinhVien(1, "Hong vy", 7, 8);
		 DiemSinhVien sv2 = new DiemSinhVien();
			/*
			 * DiemSinhVien sv3 = new DiemSinhVien(); Scanner sc = new Scanner(System.in);
			 * System.out.println("Nhập mã sinh viên 3: ");
			 * sv3.setMaSV(sc.nextInt());sc.nextLine();
			 * System.out.println("Nhập tên sinh viên 3: "); sv3.setTenSV(sc.nextLine());
			 * System.out.println("Nhập điểm lý thuyết: "); sv3.setDiemTL(sc.nextFloat());
			 * System.out.println("Nhập điểm thực hành: "); sv3.setDiemTH(sc.nextFloat());
			 */
	 
	 
	        
	     System.out.printf("%5s %10s %20s %16s %16s \n","MSSV","Họ tên","Điểm lý thuyết","Điểm thực hành","Điểm trung bình");
	      
	        sv1.xuatTT();
	        sv2.xuatTT();
			/* sv3.xuatTT(); */
	        
	       
	    
	}

}
