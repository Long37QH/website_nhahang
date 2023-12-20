<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@include file="Header.jsp" %>
<!-- Page Header Start -->
     <div class="page-header mb-0">
         <div class="container">
             <div class="row">
                 <div class="col-12">
                     <h2>Food Menu</h2>
                 </div>
                 <div class="col-12">
                     <a href="">Home</a>
                     <a href="">Menu</a>
                 </div>
             </div>
         </div>
     </div>
     <!-- Page Header End -->
     
     
 

     <!-- Menu Start -->
     <div class="menu">
         <div class="container">
             <div class="section-header text-center">
                 <p>Food Menu</p>
                 <h2>Delicious Food Menu</h2>
             </div>
             <div class="menu-tab">
                 <ul class="nav nav-pills justify-content-center">
                 	<c:forEach var="item" items="${td}">
    					<c:if test="${item.loaiMonAn == 0}">
        					<c:if test="${item.id==1}">
        						<li class="nav-item">
                        			<a class="nav-link active" data-toggle="pill" href="#burgers">${item.tenMonAn}</a>
                     			</li>
        					</c:if>
        					<c:if test="${item.id==2}">
        						<li class="nav-item">
                        			<a class="nav-link" data-toggle="pill" href="#snacks">${item.tenMonAn}</a>
                     			</li>
        					</c:if>
        					<c:if test="${item.id==3}">
        						<li class="nav-item">
                        			<a class="nav-link" data-toggle="pill" href="#beverages">${item.tenMonAn}</a>
                     			</li>
        					</c:if>
   
    					</c:if>
					</c:forEach>

                 </ul>
                 <div class="tab-content">
                     <div id="burgers" class="container tab-pane active">
                         <div class="row">
                             <div class="col-lg-7 col-md-12">
                             	<c:forEach var="item" items="${td}">
                             		<c:if test="${item.loaiMonAn == 1}">
                             			<div class="menu-item">
                                     <div class="menu-img">
                                         <img src="${item.hinhAnh}" alt="Image">
                                     </div>
                                     <div class="menu-text">
                                         <h3><span>${item.tenMonAn}</span> <strong>${item.giaMonAn}Vnđ</strong></h3>
                                         <p>${item.moTaTT}</p>
                                     </div>
                                 </div>
                             		</c:if>
                             	</c:forEach>
                             </div>  
                             <c:forEach var="item" items="${td}">
                             	<c:if test="${item.id==1}">
                             		<div class="col-lg-5 d-none d-lg-block">
                                 		<img src="${item.hinhAnh}" alt="Image">
                             		</div>
                             	</c:if>
                             </c:forEach>
                             
                         </div>
                     </div>
                     <div id="snacks" class="container tab-pane fade">
                         <div class="row">
                             <div class="col-lg-7 col-md-12">
                                 <c:forEach var="item" items="${td}">
                             		<c:if test="${item.loaiMonAn == 2}">
                             			<div class="menu-item">
                                     <div class="menu-img">
                                         <img src="${item.hinhAnh}" alt="Image">
                                     </div>
                                     <div class="menu-text">
                                         <h3><span>${item.tenMonAn}</span> <strong>${item.giaMonAn}Vnđ</strong></h3>
                                         <p>${item.moTaTT}</p>
                                     </div>
                                 </div>
                             		</c:if>
                             	</c:forEach>
                             </div>
                            <c:forEach var="item" items="${td}">
                             	<c:if test="${item.id==2}">
                             		<div class="col-lg-5 d-none d-lg-block">
                                 		<img src="${item.hinhAnh}" alt="Image">
                             		</div>
                             	</c:if>
                             </c:forEach>
                         </div>
                     </div>
                     <div id="beverages" class="container tab-pane fade">
                         <div class="row">
                             <div class="col-lg-7 col-md-12">
                                 <c:forEach var="item" items="${td}">
                             		<c:if test="${item.loaiMonAn == 3}">
                             			<div class="menu-item">
                                     <div class="menu-img">
                                         <img src="${item.hinhAnh}" alt="Image">
                                     </div>
                                     <div class="menu-text">
                                         <h3><span>${item.tenMonAn}</span> <strong>${item.giaMonAn}Vnđ</strong></h3>
                                         <p>${item.moTaTT}</p>
                                     </div>
                                 </div>
                             		</c:if>
                             	</c:forEach>
                             </div>
                             <c:forEach var="item" items="${td}">
                             	<c:if test="${item.id==3}">
                             		<div class="col-lg-5 d-none d-lg-block">
                                 		<img src="${item.hinhAnh}" alt="Image">
                             		</div>
                             	</c:if>
                             </c:forEach>
                         </div>
                     </div>
                 </div>
             </div>
         </div>
     </div>
     <!-- Menu End -->
<%@include file="Footer.jsp" %>