package dal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.nhanvien;

public class nhanvienDAO extends DBConnect {
	public List<nhanvien>getNhanVienAll(){
		List<nhanvien> list = new ArrayList<>();
		String sql = "SELECT * FROM tbl_nhanvien ORDER BY id_nhanvien LIMIT 8";
	
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int id_nhanvien;
			String tenNV, chuVu, hinhanh, sdt, email, diachi, gioitinh;
			
			while(rs.next()) {
				
				id_nhanvien = rs.getInt("id_nhanvien");
				tenNV =rs.getString("tenNV");
				chuVu = rs.getString("ChuVu");
				hinhanh = rs.getString("hinhanh");
				sdt = rs.getString("sdt");
				email = rs.getString("email");
				diachi = rs.getString("diachi");
				gioitinh = rs.getString("gioitinh");
				nhanvien nv = new nhanvien(id_nhanvien,tenNV, chuVu,hinhanh, sdt, email, diachi, gioitinh);
				list.add(nv);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<nhanvien>getNhanVienAllhome(){
		List<nhanvien> list = new ArrayList<>();
		String sql = "SELECT * FROM tbl_nhanvien ORDER BY id_nhanvien LIMIT 4";
	
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int id_nhanvien;
			String tenNV, chuVu, hinhanh, sdt, email, diachi, gioitinh;
			
			while(rs.next()) {
				
				id_nhanvien = rs.getInt("id_nhanvien");
				tenNV =rs.getString("tenNV");
				chuVu = rs.getString("ChuVu");
				hinhanh = rs.getString("hinhanh");
				sdt = rs.getString("sdt");
				email = rs.getString("email");
				diachi = rs.getString("diachi");
				gioitinh = rs.getString("gioitinh");
				nhanvien nv = new nhanvien(id_nhanvien,tenNV, chuVu,hinhanh, sdt, email, diachi, gioitinh);
				list.add(nv);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<nhanvien>getNhanVienAll2(){
		List<nhanvien> list = new ArrayList<>();
		String sql = "SELECT * FROM tbl_nhanvien ";
	
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int id_nhanvien;
			String tenNV, chuVu, hinhanh, sdt, email, diachi, gioitinh;
			
			while(rs.next()) {
				
				id_nhanvien = rs.getInt("id_nhanvien");
				tenNV =rs.getString("tenNV");
				chuVu = rs.getString("ChuVu");
				hinhanh = rs.getString("hinhanh");
				sdt = rs.getString("sdt");
				email = rs.getString("email");
				diachi = rs.getString("diachi");
				gioitinh = rs.getString("gioitinh");
				nhanvien nv = new nhanvien(id_nhanvien,tenNV, chuVu,hinhanh, sdt, email, diachi, gioitinh);
				list.add(nv);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	// thêm mới nhân viên
	public void insert(nhanvien n) {
		String sql = "INSERT INTO `tbl_nhanvien` (`tenNV`, `ChuVu`, `hinhanh`, `sdt`, `email`, `diachi`, `gioitinh`) "
				+ "VALUES ( ?, ?, ?, ?, ?, ?, ? )";
				
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,n.getTenNV());
			ps.setString(2,n.getChuVu());
			ps.setString(3,n.getHinhanh());
			ps.setString(4,n.getSdt());
			ps.setString(5,n.getEmail());
			ps.setString(6,n.getDiachi());
			ps.setString(7,n.getGioitinh());
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	// xoá
	public void delete(int id_nhanvien) {
		String sql = "DELETE FROM tbl_nhanvien WHERE `tbl_nhanvien`.`id_nhanvien` = ? ";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id_nhanvien);
			ps.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	// lấy thông tin nhân viên theo id
	public nhanvien getNhanVienByid(int id_nhanvien) {
		String sql = "SELECT * FROM tbl_nhanvien where "
				+ "id_nhanvien = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id_nhanvien);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String tenNV, chuVu, hinhanh, sdt, email, diachi, gioitinh;
				tenNV =rs.getString("tenNV");
				chuVu = rs.getString("ChuVu");
				hinhanh = rs.getString("hinhanh");
				sdt = rs.getString("sdt");
				email = rs.getString("email");
				diachi = rs.getString("diachi");
				gioitinh = rs.getString("gioitinh");
				nhanvien n = new nhanvien(id_nhanvien,tenNV, chuVu,hinhanh, sdt, email, diachi, gioitinh);
				return n;
			
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	// sửa
	public void update(nhanvien n) {
		String sql = "UPDATE `tbl_nhanvien` SET `tenNV` = ?, `ChuVU` = ?, `hinhanh` = ?, `sdt` = ?, "
				+ "`email` = ?, `diachi` = ?, `gioitinh` = ? WHERE `tbl_nhanvien`.`id_nhanvien` = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,n.getTenNV());
			ps.setString(2,n.getChuVu());
			ps.setString(3,n.getHinhanh());
			ps.setString(4,n.getSdt());
			ps.setString(5,n.getEmail());
			ps.setString(6,n.getDiachi());
			ps.setString(7,n.getGioitinh());
			ps.setInt(8,n.getId_nhanvien());
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
