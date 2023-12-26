package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.slide;

import java.io.IOException;

import dal.slideDAO;


public class add_slideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_slideServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("ds_slideServlet");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		slideDAO sl = new slideDAO();
		String tieude = request.getParameter("tieude");
		String noidung = request.getParameter("noidung");
		String hinhanh = request.getParameter("hinhanh");
		String trangthai_slide = request.getParameter("trangthai_slide");
		slide s = new slide(tieude,noidung,hinhanh,trangthai_slide);
		sl.insert(s);
		response.sendRedirect("ds_slideServlet");
	}

}
