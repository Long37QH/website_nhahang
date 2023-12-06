package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.baiviet;

import java.io.IOException;
import java.util.List;

import dal.baivietDAO;


public class baivietServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public baivietServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		baivietDAO bv = new baivietDAO();
		List<baiviet> listbv = bv.getBaiVietAll();
		request.setAttribute("list_bv", listbv);
		request.getRequestDispatcher("blog.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
