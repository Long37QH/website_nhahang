package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.thucdon;

import java.io.IOException;
import java.util.List;

import dal.thucdonDAO;


@WebServlet("/menu")
public class thucdonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public thucdonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		thucdonDAO td = new thucdonDAO();
        List<thucdon> list = td.getThucdonAll();
        request.setAttribute("td", list);
        request.getRequestDispatcher("menu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
