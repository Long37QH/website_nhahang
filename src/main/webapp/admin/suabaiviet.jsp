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
	                                <h4 class="card-title">Nhập thông tin bài viết</h4>
	                                
	                                <c:set value="${baiviet}" var="b" />
	                                <form action="suaslide_Servlet" method="post" >
	                                    <div class="form-body">
	                                        <label for="tenbai" >Tiêu đề bài viết </label>
	                                        <div class="row">	
	                                            <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="tenbai" id="tenbai" value="${b.tenbai}" class="form-control" placeholder="">
	                                                </div>
	                                            </div>
	                                            <div class="col-md-3">
	                                                <div class="form-group">
	                                                    <input type="text" name="id_baiviet" id="id_baiviet" value="${b.id_baiviet}" class="form-control" placeholder="">
	                                                </div>
	                                            </div>
	                                        </div>
	                                        <label for="danhmucbv" >Danh mục </label>
	                                        <div class="row">
	                                            <div class="col-md-3">
	                                                <div class="form-group">
	                                                    <input type="text" name="danhmucbv" id="danhmucbv" value="${b.danhmucbv}" class="form-control" placeholder="Ẩm thực">
	                                                </div>
	                                            </div>
	                                        </div>
	                                        <label for="tomtatbv" >Tóm tắt </label>
	                                        <div class="row">
	                                            <div class="col-md-9">
	                                                <div class="form-group">
                                        				<textarea class="form-control" name="tomtatbv" id="tomtatbv" rows="3" placeholder="Nội dung tóm tắt...">${b.tomtatbv}</textarea>
                                    				</div>
	                                            </div>
	                                        </div>
	                                        <label for="noidung" >Nội dung </label>
	                                        <div class="row">
	                                            <div class="col-md-9">
	                                                <div class="form-group">
                                        				<textarea class="form-control" name="noidung" id="noidung" rows="5" placeholder="Nội dung...">${b.noidung}</textarea>
                                    				</div>
	                                            </div>
	                                        </div>
	                                        <label for="hinhanh" >Hình ảnh </label>
	                                        <div class="row">
	                                        	<div class="col-md-9">
		                                            <div class="form-group">
	                                                    <input type="text" name="hinhanh" id="hinhanh" value="${b.hinhanh}" class="form-control" placeholder="">
	                                                </div>
                                                </div>
	                                        </div>
	                                        <label for="tacgia" >Tác giả </label>
	                                        <div class="row">
	                                            <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="tacgia" id="tacgia" value="${b.tacgia}" class="form-control" placeholder="">
	                                                </div>
	                                            </div>
	                                        </div>
	                                        <label>Thời gian viêt </label>
	                                        <div class="row">
	                                            <div class="col-md-6">
	                                                <div class="form-group">
                                        				<input type="date" class="form-control" name="ngayviet" value="">
                                    				</div>
	                                            </div>
	                                        </div>
	                                         <label>Trạng thái bài viết </label>
	                                        <div class="row">
	                                            <div class="col-md-9">
	                                                <select class="custom-select mr-sm-2 " name="trangthaibv" id="trangthaibv">
			                                            <option value="Hiển thị">Hiển thị</option>
			                                            <option value="Ẩn">Ẩn</option>
			                                        </select>
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
 