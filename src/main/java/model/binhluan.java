package model;

public class binhluan {
	private int id_binhluan;
	private String tennbl;
	private String noidungbl;
	private String tg_binhluan;
	private String email;
	public binhluan(){
			
	}
	public binhluan(int id_binhluan,String tennbl,String noidungbl,String tg_binhluan,String email){
		this.id_binhluan = id_binhluan;
		this.tennbl = tennbl;
		this.noidungbl = noidungbl;
		this.tg_binhluan = tg_binhluan;
		this.tg_binhluan = email;
	}
	public binhluan(String tennbl,String noidungbl,String tg_binhluan,String email){	
		this.tennbl = tennbl;
		this.noidungbl = noidungbl;
		this.tg_binhluan = tg_binhluan;
		this.email = email;
	}
	
	public int getId_binhluan() {
		return id_binhluan;
	}
	public void setId_binhluan(int id_binhluan) {
		this.id_binhluan = id_binhluan;
	}
	public String getTennbl() {
		return tennbl;
	}
	public void setTennbl(String tennbl) {
		this.tennbl = tennbl;
	}
	public String getNoidungbl() {
		return noidungbl;
	}
	public void setNoidungbl(String noidungbl) {
		this.noidungbl = noidungbl;
	}
	public String getTg_binhluan() {
		return tg_binhluan;
	}
	public void setTg_binhluan(String tg_binhluan) {
		this.tg_binhluan = tg_binhluan;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "binhluan [id_binhluan=" + id_binhluan + ", tennbl=" + tennbl + ", noidungbl=" + noidungbl
				+ ", tg_binhluan=" + tg_binhluan + ", email=" + email + "]";
	}
	
	
}
