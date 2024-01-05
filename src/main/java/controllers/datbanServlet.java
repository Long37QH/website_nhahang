package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ban;
import model.khachhang;

import java.io.IOException;
import java.util.List;

import dal.banDAO;
import dal.khachhangDAO;

/**
 * Servlet implementation class datbanServlet
 */
public class datbanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public datbanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		banDAO b  = new banDAO();
		List<ban>list = b.getbanAll();
		request.setAttribute("data", list);
		request.getRequestDispatcher("booking.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// cap nhat trang thai ban
		banDAO ban = new banDAO();
		String id_ban = request.getParameter("id_ban");
		int idb ;
		idb = Integer.parseInt(id_ban);
		ban b = new ban(idb);
		ban.updatedb(b);
		
		//them thong tin kh
		khachhangDAO khach = new khachhangDAO();
		String tenkhachhang = request.getParameter("tenkhachhang");
		
		String songuoi = request.getParameter("songuoi");
		int snguoi = Integer.parseInt(songuoi);
		
		String sdt = request.getParameter("sdt");
		String email = request.getParameter("email");
		
		String ngaydat = request.getParameter("ngaydat");
		String giodat = request.getParameter("giodat");
		String tg_datban = ngaydat+" "+ giodat;
		
		String trangthaikh = "Đặt trước bàn";
		
		khachhang kh = new khachhang(idb,tenkhachhang,snguoi,sdt,email,tg_datban,trangthaikh);
		khach.insert(kh);
		response.sendRedirect("datbanServlet");
	}

}
