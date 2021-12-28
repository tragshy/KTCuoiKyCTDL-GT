package Problem1;

import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
		
		NhapThongTin thongtin = new NhapThongTin();
		Scanner sc = new Scanner(System.in);
		
		
		showMenu();
		
		while(true) {
			
			System.out.print("Chọn: ");
			int choose = sc.nextInt();
			
			switch(choose) {
			case 1:
				thongtin.add();
				break;
				
			case 2:
				System.out.println();
				System.out.println("+++++++ DANH SÁCH +++++++");
				thongtin.xuatRaMH();
				System.out.println();
				break;
				
			case 3:
				thongtin.suaTT();
				break;
				
			case 4:
				thongtin.timKiemTT();
				break;
				
			case 5:
				thongtin.xoaThongTin();
				break;
				
			case 6:
				thongtin.sX();
				break;
				
			case 7:
				System.out.println("CẢM ƠN BẠN ĐÃ NHẬP THÔNG TIN!");
				System.exit(0);
				break;
				
			default:
				System.out.println();
				System.out.println("KHÔNG HỢP LỆ! VUI LÒNG CHỌN LẠI!");
				System.out.println();
				break;
				
			}
			
		showMenu();
	}	
}
	
	public static void showMenu() {
		System.out.println("+++++++++++++++ MENU +++++++++++++++");
		System.out.println("+  1. NHẬP THÔNG TIN SẢN PHẨM      +");
		System.out.println("+  2. XUẤT THÔNG TIN SẢN PHẨM      +");
		System.out.println("+  3. SỬA THÔNG TIN SẢN PHẨM       +");
		System.out.println("+  4. TÌM KIẾM THÔNG TIN SẢN PHẨM  +");
		System.out.println("+  5. XÓA THÔNG TIN SẢN PHẨM       +");
		System.out.println("+  6. SẮP XẾP THÔNG TIN SẢN PHẨM   +");
		System.out.println("+  7. THOÁT KHỎI CHƯƠNG TRÌNH      +");
		System.out.println("++++++++++++++++++++++++++++++++++++");
	}

}
