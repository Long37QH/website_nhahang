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
                        <h3 class="page-title text-truncate text-dark font-weight-medium mb-1">Chào mừng bạn đến với trang quản trị!</h3>
                        <div class="d-flex align-items-center">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb m-0 p-0">
                                    <li class="breadcrumb-item"><a href="index.html">Dashboard</a>
                                    </li>
                                </ol>
                            </nav>
                        </div>
                    </div>
                    <div class="col-5 align-self-center">
                        <div class="customize-input float-right">
                            <select
                                class="custom-select custom-select-set form-control bg-white border-0 custom-shadow custom-radius">
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
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="d-flex align-items-center mb-4">
                                    <h4 class="card-title">Danh sách tài khoản</h4>
                                    <div class="ml-auto">
                                        <div class="dropdown sub-dropdown">
                                            <!-- <button class="btn btn-link text-muted dropdown-toggle" type="button"
                                                id="dd1" data-toggle="dropdown" aria-haspopup="true"
                                                aria-expanded="false">
                                                <i data-feather="more-vertical"></i>
                                            </button>
                                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="dd1">
                                                <a class="dropdown-item" href="#">Thêm mới</a>
                                            </div> -->
                                            
                                            <!-- Button thêm -->
											<button type="button" class="btn waves-effect waves-light btn-success" data-bs-toggle="modal" data-bs-target="#exampleModal">
											  <i class="fa-solid fa-plus"></i> Thêm mới
											</button>
											
											<!-- Modal -->
											<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
											  <div class="modal-dialog">
											    <div class="modal-content">
											      <div class="modal-header">
											        <h5 class="modal-title" id="exampleModalLabel">Thêm mới tài khoản</h5>
											        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"><i class="fa-solid fa-xmark"></i></button>
											      </div>
											      <div class="modal-body">
											        <form action="add_taikhoanServlet" method="post" >
											        	<label for="id_nhanvien" >ID Nhân viên </label>
				                                        <div class="row">
				                                            <div class="col-md-12">
				                                                <div class="form-group">
				                                                    <input type="text" name="id_nhanvien" id="id_nhanvien" class="form-control" placeholder="">
				                                                </div>
				                                            </div>
				                                        </div>
											        	<label for="tentk" >Tài khoản </label>
				                                        <div class="row">
				                                            <div class="col-md-12">
				                                                <div class="form-group">
				                                                    <input type="text" name="tentk" id="tentk" class="form-control" placeholder="">
				                                                </div>
				                                            </div>
				                                        </div>
				                                        <label for="pass" >Mật khẩu </label>
				                                        <div class="row">
				                                            <div class="col-md-12">
				                                                <div class="form-group">
				                                                    <input type="password" name="pass" id="pass" class="form-control" placeholder="">
				                                                </div>
				                                            </div>
				                                        </div>
											        
											      </div>
											      <div class="modal-footer">
											        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Huỷ</button>
											        <button type="submit" class="btn btn-primary">Lưu tài khoản</button>
											      </div>
											      </form>
											    </div>
											  </div>
											</div>
                                        </div>
                                    </div>
                                </div>
                                <!-- bảng -->
                                <div class="table-responsive">
                                    <table id="zero_config" class="table table-striped table-bordered no-wrap">
                                        <thead>
                                            <tr>
                                                <th>TT</th>
                                                <th>ID Nhân viên</th>
                                                <th>Tên tài khoản</th>
                                                <th>Mật khẩu</th>                                             
                                                <th>Tác Vụ</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                       <c:forEach var="listtaikhoan" items = "${data}" >
                                            <tr>
                                                <td>${listtaikhoan.id_tk}</td>
                                                <td>${listtaikhoan.id_nhanvien}</td>                                              
                                                <td>${listtaikhoan.tentk}</td>                   
                                                <td>${listtaikhoan.pass}</td>  
                                                <td>
                                                    <a class="btn waves-effect waves-light btn-info" href="suatk_Servlet?id=${listtaikhoan.id_tk}"><i class="fa-solid fa-wrench"></i> Sửa</a>
                                                    <a onclick="return confirm('bạn có muốn xoá không ?');" class="btn waves-effect waves-light btn-danger" href="delete_tkServlet?id=${listtaikhoan.id_tk}"><i class="fa-solid fa-trash-can"></i> Xoá</a>
                                                </td>
                                            </tr>
                                            </c:forEach>
                                        </tbody>
                                        
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- footer -->
    <%@include file="footer.jsp" %>