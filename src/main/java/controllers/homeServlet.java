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


public class homeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public homeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// hien thị slide
		slideDAO sl = new slideDAO();
		List<slide> listslide = sl.getSlideAll();
		request.setAttribute("list_slide", listslide);
		
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
