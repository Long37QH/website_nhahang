package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ban;
import model.khachhang;

import java.io.IOException;

import dal.banDAO;
import dal.khachhangDAO;


public class update_banServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update_banServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_ban = request.getParameter("id");
		int id = Integer.parseInt(id_ban);
		banDAO b = new banDAO();
		ban n = b.getbanBYid(id);
		request.setAttribute("ban", n);
		request.getRequestDispatcher("admin/updateban.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		banDAO b = new banDAO();
		String id_ban = request.getParameter("id_ban");	
		String trangthaiban = request.getParameter("trangthaiban");
		int idb;
		idb = Integer.parseInt(id_ban);
		ban c = new ban(idb,trangthaiban);
		b.update(c);
		
		// thêm khách hàng
		khachhangDAO khach = new khachhangDAO();
		String tenkhachhang = request.getParameter("tenkhachhang");
		
		String songuoi = request.getParameter("songuoi");
		int snguoi = Integer.parseInt(songuoi);
		
		String sdt = request.getParameter("sdt");
		String email = request.getParameter("email");
		String tg_phucvu = request.getParameter("tg_phucvu");
		int tongtien = 0 ;
		
		khachhang kh = new khachhang(idb, tenkhachhang, snguoi, sdt, email,  tg_phucvu, trangthaiban , tongtien);
		khach.insertnb(kh);
		
		response.sendRedirect("ds_banServlet");
	}

}
