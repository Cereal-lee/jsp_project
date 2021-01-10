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
	<input type="hidden" name="movieId" value="${ movie.movieId }">
	<div class="container">
	<div class="row">
	  <div class="col">
		<figure class="figure">
		<img  src="/upload/${movie.image }" class="figure-img img-fluid rounded"><br>
		</figure>
	</div>
	<div class="col"> 
		<span class="align-middle">${movie.title } | ${movie.date } | ${movie.score }<br>
					${movie.context }</span></div>
	</div>
	
	
		
		
		
	</div>
	
	<%@ include file="common/footer.jsp"%>

</body>
</html>