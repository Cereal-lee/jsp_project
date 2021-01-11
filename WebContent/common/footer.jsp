<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
<style>
footer {
	width: 100%;
	height: 220px;
	margin-top: 1000spx;
	background-color: #080808;
	font-size: 13px;
	color: #7a7a7a;
}

.ftn {
	text-indent: 2em;
}

.btn2-group {
	margin-top: 70px;
	float: right;
	margin-right: 10%;
}

.btn2 {
	width: 50px;
	height: 30px;
}

.ig {
	width: 30px;
	heght: 30px;
	float: right;
}
</style>
</head>
<body>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
		integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
		crossorigin="anonymous"></script>


	<div class="container-fluid">

		<footer class="bm_left" style="margin-top: 40px;">
			<div class="container">
				<div style="margin-left: 20px;">
					<br> <a
						style="color: #757575; margin-left: 5px; margin-right: 5px;"
						href="#">서비스 이용약관</a>| <a
						style="color: #757575; margin-left: 5px; margin-right: 5px;"
						href="#">개인정보 처리방침</a>| <a
						style="color: #757575; margin-left: 5px; margin-right: 5px;"
						href="#">회사 안내</a>

				</div>

				<div class="btn-group" style="float: right; margin-right: 40px; bottom: 20px;">
					<button type="button" class="btn btn-outline-secondary btn-sm" style="padding-left: 25px; padding-right: 25px;">한국어</button>
					<button type="button" class="btn btn-outline-secondary dropdown-toggle dropdown-toggle-split btn-sm" data-toggle="dropdown">
						<span class="caret"></span>
					</button>

					<div class="dropdown-menu">
						<a href="#">한국어</a>
						<a href="#">일본어</a>
					</div>
				</div>

			</div>
			<br>
			<div class="container">
				<div class="ftn">고객센터 : cs@watchapedia.co.kr, 02-515-9985</div>
				<div class="ftn">제휴 및 대외 협력 : contact@watcha.com,
					070-7554-9696</div>
				<div class="ig" style="margin-right: 40px;">
					<a href="https://www.facebook.com/watchaKR/"><img
						src="${pageContext.request.contextPath}/img/페이스북.png" /></a> <a href="https://twitter.com/watcha_kr"><img
						src="${pageContext.request.contextPath}/img/트위터.png" /></a> <a
						href="https://www.instagram.com/watcha_kr/"><img
						src="${pageContext.request.contextPath}/img/인스타.png" /></a>
				</div>	
				<br>
				<div class="ftn">주식회사 왓챠 | 대표 아무개 | 서을특별시 서초구 강남대로 343 신덕빌딩 3층</div>
				<div class="ftn">사업자 등록 번호 123-45-67890</div>
				<div class="ftn" style="margin-top: 10px;">
					<img src="${pageContext.request.contextPath}/img/ui2.png" style="width: 40px; height: 40px;">
					2011 Watcha.lnc
				</div>
				
			</div>
		</footer>
	</div>

</body>
</html>