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
                        <h4 class="page-title text-truncate text-dark font-weight-medium mb-1">Sửa thông tin thực đơn</h4>
                        <div class="d-flex align-items-center">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb m-0 p-0">
                                    <li class="breadcrumb-item"><a href="index.html" class="text-muted">Trang quản trị</a></li>
                                    <li class="breadcrumb-item text-muted active" aria-current="page">Sửa món ăn</li>
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
        <!-- form update -->
        <div class="row">
            <div class="col-12">
                <div class="card">
                    <div class="card-body">
                        <h4 class="card-title">Nhập thông tin món ăn</h4>
                        <form action="sua_thudonServlet" method="post">
                            <div class="form-body">
									<input type="hidden" name="id" id="id"  value="${td.id}">
                                <label for="tenMonAn">Tên món ăn </label>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input type="text" name="tenMonAn" id="tenMonAn" class="form-control" value="${td.tenMonAn}" placeholder="">
                                        </div>
                                    </div>
                                </div>

                                <label>Danh mục </label>
                                <div class="row">
                                    <div class="col-md-9">
                                        <select style="color: #000;" class="custom-select mr-sm-2 " name="loaiMonAn" id="loaiMonAn">
                                            <option value="1" ${td.loaiMonAn == 1 ? 'selected' : ''}>Bánh mì</option>
                                            <option value="2" ${td.loaiMonAn == 2 ? 'selected' : ''}>Đồ ăn nhẹ</option>
                                            <option value="3" ${td.loaiMonAn == 3 ? 'selected' : ''}>Đồ uống</option>
                                        </select>
                                    </div>
                                </div>

                                <label for="moTaTT">Tóm tắt </label>
                                <div class="row">
                                    <div class="col-md-9">
                                        <div class="form-group">
                                            <textarea class="form-control" name="moTaTT" id="moTaTT" rows="3" placeholder="Nội dung tóm tắt...">${td.moTaTT}</textarea>
                                        </div>
                                    </div>
                                </div>

                                <label for="moTa">Nội dung </label>
                                <div class="row">
                                    <div class="col-md-9">
                                        <div class="form-group">
                                            <textarea class="form-control" name="moTa" id="moTa" rows="5" placeholder="Nội dung...">${td.moTa}</textarea>
                                        </div>
                                    </div>
                                </div>

                                <label for="giaMonAn">giá bán</label>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input type="number" name="giaMonAn" id="giaMonAn" class="form-control" value="${td.giaMonAn}" placeholder="">
                                        </div>
                                    </div>
                                </div>
                                <label for="giamGia">giảm giá</label>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input type="number" name="giamGia" id="giamGia" class="form-control" value="${td.giamGia}" placeholder="">
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
                                            <input type="file" class="custom-file-input" name="hinhAnh" id="hinhAnh">
                                            <label class="custom-file-label" for="hinhAnh">Choose file</label>
                                        </div>
                                    </div>
                                </div>
                                <label>Món ăn ưa thích</label>
                                <div class="row">
                                    <div class="col-md-9">
                                        <select class="custom-select mr-sm-2 " name="monAnPhoBien" id="monAnPhoBien">
                                            <option value="true" ${td.monAnPhoBien ? 'selected' : ''}>Hiển thị</option>
                                            <option value="false" ${!td.monAnPhoBien ? 'selected' : ''}>Ẩn</option>
                                        </select>
                                    </div>
                                </div>
                                <label>Hiển thị Trang chủ</label>
                                <div class="row">
                                    <div class="col-md-9">
                                        <select class="custom-select mr-sm-2 " name="hienThiTrangChu" id="hienThiTrangChu">
                                            <option value="true" ${td.hienThiTrangChu ? 'selected' : ''}>Hiển thị</option>
                                            <option value="false" ${!td.hienThiTrangChu ? 'selected' : ''}>Ẩn</option>
                                        </select>
                                    </div>
                                </div>
                                <label>Trạng thái</label>
                                <div class="row">
                                    <div class="col-md-9">
                                        <select class="custom-select mr-sm-2 " name="trangThai" id="trangThai">
                                            <option value="true" ${td.trangThai ? 'selected' : ''}>Hiển thị</option>
                                            <option value="false" ${!td.trangThai ? 'selected' : ''}>Ẩn</option>
                                        </select>
                                    </div>
                                </div>

                            </div>

                            <div class="form-actions">
                                <div class="text-left mt-3">
                                    <button type="submit" class="btn btn-info"><i class="fa-solid fa-floppy-disk"></i> Lưu lại</button>
                                    <a href="./ds_thucdonServlet" class="btn btn-dark">Quay lại</a>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- footer -->
    </div>
			<!-- footer -->
    <%@include file="footer.jsp" %>
 