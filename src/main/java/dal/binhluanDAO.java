package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.binhluan;

public class binhluanDAO extends DBConnect {
	public List<binhluan> getAllBinhluan(){
		List<binhluan> listbinhluan = new ArrayList<>();
		String sql = "SELECT * FROM tbl_binhluan ORDER BY id_binhluan DESC LIMIT 5";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id_binhluan;
				String tennbl,noidungbl,tg_binhluan,email;
				
				id_binhluan = rs.getInt(1);
				tennbl = rs.getString(2);
				noidungbl = rs.getString(3);
				tg_binhluan = rs.getString(4);
				email = rs.getString(5);
				
				binhluan b = new binhluan(id_binhluan,tennbl,noidungbl,tg_binhluan,email);
				listbinhluan.add(b);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listbinhluan;
	}
	
	public void insert(binhluan bl) {
		String sql = "INSERT INTO `tbl_binhluan` (`tennbl`, `noidungbl`, `tg_binhluan`, `email`) "
				+ "VALUES (?, ?, ?, ?);";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,bl.getTennbl());
			ps.setString(2,bl.getNoidungbl());
			ps.setString(3,bl.getTg_binhluan());
			ps.setString(4,bl.getEmail());
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
