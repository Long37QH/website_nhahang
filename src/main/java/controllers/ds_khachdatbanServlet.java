package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.khachhang;

import java.io.IOException;
import java.util.List;

import dal.khachhangDAO;

/**
 * Servlet implementation class ds_khachdatbanServlet
 */
public class ds_khachdatbanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ds_khachdatbanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		khachhangDAO kh = new khachhangDAO();
		List<khachhang> listkh = kh.getKhachhangDatban();
		request.setAttribute("datakh", listkh);
		request.getRequestDispatcher("admin/ds_khachdatban.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
