package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.danhmuc;

import java.io.IOException;
import java.util.List;

import dal.danhmucDAO;


public class danhmucServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public danhmucServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		danhmucDAO cd = new danhmucDAO();
		// lây dữ liêu tư database
		List<danhmuc> list = cd.getDanhmucAll();
		
		// gui dữ liêu qua view 
		request.setAttribute("data_dm", list);
		request.getRequestDispatcher("Header.jsp").forward(request, response);
	}

}
