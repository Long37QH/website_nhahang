package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.baiviet;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import dal.baivietDAO;


public class add_baivietServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_baivietServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("admin/addbaiviet.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		baivietDAO bv = new baivietDAO();
	
		String tenbai = request.getParameter("tenbai");
		String danhmucbv = request.getParameter("danhmucbv");
		String tomtatbv = request.getParameter("tomtatbv");
		String noidung = request.getParameter("noidung");
		String hinhanh = request.getParameter("hinhanh");
		String tacgia = request.getParameter("tacgia");
		String ngayviet = request.getParameter("ngayviet");
		String trangthaibv = request.getParameter("trangthaibv");
		
		baiviet c = new baiviet(tenbai,danhmucbv,tomtatbv,noidung,hinhanh,tacgia,ngayviet,trangthaibv);
		bv.insert(c);
//		request.getRequestDispatcher("ds_baivietServlet").forward(request, response);
		response.sendRedirect("ds_baivietServlet");
	}

}
