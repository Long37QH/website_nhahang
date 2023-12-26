package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.taikhoan;

import java.io.IOException;

import dal.taikhoanDAO;


public class add_taikhoanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_taikhoanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("ds_taikhoanServlet");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		taikhoanDAO tk = new taikhoanDAO();
		String id = request.getParameter("id_nhanvien");
		int id_nhanvien = Integer.parseInt(id);		
		String tentk = request.getParameter("tentk");
		String pass = request.getParameter("pass");
		taikhoan t = new taikhoan(id_nhanvien,tentk,pass);
		tk.insert(t);
		response.sendRedirect("ds_taikhoanServlet");
	}

}
