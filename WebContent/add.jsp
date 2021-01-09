<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Insert title here</title>

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<!-- css -->
<script type="text/javascript">

    function oneCheckbox (a) {
        var obj = document.getElementsByName ( "checkbox");
        for (var i = 0; i <obj.length; i ++) {
            if (obj [i]! = a) {
                obj [i] .checked = false;
            }
        }
    }
</script>
</head>
<body>
	<section>
		<h2>등록</h2>
		<form action="add.do" method="post" enctype="multipart/form-data">
			타이틀 : <input type="text" name="title"> <br /> 
			출시일 : <input type="text" name="date"> <br /> 
			내용 : <input type="number" name="context"> <br /> 
			종류 :<br /> 	
			<div class="form-check">
				<label class="form-check-label"> 
				<input type="radio" class="form-check-input" name="optradio" value="movie">영화
				</label>
			</div>
			<div class="form-check">
				<label class="form-check-label"> <input type="radio"
					class="form-check-input" name="optradio" value="tv">TV프로그램
				</label>
			</div>
			<div class="form-check">
				<label class="form-check-label"> <input type="radio"
					class="form-check-input" name="optradio" value="book">책
				</label>
			</div>

			<label>첨부파일 : <input type="file" name="img">
			</label> <br> <input type="submit" value="등록"> <input
				type="reset" value="초기화">

		</form>

	</section>
</body>

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
</html>