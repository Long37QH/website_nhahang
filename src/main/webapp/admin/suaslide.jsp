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
                        <h4 class="page-title text-truncate text-dark font-weight-medium mb-1">Sửa thông tin slide</h4>
                        <div class="d-flex align-items-center">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb m-0 p-0">
                                    <li class="breadcrumb-item"><a href="index.html" class="text-muted">Trang quản trị</a></li>
                                    <li class="breadcrumb-item text-muted active" aria-current="page">Sửa slide</li>
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
	                                
	                                <c:set value="${slide}" var="s" />
	                                <form action="suaslide_Servlet" method="post" >
	                                    <div class="form-body">
	                                    	<label for="tieude" >ID Slide </label>
	                                        <div class="row">
	                                            <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="id_slide" id="id_slide" value="${s.id_slide}" class="form-control" readonly >
	                                                </div>
	                                            </div>
	                                        </div>
	                                        <label for="tieude" >Tiêu đề </label>
	                                        <div class="row">
	                                            <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="tieude" id="tieude" value="${s.tieude}" class="form-control" placeholder="">
	                                                </div>
	                                            </div>
	                                        </div>
	                                        <label for="noidung" >Nội dung slide </label>
	                                        
	                                        <div class="row">
	                                            <div class="col-md-6">
	                                                <div class="form-group">
                                        				<textarea class="form-control" name="noidung" id="noidung"  rows="3" placeholder="Nội dung slide...">${s.noidung}</textarea>
                                    				</div>
	                                            </div>
	                                        </div>
	   
	                                        <label>Hình ảnh </label>
	                                        <div class="row">
	                                            <div class="input-group mb-3 col-md-6">
	                                                <div class="input-group-prepend">
                                            		<span class="input-group-text">Upload</span>
                                        		</div>
                                        		<div class="custom-file">
                                            		<input type="file" class="custom-file-input" name="hinhanh"  id="hinhanh">
                                            		<label class="custom-file-label" for="hinhanh">Choose file</label>
                                        		</div>
	                                            </div>
	                                        </div>
	                         				<label>Trạng thái Slide </label>
	                                        <div class="row">
	                                            <div class="col-md-9">
	                                                <select class="custom-select mr-sm-2 " name="trangthai_slide" id="trangthai_slide">
	                                                	<option value="value="${s.trangthai_slide}" >${s.trangthai_slide}</option>
			                                            <option value="Hiển thị">Hiển thị</option>
			                                            <option value="Ẩn">Ẩn</option>
			                                        </select>
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
 