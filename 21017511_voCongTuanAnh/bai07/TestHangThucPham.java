package bai07;

import java.time.LocalDate;

public class TestHangThucPham {
    public static void main(String[] args) throws Exception {
    	HangThucPham gao = new HangThucPham("001", "Gạo", 100000, LocalDate.of(2018,7,10), LocalDate.of(2018,7,10));
		HangThucPham mi = new HangThucPham("002", "Mì", 5000,LocalDate.of(2018,3, 1), LocalDate.of(2018,9,1));
		HangThucPham nuoc = new HangThucPham("003", "Nước", 10000, LocalDate.of(2017,3,1), LocalDate.of(2018,3,1));
		
		
		System.out.println(gao.tieuDe());
		System.out.println(gao.toString());
		System.out.println(mi.toString());
		System.out.println(nuoc.toString());
		
	}
}
