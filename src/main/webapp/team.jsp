<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@include file="Header.jsp" %>
<!-- Page Header Start -->
     <div class="page-header">
         <div class="container">
             <div class="row">
                 <div class="col-12">
                     <h2>Master Chef</h2>
                 </div>
                 <div class="col-12">
                     <a href="">Home</a>
                     <a href="">Chef</a>
                 </div>
             </div>
         </div>
     </div>
     <!-- Page Header End -->
     

     <!-- Team Start -->
     <div class="team">
         <div class="container">
             <div class="section-header text-center">
                 <p>Đội của chúng tôi</p>
                 <h2>Our Master Chef</h2>
             </div>
             <div class="row">
              	<c:forEach var="list" items = "${data}" >
                 <div class="col-lg-3 col-md-6">
                     <div class="team-item">
                         <div class="team-img">
                             <img src="img/${list.hinhanh}" alt="Image">
                             <div class="team-social">
                                 <a href=""><i class="fab fa-twitter"></i></a>
                                 <a href=""><i class="fab fa-facebook-f"></i></a>
                                 <a href=""><i class="fab fa-linkedin-in"></i></a>
                                 <a href=""><i class="fab fa-instagram"></i></a>
                             </div>
                         </div>
                         <div class="team-text">
                             <h2>${list.tenNV}</h2>
                             <p>${list.chuVu}</p>
                         </div>
                     </div>
                 </div>
                 </c:forEach>
                
                    
                 </div>
             </div>
         </div>
     </div>
     <!-- Team End -->


     <!-- Footer Start -->
<%@include file="Footer.jsp" %> 