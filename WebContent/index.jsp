<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>왓챠피디아</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<button type="button" onclick="location.href='/'">메인</button>
		<button type="button" onclick="location.href='/">영화</button>
		<button type="button" onclick="location.href='/tvshow.do'">TV</button>
		<button type="button" onclick="location.href='/book.do'">책</button>
		<button type="button" class="btn btn-primary" data-toggle="modal"
			data-target="#signIn">회원가입</button>
		<button type="button" class="btn btn-primary" data-toggle="modal"
			data-target="#login">로그인</button>
		<div class="modal" id="signIn">
			<div class="modal-dialog">
				<div class="modal-content">

					<!-- Modal Header -->
					<div class="modal-header">
						<h5 class="modal-title">회원가입</h5>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>

					<!-- Modal body -->
					<form>
						<div class="modal-body">

							<div class="input-group mb-3">
								<input type="text" class="form-control" placeholder="이름">
							</div>
							<div class="input-group mb-3">
								<input type="text" class="form-control" placeholder="이메일">
							</div>
							<div class="input-group mb-3">
								<input type="text" class="form-control" placeholder="비밀번호">
							</div>
							<button type="button" class="btn btn-primary btn-block">회원가입</button>
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
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>

					<!-- Modal body -->
					<form>
						<div class="modal-body">
							<div class="input-group mb-3">
								<input type="text" class="form-control" placeholder="이메일">
							</div>
							<div class="input-group mb-3">
								<input type="text" class="form-control" placeholder="비밀번호">
							</div>
						<button type="button" class="btn btn-primary btn-block">로그인</button>
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
</body>
</html>