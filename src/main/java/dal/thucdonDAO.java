package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.thucdon;

public class thucdonDAO extends DBConnect {

    public List<thucdon> getThucdonAll() {
        List<thucdon> list = new ArrayList<>();
        String sql = "SELECT * FROM tbl_thucdon";
        try (PreparedStatement st = connection.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String tenMonAn = rs.getString("tenMonAn");
                int loaiMonAn = rs.getInt("loaiMonAn");
                String moTaTT = rs.getString("moTaTT");
                String moTa = rs.getString("moTa");
                int giaMonAn = rs.getInt("giaMonAn");
                int giamGia = rs.getInt("giamGia");
                String hinhAnh = rs.getString("hinhAnh");
                String ngayTao = rs.getString("ngayTao");
                String ngayCapNhat = rs.getString("ngayCapNhat");
                boolean monAnPhoBien = rs.getBoolean("monAnPhoBien");
                boolean hienThiTrangChu = rs.getBoolean("hienThiTrangChu");
                boolean trangThai = rs.getBoolean("trangThai");
                int luotThich = rs.getInt("luotThich");

                thucdon td = new thucdon(id, tenMonAn, loaiMonAn, moTaTT, moTa, giaMonAn, giamGia, hinhAnh,
                        ngayTao, ngayCapNhat, monAnPhoBien, hienThiTrangChu, trangThai, luotThich);
                list.add(td);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<thucdon> getThucdonAll2() {
        List<thucdon> list = new ArrayList<>();
        String sql = "SELECT * FROM tbl_thucdon ORDER BY id DESC LIMIT 5";
        try (PreparedStatement st = connection.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String tenMonAn = rs.getString("tenMonAn");
                int loaiMonAn = rs.getInt("loaiMonAn");
                String moTaTT = rs.getString("moTaTT");
                String moTa = rs.getString("moTa");
                int giaMonAn = rs.getInt("giaMonAn");
                int giamGia = rs.getInt("giamGia");
                String hinhAnh = rs.getString("hinhAnh");
                String ngayTao = rs.getString("ngayTao");
                String ngayCapNhat = rs.getString("ngayCapNhat");
                boolean monAnPhoBien = rs.getBoolean("monAnPhoBien");
                boolean hienThiTrangChu = rs.getBoolean("hienThiTrangChu");
                boolean trangThai = rs.getBoolean("trangThai");
                int luotThich = rs.getInt("luotThich");

                thucdon td = new thucdon(id, tenMonAn, loaiMonAn, moTaTT, moTa, giaMonAn, giamGia, hinhAnh,
                        ngayTao, ngayCapNhat, monAnPhoBien, hienThiTrangChu, trangThai, luotThich);
                list.add(td);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void delete(int id_thucdon) {
        try {
            String sql = "DELETE FROM tbl_thucdon WHERE id = ?";
            
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id_thucdon);

                // Thực hiện truy vấn xóa
                int rowsAffected = statement.executeUpdate();

                // Kiểm tra xem có dòng nào bị ảnh hưởng không
                if (rowsAffected > 0) {
                    System.out.println("Đã xóa thành công thực đơn có ID: " + id_thucdon);
                } else {
                    System.out.println("Không có thực đơn nào được xóa với ID: " + id_thucdon);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void insert(thucdon td) {
        try {
            String sql = "INSERT INTO tbl_thucdon (tenMonAn, loaiMonAn, moTaTT, moTa, giaMonAn, giamGia, hinhAnh, ngayTao, ngayCapNhat, monAnPhoBien, hienThiTrangChu, trangThai, luotThich) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, td.getTenMonAn());
                statement.setInt(2, td.getLoaiMonAn());
                statement.setString(3, td.getMoTaTT());
                statement.setString(4, td.getMoTa());
                statement.setInt(5, td.getGiaMonAn());
                statement.setInt(6, td.getGiamGia());
                statement.setString(7, td.getHinhAnh());
                statement.setString(8, td.getNgayTao());
                statement.setString(9, td.getNgayCapNhat());
                statement.setBoolean(10, td.isMonAnPhoBien());
                statement.setBoolean(11, td.isHienThiTrangChu());
                statement.setBoolean(12, td.isTrangThai());
                statement.setInt(13, td.getLuotThich());

                // Thực hiện truy vấn thêm mới
                int rowsAffected = statement.executeUpdate();

                // Kiểm tra xem có dòng nào bị ảnh hưởng không
                if (rowsAffected > 0) {
                    System.out.println("Đã thêm mới thực đơn thành công");
                } else {
                    System.out.println("Không có thực đơn nào được thêm mới");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public thucdon getThuDonById(int id) {
        thucdon td = null;
        String sql = "SELECT * FROM tbl_thucdon WHERE id = ?";
        try (PreparedStatement st = connection.prepareStatement(sql)) {
            st.setInt(1, id);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    // Extract data from the result set
                    String tenMonAn = rs.getString("tenMonAn");
                    int loaiMonAn = rs.getInt("loaiMonAn");
                    String moTaTT = rs.getString("moTaTT");
                    String moTa = rs.getString("moTa");
                    int giaMonAn = rs.getInt("giaMonAn");
                    int giamGia = rs.getInt("giamGia");
                    String hinhAnh = rs.getString("hinhAnh");
                    String ngayTao = rs.getString("ngayTao");
                    String ngayCapNhat = rs.getString("ngayCapNhat");
                    boolean monAnPhoBien = rs.getBoolean("monAnPhoBien");
                    boolean hienThiTrangChu = rs.getBoolean("hienThiTrangChu");
                    boolean trangThai = rs.getBoolean("trangThai");
                    int luotThich = rs.getInt("luotThich");

                    // Create a thucdon object
                    td = new thucdon(id, tenMonAn, loaiMonAn, moTaTT, moTa, giaMonAn, giamGia, hinhAnh,
                            ngayTao, ngayCapNhat, monAnPhoBien, hienThiTrangChu, trangThai, luotThich);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return td;
    }
    public void update(thucdon td) {
        try {
            String sql = "UPDATE tbl_thucdon SET tenMonAn=?, loaiMonAn=?, moTaTT=?, moTa=?, giaMonAn=?, giamGia=?, "
                    + "hinhAnh=?, ngayTao=?, ngayCapNhat=?, monAnPhoBien=?, hienThiTrangChu=?, trangThai=?, luotThich=? WHERE id=?";
            
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, td.getTenMonAn());
                statement.setInt(2, td.getLoaiMonAn());
                statement.setString(3, td.getMoTaTT());
                statement.setString(4, td.getMoTa());
                statement.setInt(5, td.getGiaMonAn());
                statement.setInt(6, td.getGiamGia());
                statement.setString(7, td.getHinhAnh());
                statement.setString(8, td.getNgayTao());
                statement.setString(9, td.getNgayCapNhat());
                statement.setBoolean(10, td.isMonAnPhoBien());
                statement.setBoolean(11, td.isHienThiTrangChu());
                statement.setBoolean(12, td.isTrangThai());
                statement.setInt(13, td.getLuotThich());
                statement.setInt(14, td.getId()); // Đảm bảo thiết lập ID cho điều kiện WHERE

                // Thực hiện truy vấn cập nhật
                int rowsAffected = statement.executeUpdate();

                // Kiểm tra xem có dòng nào bị ảnh hưởng không
                if (rowsAffected > 0) {
                    System.out.println("Đã cập nhật thành công thực đơn có ID: " + td.getId());
                } else {
                    System.out.println("Không có thực đơn nào được cập nhật với ID: " + td.getId());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
