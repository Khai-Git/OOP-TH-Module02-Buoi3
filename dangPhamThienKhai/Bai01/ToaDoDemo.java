package dangPhamThienKhai.Bai01;

import java.util.Scanner;

/**
 * Bài 1.
Biết lớp tọa độ ToaDo có:
- Các thuộc tính: x, y và tên.
- Các phương thức set, get thông tin của x, y và tên.
- Các phương thức khởi tạo: một constructor mặc định và một construtor đầy đủ tham số.
- Phương thức getThongTin() trả về chuỗi thông tin theo mẫu: tên(x,y).
Yêu cầu:
a. Vẽ lược đồ lớp UML cho lớp tọa độ.
b. Cài đặt lớp tọa độ theo thiết kế.
c. Xây dựng lớp khác chứa hàm main cho phần kiểm nghiệm.
d. Thay phương thức getThongTin() bằng phương thức toString() và nhận xét cách sử dụng.
 * @author BeekaiPC
 *
 */
public class ToaDoDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap ten toa do: ");
		String ten = sc.nextLine();
		
		System.out.print("Nhap toa do x: ");
		double x = sc.nextDouble();
		
		System.out.print("Nhap toa do y: ");
		double y = sc.nextDouble();
		
		ToaDo td1 = new ToaDo(x,y,ten);
		
		System.out.println(td1.getThongTin());
		System.out.println(td1);
	}
}

/*
 * Phương thức getThongTin() thì chúng ta phải tự tạo ra (Có thể rườm rà hơn nhưng sẽ dễ hiểu hơn vì mình code theo ý mình)
 * Còn phương thức toString() thì dựa vào form mặc định của phần mềm Java mà người sáng lập thiết kế ra (Mục đích giúp cho người code thao tác nhanh hơn không phải tốn quá nhiều thời gian để tạo ra một phương thức để xuất ra console hoặc kết quả)
 */