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


public class baiviet_detialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public baiviet_detialServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// lấy nội dung bài viết
		String id_baiviet = request.getParameter("id");
		int id = Integer.parseInt(id_baiviet);
		baivietDAO bv = new baivietDAO();
		baiviet b = bv.getBaiVietById(id);
		request.setAttribute("baiviet", b);
		
		// lấy danh sách liên quan
		baivietDAO bv2 = new baivietDAO();
		List<baiviet> listbv = bv2.getBaiVietAll();
		request.setAttribute("list_bv", listbv);
		
		request.getRequestDispatcher("blog_detial.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
