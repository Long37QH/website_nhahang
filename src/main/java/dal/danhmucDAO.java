package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.danhmuc;

public class danhmucDAO extends DBConnect {
	public List<danhmuc> getDanhmucAll(){
		List<danhmuc> list = new ArrayList<>();
		String sql = "SELECT * FROM tbl_danhmuc";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				danhmuc c = new danhmuc(rs.getInt("id_danhmuc"),rs.getString("tendanhmuc"),rs.getInt("cap"),rs.getInt("vitri"),rs.getString("link"),rs.getString("trangthaiAH"));
				list.add(c);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
//	public static void main(String[] args) {
//		 danhmucDAO c=new danhmucDAO();
//		 List<danhmuc> list=c.getDanhmucAll();
//		 System.out.println(list.get(0).getTendanhmuc());
//		}

}
