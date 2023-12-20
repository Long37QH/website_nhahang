package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dal.baivietDAO;
import dal.thucdonDAO;

/**
 * Servlet implementation class delete_thucdonServlet
 */
public class delete_thucdonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delete_thucdonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        // Kiểm tra xem id có giá trị không trước khi chuyển đổi sang kiểu int
        if (id != null && !id.isEmpty()) {
            int id_thucdon = Integer.parseInt(id);

            thucdonDAO td = new thucdonDAO();
            
            // Sửa lỗi tên biến (bv -> td)
            td.delete(id_thucdon);

            response.sendRedirect("ds_thucdonServlet");
        } else {
            // Xử lý trường hợp id không có giá trị
            response.getWriter().println("ID không hợp lệ");
        }
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
