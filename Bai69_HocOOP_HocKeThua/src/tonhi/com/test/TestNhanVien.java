package tonhi.com.test;

import tonhi.com.model.NhanVienChinhThuc;
import tonhi.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVienChinhThuc teo = new NhanVienChinhThuc(1,"Nguyễn Văn Tèo");
		NhanVienThoiVu ty = new NhanVienThoiVu(2,"Trần Thị Tý");
		teo.tinhLuong();
		ty.tinhLuong();
	}

}
