package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.slide;

import java.io.IOException;

import dal.slideDAO;


public class suaslide_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public suaslide_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_slide = request.getParameter("id");
		int id = Integer.parseInt(id_slide);
		slideDAO sl = new slideDAO();
		slide s = sl.getSlideById(id);
		request.setAttribute("slide", s);
		request.getRequestDispatcher("admin/suaslide.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		slideDAO sl = new slideDAO();
		String id_slide = request.getParameter("id_slide");
		String tieude = request.getParameter("tieude");
		String noidung = request.getParameter("noidung");
		String hinhanh = request.getParameter("hinhanh");
		String trangthai_slide = request.getParameter("trangthai_slide");
		int id ;
		id = Integer.parseInt(id_slide);
		slide s = new slide(id ,tieude, noidung, hinhanh, trangthai_slide);
		sl.update(s);
		response.sendRedirect("ds_slideServlet");
	}

}
