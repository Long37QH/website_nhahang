package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ban;

public class banDAO extends DBConnect {
	public List<ban>getbanAll(){
		List<ban> list = new ArrayList<>();
		String sql = "SELECT * FROM tbl_ban where trangthaiban = \"Trống\";";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int id_ban;
			String vitri ,trangthaiban,anhban;
			while(rs.next()) {
				id_ban = rs.getInt("id_ban");
				vitri = rs.getString("vitri");
				trangthaiban = rs.getString("trangthaiban");
				anhban = rs.getString("anhban");
				ban b = new ban(id_ban,vitri,trangthaiban,anhban);
				list.add(b);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
	}
	
	return list;

}
	public List<ban>getbanAll2(){
		List<ban> list = new ArrayList<>();
		String sql = "SELECT * FROM tbl_ban where `trangthaiban` = 'Trống'; ";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int id_ban;
			String vitri ,trangthaiban,anhban;
			while(rs.next()) {
				id_ban = rs.getInt("id_ban");
				vitri = rs.getString("vitri");
				trangthaiban = rs.getString("trangthaiban");
				anhban = rs.getString("anhban");
				ban b = new ban(id_ban,vitri,trangthaiban,anhban);
				list.add(b);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
	}
	
	return list;

}
	
	public void insert(ban b) {
		String sql = "INSERT INTO `tbl_ban` (`vitri`, `trangthaiban`) "
				+ "VALUES ( ?, ?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,b.getVitri());
			ps.setString(2,b.getTrangthaiban());
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ban getbanBYid(int id_ban){
	String sql = "SELECT * FROM tbl_ban where "
			+ "id_ban = ?";
	try {
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, id_ban);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			String vitri ,trangthaiban,anhban;
			id_ban = rs.getInt("id_ban");
			vitri = rs.getString("vitri");
			trangthaiban = rs.getString("trangthaiban");
			anhban = rs.getString("anhban");
			ban b = new ban(id_ban,vitri,trangthaiban,anhban);
			return b;		
		}		
	}catch(SQLException e) {
		e.printStackTrace();
}
	return null;

}
	public void update(ban b) {
		String sql = "UPDATE `tbl_ban` SET `trangthaiban` = ? where `tbl_ban`.`id_ban` =? ";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,b.getTrangthaiban());
			ps.setInt(2,b.getId_ban());
		
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updatedb(ban b) {
		String sql = "UPDATE `tbl_ban` SET `trangthaiban` = 'Đặt trước bàn' WHERE `tbl_ban`.`id_ban` = ?; ";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setInt(1,b.getId_ban());
		
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void updatedb2(ban b) {
		String sql = "UPDATE `tbl_ban` SET `trangthaiban` = 'Đang phục vụ' WHERE `tbl_ban`.`id_ban` = ?; ";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setInt(1,b.getId_ban());
		
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
