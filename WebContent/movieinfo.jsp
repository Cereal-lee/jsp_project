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
		<input type="hidden" name="movieId" value="${ movie.movieId }">
		<img src="/upload/${movie.image }"><br>
		${movie.title }<br>${movie.date }<br>${movie.score }<br>${movie.context }
	</div>
	
	<%@ include file="common/footer.jsp"%>

</body>
</html>