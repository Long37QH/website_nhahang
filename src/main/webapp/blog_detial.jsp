<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@include file="Header.jsp" %>
<!-- Page Header Start -->
        <div class="page-header">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h2>Chi tiết bài viết</h2>
                    </div>
                    <div class="col-12">
                        <a href="">Trang chủ</a>
                        <a href="">chi tiết</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- Page Header End -->


        <!-- Single Post Start-->
        <div class="single">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8">
                        <div class="single-content">
                        	<c:set value="${baiviet}" var = "b" />
                            <img src="${b.hinhanh}" />
                            <h2>${b.tenbai}</h2>
                            <p>
                                ${b.noidung}
                            </p>
                            
                       
                        </div>
                        
                        <div class="single-related">
                            <h2>Bài viết liên quan</h2>
                            <div class="owl-carousel related-slider">
                            	<c:forEach items = "${list_bv}" var = "listbv" >
                            		<div class="post-item">
	                                    <div class="post-img">
	                                        <img src="${listbv.hinhanh}" />
	                                    </div>
	                                    <div class="post-text">
	                                        <a href="baiviet_detialServlet?id=${listbv.id_baiviet}">${listbv.tenbai}</a>
	                                        <div class="post-meta">
	                                            <p>tác giả<a href="">${listbv.tacgia}</a></p>
	                                        </div>
	                                    </div>
                                	</div>
                            	</c:forEach>          
                            </div>
                        </div>
						
                        <div class="single-comment">
                        
                            <h2>5 Bình luận</h2>
                            <ul class="comment-list">
                            <c:forEach items = "${list_bl}" var = "listbinhluan">
                                <li class="comment-item">
                                    <div class="comment-body">
                                        <div class="comment-img">
                                            <img src="img/anhbl.jpg" />
                                        </div>
                                        <div class="comment-text">
                                            <h3><a href="">${listbinhluan.tennbl}</a></h3>
                                            <span>${listbinhluan.tg_binhluan}</span>
                                            <p>
                                                ${listbinhluan.noidungbl}
                                            </p>
                                            <a class="btn" href="#phanhoi">Phản hồi</a>
                                        </div>
                                    </div>
                                </li>
                                </c:forEach>
                            </ul>
                        </div>
                        <div class="comment-form" id ="phanhoi">
                            <h2>Bình luận bài viết</h2>
                            <form  action="add_binhluanServlet" method="post" >
                                <div class="form-group">
                                    <label for="tennbl">Họ và tên *</label>
                                    <input type="text" class="form-control" id="tennbl" name="tennbl" >
                                </div>
                                <div class="form-group">
                                    <label for="email">Email *</label>
                                    <input type="email" class="form-control" id="email" name="email" >
                                </div>
                               
                                <div class="form-group">
                                    <label for="noidungbl">Bình buận *</label>
                                    <textarea id="noidungbl" name="noidungbl" cols="30" rows="5" class="form-control"></textarea>
                                </div>
                                <div class="form-group">
                                    <input type="submit" value="Gửi bình luận" class="btn custom-btn">
                                </div>
                            </form>
                        </div>
                    </div>

                    <div class="col-lg-4">
                        <div class="sidebar">
                            <div class="sidebar-widget">
                                <div class="search-widget">
                                    <form>
                                        <input class="form-control" type="text" placeholder="Tìm kiếm">
                                        <button class="btn"><i class="fa fa-search"></i></button>
                                    </form>
                                </div>
                            </div>
	
                            <div class="sidebar-widget">
                                <h2 class="widget-title">Bài viết nổi bật</h2>
                                <div class="recent-post">
	                                <c:forEach items = "${list_bv}" var = "listbv"  >
	                                	<div class="post-item">
	                                        <div class="post-img">
	                                            <img src="${listbv.hinhanh}" />
	                                        </div>
	                                        <div class="post-text">
	                                            <a href="baiviet_detialServlet?id=${listbv.id_baiviet}">${listbv.tenbai}</a>
	                                            <div class="post-meta">
	                                                <p>Tác giả<a href="">${listbv.tacgia}</a>
	                                            </div>
	                                        </div>
	                                    </div>
	                                </c:forEach>
                                </div>
                            </div>

                            <div class="sidebar-widget">
                                <div class="image-widget">
                                    <a href="#"><img src="${b.hinhanh}" alt="Image"></a>
                                </div>
                            </div>

                            <div class="sidebar-widget">
                                <h2 class="widget-title">Danh mục bài viết</h2>
                                <div class="category-widget">
                                    <ul>
                                        <li><a href="">Ẩm thực</a><span>(9)</span></li>
                                        <li><a href="">Mẹo nấu ăn</a><span>(1)</span></li>
                                        <li><a href="">Khuyến mãi</a><span>(5)</span></li>
                                        <li><a href="">Sự kiện</a><span>(4)</span></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Single Post End-->   

<%@include file="Footer.jsp" %>