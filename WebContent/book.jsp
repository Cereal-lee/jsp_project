<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>왓챠피디아</title>
<style>
footer{
width:100%;
max-width:1000spx;
height:auto;
margin-top:1000spx;
background-color: #f2dada;
color:#423e3e;
font-size : 12px;
}
fott{
width:100%;
max-width:1000spx;
height:auto;
margin-top:1000spx;
background-color: #deafaf;
color:#423e3e;
font-size : 20px;
}
</style>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<button type="button" onclick="location.href='/' ">메인</button>
		<button type="button" onclick="location.href='/' ">영화</button>
		<button type="button" onclick="location.href='/tvshow.do' ">TV</button>
		<button type="button" onclick="location.href='/book.do' ">책</button>
		<button type="button" class="btn btn-primary" data-toggle="modal"
			data-target="#signIn">회원가입</button>
		<button type="button" class="btn btn-primary" data-toggle="modal"
			data-target="#login">로그인</button>

		<div class="modal" id="signIn">
			<div class="modal-dialog">
				<div class="modal-content">

					<!-- Modal Header -->
					<div class="modal-header">
						<h4 class="modal-title">Modal Heading</h4>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>

					<!-- Modal body -->
					<div class="modal-body">Modal body..</div>

					<!-- Modal footer -->
					<div class="modal-footer">
						<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
					</div>

				</div>
			</div>
		</div>


		<div class="modal" id="login">
			<div class="modal-dialog">
				<div class="modal-content">

					<!-- Modal Header -->
					<div class="modal-header">
						<h4 class="modal-title">Modal Heading</h4>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>

					<!-- Modal body -->
					<div class="modal-body">Modal body..</div>

					<!-- Modal footer -->
					<div class="modal-footer">
						<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
					</div>

				</div>
			</div>
		</div>
	</div>

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
		
		<footer class="navbar-fixed-bottom navbar-light" >

  <a class="navbar-brand" style="font-size:15px"> 서비스 이용약관</a>
  <a class="navbar-brand" style="font-size:15px"> 개인정보 처리방침</a>
  <a class="navbar-brand" style="font-size:15px"> 회사 안내</a>
  
 <br>
     고객센터 : cs@watchapedia.co.kr, 02-515-9985
  <br>
  
    제휴 및 대외 협력 : contact@watcha.com, 070-7554-9696
 <br>
 <br>
    주식회사 왓챠 /
    대표 : ddd /
    서을특별시 서초구 강남대로 343 신덕빌딩 3층
    <br>
    사업자 등록 번호 123-45-67890
 <br>
<img src="/img/ui.png"> 2011 Watcha.lnc

  
  
  

</footer>
</body>
</html>