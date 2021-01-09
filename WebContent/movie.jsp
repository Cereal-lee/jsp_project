<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>왓챠피디아</title>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

</head>

<body>
	<%@ include file="common/header.jsp"%>

	<div class="container">
		<c:if test="${login.role eq 'admin' }">
			<h5>관리자 페이지</h5>
			<h2>등록</h2>
			<form action="addmovie.do" method="post"
				enctype="multipart/form-data">
				타이틀 : <input type="text" name="title"> <br /> 출시일 : <input
					type="number" name="year" maxlength='4'>- <input
					type="number" name="month" maxlength='2'>- <input
					type="number" name="day" maxlength='2'> <br /> 내용 :<br />
				<textarea cols="50" rows="10" name="context"></textarea>
				<br /> <label>첨부파일 : <input type="file" name="image"></label>
				<br> <input type="submit" value="등록"> <input
					type="reset" value="초기화">

			</form>
		</c:if>
	</div>

	<div class="container">
		<div id="carouselExampleControls" class="carousel slide"
			data-interval="false" data-ride="carousel" data-pause="hover">
			<div class="tit" style="margin-left: 35px;">영화</div>
			<div class="carousel-inner" style="margin-left: 25px;">
				<div class="carousel-item active">
					<a class="card cardImg"><img src="/img/harrystone.jpg" alt="해리포터">해리포터와 마법사의 돌<br>2001</a> 
					<a class="card cardImg"><img src="/img/bts.jpg" alt="해리포터">해리포터와 마법사의 돌<br>2001</a> 
					<a class="card cardImg"><img src="/img/god.jpg" alt="해리포터">해리포터와 마법사의 돌<br>2001</a> 
					<a class="card cardImg"><img src="/img/inter.jpg" alt="해리포터">해리포터와 마법사의 돌<br>2001</a> 
					<a class="card cardImg"><img src="/img/girl.jpg" alt="해리포터">해리포터와 마법사의 돌<br>2001</a>
				</div>
				<div class="carousel-item">
				<c:forEach var="data" items="${movielist}">
					<a class="card cardImg"><img src="/upload/${data.image }" alt="해리포터">${data.title }<br>${data.date }</a> 
				</c:forEach>
				</div>
				<div class="carousel-item">
					<a class="card"><img src="..." alt="...">안녕하세요</a> <a
						class="card"><img src="..." alt="...">만나서</a> <a
						class="card"><img src="..." alt="...">반가워요</a> <a
						class="card"><img src="..." alt="...">잘</a> <a class="card"><img
						src="..." alt="...">부탁드려용</a>
				</div>
			</div>
			<a class="carousel-control-prev" href="#carouselExampleControls"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#carouselExampleControls"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="sr-only">Next</span>
			</a>

		</div>
	</div>

	<%@ include file="common/footer.jsp"%>

</body>
</html>