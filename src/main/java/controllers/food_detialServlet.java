package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.baiviet;
import model.thucdon;

import java.io.IOException;
import java.util.List;

import dal.baivietDAO;
import dal.thucdonDAO;

/**
 * Servlet implementation class food_detialServlet
 */
public class food_detialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public food_detialServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idthudon = request.getParameter("id");
        int id = Integer.parseInt(idthudon);
        thucdonDAO thd = new thucdonDAO();
        thucdon td = thd.getThuDonById(id);
        request.setAttribute("td", td);
        
     // lấy danh sách liên quan
 		baivietDAO bv2 = new baivietDAO();
 		List<baiviet> listbv = bv2.getBaiVietAll();
 		request.setAttribute("list_bv", listbv);
        request.getRequestDispatcher("food_detial.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
