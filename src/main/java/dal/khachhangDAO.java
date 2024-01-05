 package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.khachhang;

public class khachhangDAO extends DBConnect{
	public List<khachhang> getKhachhangAll(){
		List<khachhang> listkh = new ArrayList<>();
		String sql = "SELECT * FROM tbl_khachhang;";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id_khachhang,id_ban,songuoi,tongtien;
				String tenkhachhang,sdt,email,tg_datban,tg_phucvu,trangthaikh;
				
				id_khachhang = rs.getInt("id_khachhang");
				id_ban = rs.getInt("id_ban");
				tenkhachhang = rs.getString("tenkhachhang");
				songuoi = rs.getInt("songuoi");
				sdt = rs.getString("sdt");
				email = rs.getString("email");
				tg_datban = rs.getString("tg_datban");
				tg_phucvu = rs.getString("tg_phucvu");
				trangthaikh = rs.getString("trangthaikh");
				tongtien = rs.getInt("tongtien");
				khachhang kh = new khachhang(id_khachhang,id_ban, tenkhachhang, songuoi, sdt, email, tg_datban, tg_phucvu, trangthaikh,tongtien);
				listkh.add(kh);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listkh;
	}
	
	// danh sach khách đặt trước
	public List<khachhang> getKhachhangDatban(){
		List<khachhang> listkh = new ArrayList<>();
		String sql = "SELECT * FROM tbl_khachhang where trangthaikh = 'Đặt trước bàn';";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id_khachhang,id_ban,songuoi,tongtien;
				String tenkhachhang,sdt,email,tg_datban,tg_phucvu,trangthaikh;
				
				id_khachhang = rs.getInt("id_khachhang");
				id_ban = rs.getInt("id_ban");
				tenkhachhang = rs.getString("tenkhachhang");
				songuoi = rs.getInt("songuoi");
				sdt = rs.getString("sdt");
				email = rs.getString("email");
				tg_datban = rs.getString("tg_datban");
				tg_phucvu = rs.getString("tg_phucvu");
				trangthaikh = rs.getString("trangthaikh");
				tongtien = rs.getInt("tongtien");
				khachhang kh = new khachhang(id_khachhang,id_ban, tenkhachhang, songuoi, sdt, email, tg_datban, tg_phucvu, trangthaikh,tongtien);
				listkh.add(kh);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listkh;
	}
	
	// danh sach khách đang được phục vụ
		public List<khachhang> getKhachhangpv(){
			List<khachhang> listkh = new ArrayList<>();
			String sql = "SELECT * FROM tbl_khachhang where trangthaikh = 'Đang phục vụ';";
			try {
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					int id_khachhang,id_ban,songuoi,tongtien;
					String tenkhachhang,sdt,email,tg_datban,tg_phucvu,trangthaikh;
					
					id_khachhang = rs.getInt("id_khachhang");
					id_ban = rs.getInt("id_ban");
					tenkhachhang = rs.getString("tenkhachhang");
					songuoi = rs.getInt("songuoi");
					sdt = rs.getString("sdt");
					email = rs.getString("email");
					tg_datban = rs.getString("tg_datban");
					tg_phucvu = rs.getString("tg_phucvu");
					trangthaikh = rs.getString("trangthaikh");
					tongtien = rs.getInt("tongtien");
					khachhang kh = new khachhang(id_khachhang,id_ban, tenkhachhang, songuoi, sdt, email, tg_datban, tg_phucvu, trangthaikh,tongtien);
					listkh.add(kh);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return listkh;
		}
	
	// 
	public khachhang getKhachHangById(int id) {
		String sql = "SELECT * FROM tbl_khachhang where id_khachhang = ?;";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				
				int id_ban ,songuoi,tongtien;
				String tenkhachhang,sdt,email,tg_datban,tg_phucvu,trangthaikh;
				id_ban = rs.getInt("id_ban");
				tenkhachhang = rs.getString("tenkhachhang");
				songuoi = rs.getInt("songuoi");
				sdt = rs.getString("sdt");
				email = rs.getString("email");
				tg_datban = rs.getString("tg_datban");
				tg_phucvu = rs.getString("tg_phucvu");
				trangthaikh = rs.getString("trangthaikh");
				tongtien = rs.getInt("tongtien");
				
				khachhang kh = new khachhang(id,id_ban,tenkhachhang,songuoi,sdt,email,tg_datban,tg_phucvu,trangthaikh,tongtien);
				return kh;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void insert(khachhang kh) {
		String sql = "INSERT INTO `tbl_khachhang` (`id_ban`, `tenkhachhang`, `songuoi`, `sdt`, `email`, `tg_datban`, `trangthaikh`) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, kh.getId_ban());
			ps.setString(2,kh.getTenkhachhang());
			ps.setInt(3, kh.getSonguoi());
			ps.setString(4, kh.getSdt());
			ps.setString(5, kh.getEmail());
			ps.setString(6, kh.getTg_datban());
			ps.setString(7, kh.getTrangthaikh());
			ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void insertnb(khachhang kh) {
		String sql = "INSERT INTO `tbl_khachhang` (`id_ban`, `tenkhachhang`, `songuoi`, `sdt`, `email`, `tg_phucvu`, `trangthaikh`) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, kh.getId_ban());
			ps.setString(2,kh.getTenkhachhang());
			ps.setInt(3, kh.getSonguoi());
			ps.setString(4, kh.getSdt());
			ps.setString(5, kh.getEmail());
			ps.setString(6, kh.getTg_phucvu());
			ps.setString(7, kh.getTrangthaikh());
			ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	// câp nhạt trang thai khach hàng
	public void update_thkh(khachhang kh) {
		String sql ="UPDATE `nhahang`.`tbl_khachhang` SET `id_ban` = ?, `tenkhachhang` = ?, `songuoi` = ?, `sdt` = ?,"
				+ " `email` = ?, `tg_datban` = ?, `tg_phucvu` = ?, `trangthaikh` = ?, `tongtien` = ?"
				+ " WHERE (`id_khachhang` = ?);";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1,kh.getId_ban());
			ps.setString(2, kh.getTenkhachhang());
			ps.setInt(3,kh.getSonguoi());
			ps.setString(4, kh.getSdt());
			ps.setString(5, kh.getEmail());
			ps.setString(6, kh.getTg_datban());
			ps.setString(7, kh.getTg_phucvu());
			ps.setString(8, kh.getTrangthaikh());
			ps.setInt(9, kh.getTongtien());
			ps.setInt(10,kh.getId_khachhang());
			
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
