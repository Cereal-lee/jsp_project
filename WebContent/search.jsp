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

		<div id="carouselControls" class="carousel slide"
			data-interval="false" data-ride="carousel" data-pause="hover">
			<div class="tit" style="margin-left: 35px;">영화</div>
			<div class="carousel-inner" style="margin-left: 25px;">
				<div class="carousel-item active">
					<c:forEach var="data" items="${movieList}">
						<a class="card cardImg" href="/movieinfo.do?movieId=${data.movieId}">
						<img src="/upload/${data.image }">${data.title }<br>${data.date }</a>
					</c:forEach>
				</div>
			</div>
		</div>

		<div id="carouselControls" class="carousel slide"
			data-interval="false" data-ride="carousel" data-pause="hover">
			<div class="tit" style="margin-left: 35px;">TV프로그램</div>
			<div class="carousel-inner" style="margin-left: 25px;">
				<div class="carousel-item active">
					<c:forEach var="data" items="${tvList}">
						<a class="card cardImg" href="/tvinfo.do?tvId=${data.tvId}">
						<img src="/upload/${data.image }">${data.title }<br>${data.date }</a>
					</c:forEach>
				</div>
			</div>
		</div>
		
		<div id="carouselControls" class="carousel slide"
			data-interval="false" data-ride="carousel" data-pause="hover">
			<div class="tit" style="margin-left: 35px;">책</div>
			<div class="carousel-inner" style="margin-left: 25px;">
				<div class="carousel-item active">
					<c:forEach var="data" items="${bookListTitle}">
						<a class="card cardImg" href="/bookinfo.do?bookId=${data.bookId}">
						<img src="/upload/${data.image }">${data.title }<br>${data.writer }</a>
					</c:forEach>
					<c:forEach var="data" items="${bookListWriter}">
						<a class="card cardImg" href="/bookinfo.do?bookId=${data.bookId}">
						<img src="/upload/${data.image }">${data.title }<br>${data.writer }</a>
					</c:forEach>
				</div>
			</div>
		</div>
		
		<div id="carouselControls" class="carousel slide"
			data-interval="false" data-ride="carousel" data-pause="hover">
			<div class="tit" style="margin-left: 35px;">유저</div>
			<div class="carousel-inner" style="margin-left: 25px;">
				<div class="carousel-item active">
					<c:forEach var="data" items="${userListName}">
						<a class="card cardImg">${data.name }</a>
					</c:forEach>
					<c:forEach var="data" items="${userListEmail}">
						<a class="card cardImg">${data.name }</a>
					</c:forEach>
				</div>
			</div>
		</div>

	</div>

	<%@ include file="common/footer.jsp"%>

</body>
</html>