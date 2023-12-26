package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.binhluan;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import dal.binhluanDAO;


public class add_binhluanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_binhluanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		binhluanDAO bl = new binhluanDAO();
		
		String tennbl = request.getParameter("tennbl");
		String noidungbl = request.getParameter("noidungbl");
		String hinhbl = "";
		// Lấy thời gian hiện tại
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date currentTime = new Date();
        String tg_binhluan = dateFormat.format(currentTime);
        
		String email = request.getParameter("email");
		
		binhluan b = new binhluan(tennbl, noidungbl, tg_binhluan, email);
		bl.insert(b);
	
		
		// xủ lý 
//		String currentURL = request.getRequestURL().toString();
       response.sendRedirect("baivietServlet");
	}

}
