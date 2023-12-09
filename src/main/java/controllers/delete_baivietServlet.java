package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dal.baivietDAO;

/**
 * Servlet implementation class delete_baivietServlet
 */
public class delete_baivietServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public delete_baivietServlet() {
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
		bv.delete(id);
		response.sendRedirect("ds_baivietServlet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
