package Problem1;

public class SanhSu extends ThuocTinhChung {
    
    public SanhSu(int MaSP, String tenSP, boolean loaiSanPham, String ngayNhapKho, int giaNhapKho, int soLuongTK) {
		super(MaSP, tenSP, loaiSanPham, ngayNhapKho, giaNhapKho, soLuongTK);//SUPER: BIẾN THAM CHIẾU
	}
	
	@Override//GHI ĐÈ PHƯƠNG THỨC
	public String ShowInfo() {
		return super.ShowInfo();
	}

	@Override//GHI ĐÈ PHƯƠNG THỨC
	public String ShowItemInfo() {
		return super.ShowItemInfo();
	}


}
