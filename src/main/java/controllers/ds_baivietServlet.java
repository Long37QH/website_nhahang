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

/**
 * Servlet implementation class ds_baivietServlet
 */
public class ds_baivietServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ds_baivietServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		baivietDAO bv = new baivietDAO();
		List<baiviet> listbv = bv.getBaiVietAll2();
		request.setAttribute("list_bv", listbv);
		request.getRequestDispatcher("admin/ds_baiviet.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
