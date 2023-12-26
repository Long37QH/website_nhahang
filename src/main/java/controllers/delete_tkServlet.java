package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dal.taikhoanDAO;


public class delete_tkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public delete_tkServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_tk = request.getParameter("id");
		int id =Integer.parseInt(id_tk);
		taikhoanDAO tk = new taikhoanDAO();
		tk.delete(id);
		response.sendRedirect("ds_taikhoanServlet");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
