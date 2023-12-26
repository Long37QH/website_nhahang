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
 * Servlet implementation class add_nhanvienServlet
 */
public class add_nhanvienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_nhanvienServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("ds_nhanvienServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		nhanvienDAO nv = new nhanvienDAO();
		String tenNV = request.getParameter("tenNV");
		String chuVu = request.getParameter("chuVu");
		String hinhanh = request.getParameter("hinhanh");
		String sdt = request.getParameter("sdt");
		String diachi = request.getParameter("diachi");
		String email = request.getParameter("email");
		String gioitinh = request.getParameter("gioitinh");
		nhanvien c = new nhanvien(tenNV,chuVu,hinhanh,sdt,diachi,email,gioitinh);
		nv.insert(c);
		response.sendRedirect("ds_nhanvienServlet");
		
	}

}
