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
                        <h4 class="page-title text-truncate text-dark font-weight-medium mb-1">Sửa thông tài khoản</h4>
                        <div class="d-flex align-items-center">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb m-0 p-0">
                                    <li class="breadcrumb-item"><a href="index.html" class="text-muted">Trang quản trị</a></li>
                                    <li class="breadcrumb-item text-muted active" aria-current="page">Sửa tài khoản</li>
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
	                                <h4 class="card-title">Sửa thông tin tài khoản</h4>
	                                
	                                <c:set value="${taikhoan}" var="t" />
	                                <form action="suatk_Servlet" method="post" >
	                                    <div class="form-body">
	                                    	<label for="id_tk" >ID Tài khoản </label>
	                                        <div class="row">
	                                            <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="id_tk" id="id_tk" value="${t.id_tk}" class="form-control" readonly >
	                                                </div>
	                                            </div>
	                                        </div>
	                                        <label for="id_nhanvien" >ID Nhân viên </label>
	                                        <div class="row">
	                                            <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="id_nhanvien" id="id_nhanvien" value="${t.id_nhanvien}" class="form-control" readonly >
	                                                </div>
	                                            </div>
	                                        </div>
	                                        <label for="tentk" >Tài khoản </label>
	                                        <div class="row">
	                                            <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="tentk" id="tentk" value="${t.tentk}" class="form-control" placeholder="">
	                                                </div>
	                                            </div>
	                                        </div>
	                                        <label for="pass" >Mật khẩu </label>
	                                        <div class="row">
	                                            <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="pass" id="pass" value="${t.pass}" class="form-control" placeholder="">
	                                                </div>
	                                            </div>
	                                        </div>
	                                    <div class="form-actions">
	                                        <div class="text-left mt-3 ">
	                                            <button type="submit" class="btn btn-info"><i class="fa-solid fa-floppy-disk"></i> Lưu lại</button>
	                                            <button type="reset" class="btn btn-dark"><i class="fa-regular fa-circle-xmark"></i> Huỷ</button>
	                                        </div>
	                                    </div>
	                                </form>
	                            </div>
	                        </div>
	                    </div>
	                </div>
			<!-- footer -->
    <%@include file="footer.jsp" %>
 