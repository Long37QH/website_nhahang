package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.baiviet;
import model.binhluan;
import model.nhanvien;
import model.slide;
import model.thucdon;

import java.io.IOException;
import java.util.List;

import dal.baivietDAO;
import dal.binhluanDAO;
import dal.nhanvienDAO;
import dal.slideDAO;
import dal.thucdonDAO;


public class homeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public homeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// hien thị slide
		slideDAO sl = new slideDAO();
		List<slide> listslide = sl.getSlideAll();
		request.setAttribute("list_slide", listslide);
		
		baivietDAO bv = new baivietDAO();
		List<baiviet> gtbv = bv.getBaiVietGT();
		request.setAttribute("bvgt", gtbv);
		
		thucdonDAO td = new thucdonDAO();
        List<thucdon> list = td.getThucdonAll();
        request.setAttribute("td", list);
        
        nhanvienDAO nv = new nhanvienDAO();
		List<nhanvien> listnv = nv.getNhanVienAllhome();
		request.setAttribute("data", listnv);
		
		binhluanDAO bl = new binhluanDAO();
		List<binhluan> listbinhluan = bl.getAllBinhluan();
		request.setAttribute("list_bl", listbinhluan);
		
		baivietDAO bvbl = new baivietDAO();
		List<baiviet> listbv = bvbl.getBaiVietAllhome();
		request.setAttribute("list_bv", listbv);
        
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
