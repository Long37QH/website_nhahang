package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.taikhoan;

import java.io.IOException;
import java.util.List;

import dal.taikhoanDAO;


public class ds_taikhoanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ds_taikhoanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		taikhoanDAO tk = new taikhoanDAO();
		List<taikhoan> listtaikhoan = tk.getTaikhoanAll();
		request.setAttribute("data", listtaikhoan);
		request.getRequestDispatcher("admin/ds_taikhoan.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
