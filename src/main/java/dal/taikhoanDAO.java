package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.taikhoan;

public class taikhoanDAO extends DBConnect{
	public List<taikhoan> getTaikhoanAll(){
		List<taikhoan> listtaikhoan = new ArrayList<>();
		String sql = "SELECT * FROM tbl_taikhoan;";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id_tk,id_nhanvien;
				String tentk,pass;
				
				id_tk = rs.getInt("id_tk");
				id_nhanvien = rs.getInt("id_nhanvien");
				tentk = rs.getString("tentk");
				pass = rs.getString("pass");
				
				taikhoan t = new taikhoan(id_tk,id_nhanvien,tentk,pass);
				listtaikhoan.add(t);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listtaikhoan;
	}
	
	public taikhoan checktk (String tentk, String pass) {
		String sql = "SELECT * FROM tbl_taikhoan where tentk = ? and pass = ?;";
		try {
			PreparedStatement st = connection.prepareStatement(sql);
			st.setString(1, tentk);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				taikhoan tk = new taikhoan(rs.getInt("id_tk"),rs.getInt("id_nhanvien"),rs.getString("tentk"),rs.getString("pass"));
				return tk;
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
		return null ;
	}
	
	public taikhoan getTaikhoanById(int id) {
		String sql = "SELECT * FROM tbl_taikhoan where id_tk = ? ;";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int id_nhanvien ;
				String tentk,pass;
				id_nhanvien = rs.getInt("id_nhanvien");
				tentk = rs.getString("tentk");
				pass = rs.getString("pass");
				taikhoan tk = new taikhoan(id,id_nhanvien,tentk,pass);
				return tk;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public void insert(taikhoan tk) {
		String sql = "INSERT INTO `tbl_taikhoan` (`id_nhanvien`, `tentk`, `pass`) VALUES (?, ?, ?);";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1,tk.getId_nhanvien());
			ps.setString(2, tk.getTentk());
			ps.setString(3, tk.getPass());
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(taikhoan tk) {
		String sql = "UPDATE `tbl_taikhoan` SET `id_nhanvien` = ?,"
				+ " `tentk` = ?, `pass` = ? WHERE (`id_tk` = ?);";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1,tk.getId_nhanvien());
			ps.setString(2, tk.getTentk());
			ps.setString(3, tk.getPass());
			ps.setInt(4,tk.getId_tk());
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int id_tk) {
		String sql = "DELETE FROM `tbl_taikhoan` WHERE (`id_tk` = ?); ";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id_tk);
			ps.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}
