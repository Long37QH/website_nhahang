package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.taikhoan;

import java.io.IOException;

import dal.taikhoanDAO;


public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tentk = request.getParameter("tentk");
		String pass = request.getParameter("pass");
		taikhoanDAO tk = new taikhoanDAO();
		taikhoan t = tk.checktk(tentk, pass);
		
		if (t == null) {
			request.setAttribute("error","Tài khoản hoặc mật khẩu không đúng!");
			request.getRequestDispatcher("admin/errorlogin.jsp").forward(request, response);
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("tentk", t);
			request.getRequestDispatcher("admin/index.jsp").forward(request, response);
		}
	}

}
