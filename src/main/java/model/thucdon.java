package model;

public class thucdon {
	private int id_mon;
	private String tenmon;
	private String hinhanh;
	private String mota;
	private int phanloai;
	private float gia;
	private String trangthaiMA;
	
	public thucdon() {
		
	}
	public thucdon(int id_mon,String tenmon,String hinhanh,String mota,int phanloai,float gia,String trangthaiMA) {
		this.id_mon = id_mon;
		this.tenmon = tenmon;
		this.hinhanh = hinhanh;
		this.mota = mota;
		this.phanloai = phanloai;
		this.gia = gia;
		this.trangthaiMA = trangthaiMA;
	}
	

	public int getId_mon() {
		return id_mon;
	}

	public void setId_mon(int id_mon) {
		this.id_mon = id_mon;
	}

	public String getTenmon() {
		return tenmon;
	}

	public void setTenmon(String tenmon) {
		this.tenmon = tenmon;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public int getPhanloai() {
		return phanloai;
	}

	public void setPhanloai(int phanloai) {
		this.phanloai = phanloai;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public String getTrangthaiMA() {
		return trangthaiMA;
	}

	public void setTrangthaiMA(String trangthaiMA) {
		this.trangthaiMA = trangthaiMA;
	}
	@Override
	public String toString() {
		return "thucdon [id_mon=" + id_mon + ", tenmon=" + tenmon + ", hinhanh=" + hinhanh + ", mota=" + mota
				+ ", phanloai=" + phanloai + ", gia=" + gia + ", trangthaiMA=" + trangthaiMA + "]";
	}
	
}
