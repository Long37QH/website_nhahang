package model;

public class slide {
	private int id_slide;
	private String tieude;
	private String noidung;
	private String hinhanh;
	private String trangthai_slide;
	
	public slide() {
		
	}
	public slide(int id_slide,String tieude,String noidung,String hinhanh,String trangthai_slide) {
		this.id_slide = id_slide;
		this.tieude = tieude;
		this.noidung = noidung;
		this.hinhanh = hinhanh;
		this.trangthai_slide = trangthai_slide;
	}
	public slide(String tieude,String noidung,String hinhanh,String trangthai_slide) {
		this.tieude = tieude;
		this.noidung = noidung;
		this.hinhanh = hinhanh;
		this.trangthai_slide = trangthai_slide;
	}

	public int getId_slide() {
		return id_slide;
	}

	public void setId_slide(int id_slide) {
		this.id_slide = id_slide;
	}

	public String getTieude() {
		return tieude;
	}

	public void setTieude(String tieude) {
		this.tieude = tieude;
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

	public String getTrangthai_slide() {
		return trangthai_slide;
	}

	public void setTrangthai_slide(String trangthai_slide) {
		this.trangthai_slide = trangthai_slide;
	}
	@Override
	public String toString() {
		return "slide [id_slide=" + id_slide + ", tieude=" + tieude + ", noidung=" + noidung + ", hinhanh=" + hinhanh
				+ ", trangthai_slide=" + trangthai_slide + "]";
	}
	
}
