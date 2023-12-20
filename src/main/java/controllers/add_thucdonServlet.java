package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.thucdon;

import java.io.IOException;

import dal.thucdonDAO;

/**
 * Servlet implementation class add_thucdonServlet
 */
public class add_thucdonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_thucdonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            thucdonDAO td = new thucdonDAO();
            String tenMonAn = request.getParameter("tenMonAn");
            int loaiMonAn = Integer.parseInt(request.getParameter("loaiMonAn"));
            String moTaTT = request.getParameter("moTaTT");
            String moTa = request.getParameter("moTa");
            int giaMonAn = Integer.parseInt(request.getParameter("giaMonAn"));
            int giamGia = Integer.parseInt(request.getParameter("giamGia"));
            String hinhAnh = request.getParameter("hinhAnh");

            // Sử dụng java.time.LocalDateTime để xử lý ngày và giờ hiện đại
            java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
            String ngayTao = currentDateTime.toString(); // định dạng
            String ngayCapNhat = currentDateTime.toString();

            boolean monAnPhoBien = Boolean.parseBoolean(request.getParameter("monAnPhoBien"));
            boolean hienThiTrangChu = Boolean.parseBoolean(request.getParameter("hienThiTrangChu"));
            boolean trangThai = Boolean.parseBoolean(request.getParameter("trangThai"));
            int luotThich = 0;

            thucdon t = new thucdon(tenMonAn, loaiMonAn, moTaTT, moTa, giaMonAn, giamGia, hinhAnh,
                    ngayTao, ngayCapNhat, monAnPhoBien, hienThiTrangChu, trangThai, luotThich);

            td.insert(t);

            // Correct URL for redirection
            response.sendRedirect("ds_thucdonServlet");
        } catch (NumberFormatException e) {
            // Handle the exception, e.g., show an error page or redirect to a specific page
            e.printStackTrace();
            response.sendRedirect("errorPage.jsp");
        }
    }
}
