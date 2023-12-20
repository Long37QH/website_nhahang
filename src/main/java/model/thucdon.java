package model;

public class thucdon {
    private int id;
    private String tenMonAn;
    private int loaiMonAn;
    private String moTaTT;
    private String moTa;
    private int giaMonAn;
    private int giamGia;
    private String hinhAnh;
    private String ngayTao;
    private String ngayCapNhat;
    private boolean monAnPhoBien;
    private boolean hienThiTrangChu;
    private boolean trangThai;
    private int luotThich;

    // Constructors
    public thucdon() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public int getLoaiMonAn() {
        return loaiMonAn;
    }

    public void setLoaiMonAn(int loaiMonAn) {
        this.loaiMonAn = loaiMonAn;
    }

    public String getMoTaTT() {
        return moTaTT;
    }

    public void setMoTaTT(String moTaTT) {
        this.moTaTT = moTaTT;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getGiaMonAn() {
        return giaMonAn;
    }

    public void setGiaMonAn(int giaMonAn) {
        this.giaMonAn = giaMonAn;
    }

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(String ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    public boolean isMonAnPhoBien() {
        return monAnPhoBien;
    }

    public void setMonAnPhoBien(boolean monAnPhoBien) {
        this.monAnPhoBien = monAnPhoBien;
    }

    public boolean isHienThiTrangChu() {
        return hienThiTrangChu;
    }

    public void setHienThiTrangChu(boolean hienThiTrangChu) {
        this.hienThiTrangChu = hienThiTrangChu;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getLuotThich() {
        return luotThich;
    }

    public void setLuotThich(int luotThich) {
        this.luotThich = luotThich;
    }
    public thucdon(String tenMonAn, int loaiMonAn, String moTaTT, String moTa, int giaMonAn, int giamGia,
            String hinhAnh, String ngayTao, String ngayCapNhat, boolean monAnPhoBien,
            boolean hienThiTrangChu, boolean trangThai, int luotThich) {
			 this.tenMonAn = tenMonAn;
			 this.loaiMonAn = loaiMonAn;
			 this.moTaTT = moTaTT;
			 this.moTa = moTa;
			 this.giaMonAn = giaMonAn;
			 this.giamGia = giamGia;
			 this.hinhAnh = hinhAnh;
			 this.ngayTao = ngayTao;
			 this.ngayCapNhat = ngayCapNhat;
			 this.monAnPhoBien = monAnPhoBien;
			 this.hienThiTrangChu = hienThiTrangChu;
			 this.trangThai = trangThai;
			 this.luotThich = luotThich;
}


    public thucdon(int id, String tenMonAn, int loaiMonAn, String moTaTT, String moTa, int giaMonAn, int giamGia,
                   String hinhAnh, String ngayTao, String ngayCapNhat, boolean monAnPhoBien, boolean hienThiTrangChu,
                   boolean trangThai, int luotThich) {
        this.id = id;
        this.tenMonAn = tenMonAn;
        this.loaiMonAn = loaiMonAn;
        this.moTaTT = moTaTT;
        this.moTa = moTa;
        this.giaMonAn = giaMonAn;
        this.giamGia = giamGia;
        this.hinhAnh = hinhAnh;
        this.ngayTao = ngayTao;
        this.ngayCapNhat = ngayCapNhat;
        this.monAnPhoBien = monAnPhoBien;
        this.hienThiTrangChu = hienThiTrangChu;
        this.trangThai = trangThai;
        this.luotThich = luotThich;
    }


    @Override
    public String toString() {
        return "thucdon [id=" + id + ", tenMonAn=" + tenMonAn + ", loaiMonAn=" + loaiMonAn + ", moTaTT=" + moTaTT
                + ", moTa=" + moTa + ", giaMonAn=" + giaMonAn + ", giamGia=" + giamGia + ", hinhAnh=" + hinhAnh
                + ", ngayTao=" + ngayTao + ", ngayCapNhat=" + ngayCapNhat + ", monAnPhoBien=" + monAnPhoBien
                + ", hienThiTrangChu=" + hienThiTrangChu + ", trangThai=" + trangThai + ", luotThich=" + luotThich
                + "]";
    }
}
