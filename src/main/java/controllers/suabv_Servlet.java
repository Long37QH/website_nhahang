package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.baiviet;

import java.io.IOException;

import dal.baivietDAO;

/**
 * Servlet implementation class suabv_Servlet
 */
public class suabv_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public suabv_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_baiviet = request.getParameter("id");
		int id = Integer.parseInt(id_baiviet);
		baivietDAO bv = new baivietDAO();
		baiviet b = bv.getBaiVietById(id);
		request.setAttribute("baiviet", b);
		request.getRequestDispatcher("admin/suabaiviet.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		baivietDAO bv = new baivietDAO();
		String id_baiviet = request.getParameter("id_baiviet");
		String tenbai = request.getParameter("tenbai");
		String danhmucbv = request.getParameter("danhmucbv");
		String tomtatbv = request.getParameter("tomtatbv");
		String noidung = request.getParameter("noidung");
		String hinhanh = request.getParameter("hinhanh");
		String tacgia = request.getParameter("tacgia");
		String ngayviet = request.getParameter("ngayviet");
		String trangthaibv = request.getParameter("trangthaibv");
		
		int id ;
		id = Integer.parseInt(id_baiviet);
		baiviet b = new baiviet(id,tenbai,danhmucbv,tomtatbv,noidung,hinhanh,tacgia,ngayviet,trangthaibv);
		bv.update(b);
		response.sendRedirect("ds_baivietServlet");
	}

}
