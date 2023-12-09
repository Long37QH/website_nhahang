package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.baiviet;

public class baivietDAO extends DBConnect{
	public List<baiviet> getBaiVietAll(){
		List<baiviet> listbv = new ArrayList<>();
		String sql = "SELECT * FROM tbl_baiviet where trangthaibv = 'Hiển thị' ORDER BY id_baiviet DESC LIMIT 6";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id_baiviet;
				String tenbai,danhmucbv,tomtatbv,noidung,hinhanh,tacgia,trangthaibv,ngayviet;
				
				
				id_baiviet = rs.getInt("id_baiviet");
				tenbai = rs.getString("tenbai");
				danhmucbv = rs.getString("danhmucbv");
				tomtatbv = rs.getString("tomtatbv");
				noidung = rs.getString("noidung");
				hinhanh = rs.getString("hinhanh");
				tacgia = rs.getString("tacgia");
				ngayviet = rs.getString("ngayviet");
				trangthaibv = rs.getString("trangthaibv");
				
				baiviet b = new baiviet(id_baiviet,tenbai,danhmucbv,tomtatbv,noidung,hinhanh,tacgia,ngayviet,trangthaibv);
				listbv.add(b);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listbv;
	}
	public List<baiviet> getBaiVietAll2(){
		List<baiviet> listbv = new ArrayList<>();
		String sql = "SELECT * FROM tbl_baiviet ORDER BY id_baiviet DESC";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id_baiviet;
				String tenbai,danhmucbv,tomtatbv,noidung,hinhanh,tacgia,trangthaibv,ngayviet;
				
				
				id_baiviet = rs.getInt("id_baiviet");
				tenbai = rs.getString("tenbai");
				danhmucbv = rs.getString("danhmucbv");
				tomtatbv = rs.getString("tomtatbv");
				noidung = rs.getString("noidung");
				hinhanh = rs.getString("hinhanh");
				tacgia = rs.getString("tacgia");
				ngayviet = rs.getString("ngayviet");
				trangthaibv = rs.getString("trangthaibv");
				
				baiviet b = new baiviet(id_baiviet,tenbai,danhmucbv,tomtatbv,noidung,hinhanh,tacgia,ngayviet,trangthaibv);
				listbv.add(b);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listbv;
	}
	public baiviet getBaiVietById(int id_baiviet) {
		String sql = "SELECT * FROM tbl_baiviet where "
				+ "id_baiviet = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id_baiviet);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String tenbai,danhmucbv,tomtatbv,noidung,hinhanh,tacgia,trangthaibv,ngayviet;
				
				
				tenbai = rs.getString("tenbai");
				danhmucbv = rs.getString("danhmucbv");
				tomtatbv = rs.getString("tomtatbv");
				noidung = rs.getString("noidung");
				hinhanh = rs.getString("hinhanh");
				tacgia = rs.getString("tacgia");
				ngayviet = rs.getString("ngayviet");
				trangthaibv = rs.getString("trangthaibv");
				baiviet b = new baiviet(id_baiviet,tenbai,danhmucbv,tomtatbv,noidung,hinhanh,tacgia,ngayviet,trangthaibv);
				
				return b;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//	Thêm mới dữ liệu
	public void insert(baiviet b) {
		String sql = "INSERT INTO `tbl_baiviet` (`tenbai`, `danhmucbv`, `tomtatbv`, `noidung`, `hinhanh`, `tacgia`, `ngayviet`, `trangthaibv`) "
				+ "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, b.getTenbai());
			ps.setString(2, b.getDanhmucbv());
			ps.setString(3, b.getTomtatbv());
			ps.setString(4, b.getNoidung());
			ps.setString(5, b.getHinhanh());
			ps.setString(6, b.getTacgia());
			ps.setString(7, b.getNgayviet());
			ps.setString(8, b.getTrangthaibv());
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//sua du lieu
	public void update(baiviet b) {
		String sql = "UPDATE `tbl_baiviet` SET `tenbai` = ?, `danhmucbv` = ?, `tomtatbv` = ?, `noidung` = ?, "
				+ "`hinhanh` = ?, `tacgia` = ?, `ngayviet` = ?, `trangthaibv` = ? WHERE `tbl_baiviet`.`id_baiviet` = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, b.getTenbai());
			ps.setString(2, b.getDanhmucbv());
			ps.setString(3, b.getTomtatbv());
			ps.setString(4, b.getNoidung());
			ps.setString(5, b.getHinhanh());
			ps.setString(6, b.getTacgia());
			ps.setString(7, b.getNgayviet());
			ps.setString(8, b.getTrangthaibv());
			ps.setInt(9, b.getId_baiviet());
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//xoa bai viet
	public void delete(int id_baiviet) {
		String sql = "DELETE FROM tbl_baiviet WHERE `tbl_baiviet`.`id_baiviet` = ? ";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id_baiviet);
			ps.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}
