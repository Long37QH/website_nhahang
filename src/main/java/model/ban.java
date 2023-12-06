package model;

public class ban {
	private int id_ban;
	private String vitri;
	private String trangthaiban;
	
	public ban() {
		
	}
	public ban(int id_ban,String vitri,String trangthaiban) {
		this.id_ban = id_ban;
		this.vitri = vitri;
		this.trangthaiban = trangthaiban;
	}

	public int getId_ban() {
		return id_ban;
	}

	public void setId_ban(int id_ban) {
		this.id_ban = id_ban;
	}

	public String getVitri() {
		return vitri;
	}

	public void setVitri(String vitri) {
		this.vitri = vitri;
	}

	public String getTrangthaiban() {
		return trangthaiban;
	}

	public void setTrangthaiban(String trangthaiban) {
		this.trangthaiban = trangthaiban;
	}
	@Override
	public String toString() {
		return "ban [id_ban=" + id_ban + ", vitri=" + vitri + ", trangthaiban=" + trangthaiban + "]";
	}
	
	
}
