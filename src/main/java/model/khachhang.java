package model;

import java.sql.Timestamp;

public class khachhang {
	private int id_khachhang;
	private int id_ban;
	private String tenkhachhang;
	private int songuoi;
	private String sdt;
	private String email;
	private Timestamp tg_datban;
	private String trangthaikh;
	
	public khachhang() {
		
	}
	
	public khachhang(int id_khachhang,int id_ban,String tenkhachhang,int songuoi,String sdt,String email,Timestamp tg_datban,String trangthaikh) {
		this.id_khachhang = id_khachhang;
		this.id_ban = id_ban;
		this.tenkhachhang = tenkhachhang;
		this.songuoi = songuoi;
		this.sdt = sdt;
		this.email = email;
		this.tg_datban = tg_datban;
		this.trangthaikh = trangthaikh;
	}

	public int getId_khachhang() {
		return id_khachhang;
	}

	public void setId_khachhang(int id_khachhang) {
		this.id_khachhang = id_khachhang;
	}

	public int getId_ban() {
		return id_ban;
	}

	public void setId_ban(int id_ban) {
		this.id_ban = id_ban;
	}

	public String getTenkhachhang() {
		return tenkhachhang;
	}

	public void setTenkhachhang(String tenkhachhang) {
		this.tenkhachhang = tenkhachhang;
	}

	public int getSonguoi() {
		return songuoi;
	}

	public void setSonguoi(int songuoi) {
		this.songuoi = songuoi;
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

	public Timestamp getTg_datban() {
		return tg_datban;
	}

	public void setTg_datban(Timestamp tg_datban) {
		this.tg_datban = tg_datban;
	}

	public String getTrangthaikh() {
		return trangthaikh;
	}

	public void setTrangthaikh(String trangthaikh) {
		this.trangthaikh = trangthaikh;
	}

	@Override
	public String toString() {
		return "khachhang [id_khachhang=" + id_khachhang + ", id_ban=" + id_ban + ", tenkhachhang=" + tenkhachhang
				+ ", songuoi=" + songuoi + ", sdt=" + sdt + ", email=" + email + ", tg_datban=" + tg_datban
				+ ", trangthaikh=" + trangthaikh + "]";
	}
	
	
}
