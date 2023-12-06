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
				String tenbai,danhmucbv,tomtatbv,noidung,hinhanh,tacgia,trangthaibv;
				Date ngayviet;
				
				id_baiviet = rs.getInt("id_baiviet");
				tenbai = rs.getString("tenbai");
				danhmucbv = rs.getString("danhmucbv");
				tomtatbv = rs.getString("tomtatbv");
				noidung = rs.getString("noidung");
				hinhanh = rs.getString("hinhanh");
				tacgia = rs.getString("tacgia");
				ngayviet = rs.getDate("ngayviet");
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
				String tenbai,danhmucbv,tomtatbv,noidung,hinhanh,tacgia,trangthaibv;
				Date ngayviet;
				
				tenbai = rs.getString("tenbai");
				danhmucbv = rs.getString("danhmucbv");
				tomtatbv = rs.getString("tomtatbv");
				noidung = rs.getString("noidung");
				hinhanh = rs.getString("hinhanh");
				tacgia = rs.getString("tacgia");
				ngayviet = rs.getDate("ngayviet");
				trangthaibv = rs.getString("trangthaibv");
				baiviet b = new baiviet(id_baiviet,tenbai,danhmucbv,tomtatbv,noidung,hinhanh,tacgia,ngayviet,trangthaibv);
				
				return b;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
