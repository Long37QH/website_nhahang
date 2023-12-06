package model;

public class danhmuc {
	private int id_danhmuc;
	private String tendanhmuc;
	private int cap;
	private int vitri;
	private String link;
	private String trangthaiAH;
	
	public danhmuc() {
			
	}
	
	public danhmuc(int id_danhmuc,String tendanhmuc,int cap,int vitri,String link,String trangthaiAH) {
		this.id_danhmuc = id_danhmuc;
		this.tendanhmuc = tendanhmuc;
		this.cap = cap;
		this.vitri = vitri;
		this.link = link;
		this.trangthaiAH = trangthaiAH;
	}
	
	public int getId_danhmuc() {
		return id_danhmuc;
	}
	public void setId_danhmuc(int id_danhmuc) {
		this.id_danhmuc = id_danhmuc;
	}
	public String getTendanhmuc() {
		return tendanhmuc;
	}
	public void setTendanhmuc(String tendanhmuc) {
		this.tendanhmuc = tendanhmuc;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	public int getVitri() {
		return vitri;
	}
	public void setVitri(int vitri) {
		this.vitri = vitri;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getTrangthaiAH() {
		return trangthaiAH;
	}
	public void setTrangthaiAH(String trangthaiAH) {
		this.trangthaiAH = trangthaiAH;
	}
	@Override
	public String toString() {
		return "danhmuc [id_danhmuc=" + id_danhmuc + ", tendanhmuc=" + tendanhmuc + ", cap=" + cap + ", vitri=" + vitri
				+ ", link=" + link + ", trangthaiAH=" + trangthaiAH + "]";
	}
	
}
