
public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;
	
	public String getTenLoaiCaPhe() {
		return tenLoaiCaPhe;
	}
	public void setTenLoaiCaPhe(String tenLoaiCaPhe) {
		this.tenLoaiCaPhe = tenLoaiCaPhe;
	}
	public double getGiaTien1Kg() {
		return giaTien1Kg;
	}
	public void setGiaTien1Kg(double giaTien1Kg) {
		this.giaTien1Kg = giaTien1Kg;
	}
	public double getKhoiLuong() {
		return khoiLuong;
	}
	public void setKhoiLuong(double khoiLuong) {
		if(khoiLuong > 0)
			this.khoiLuong = khoiLuong;
	}
	public HoaDonCaPhe(String tenLoaiCaPhe, double giaTien1Kg, double khoiLuong) {
		this.tenLoaiCaPhe = tenLoaiCaPhe;
		this.giaTien1Kg = giaTien1Kg;
		this.khoiLuong = khoiLuong;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.tenLoaiCaPhe + " - " + this.giaTien1Kg  + " + " + this.khoiLuong;
		
	}
	
	
}
