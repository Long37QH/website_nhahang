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

/**
 * Servlet implementation class xulybanServlet
 */
public class xulybanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public xulybanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_khachhang = request.getParameter("id");
		int id = Integer.parseInt(id_khachhang);
		khachhangDAO khach = new khachhangDAO();
		khachhang kh = khach.getKhachHangById(id);
		request.setAttribute("khachhang", kh);
		request.getRequestDispatcher("admin/xulyban.jsp").forward(request, response);
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
		
		
		// cap nhat thong tin khách
		khachhangDAO khach = new khachhangDAO();
		String id_khachhang = request.getParameter("id_khachhang");
		String tenkhachhang = request.getParameter("tenkhachhang");
		String songuoi = request.getParameter("songuoi");
		String sdt = request.getParameter("sdt");
		String email = request.getParameter("email");
		String tg_datban = request.getParameter("tg_datban");
		String tg_phucvu = request.getParameter("tg_phucvu");
		String trangthaikh = request.getParameter("trangthaikh");
		
		int tongtien = 0;
		int idkh = Integer.parseInt(id_khachhang);
		
		int snguoi = Integer.parseInt(songuoi);
		
		khachhang kh = new khachhang( idkh, idb, tenkhachhang, snguoi, sdt, email, tg_datban, tg_phucvu, trangthaikh, tongtien);
		khach.update_thkh(kh);
		response.sendRedirect("ds_khachdatbanServlet");
		
	}

}
