package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.slide;

public class slideDAO extends DBConnect{
	public List<slide> getSlideAll(){
		List<slide> listslide = new ArrayList<>();
		String sql = "SELECT * FROM tbl_slide where trangthai_slide = 'Hiển thị'";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id_slide;
				String tieude,noidung,hinhanh,trangthai_slide;
				
				id_slide = rs.getInt("id_slide");
				tieude = rs.getString("tieude");
				noidung = rs.getString("noidung");
				hinhanh = rs.getString("hinhanh");
				trangthai_slide = rs.getString("trangthai_slide");
				
				slide s = new slide(id_slide,tieude,noidung,hinhanh,trangthai_slide);
				listslide.add(s);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listslide;
	}
	
	public List<slide> getSlideAll2(){
		List<slide> listslide = new ArrayList<>();
		String sql = "SELECT * FROM tbl_slide";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id_slide;
				String tieude,noidung,hinhanh,trangthai_slide;
				
				id_slide = rs.getInt("id_slide");
				tieude = rs.getString("tieude");
				noidung = rs.getString("noidung");
				hinhanh = rs.getString("hinhanh");
				trangthai_slide = rs.getString("trangthai_slide");
				
				slide s = new slide(id_slide,tieude,noidung,hinhanh,trangthai_slide);
				listslide.add(s);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listslide;
	}
	
	public slide  getSlideById(int id) {
		String sql = "SELECT * FROM `tbl_slide` WHERE id_slide = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String tieude, noidung ,hinhanh,trangthai_slide;
				tieude = rs.getString("tieude");
				noidung = rs.getString("noidung");
				hinhanh = rs.getString("hinhanh");
				trangthai_slide = rs.getString("trangthai_slide");
				slide s = new slide(id,tieude, noidung ,hinhanh,trangthai_slide);
				return s;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	
//	them mới slide
	public void insert(slide sl) {
		String sql = "INSERT INTO `tbl_slide` (`tieude`, `noidung`, `hinhanh`, `trangthai_slide`) "
				+ "VALUES (?, ?, ?, ?);";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, sl.getTieude());
			ps.setString(2, sl.getNoidung());
			ps.setString(3, sl.getHinhanh());
			ps.setString(4, sl.getTrangthai_slide());
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(slide sl) {
		String sql = "UPDATE `tbl_slide` SET `tieude` = ?, "
				+ "`noidung` = ?, `hinhanh` = ?, `trangthai_slide` = ? "
				+ "WHERE (`id_slide` = ?);";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, sl.getTieude());
			ps.setString(2, sl.getNoidung());
			ps.setString(3, sl.getHinhanh());
			ps.setString(4, sl.getTrangthai_slide());
			ps.setInt(5, sl.getId_slide());
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int id_slide) {
		String sql = "DELETE FROM `tbl_slide` WHERE (`id_slide` = ?); ";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id_slide);
			ps.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}
