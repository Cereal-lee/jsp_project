<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<!-- css -->
<link rel="stylesheet" href="../css/style.css">
<link rel="stylesheet" href="../css/reset.css">
<!-- 웹 폰트 -->
<link
	href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:100,300,400,500,700,900&subset=korean"
	rel="stylesheet">

<title>WachaPedia</title>
</head>
<body>
	<!-- header -->
	<header id="header">
		<div class="container">
			<div class="row">
				<div class="header clearfix">
					<h1>
						<a href="/"> <em><img src="../img/logo.png" alt="WACHA" ></em>
						</a>
					</h1>
					<nav class="nav">
						<ul class="clearfix">
							<li><a href="/">영화</a></li>
							<li><a href="tvshow.do">TV프로그램</a></li>
							<li><a href="book.do">책</a></li>
						</ul>		
						<div class="topright" style="margin-top:19px; margin-left:150px;">
							<div class="container">
							
								<c:choose>
									<c:when test="${not empty login }">
									<form class="form-inline my-2 my-lg-0">
										<input class="form-control mr-sm-2" type="text"
												placeholder="작품을 검색해보세요">
										<p style="margin-right:15px; margin-left:15px;">${login.name}님</p>
										<button type="button" class="btn btn-outline-dark" onclick="location.href='/logout.do' ">로그아웃</button>
									</form>
										
									</c:when>
									<c:otherwise>
									
										<form class="form-inline my-2 my-lg-0">
											<input class="form-control mr-sm-2" type="text"
												placeholder="작품을 검색해보세요">
											<button type="button" class="btn btn-link-secondary"
												data-toggle="modal" data-target="#login">로그인</button>
											<button type="button" class="btn btn-outline-dark"
												data-toggle="modal" data-target="#signIn">회원가입</button>
										</form>
										</div>
										<div class="modal" id="signIn">
											<div class="modal-dialog">
												<div class="modal-content">

													<!-- Modal Header -->
													<div class="modal-header">
														<h5 class="modal-title">회원가입</h5>
													</div>

													<!-- Modal body -->
													<form action="register.do" method="POST" name="signForm"
														onsubmit="return confirm('회원가입 하시겠습니까?')">
														<div class="modal-body">
															<div class="input-group mb-3">
																<input type="text" class="form-control" name="name"
																	placeholder="이름">
															</div>
															<div class="input-group mb-3">
																<input type="email" class="form-control" name="email"
																	placeholder="이메일">
															</div>
															<div class="input-group mb-3">
																<input type="password" class="form-control"
																	name="password" placeholder="비밀번호">
															</div>
															<input type="hidden" name="role" value="user"> 
															<input type="submit" class="btn btn-primary btn-block"
																id="btnSign" value="회원가입">
														</div>
													</form>

													<!-- Modal footer -->
													<div class="modal-footer">
														<button type="button" class="btn btn-danger btn-block"
															data-dismiss="modal">닫기</button>
													</div>

												</div>
											</div>
										</div>

										<div class="modal" id="login">
											<div class="modal-dialog">
												<div class="modal-content">

													<!-- Modal Header -->
													<div class="modal-header">
														<h5 class="modal-title">로그인</h5>
													</div>

													<!-- Modal body -->
													<form action="login.do" method="POST" name="loginForm">
														<div class="modal-body">
															<div class="input-group mb-3">
																<input type="email" class="form-control" name="email"
																	placeholder="이메일">
															</div>
															<div class="input-group mb-3">
																<input type="password" class="form-control"
																	name="password" placeholder="비밀번호">
															</div>
															<input type="hidden" name="role" value="user"> <input
																type="submit" class="btn btn-primary btn-block"
																id="login" value="로그인">
														</div>
													</form>

													<!-- Modal footer -->
													<div class="modal-footer">
														<button type="button" class="btn btn-danger btn-block"
															data-dismiss="modal">닫기</button>
													</div>

												</div>
											</div>
										</div>
									</c:otherwise>
								</c:choose>
						</ul>
					</nav>

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

		<script type="text/javascript">
			function isEmail(value) {
				let regExp = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
				return regExp.test(value); // 형식에 맞는 경우 true 리턴	
			}
			$('#btnSign').on('click', function(e) {
				e.preventDefault();
				let email = $.trim($('input[name="email"]').val());
				if (!$('input[name="name"]').val()) {
					alert('이름을 입력해주세요');
					$('input[name="name"]').focus();
					return false;
				}
				if (!email) {
					alert('이메일을 입력해주세요');
					$('input[name="email"]').focus();
					return false;
				}
				if (!isEmail(email)) {
					alert('올바른 형식의 이메일을 입력해주세요');
					$('input[name="email"]').focus();
					return false;
				}
				if (!$('input[name="password"]').val()) {
					alert('비밀번호를 입력해주세요');
					$('input[name="password"]').focus();
					return false;
				}
				$('form[name=signForm]').submit();
			});
		</script>
	</header>
	<!-- //header -->