<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>왓챠피디아</title>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
	.writer{
		margin-top:10px;
		margin-bottom:10px;
		margin-left:15px;
	}
</style>

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
			<h2>책 등록</h2>
		<form action="addbook.do" method="post" enctype="multipart/form-data">
			타이틀 : <input type="text" name="title"> <br /> 
			저자 : <input type="text" name="writer"> <br />
			내용 :<br />  <textarea cols="50" rows="10" name="context"></textarea> <br /> 
			<label>첨부파일 : <input type="file" name="image" value="image"></label> <br> 
			<input type="submit" value="등록"> 
			<input type="reset" value="초기화">

		</form>
		</c:if>
	</div>

	<div class="container">

		<div id="allBest" class="carousel slide"
			data-interval="false" data-ride="carousel" data-pause="hover">
			<div class="tit" style="margin-left: 35px;">전체 베스트셀러</div>
			<div class="carousel-inner" style="margin-left: 25px;">
				<div class="carousel-item active">
					<c:forEach var="data" items="${bookList}">
						<c:if test="${data.bookId <= '5' }">
							<a class="card cardImg" href="/bookinfo.do?bookId=${data.bookId}">
							<img src="/upload/${data.image }">${data.title }<br>${data.writer }</a>
						</c:if>
					</c:forEach>
				</div>
				<div class="carousel-item">
					<c:forEach var="data" items="${bookList}">
						<c:if test="${data.bookId <= '10' and data.bookId > '5' }">
							<a class="card cardImg" href="/bookinfo.do?bookId=${data.bookId}">
							<img src="/upload/${data.image }">${data.title }<br>${data.writer }</a>
						</c:if>
					</c:forEach>
				</div>
			</div>
			
			<a class="carousel-control-prev" href="#allBest"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon"></span> <span class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#allBest"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon"></span> <span class="sr-only">Next</span>
			</a>
		</div>
		
		<div id="newBest" class="carousel slide"
			data-interval="false" data-ride="carousel" data-pause="hover">
			<div class="tit" style="margin-left: 35px;">신간 베스트셀러</div>
			<div class="carousel-inner" style="margin-left: 25px;">
				<div class="carousel-item active">
					<c:forEach var="data" items="${bookList}">
						<c:if test="${data.bookId <= '15' and data.bookId > '10' }">
							<a class="card cardImg" href="/bookinfo.do?bookId=${data.bookId}">
							<img src="/upload/${data.image }">${data.title }<br>${data.writer }</a>
						</c:if>
					</c:forEach>
				</div>
				<div class="carousel-item">
					<c:forEach var="data" items="${bookList}">
						<c:if test="${data.bookId <= '20' and data.bookId > '15' }">
							<a class="card cardImg" href="/bookinfo.do?bookId=${data.bookId}">
							<img src="/upload/${data.image }">${data.title }<br>${data.writer }</a>
						</c:if>
					</c:forEach>
				</div>
			</div>
			
			<a class="carousel-control-prev" href="#newBest"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon"></span> <span class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#newBest"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon"></span> <span class="sr-only">Next</span>
			</a>
		</div>

	</div>

	<%@ include file="common/footer.jsp"%>

</body>
</html>