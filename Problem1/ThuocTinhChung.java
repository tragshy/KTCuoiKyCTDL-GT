package Problem1;

public class ThuocTinhChung {
    
    private int MaSP;
	private String tenSP;
	private boolean loaiSanPham;
	private String ngayNhapKho;
	private int giaNhapKho;
	private int soLuongTK;

	public ThuocTinhChung(int MaSP, String tenSP, boolean loaiSanPham, String ngayNhapKho, int giaNhapKho, int soLuongTK) {
		this.MaSP = MaSP;
		this.tenSP = tenSP;
		this.loaiSanPham = loaiSanPham;
		this.ngayNhapKho = ngayNhapKho;
		this.giaNhapKho = giaNhapKho;
		this.soLuongTK = soLuongTK;
		
	}
	
	public String ShowInfo() {
		String loaisanpham = "";
		if(loaiSanPham) {
			loaisanpham = "Thực phẩm";
		} else {
			if(loaiSanPham) {
				loaisanpham = "Sành sứ";
			}else {
				loaisanpham = "Điện máy";
			}
			
	    }
		return "Sản Phẩm [ Mã: " + MaSP + ", Tên sản phẩm: " + tenSP + ", Loại sản phẩm: " + loaisanpham + ", Ngày nhập kho: " + ngayNhapKho + ", Giá nhập kho: " + giaNhapKho + ", Số lượng tồn kho: " + soLuongTK;
	}
	
	public String ShowItemInfo() {
		String loaisanpham = "";
		if(loaiSanPham) {
			loaisanpham = "Thực phẩm";
		} else {
			if(loaiSanPham) {
				loaisanpham = "Sành sứ";
			}else {
				loaisanpham = "Điện máy";
			}
			
	    }
		return "Sản Phẩm:\n1. Mã: " + MaSP + "\n2. Tên sản phẩm: " + tenSP + "\n3. Loại sản phẩm: " + loaisanpham + "\n4. Ngày nhập kho: " + ngayNhapKho + "\n5. Giá nhập kho: " + giaNhapKho + "\n6. Số lượng tồn kho: " + soLuongTK;
	}
	
	public int getMaSP() {
		return MaSP;
	}
	public void setMaSP(int maSP) {
		MaSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
		
	public boolean isLoaiSanPham() {
		return loaiSanPham;
	}

	public void setLoaiSanPham(boolean loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}

	public String getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(String ngayNhapKho) {
		this.ngayNhapKho = ngayNhapKho;
	}

	public int getGiaNhapKho() {
		return giaNhapKho;
	}
	public void setGiaNhapKho(int giaNhapKho) {
		this.giaNhapKho = giaNhapKho;
	}
	public int getSoLuongTK() {
		return soLuongTK;
	}
	public void setSoLuongTK(int soLuongTK) {
		this.soLuongTK = soLuongTK;
	}
	
	
}
