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

.topright {
  position: absolute;
  top: 8px;
  right: 16px;
  font-size: 18px;
}

/* 레이아웃 */
#header {width: 100%; height: 63px; position: fixed;}
#banner {position: relative;}

/* 가운데 영역 */
.container {position: relative; width: 1280px; margin: 0 auto; background: rgba(0,0,0,0); }

/* 로우 영역 */
.row {padding: 0 24px;}

/* 헤더 영역 */
.header h1 {float: left;}
.header h1 em {padding: 15px 8px 5px 0; display: inline-block;}
.header h1 em img {width: 130px; }
.header .nav {height: 50px;}
.header .nav ul {display: block; padding: 19px 10px; }
.header .nav ul li {float: left; width: 110px; text-align: center;}
.header .nav ul li a { font-size: 15px; font-weight: 500; color: #444; line-height: 50px;}
.mr-sm-2 {margin-top: 6px; float: right;}
.btn { margin-top: 6px;}

/* 여백 초기화 */
body,div,ul,li,dl,dd,dt,ol,h1,h2,h3,h4,h5,h6,input,fieldset,legend,p,select,table,th,td,tr,textarea,button,form,figure,figcaption{margin:0; padding:0;}

/* a 링크 초기화 */
a {color: #222; text-decoration: none;}
a:hover {color: #2698cb;}

/* 폰트 초기화 */
body, input, textarea, select, button, table {font-family:'Noto Sans KR', AppleSDGothicNeo-Regular,'Malgun Gothic','맑은 고딕',dotum,'돋움',sans-serif; color: #222; font-size: 13px; line-height: 1.5;}

/* 폰트 스타일 초기화 */
em,address {font-style: normal;}

/* 블릿기호 초기화 */
ul,li,ol {list-style:none;}

/* 제목 태그 초기화 */
h1,h2,h3,h4,h5,h6 {font-size: 13px; font-weight: normal;}

/* 테두리 초기화 */
img,fieldset {border:0 none;}

/* 버튼 초기화 */
button {border: 0;}

/* 반응형 */
video,img {width: 100%;}

/* clearfix */
.clearfix{*zoom:1;}
.clearfix:before, .clearfix:after {display: block; content: '';line-height: 0;}
.clearfix:after {clear: both;}

/* IR 효과 */
.ir_pm {display:block; overflow:hidden; font-size:0; line-height:0; text-indent:-9999px;} /* 의미있는 이미지의 대체 텍스트를 제공하는 경우(Phark Method) */
.ir_wa {display:block; overflow:hidden; position:relative; z-index:-1; width:100%; height: 100%;} /* 의미있는 이미지의 대체 텍스트로 이미지가 없어도 대체 텍스트를 보여주고자 할 때(WA IR) */
.ir_so {overflow: hidden; position:absolute; width:0; height:0; line-height:0; text-indent:-9999px;} /* 대체 텍스트가 아닌 접근성을 위한 숨김 텍스트를 제공할 때 */

</style>

<!-- 웹 폰트 -->
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:100,300,400,500,700,900&subset=korean" rel="stylesheet">
    
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<header id="header">
        <div class="container">
            <div class="row">
                <div class="header clearfix">
                    <h1>
                        <a href="#">
                            <em><img src="/img/logo.png" alt="WACHA"></em>
                        </a>    
                    </h1>
                    <nav class="nav">
                        <ul class="clearfix">
                            <li><a href="#">영화</a></li>
  				            <li><a href="#">TV프로그램</a></li>
  				            <li><a href="#">책</a></li>
  				           
                        </ul>
                        <div class="topright">
                         <form class="form-inline my-2 my-lg-0">
				     			<input class="form-control mr-sm-2" type="text" placeholder="작품을 검색해보세요">
				     			<button type="button" class="btn btn-link-secondary">로그인</button>
		  				        <button type="button" class="btn btn-outline-dark">회원가입</button>
				    		</form>
                        </div>
                    </nav>    
                    
                </div>
            </div>
        </div>
    </header>

	 <!-- <div class="container">
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

					Modal Header
					<div class="modal-header">
						<h4 class="modal-title">Modal Heading</h4>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>

					Modal body
					<div class="modal-body">Modal body..</div>

					Modal footer
					<div class="modal-footer">
						<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
					</div>

				</div>
			</div>
		</div>


		<div class="modal" id="login">
			<div class="modal-dialog">
				<div class="modal-content">

					Modal Header
					<div class="modal-header">
						<h4 class="modal-title">Modal Heading</h4>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>

					Modal body
					<div class="modal-body">Modal body..</div>

					Modal footer
					<div class="modal-footer">
						<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
					</div>

				</div>
			</div>
		</div>
	</div> -->

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
		
		<!-- <footer class="navbar-bottom navbar-light" >

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

</footer> -->
</body>
</html>