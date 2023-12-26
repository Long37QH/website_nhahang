package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.taikhoan;

import java.io.IOException;

import dal.taikhoanDAO;


public class suatk_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public suatk_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_tk = request.getParameter("id");
		int id = Integer.parseInt(id_tk);
		taikhoanDAO tk = new taikhoanDAO();
		taikhoan t = tk.getTaikhoanById(id);
		request.setAttribute("taikhoan", t);
		request.getRequestDispatcher("admin/suataikhoan.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		taikhoanDAO tk = new taikhoanDAO();
		String id_tk = request.getParameter("id_tk");
		String id_nhanvien = request.getParameter("id_nhanvien");
		String tentk = request.getParameter("tentk");
		String pass = request.getParameter("pass");
		
		int id,idnv ;
		id = Integer.parseInt(id_tk);
		idnv = Integer.parseInt(id_nhanvien);
		
		taikhoan t = new taikhoan(id,idnv,tentk,pass);
		tk.update(t);
		response.sendRedirect("ds_taikhoanServlet");
	}

}
