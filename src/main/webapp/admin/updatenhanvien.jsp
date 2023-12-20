<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>

<div class="page-wrapper">
            <!-- ============================================================== -->
            <!-- Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            <div class="page-breadcrumb">
                <div class="row">
                    <div class="col-7 align-self-center">
                        <h4 class="page-title text-truncate text-dark font-weight-medium mb-1">Sửa thông tin bài viết</h4>
                        <div class="d-flex align-items-center">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb m-0 p-0">
                                    <li class="breadcrumb-item"><a href="index.html" class="text-muted">Trang quản trị</a></li>
                                    <li class="breadcrumb-item text-muted active" aria-current="page">Sửa bài viết</li>
                                </ol>
                            </nav>
                        </div>
                    </div>
                    <div class="col-5 align-self-center">
                        <div class="customize-input float-right">
                            <select class="custom-select custom-select-set form-control bg-white border-0 custom-shadow custom-radius">
                                <option selected>Aug 19</option>
                                <option value="1">July 19</option>
                                <option value="2">Jun 19</option>
                            </select>
                        </div>
                    </div>
                </div>
            </div>
            <!-- ============================================================== -->
            <!-- End Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            <!-- ============================================================== -->
            <!-- Container fluid  -->
            <!-- ============================================================== -->
            <div class="container-fluid">
		    <!-- form insert -->
		    <div class="row">
	                    <div class="col-12">
	                        <div class="card">
	                            <div class="card-body">
	                                <h4 class="card-title">Nhập thông tin nhân viên</h4>
	                                
	                                <c:set value="${nhanvien}" var="n" />
	                                <form action="update_nhanvienServlet" method="post" >
	                                     <div class="form-body">
	                                        <label for="tenNV" >Tên nhân viên </label>
	                                        <div class="row">
	                                            <div class="col-md-4">
	                                                <div class="form-group">
	                                                    <input type="text" name="tenNV" id="tenNV" value="${n.tenNV}" class="form-control" placeholder="">
	                                                </div>
	                                            </div>
	                                             <div class="col-md-3">
	                                                <div class="form-group">
	                                                    <input type="text" name="id_nhanvien" id="id_nhanvien" value="${n.id_nhanvien}" class="form-control" readonly placeholder="">
	                                                </div>
	                                            </div>
	                                        </div>
	                                        <label for="hinhanh" >Hình ảnh </label>
	                                        <div class="row">
	                                        	<div class="col-md-9">
		                                            <div class="form-group">
	                                                    <input type="text" name="hinhanh" id="hinhanh" value="${n.hinhanh}" class="form-control" placeholder="">
	                                                </div>
                                                </div>
	                                        </div>
	                                        <label for="chuVu" >Chức vụ </label>
	                                        <div class="row">
	                                            <div class="col-md-3">
	                                                <div class="form-group">
	                                                    <input type="text" name="chuVu" id="chuVu" value="${n.chuVu}" class="form-control" placeholder="">
	                                                </div>
	                                            </div>
	                                        </div>
	   
	          
	                                       <label for="sdt" >Số điện thoại</label>
	                                        <div class="row">
	                                            <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="sdt" id="sdt" value="${n.sdt}" class="form-control" placeholder="">
	                                                </div>
	                                            </div>
	                                        </div>
	                                        <label for="email" >Email</label>
	                                        <div class="row">
	                                            <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="email" id="email" value="${n.email}" class="form-control" placeholder="">
	                                                </div>
	                                            </div>
	                                        </div>
	                                        <label for="diachi" >Địa chỉ</label>
	                                        <div class="row">
	                                            <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="diachi" id="diachi" value="${n.diachi}" class="form-control" placeholder="">
	                                                </div>
	                                            </div>
	                                        </div>
	                                         
	                                        
	                         
	                                        <label for="gioitinh" >Giới tính</label>
	                                        <div class="row">
	                                            <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="gioitinh" id="gioitinh" value="${n.gioitinh}" class="form-control" placeholder="">
	                                                </div>
	                                            </div>
	                                        </div>
	                                    <div class="form-actions">
	                                        <div class="text-left mt-3 ">
	                                            <button type="submit" class="btn btn-info">Lưu lại</button>
	                                            <button type="reset" class="btn btn-dark">Huỷ</button>
	                                        </div>
	                                    </div>
	                                </form>
	                            </div>
	                        </div>
	                    </div>
	                </div>
			<!-- footer -->
    <%@include file="footer.jsp" %>
 