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
                        <h4 class="page-title text-truncate text-dark font-weight-medium mb-1">Xứ lý nhận bàn</h4>
                        <div class="d-flex align-items-center">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb m-0 p-0">
                                    <li class="breadcrumb-item"><a href="index.html" class="text-muted">Trang quản trị</a></li>
                                    <li class="breadcrumb-item text-muted active" aria-current="page">Xử lý bàn</li>
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
	                                <h4 class="card-title">Xử lý thông tin bàn</h4>
	                                
	                                <c:set value="${khachhang}" var="kh" />
	                                <form action="xulybanServlet" method="post" >
	                                     <div class="form-body">
	                                     	<label for="id_khachhang" >ID Khách hàng :</label>
	                                        <div class="row">
	                                             <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="id_khachhang" id="id_khachhang" value="${kh.id_khachhang}" class="form-control" readonly placeholder="">
	                                                </div>
	                                            </div>   
	                                        </div>
	                    
	                                        <label for="id_ban" >Bàn số :</label>
	                                        <div class="row">
	                                             <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="id_ban" id="id_ban" value="${kh.id_ban}" class="form-control" readonly placeholder="">
	                                                </div>
	                                            </div>   
	                                        </div>
	                                        
	                                        <label for="tenkhachhang" >Tên khách hàng :</label>
	                                        <div class="row">
	                                             <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="tenkhachhang" id="tenkhachhang" value="${kh.tenkhachhang}" class="form-control"  placeholder="">
	                                                </div>
	                                            </div>   
	                                        </div>
	                                        
	                                        <label for="email" >Email :</label>
	                                        <div class="row">
	                                             <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="email" id="email" value="${kh.email}" class="form-control"  placeholder="">
	                                                </div>
	                                            </div>   
	                                        </div>
	                                        
	                                        <label for="sdt" >Số điện thoại :</label>
	                                        <div class="row">
	                                             <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="sdt" id="sdt" value="${kh.sdt}"  class="form-control"  placeholder="">
	                                                </div>
	                                            </div>   
	                                        </div>
	                                        
	                                        <label for="songuoi" >Số người :</label>
	                                        <div class="row">
	                                             <div class="col-md-3">
	                                                <div class="form-group">
	                                                    <input type="songuoi" name="songuoi" id="songuoi" value="${kh.songuoi}"  class="form-control"  placeholder="">
	                                                </div>
	                                            </div>   
	                                        </div>
	                                        
	                                        <label for="tg_datban" >Thời gian đặt bàn :</label>
	                                        <div class="row">
	                                             <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="text" name="tg_datban" id="tg_datban" value="${kh.tg_datban}"  class="form-control"  placeholder="">
	                                                </div>
	                                            </div>   
	                                        </div>
	                                        <label for="tg_phucvu" >Thời gian phục vụ :</label>
	                                        <div class="row">
	                                             <div class="col-md-6">
	                                                <div class="form-group">
	                                                    <input type="datetime-local" name="tg_phucvu" id="tg_phucvu"  class="form-control"  placeholder="">
	                                                </div>
	                                            </div>   
	                                        </div>
	                                        
	                                        <label>Trạng thái bàn </label>
	                                        <div class="row">
	                                            <div class="col-md-6">
	                                                <select class="custom-select mr-sm-2 " name="trangthaiban" id="trangthaiban">
			                                            <option value="Đặt trước bàn">Khách đặt trước</option>      
			                                            <option value="Đang phục vụ">Phục vụ ngay</option>
			                                            <option value="Trống">Huỷ đặt bàn</option>
			                                        </select>
	                                            </div>
	                                        </div>
											<label>Trạng thái khách hàng </label>
	                                        <div class="row">
	                                            <div class="col-md-6">
	                                                <select class="custom-select mr-sm-2 " name="trangthaikh" id="trangthaikh">
	                                                	<option value="Đang phục vụ">Phục vụ ngay</option>
			                                            <option value="Đặt trước bàn">Khách đặt trước</option>      			                                            
			                                            <option value="Huỷ đặt bàn">Huỷ đặt bàn</option>
			                                        </select>
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
 