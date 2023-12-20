package controllers;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.thucdon;
import java.io.IOException;
import dal.thucdonDAO;
public class sua_thudonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public sua_thudonServlet() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String idthudon = request.getParameter("id");
        int id = Integer.parseInt(idthudon);
        thucdonDAO thd = new thucdonDAO();
        thucdon td = thd.getThuDonById(id);
        request.setAttribute("td", td);  // Provide the variable name 'td'
        request.getRequestDispatcher("admin/sua_thucdon.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            thucdonDAO td = new thucdonDAO();
            int id = Integer.parseInt(request.getParameter("id")); // Giả sử bạn có một trường ẩn trong biểu mẫu với tên "id"
            String tenMonAn = request.getParameter("tenMonAn");
            int loaiMonAn = Integer.parseInt(request.getParameter("loaiMonAn"));
            String moTaTT = request.getParameter("moTaTT");
            String moTa = request.getParameter("moTa");
            int giaMonAn = Integer.parseInt(request.getParameter("giaMonAn"));
            int giamGia = Integer.parseInt(request.getParameter("giamGia"));
            String hinhAnh = request.getParameter("hinhAnh");
            // Sử dụng java.time.LocalDateTime cho việc xử lý ngày và giờ hiện đại
            java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
            String ngayTao = currentDateTime.toString(); // định dạng
            String ngayCapNhat = currentDateTime.toString();

            boolean monAnPhoBien = Boolean.parseBoolean(request.getParameter("monAnPhoBien"));
            boolean hienThiTrangChu = Boolean.parseBoolean(request.getParameter("hienThiTrangChu"));
            boolean trangThai = Boolean.parseBoolean(request.getParameter("trangThai"));
            int luotThich = 0;
            thucdon t = new thucdon(id, tenMonAn, loaiMonAn, moTaTT, moTa, giaMonAn, giamGia,hinhAnh, ngayTao, ngayCapNhat, monAnPhoBien, hienThiTrangChu, trangThai, luotThich);
            td.update(t);
//             URL đúng để chuyển hướng
            response.sendRedirect("ds_thucdonServlet");
        
    }
}
