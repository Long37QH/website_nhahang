package model;

public class khachhang {
	private int id_khachhang;
	private int id_ban;
	private String tenkhachhang;
	private int songuoi;
	private String sdt;
	private String email;
	private String tg_datban;
	private String tg_phucvu;
	private String trangthaikh;
	private int tongtien;
	public khachhang() {
		
	}
	
	public khachhang(int id_khachhang,int id_ban,String tenkhachhang,int songuoi,String sdt,String email,String tg_datban,String tg_phucvu,String trangthaikh,int tongtien) {
		this.id_khachhang = id_khachhang;
		this.id_ban = id_ban;
		this.tenkhachhang = tenkhachhang;
		this.songuoi = songuoi;
		this.sdt = sdt;
		this.email = email;
		this.tg_datban = tg_datban;
		this.tg_phucvu = tg_phucvu;
		this.trangthaikh = trangthaikh;
		this.tongtien = tongtien;
	}
	//them dat ban
	public khachhang(int id_ban,String tenkhachhang,int songuoi,String sdt,String email,String tg_datban,String trangthaikh) {
		this.id_ban = id_ban;
		this.tenkhachhang = tenkhachhang;
		this.songuoi = songuoi;
		this.sdt = sdt;
		this.email = email;
		this.tg_datban = tg_datban;
		this.trangthaikh = trangthaikh;
		
	}
	
	
	
	public khachhang(int id_khachhang,int id_ban,String tenkhachhang,int songuoi,String sdt,String email,String tg_phucvu,String trangthaikh) {
		this.id_khachhang = id_khachhang;
		this.id_ban = id_ban;
		this.tenkhachhang = tenkhachhang;
		this.songuoi = songuoi;
		this.sdt = sdt;
		this.email = email;
		this.tg_phucvu = tg_phucvu;
		this.trangthaikh = trangthaikh;
	}
	
	//
	public khachhang(int id_ban,String tenkhachhang,int songuoi,String sdt,String email ,String tg_phucvu,String trangthaikh,int tongtien) {
		this.id_ban = id_ban;
		this.tenkhachhang = tenkhachhang;
		this.songuoi = songuoi;
		this.sdt = sdt;
		this.email = email;
		this.tg_phucvu = tg_phucvu;
		this.trangthaikh = trangthaikh;
		this.tongtien = tongtien;
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

	public String getTg_datban() {
		return tg_datban;
	}

	public void setTg_datban(String tg_datban) {
		this.tg_datban = tg_datban;
	}

	public String getTg_phucvu() {
		return tg_phucvu;
	}

	public void setTg_phucvu(String tg_phucvu) {
		this.tg_phucvu = tg_phucvu;
	}

	public String getTrangthaikh() {
		return trangthaikh;
	}

	public void setTrangthaikh(String trangthaikh) {
		this.trangthaikh = trangthaikh;
	}

	public int getTongtien() {
		return tongtien;
	}

	public void setTongtien(int tongtien) {
		this.tongtien = tongtien;
	}

	@Override
	public String toString() {
		return "khachhang [id_khachhang=" + id_khachhang + ", id_ban=" + id_ban + ", tenkhachhang=" + tenkhachhang
				+ ", songuoi=" + songuoi + ", sdt=" + sdt + ", email=" + email + ", tg_datban=" + tg_datban
				+ ", tg_phucvu=" + tg_phucvu + ", trangthaikh=" + trangthaikh + ", tongtien=" + tongtien + "]";
	}

	
}
