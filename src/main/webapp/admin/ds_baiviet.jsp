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
                        <h3 class="page-title text-truncate text-dark font-weight-medium mb-1">Good Morning Jason!</h3>
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
                                    <h4 class="card-title">Danh sách bài viết</h4>
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
                                            <a href="admin/addbaiviet.jsp" class="btn waves-effect waves-light btn-success" ><i class="fa-solid fa-plus"></i> Thêm mới</a>
                                        </div>
                                    </div>
                                </div>
                                <!-- bảng -->
                                <div class="table-responsive">
                                    <table id="zero_config" class="table table-striped table-bordered no-wrap">
                                        <thead>
                                            <tr>
                                                <th>TT</th>
                                                <th style="width:230px" >Tiêu Đề</th>
                                                <th>Hình ảnh</th>
                                                <th>Tác giả</th>
                                                <th>Ngày Đăng</th>
                                                <th>Trạng Thái</th>
                                                <th>Tác Vụ</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items = "${list_bv}" var = "listbv" >
                                            <tr>
                                                <td>${listbv.id_baiviet}</td>
                                                <td>${listbv.tenbai}</td>
                                                <td>
                                                    <img style="width: 150px;" src="${listbv.hinhanh}" alt="">
                                                </td>
                                                <td>${listbv.tacgia}</td>
                                                <td>${listbv.ngayviet}</td>
                                                <td>${listbv.trangthaibv}</td>
                                                <td>
                                                    <a class="btn waves-effect waves-light btn-info" href="suabv_Servlet?id=${listbv.id_baiviet}">Sửa</a>
                                                    <a onclick="return confirm('bạn có muốn xoá không ?');" class="btn waves-effect waves-light btn-danger" href="delete_baivietServlet?id=${listbv.id_baiviet}">Xoá</a>
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