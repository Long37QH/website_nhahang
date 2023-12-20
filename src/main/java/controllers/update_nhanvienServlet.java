package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.nhanvien;

import java.io.IOException;

import dal.nhanvienDAO;

/**
 * Servlet implementation class update_nhanvienServlet
 */
public class update_nhanvienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update_nhanvienServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_nhanvien = request.getParameter("id");
		int id = Integer.parseInt(id_nhanvien);
		nhanvienDAO nv = new nhanvienDAO();
		nhanvien n = nv.getNhanVienByid(id);
		request.setAttribute("nhanvien", n);
		request.getRequestDispatcher("admin/updatenhanvien.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		nhanvienDAO nv = new nhanvienDAO();
		String id_nhanvien = request.getParameter("id_nhanvien");
		String tenNV = request.getParameter("tenNV");
		String chuVu = request.getParameter("chuVu");
		String hinhanh = request.getParameter("hinhanh");
		String sdt = request.getParameter("sdt");
		String email = request.getParameter("email");
		String diachi = request.getParameter("diachi");
		String gioitinh = request.getParameter("gioitinh");
		int id;
		id = Integer.parseInt(id_nhanvien);
		nhanvien n = new nhanvien(id,tenNV,chuVu,hinhanh,sdt,email,diachi,gioitinh);
		nv.update(n);
		response.sendRedirect("ds_nhanvienServlet");
	
	}

}
