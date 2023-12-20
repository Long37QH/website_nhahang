package model;

public class nhanvien {
	private int id_nhanvien;
	private String tenNV;
	private String ChuVu;
	private String hinhanh;
	private String sdt;
	private String email;
	private String diachi;
	private String gioitinh;
	
	public nhanvien() {
		
	}
	
	public nhanvien(int id_nhanvien,String tenNV,String ChuVu,String hinhanh,String sdt,String email,String diachi,String gioitinh) {
		this.id_nhanvien = id_nhanvien;
		this.tenNV = tenNV;
		this.ChuVu = ChuVu;
		this.hinhanh = hinhanh;
		this.sdt = sdt;
		this.email = email;
		this.diachi = diachi;
		this.gioitinh = gioitinh;
	}
	public nhanvien(String tenNV,String ChuVu,String hinhanh,String sdt,String email,String diachi,String gioitinh) {
		this.tenNV = tenNV;
		this.ChuVu = ChuVu;
		this.hinhanh = hinhanh;
		this.sdt = sdt;
		this.email = email;
		this.diachi = diachi;
		this.gioitinh = gioitinh;
	}

	public int getId_nhanvien() {
		return id_nhanvien;
	}

	public void setId_nhanvien(int id_nhanvien) {
		this.id_nhanvien = id_nhanvien;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getChuVu() {
		return ChuVu;
	}

	public void setChuVu(String chuVu) {
		ChuVu = chuVu;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	@Override
	public String toString() {
		return "nhanvien [id_nhanvien=" + id_nhanvien + ", tenNV=" + tenNV + ", ChuVu=" + ChuVu + ", hinhanh=" + hinhanh
				+ ", sdt=" + sdt + ", email=" + email + ", diachi=" + diachi + ", gioitinh=" + gioitinh + "]";
	}
	
	
}
