package Problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ClassList {
    List<ThuocTinhChung> dssanpham = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	public ClassList() {
		this.dssanpham = dssanpham;
	}
	
	public void them(ThuocTinhChung thuoctinh) {
		dssanpham.add(thuoctinh);
	}
	
	//XÓA MỘT SẢN PHẨM TRONG DANH SÁCH
	public void xoa(int i) {
		 
		 if(dssanpham.size() == 0) {
			 
			 System.out.println("Chưa có thông tin sản phẩm nào!!");
		 }else {

			 dssanpham.remove(i - 1);
		 }
	 }

	//SỬA MỘT TRONG CÁC THUỘC TÍNH CỦA CLASS "ThuocTinhChung"
	public void sua() {
		
		if(dssanpham.size() == 0) {
			
			System.out.println("Chưa có thông tin sản phẩm nào!!");
			
		}else {
			
		xuat();
		
		System.out.print("Nhập số thứ tự của sản phẩm cần sửa thông tin:  ");
		
		int index = sc.nextInt();
		
		if(index > 0 && index < this.dssanpham.size()+1) {
			
			System.out.println(dssanpham.get(index - 1).ShowItemInfo());
			
			System.out.print("Chọn thông tin cần sửa: ");
			
			int idx = sc.nextInt();
			
			System.out.print("Sửa thành: ");
			
			switch(idx) {
			
			case 1:
				int masp = sc.nextInt();
				dssanpham.get(index - 1).setMaSP(masp);
				break;
				
			case 2:
				sc.nextLine();
				String tensp = sc.nextLine();
				dssanpham.get(index - 1).setTenSP(tensp);
				break;
				
			case 3:
				boolean loaiSanPham = sc.nextBoolean();
				dssanpham.get(index - 1).setLoaiSanPham(loaiSanPham);
				break;
				
			case 4:
				String ngayNhapKho = sc.nextLine();
				dssanpham.get(index - 1).setNgayNhapKho(ngayNhapKho);
				break;
				
			case 5:
				int gianhapkho = sc.nextInt();
				dssanpham.get(index - 1).setGiaNhapKho(gianhapkho);
				break;
				
			case 6:
				int soluongtk = sc.nextInt();
				dssanpham.get(index - 1).setSoLuongTK(soluongtk);
				break;
				
			}
			
			System.out.println("Sửa thành công!!");
	
		}
		
		else {
			
			System.out.print("Nhập sai, vui lòng nhập lại!!!");
			
			this.sua();
			
		}
		
	}
		
}
	
	//XUẤT THÔNG TIN SẢN PHẨM RA MÀN HÌNH
	public void xuat() {
		
		if(dssanpham.size() == 0) {
			
			System.out.println("Chưa có thông tin sản phẩm nào được nhập!!");
		}else {
			
		for(ThuocTinhChung thuoctinh : dssanpham) {
			System.out.print((dssanpham.indexOf(thuoctinh) + 1)+ ". ");
			System.out.println(thuoctinh.ShowInfo());
			}
		}
	}
	
	//TÌM KIẾM THÔNG TIN SẢN PHẨM
	public void timKiem() {
		
		if(dssanpham.size() == 0) {
			
			System.out.println("Chưa có thông tin sản phẩm nào!!");
			
		}else {
			
		System.out.println("-------TÌM KIẾM-------");
		System.out.println("1. Theo tên");
		System.out.println("2. Theo giá nhập kho");
		System.out.println("----------------------");
		System.out.print("Chọn: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: 
			timKiemTheoTen();
			break;
			
		case 2:
			timKiemTheoGia();
			break;
			
		}
	}
}
	
	//TÌM KIẾM THEO TÊN SẢN PHẨM
	public void timKiemTheoTen() {
		
		List<ThuocTinhChung> tempDSSP = new ArrayList<>();
		
		sc.nextLine();
		
		System.out.print("Nhập tên sản phẩm cần tìm kiếm: ");
		
		String text = sc.nextLine().replace(" ", "").toLowerCase();
		
		dssanpham.forEach((element) -> {
			
			if(element.getTenSP().replace(" ", "").toLowerCase().contains(text)) {
				
				tempDSSP.add(element);
			}

		});
		
		if(tempDSSP.size() == 0) {
			
			System.out.println("Không có thông tin tìm kiếm!!!");
			
		}
		
		for(ThuocTinhChung thuoctinh : tempDSSP) {
			
			System.out.print((dssanpham.indexOf(thuoctinh) + 1)+ ". ");
			
			System.out.println(thuoctinh.ShowInfo());
		}
	}
	
	//TÌM KIẾM THEPO GIÁ NHẬP KHO CỦA SẢN PHẨM
	public void timKiemTheoGia() {
		
		List<ThuocTinhChung> tempDSSP = new ArrayList<>();
		
		sc.nextLine();
		
		System.out.print("Nhập giá cần tìm kiếm: ");
		
		int gia = sc.nextInt();
		
		dssanpham.forEach((element) -> {
			
			if(element.getGiaNhapKho() == gia) {
				
				tempDSSP.add(element);
			}
		});
		
		if(tempDSSP.size() == 0) {
			
			System.out.println("Không có thông tin tìm kiếm!!!");
		}
		
		for(ThuocTinhChung thuoctinh : tempDSSP) {
			
			System.out.print((dssanpham.indexOf(thuoctinh) + 1)+ ". ");
			
			System.out.println(thuoctinh.ShowInfo());
		}
		System.out.println();
	}
	
	//SẮP XẾP SẢN PHẨM
	public void sapXep() {
		if(dssanpham.size() == 0) {
			System.out.println("Chưa có thông tin sản phẩm nào!");
		}else {
		System.out.println("Sắp xếp giá nhập kho theo:");
		System.out.println("1. Tăng dần");
		System.out.println("2. Giảm dần");
		System.out.println("--------------------------");
		System.out.print("Mời chọn: ");
			int chon = sc.nextInt();
			switch(chon) {
			case 1:
				sapXepTangDan();
				break;
			case 2:
				sapXepGiamDan();
				break;
			default:
				System.out.println();
				System.out.println("KHÔNG HỢP LỆ! VUI LÒNG CHỌN LẠI!");
				System.out.println();
				break;
			}
		}
}
	
	//SẮP XẾP SẢN PHẨM THEO GIÁ NHẬP KHO TĂNG DẦN
	public void sapXepTangDan() {
		System.out.println("------------DANH SÁCH SẮP XẾP THEO GIÁ TĂNG DẦN------------");
		Collections.sort(dssanpham, new Comparator<ThuocTinhChung>() {
			@Override
			public int compare(ThuocTinhChung ttc1, ThuocTinhChung ttc2) {
				if(ttc1.getGiaNhapKho() > ttc2.getGiaNhapKho()) {
					return 1;
				}else {
					if(ttc1.getGiaNhapKho() == ttc2.getGiaNhapKho()) {
						return 0;
					}else {
						return -1;
					}
				}
			}
		});
		xuat();
	}
	
	//SẮP XẾP SẢN PHẨM THEO GIÁ NHẬP KHO GIẢM DẦN
	public void sapXepGiamDan() {
		System.out.println("------------DANH SÁCH SẮP XẾP THEO GIÁ TĂNG DẦN------------");
		Collections.sort(dssanpham, new Comparator<ThuocTinhChung>() {
			@Override
			public int compare(ThuocTinhChung ttc1, ThuocTinhChung ttc2) {
				if(ttc1.getGiaNhapKho() < ttc2.getGiaNhapKho()) {
					return 1;
				}else {
					if(ttc1.getGiaNhapKho() == ttc2.getGiaNhapKho()) {
						return 0;
					}else {
						return -1;
					}
				}
			}
		});
		xuat();
	}
	
}
