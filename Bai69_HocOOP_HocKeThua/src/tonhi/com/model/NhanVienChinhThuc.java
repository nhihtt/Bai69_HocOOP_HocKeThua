package tonhi.com.model;

public class NhanVienChinhThuc extends NhanVien {
	
	public NhanVienChinhThuc() {
		super();
	}
	public NhanVienChinhThuc(int ma,String ten) {
		super(ma,ten);
	}
	public void tinhLuong() {
		// TODO Auto-generated method stub
		super.tinhLuong();
		System.out.println("Đây là nhân viên chính thức");
	}
}
