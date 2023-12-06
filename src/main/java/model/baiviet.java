package model;
import java.sql.Date;

public class baiviet {
	private int id_baiviet;
	private String tenbai;
	private String danhmucbv;
	private String tomtatbv;
	private String noidung;
	private String hinhanh;
	private String tacgia;
	private Date ngayviet;
	private String trangthaibv;
	
	public baiviet() {
		
	}
	
	public baiviet(int id_baiviet,String tenbai,String danhmucbv,String tomtatbv,String noidung,String hinhanh,String tacgia,Date ngayviet,String trangthaibv) {
		this.id_baiviet = id_baiviet;
		this.tenbai = tenbai;
		this.danhmucbv = danhmucbv;
		this.tomtatbv = tomtatbv;
		this.noidung = noidung;
		this.hinhanh = hinhanh;
		this.tacgia = tacgia;
		this.ngayviet = ngayviet;
		this.trangthaibv = trangthaibv;
	}
	
	public int getId_baiviet() {
		return id_baiviet;
	}
	public void setId_baiviet(int id_baiviet) {
		this.id_baiviet = id_baiviet;
	}
	public String getTenbai() {
		return tenbai;
	}
	public void setTenbai(String tenbai) {
		this.tenbai = tenbai;
	}
	public String getDanhmucbv() {
		return danhmucbv;
	}
	public void setDanhmucbv(String danhmucbv) {
		this.danhmucbv = danhmucbv;
	}
	public String getTomtatbv() {
		return tomtatbv;
	}
	public void setTomtatbv(String tomtatbv) {
		this.tomtatbv = tomtatbv;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	public String getTacgia() {
		return tacgia;
	}
	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}
	public Date getNgayviet() {
		return ngayviet;
	}
	public void setNgayviet(Date ngayviet) {
		this.ngayviet = ngayviet;
	}
	public String getTrangthaibv() {
		return trangthaibv;
	}
	public void setTrangthaibv(String trangthaibv) {
		this.trangthaibv = trangthaibv;
	}

	@Override
	public String toString() {
		return "baiviet [id_baiviet=" + id_baiviet + ", tenbai=" + tenbai + ", danhmucbv=" + danhmucbv + ", tomtatbv="
				+ tomtatbv + ", noidung=" + noidung + ", hinhanh=" + hinhanh + ", tacgia=" + tacgia + ", ngayviet="
				+ ngayviet + ", trangthaibv=" + trangthaibv + "]";
	}
	
	
	
}
