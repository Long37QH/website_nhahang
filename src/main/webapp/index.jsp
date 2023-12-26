<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@include file="Header.jsp" %>

        <!-- Carousel Start -->
        <div class="carousel">
            <div class="container-fluid">
                <div class="owl-carousel">
                	<c:forEach items = "${list_slide}" var = "listslide">
                    <div class="carousel-item">
                        <div class="carousel-img">
                            <img src="img/${listslide.hinhanh}" alt="Image">
                        </div>
                        <div class="carousel-text">
                            <h2 style="color:white; text-align:center;" >${listslide.tieude}</h1>
                            <p>
                                ${listslide.noidung}
                            </p>
                            <div class="carousel-btn">
                                <a class="btn custom-btn" href="thucdonServlet">Thực đơn</a>
                                <a class="btn custom-btn" href="booking.jsp">Đặt bàn</a>
                            </div>
                        </div>
                    </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <!-- Carousel End -->
        
        
        <!-- Booking Start -->
        <div class="booking">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-lg-7">
                        <div class="booking-content">
                            <div class="section-header">
                                <p>Book A Table</p>
                                <h2>Book Your Table For Private Dinners  Happy Hours</h2>
                            </div>
                            <div class="about-text">
                                <p>
                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nec pretium mi. Curabitur facilisis ornare velit non vulputate. Aliquam metus tortor, auctor id gravida condimentum, viverra quis sem.
                                </p>
                                <p>
                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nec pretium mi. Curabitur facilisis ornare velit non vulputate. Aliquam metus tortor, auctor id gravida condimentum, viverra quis sem. Curabitur non nisl nec nisi scelerisque maximus. Aenean consectetur convallis porttitor. Aliquam interdum at lacus non blandit.
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-5">
                        <div class="booking-form">
                            <form>
                                <div class="control-group">
                                    <div class="input-group">
                                        <input type="text" class="form-control" placeholder="Name" required="required" />
                                        <div class="input-group-append">
                                            <div class="input-group-text"><i class="far fa-user"></i></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <div class="input-group">
                                        <input type="email" class="form-control" placeholder="Email" required="required" />
                                        <div class="input-group-append">
                                            <div class="input-group-text"><i class="far fa-envelope"></i></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <div class="input-group">
                                        <input type="text" class="form-control" placeholder="Mobile" required="required" />
                                        <div class="input-group-append">
                                            <div class="input-group-text"><i class="fa fa-mobile-alt"></i></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <div class="input-group date" id="date" data-target-input="nearest">
                                        <input type="text" class="form-control datetimepicker-input" placeholder="Date" data-target="#date" data-toggle="datetimepicker"/>
                                        <div class="input-group-append" data-target="#date" data-toggle="datetimepicker">
                                            <div class="input-group-text"><i class="far fa-calendar-alt"></i></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <div class="input-group time" id="time" data-target-input="nearest">
                                        <input type="text" class="form-control datetimepicker-input" placeholder="Time" data-target="#time" data-toggle="datetimepicker"/>
                                        <div class="input-group-append" data-target="#time" data-toggle="datetimepicker">
                                            <div class="input-group-text"><i class="far fa-clock"></i></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <div class="input-group">
                                        <select class="custom-select form-control">
                                            <option selected>Guest</option>
                                            <option value="1">1 Guest</option>
                                            <option value="2">2 Guest</option>
                                            <option value="3">3 Guest</option>
                                            <option value="4">4 Guest</option>
                                            <option value="5">5 Guest</option>
                                            <option value="6">6 Guest</option>
                                            <option value="7">7 Guest</option>
                                            <option value="8">8 Guest</option>
                                            <option value="9">9 Guest</option>
                                            <option value="10">10 Guest</option>
                                        </select>
                                        <div class="input-group-append">
                                            <div class="input-group-text"><i class="fa fa-chevron-down"></i></div>
                                        </div>
                                    </div>
                                </div>
                                <div>
                                    <button class="btn custom-btn" type="submit">Book Now</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Booking End -->
        

        <!-- About Start -->
        <div class="about">
            <c:forEach items = "${bvgt}" var = "gtbv" >
            <div class="container">
            
                <div class="row align-items-center">
                    <div class="col-lg-6">
                        <div class="about-img">
                            <img src="${gtbv.hinhanh}" alt="Image">
                            <button type="button" class="btn-play" data-toggle="modal" data-src="img/gtnhahang.mp4" data-target="#videoModal">
                                <span></span>
                            </button>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="about-content">
                        
                            <div class="section-header">
                                <p>Giới thiệu về chúng tôi</p>
                                <h2>${gtbv.tenbai}</h2>
                            </div>
                            <div class="about-text">
                                <p>
                                    ${gtbv.tomtatbv}
                                </p>
                                <a class="btn custom-btn" href="baiviet_detialServlet?id=${gtbv.id_baiviet}">Xem Thêm</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            </c:forEach>
        </div>
        <!-- About End -->
        
        
        <!-- Video Modal Start-->
        <div class="modal fade" id="videoModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-body">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>        
                        <!-- 16:9 aspect ratio -->
                        <div class="embed-responsive embed-responsive-16by9">
                            <iframe class="embed-responsive-item" src="" id="video"  allowscriptaccess="always" allow="autoplay"></iframe>
                        </div>
                    </div>
                </div>
            </div>
        </div> 
        <!-- Video Modal End -->
        
        
        <!-- Feature Start -->
        <div class="feature">
            <div class="container">
                <div class="row">
                    <div class="col-lg-5">
                        <div class="section-header">
                            <p>Tại sao chọn cúng tôi</p>
                            <h2>Điểm nhấn nổi bật</h2>
                        </div>
                        <div class="feature-text">
                            <div class="feature-img">
                                <div class="row">
                                    <div class="col-6">
                                        <img src="img/feature-1.jpg" alt="Image">
                                    </div>
                                    <div class="col-6">
                                        <img src="img/feature-2.jpg" alt="Image">
                                    </div>
                                    <div class="col-6">
                                        <img src="img/feature-3.jpg" alt="Image">
                                    </div>
                                    <div class="col-6">
                                        <img src="img/feature-4.jpg" alt="Image">
                                    </div>
                                </div>
                            </div>
                            <p>
                                Nhà hàng nổi tiếng Food247 – Ngày nay với xu thế phát triển hội nhập, toàn cầu hóa, đời sống của con người trở nên phát triển nhanh chóng. 
                                Chính vì lẽ đó, tiêu chí ăn no mặc ấm đã chuyển sang một giai đoạn mới cao hơn đó là ăn ngon, mặc đẹp.
                            </p>
                            <a class="btn custom-btn" href="">Đặt bàn ngay</a>
                        </div>
                    </div>
                    <div class="col-lg-7">
                        <div class="row">
                            <div class="col-sm-6">
                                <div class="feature-item">
                                    <i class="flaticon-cooking"></i>
                                    <h3>Tập trung nhiều đầu bếp giỏi</h3>
                                    <p>
                                        Nhà hàng Food247 tập trung nhiều đầu bếp trên khắp vùng miền Việt Nam sẵn sàng đáp ứng được quý khách.
                                    </p>
                                </div>
                            </div>
                            <div class="col-sm-6">
                                <div class="feature-item">
                                    <i class="flaticon-vegetable"></i>
                                    <h3>Thực phẩm 100% tự nhiên</h3>
                                    <p>
                                        Tất cacr các loại thực phẩm được sử dụng tại nhà hàng Food247 đều được cấp chứng nhận sạch tự nhiên.
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-6">
                                <div class="feature-item">
                                    <i class="flaticon-medal"></i>
                                    <h3>Sản phẩm luôn đảm bảo chất lượng tốt nhất</h3>
                                    <p>
                                        Vơi đội ngũ nhân viên chuyên nghiệp nhà hàng Food247 cam kết đưa lại cho quý khách những giây phut trải nghiệm tuyệt vời.
                                    </p>
                                </div>
                            </div>
                            <div class="col-sm-6">
                                <div class="feature-item">
                                    <i class="flaticon-meat"></i>
                                    <h3>Thực phẩm tươi ngon rõ ràng nguông gốc</h3>
                                    <p>
                                        Mọi loại thực phẩm trước khi được nhập về nhà hàng Food247 đều được kiểm tra một cách kĩ lưỡng có nguồn gốc rõ ràng.
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-6">
                                <div class="feature-item">
                                    <i class="flaticon-courier"></i>
                                    <h3>Nhận đặt bàn đặt tiệc mọi lúc</h3>
                                    <p>
                                        Nhà hàng Food247 luôn sãn sàng nhận các quý khách đặt bàn hay tổ chức tiệc tùng.
                                    </p>
                                </div>
                            </div>
                            <div class="col-sm-6">
                                <div class="feature-item">
                                    <i class="flaticon-fruits-and-vegetables"></i>
                                    <h3>Nhân viên phục vụ nhiệt tình</h3>
                                    <p>
                                        Với đội ngũ nhân viên luôn được tập huấn ngiệp vụ thường xuyên đảm vảo đêm lại trải nghiệm tôt nhất.
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Feature End -->
        
        
        <!-- Food Start -->
        <div class="food">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-md-4">
                        <div class="food-item">
                            <i class="fa-solid fa-bowl-rice"></i>
                            <h2>Món ăn chính</h2>
                            <p>
                                Nhà hàng phục vụ phong phú đa dạng nhiều loại món ăn từ đồ ăn vùng núi đến hải sản với những món ăn đậm vị xứ Nghệ.
                            </p>
                            <a href="thucdonServlet">Xem Thực Đơn</a>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="food-item">
                            <i class="fa-solid fa-plate-wheat"></i>
                            <h2>Điểm tâm</h2>
                            <p>
                                Nhà hàng cung cấp phục vụ nhiều món điểm tâm nổi tiếng mọi vùng miền, đầy bổ dưỡng rất tối cho sức khoẻ.
                            </p>
                            <a href="thucdonServlet">Xem Thực Đơn</a>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="food-item">
                            <i class="fa-solid fa-martini-glass-citrus"></i>
                            <h2>Đồ uống</h2>
                            <p>
                                Qua nhưng phương châm cốt lõi, chúng tôi mong muốn hướng đến phục vụ tốt nhất cho lợi ích của tất cả đối tác và người tiêu dùng. 
                            </p>
                            <a href="thucdonServlet">Xem Thực Đơn</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Food End -->
        
        
        <!-- Menu Start -->
        <div class="menu">
            <div class="container">
             <div class="section-header text-center">
                 <p>Thực đơn chính</p>
                 <h2>Món ăn được săn đón</h2>
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
        
        
        <!-- Team Start -->
        <div class="team">
            <div class="container">
             <div class="section-header text-center">
                 <p>Đội của chúng tôi</p>
                 <h2>Đội ngũ hàng đầu Việt Nam</h2>
             </div>
             <div class="row">
              	<c:forEach var="listnv" items = "${data}" >
                 <div class="col-lg-3 col-md-6">
                     <div class="team-item">
                         <div class="team-img">
                             <img src="img/${listnv.hinhanh}" alt="Image">
                             <div class="team-social">
                                 <a href=""><i class="fab fa-twitter"></i></a>
                                 <a href=""><i class="fab fa-facebook-f"></i></a>
                                 <a href=""><i class="fab fa-linkedin-in"></i></a>
                                 <a href=""><i class="fab fa-instagram"></i></a>
                             </div>
                         </div>
                         <div class="team-text">
                             <h2>${listnv.tenNV}</h2>
                             <p>${listnv.chuVu}</p>
                         </div>
                     </div>
                 </div>
                 </c:forEach>
                
                    
                 </div>
             </div>
        </div>
        <!-- Team End -->
        
        
        <!-- Testimonial Start -->
        <div class="testimonial">
            <div class="container">
                <div class="owl-carousel testimonials-carousel">
                	<c:forEach items = "${list_bl}" var = "listbinhluan">
	                    <div class="testimonial-item">
	                        <div class="testimonial-img">
	                            <img src="img/anhbl.jpg" alt="Image">
	                        </div>
	                        <p>
	                            ${listbinhluan.noidungbl}
	                        </p>
	                        <h2>${listbinhluan.tennbl}</h2>
	                        <h3>${listbinhluan.tg_binhluan}</h3>
	                    </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <!-- Testimonial End -->
        
        
        <!-- Contact Start -->
        <div class="contact">
            <div class="container">
                <div class="section-header text-center">
                    <p>Liên hệ chúng tôi</p>
                    <h2>Hãy liên hệ chúng tôi khi bạn cần</h2>
                </div>
                <div class="row align-items-center contact-information">
                    <div class="col-md-6 col-lg-3">
                        <div class="contact-info">
                            <div class="contact-icon">
                                <i class="fa fa-map-marker-alt"></i>
                            </div>
                            <div class="contact-text">
                                <h3>Địa chỉ</h3>
                                <p>182 Lê Duẩn, Tp Vinh</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-3">
                        <div class="contact-info">
                            <div class="contact-icon">
                                <i class="fa fa-phone-alt"></i>
                            </div>
                            <div class="contact-text">
                                <h3>Điện thoại</h3>
                                <p>0399 876 456</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-3">
                        <div class="contact-info">
                            <div class="contact-icon">
                                <i class="fa fa-envelope"></i>
                            </div>
                            <div class="contact-text">
                                <h3>Email</h3>
                                <p>food247@gmail.com</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-3">
                        <div class="contact-info">
                            <div class="contact-icon">
                                <i class="fa fa-share"></i>
                            </div>
                            <div class="contact-text">
                                <h3>Follow Us</h3>
                                <div class="contact-social">
                                    <a href=""><i class="fab fa-twitter"></i></a>
                                    <a href=""><i class="fab fa-facebook-f"></i></a>
                                    <a href=""><i class="fab fa-youtube"></i></a>
                                    <a href=""><i class="fab fa-instagram"></i></a>
                                    <a href=""><i class="fab fa-linkedin-in"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row contact-form">
                    <div class="col-md-6">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3780.110234938391!2d105.69317477494573!3d18.659048664930197!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3139cddf0bf20f23%3A0x86154b56a284fa6d!2zVHLGsOG7nW5nIMSQ4bqhaSBo4buNYyBWaW5o!5e0!3m2!1svi!2s!4v1701870689353!5m2!1svi!2s" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
                    </div>
                    <div class="col-md-6">
                        <div id="success"></div>
                        <form name="sentMessage" id="contactForm" novalidate="novalidate">
                            <div class="control-group">
                                <input type="text" class="form-control" id="name" placeholder="Họ và tên" required="required" data-validation-required-message="Hãy nhập tên của bạn" />
                                <p class="help-block text-danger"></p>
                            </div>
                            <div class="control-group">
                                <input type="email" class="form-control" id="email" placeholder="Email" required="required" data-validation-required-message="Hãy nhập email của bạn" />
                                <p class="help-block text-danger"></p>
                            </div>
                            <div class="control-group">
                                <input type="text" class="form-control" id="subject" placeholder="Chủ đề" required="required" data-validation-required-message="Bạn phải nhập chủ đề" />
                                <p class="help-block text-danger"></p>
                            </div>
                            <div class="control-group">
                                <textarea class="form-control" id="message" placeholder="Nội dung" required="required" data-validation-required-message="Hãy nhập nội dung cho chúng tôi"></textarea>
                                <p class="help-block text-danger"></p>
                            </div>
                            <div>
                                <button class="btn custom-btn" type="submit" id="sendMessageButton">Gửi</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- Contact End -->


        <!-- Blog Start -->
        <div class="blog">
            <div class="container">
                <div class="section-header text-center">
                    <p>Góc ẩm thực</p>
                    <h2>Bài viết mới nhất</h2>
                </div>
                <div class="row">
                	<c:forEach items = "${list_bv}" var = "listbv" >
                		<div class="col-md-6">
                        <div class="blog-item">
                            <div class="blog-img">
                                <img src="${listbv.hinhanh}" alt="Blog" hidth="400px" >
                            </div>
                            <div class="blog-content">
                                <h2 class="blog-title">${listbv.tenbai}</h2>
                                <div class="blog-meta">
                                    <p><i class="far fa-user"></i>${listbv.tacgia}</p>
                                    <p><i class="far fa-list-alt"></i>${listbv.danhmucbv}</p>
                                    <p><i class="far fa-calendar-alt"></i>${listbv.ngayviet}</p>
                                    <p><i class="far fa-comments"></i>10</p>
                                </div>
                                <div class="blog-text">
                                    <p>
                                        ${listbv.tomtatbv}
                                    </p>
                                    <a class="btn custom-btn" href="baiviet_detialServlet?id=${listbv.id_baiviet}">Xem Thêm</a>
                                </div>
                            </div>
                        </div>
                    </div>
                	</c:forEach>       
                </div>
            </div>
        </div>
        <!-- Blog End -->


        <!-- Footer Start -->
        <%@include file="Footer.jsp" %>

        