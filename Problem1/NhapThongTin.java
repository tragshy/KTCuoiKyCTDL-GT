package Problem1;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class NhapThongTin {
    
    static ClassList cll = new ClassList();
	
	static Scanner sc = new Scanner(System.in);
	
	public void add() {
		
		System.out.println("------------------------------------");
		System.out.print("Nhập số sản phẩm cần nhập thông tin: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1));
			
			System.out.print("Nhập mã sản phẩm: ");
			int MaSP = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Nhập tên sản phẩm: ");
			String tenSP = sc.nextLine();	
			
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");
			String ngayNhapKho = formatter.format(date);
			
			System.out.print("Nhập giá nhập kho: ");
			int giaNhapKho = sc.nextInt();
			
			System.out.print("Nhập số lượng tồn kho: ");
			int soLuongTK = sc.nextInt();	
			
			showMenu();
			boolean loaiSanPham = false;
			
			int sanpham = sc.nextInt();
			
			if(sanpham == 1) {
				
				loaiSanPham = true;
				
				sc.nextLine();
				ThuocTinhChung tp = new ThucPham(MaSP, tenSP, loaiSanPham, ngayNhapKho, giaNhapKho, soLuongTK);
				
				cll.them(tp);
				
				System.out.println();
				
			}else {
				
				if(sanpham == 2) {
					loaiSanPham = true;
					
					System.out.println();	
					
					sc.nextLine();
					ThuocTinhChung ss = new SanhSu(MaSP, tenSP, loaiSanPham, ngayNhapKho, giaNhapKho, soLuongTK);
					
						cll.them(ss);
						
						System.out.println();
						
					}else {
						
						if(sanpham == 3) {
							
						sc.nextLine();					
						ThuocTinhChung dienmay = new DienMay(MaSP, tenSP, loaiSanPham, ngayNhapKho, giaNhapKho, soLuongTK);
						
						cll.them(dienmay);
						
						System.out.println();
					}
				}
			}
		}
	}

	  
	 public void xuatRaMH() {
		 cll.xuat();
		 
	 }
	 
	 public void suaTT() {
		 cll.sua();
	 }
	 
	 public void timKiemTT() {
		 cll.timKiem();
	 }
	 
	 public void sX() {
		cll.sapXep();
	 }
	 
	 public void xoaThongTin() {
		 
		 System.out.println("------------------------------------");
		 
		 System.out.print("Nhập vị trí cần xóa: ");
		 
		 int n = sc.nextInt();
		 
		 cll.xoa(n);
	 }
	 

	 
	 public void showMenu() {

		 
			System.out.println("------------------------------------");
			
			System.out.println("+++++++ Chọn loại Sản Phẩm +++++++");
			
			System.out.println("1. Thực phẩm ");
			
			System.out.println("2. Sành sứ ");
			
			System.out.println("3. Điện máy ");
			
			System.out.println("++++++++++++++++++++++++++++++++++");
			
			System.out.print("Sản phẩm là thực phẩm, sành sứ hay điện máy(mời bạn chọn): ");		 
	 }
}
