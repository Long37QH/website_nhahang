<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <%@include file="Header.jsp" %>   
        <!-- Page Header Start -->
        <div class="page-header mb-0">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h2>Giới Thiệu Về Chúng Tôi</h2>
                    </div>
                    <div class="col-12">
                        <a href="">Trang Chủ</a>
                        <a href="">Giơi Thiệu</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- Page Header End -->
        
        
        <!-- Food Start -->
        <div class="food mt-0">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-md-4">
                        <div class="food-item">
                            <i class="fa-solid fa-bowl-rice"></i>
                            <h2>Món ăn chính</h2>
                            <p>
                                Nhà hàng phục vụ phong phú đa dạng nhiều loại món ăn từ đồ ăn vùng núi đến hải sản với những món ăn đậm vị xứ Nghệ.
                            </p>
                            <a href="thucdonServlet">Xem Thực Đơn</a>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="food-item">
                            <i class="fa-solid fa-plate-wheat"></i>
                            <h2>Điểm tâm</h2>
                            <p>
                                Nhà hàng cung cấp phục vụ nhiều món điểm tâm nổi tiếng mọi vùng miền, đầy bổ dưỡng rất tối cho sức khoẻ.
                            </p>
                            <a href="thucdonServlet">Xem Thực Đơn</a>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="food-item">
                            <i class="fa-solid fa-martini-glass-citrus"></i>
                            <h2>Đồ uống</h2>
                            <p>
                                Qua nhưng phương châm cốt lõi, chúng tôi mong muốn hướng đến phục vụ tốt nhất cho lợi ích của tất cả đối tác và người tiêu dùng. 
                            </p>
                            <a href="thucdonServlet">Xem Thực Đơn</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Food End -->
        

        <!-- About Start -->
        <div class="about">
        <c:forEach items = "${bvgt}" var = "gtbv" >
            <div class="container">
            
                <div class="row align-items-center">
                    <div class="col-lg-6">
                        <div class="about-img">
                            <img src="${gtbv.hinhanh}" alt="Image">
                            <button type="button" class="btn-play" data-toggle="modal" data-src="https://www.youtube.com/embed/DWRcNpR6Kdc" data-target="#videoModal">
                                <span></span>
                            </button>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="about-content">
                        
                            <div class="section-header">
                                <p>Giới thiệu về chúng tôi</p>
                                <h2>${gtbv.tenbai}</h2>
                            </div>
                            <div class="about-text">
                                <p>
                                    ${gtbv.tomtatbv}
                                </p>
                                <a class="btn custom-btn" href="baiviet_detialServlet?id=${gtbv.id_baiviet}">Xem Thêm</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            </c:forEach>
        </div>
        <!-- About End -->
        
        
        <!-- Video Modal Start-->
        <div class="modal fade" id="videoModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-body">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>        
                        <!-- 16:9 aspect ratio -->
                        <div class="embed-responsive embed-responsive-16by9">
                            <iframe class="embed-responsive-item" src="" id="video"  allowscriptaccess="always" allow="autoplay"></iframe>
                        </div>
                    </div>
                </div>
            </div>
        </div> 
        <!-- Video Modal End -->
 <%@include file="Footer.jsp" %>