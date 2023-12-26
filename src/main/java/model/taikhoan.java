package model;

public class taikhoan {
	private int id_tk;
	private int id_nhanvien;
	private String tentk;
	private String pass;
	
	public taikhoan() {
		
	}
	public taikhoan(int id_tk,int id_nhanvien,String tentk,String pass) {
		this.id_tk = id_tk;
		this.id_nhanvien = id_nhanvien;
		this.tentk = tentk;
		this.pass = pass;	
	}
	public taikhoan(int id_nhanvien,String tentk,String pass) {
		this.id_nhanvien = id_nhanvien;
		this.tentk = tentk;
		this.pass = pass;	
	}
	
	public int getId_tk() {
		return id_tk;
	}

	public void setId_tk(int id_tk) {
		this.id_tk = id_tk;
	}

	public int getId_nhanvien() {
		return id_nhanvien;
	}

	public void setId_nhanvien(int id_nhanvien) {
		this.id_nhanvien = id_nhanvien;
	}

	public String getTentk() {
		return tentk;
	}

	public void setTentk(String tentk) {
		this.tentk = tentk;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "taikhoan [id_tk=" + id_tk + ", id_nhanvien=" + id_nhanvien + ", tentk=" + tentk + ", pass=" + pass
				+ "]";
	}
	
}
