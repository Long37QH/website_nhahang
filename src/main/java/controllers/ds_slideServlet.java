package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.slide;

import java.io.IOException;
import java.util.List;

import dal.slideDAO;

/**
 * Servlet implementation class ds_slideServlet
 */
public class ds_slideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ds_slideServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		slideDAO sl = new slideDAO();
		List<slide> listslide = sl.getSlideAll();
		request.setAttribute("data", listslide);
		request.getRequestDispatcher("admin/ds_slide.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
