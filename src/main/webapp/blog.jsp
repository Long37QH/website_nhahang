<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@include file="Header.jsp" %>
<!-- Page Header Start -->
        <div class="page-header">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h2>Bài viết nổi bật</h2>
                    </div>
                    <div class="col-12">
                        <a href="homeServlet">Trang chủ</a>
                        <a href="">Bài viết</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- Page Header End -->
        
        
        <!-- Blog Start -->
        <div class="blog">
            <div class="container">
                <div class="section-header text-center">
                    <p>Góc ẩm thực</p>
                    <h2>Bài viết mới nhất</h2>
                </div>
                <div class="row">
                	<c:forEach items = "${list_bv}" var = "listbv" >
                		<div class="col-md-6">
                        <div class="blog-item">
                            <div class="blog-img">
                                <img src="${listbv.hinhanh}" alt="Blog" hidth="400px" >
                            </div>
                            <div class="blog-content">
                                <h2 class="blog-title">${listbv.tenbai}</h2>
                                <div class="blog-meta">
                                    <p><i class="far fa-user"></i>${listbv.tacgia}</p>
                                    <p><i class="far fa-list-alt"></i>${listbv.danhmucbv}</p>
                                    <p><i class="far fa-calendar-alt"></i>${listbv.ngayviet}</p>
                                    <p><i class="far fa-comments"></i>10</p>
                                </div>
                                <div class="blog-text">
                                    <p>
                                        ${listbv.tomtatbv}
                                    </p>
                                    <a class="btn custom-btn" href="baiviet_detialServlet?id=${listbv.id_baiviet}">Xem Thêm</a>
                                </div>
                            </div>
                        </div>
                    </div>
                	</c:forEach>
                    
                </div>
                <div class="row">
                    <div class="col-12">
                        <ul class="pagination justify-content-center">
                            <li class="page-item disabled"><a class="page-link" href="#">Previous</a></li>
                            <li class="page-item"><a class="page-link" href="#">1</a></li>
                            <li class="page-item active"><a class="page-link" href="#">2</a></li>
                            <li class="page-item"><a class="page-link" href="#">3</a></li>
                            <li class="page-item"><a class="page-link" href="#">Next</a></li>
                        </ul> 
                    </div>
                </div>
            </div>
        </div>
        <!-- Blog End -->
<%@include file="Footer.jsp" %>