<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style>
.card {
width:100;
height:100;
margin-top:30px;
margin-left:10px;
margin-right:0px;
margin-bottom:400px;
 float: left;
 

}
.cardImg {
  width: 200px;
  height: 300px;
  object-fit: cover;
}
.tit {
width:0 auto;
height:0 auto;
margin-top:20px;
margin-left:50px;
font-size:20px;
color:ff0000;

}
</style>

</head>
<body>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
<br>
<br>
<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
<div class="tit" style="margin-left:10px;">전체 베스트셀러</div>
  <div class="carousel-inner"> 
    <div class="carousel-item active"> 
      <p class="card cardImg"><img src="./img/delusion.jpg"  alt="공정하다는착각" >공정하다는 착각<br>2020 &nbsp;&nbsp;마이클 샌델<br>평점 : 3.9</p> 
  <p class="card cardImg"><img src="./img/dream.jpg" alt="달러구트꿈백화점">달러구트 꿈 백화점<br>2020 &nbsp;&nbsp;이미예<br>평점 : 3.8</p>
<p class="card cardImg" ><img src="./img/hiq.jpg" alt="하이큐45" >하이큐!!45<br>2020 &nbsp;&nbsp;후루다테 하루이치<br>평점 : 4.1</p> 
<p class="card cardImg" ><img src="./img/poem.jpg" alt="마음챙김의시">마음챙김의 시<br>2020 &nbsp;&nbsp;류시화<br>평점 : 3.9</p> 
<p class="card cardImg" ><img src="./img/rotate.jpg"  alt="주술회전">주술회전 <br>2021 &nbsp;&nbsp;아쿠타미 게게<br>평점 : 3.6</p>  
    </div>
    <div class="carousel-item">
       <p class="card cardImg"><img src="./img/classic.jpg"  alt="1일1클래식1기쁨" >1일 1클래식 1기쁨<br>2020 &nbsp;&nbsp;클레먼시 버턴힐<br>평점 : 3.5</p> 
  <p class="card cardImg"><img src="./img/fiveyears.jpg" alt="앞으로 5년">앞으로 5년, 집을 사고팔 타이밍은 정해져 있다<br>2020 &nbsp;&nbsp;강승우<br>평점 : 5.0</p>
<p class="card cardImg" ><img src="./img/midnight.jpg" alt="미드나잇 선" >미드나잇 선<br>2020 &nbsp;&nbsp;스테프니 메이어<br>평점 : 3.7</p> 
<p class="card cardImg" ><img src="./img/rich.jpg" alt="부자의 공식">부자의 공식<br>2020 &nbsp;&nbsp;이정윤<br>평점 : 3.9</p> 
<p class="card cardImg" ><img src="./img/rotate.jpg"  alt="주술회전">주술회전 <br>2021 &nbsp;&nbsp;아쿠타미 게게<br>평점 : 3.6</p>    
    </div>
    <div class="carousel-item">
      <p class="card cardImg"><img src="./img/delusion.jpg"  alt="공정하다는착각" >공정하다는 착각<br>2020 &nbsp;&nbsp;마이클 샌델<br>평점 : 3.9</p> 
 <p class="card cardImg"><img src="./img/classic.jpg"  alt="1일1클래식1기쁨" >1일 1클래식 1기쁨<br>2020 &nbsp;&nbsp;클레먼시 버턴힐<br>평점 : 3.5</p> 
<p class="card cardImg" ><img src="./img/hiq.jpg" alt="하이큐45" >하이큐!!45<br>2020 &nbsp;&nbsp;후루다테 하루이치<br>평점 : 4.1</p> 
<p class="card cardImg" ><img src="./img/midnight.jpg" alt="미드나잇 선" >미드나잇 선<br>2020 &nbsp;&nbsp;스테프니 메이어<br>평점 : 3.7</p>  
<p class="card cardImg" ><img src="./img/rotate.jpg"  alt="주술회전">주술회전 <br>2021 &nbsp;&nbsp;아쿠타미 게게<br>평점 : 3.6</p>  
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>


</div>
<br>
<br>
<div id="carouselExample" class="carousel slide" data-ride="carousel"> 
<div class="tit" style="margin-left:10px;">신간 베스트셀러</div>
  <div class="carousel-inner"> 
    <div class="carousel-item active"> 
     <p class="card cardImg"><img src="./img/delusion.jpg"  alt="공정하다는착각" >공정하다는 착각<br>2020 &nbsp;&nbsp;마이클 샌델<br>평점 : 3.9</p> 
  <p class="card cardImg"><img src="./img/dream.jpg" alt="달러구트꿈백화점">달러구트 꿈 백화점<br>2020 &nbsp;&nbsp;이미예<br>평점 : 3.8</p>
<p class="card cardImg" ><img src="./img/hiq.jpg" alt="하이큐45" >하이큐!!45<br>2020 &nbsp;&nbsp;후루다테 하루이치<br>평점 : 4.1</p> 
<p class="card cardImg" ><img src="./img/poem.jpg" alt="마음챙김의시">마음챙김의 시<br>2020 &nbsp;&nbsp;류시화<br>평점 : 3.9</p> 
<p class="card cardImg" ><img src="./img/rotate.jpg"  alt="주술회전">주술회전 <br>2021 &nbsp;&nbsp;아쿠타미 게게<br>평점 : 3.6</p>  
    </div>
    <div class="carousel-item">
       <p class="card cardImg"><img src="./img/classic.jpg"  alt="1일1클래식1기쁨" >1일 1클래식 1기쁨<br>2020 &nbsp;&nbsp;클레먼시 버턴힐<br>평점 : 3.5</p> 
  <p class="card cardImg"><img src="./img/fiveyears.jpg" alt="앞으로 5년">앞으로 5년, 집을 사고팔 타이밍은 정해져 있다<br>2020 &nbsp;&nbsp;강승우<br>평점 : 5.0</p>
<p class="card cardImg" ><img src="./img/midnight.jpg" alt="미드나잇 선" >미드나잇 선<br>2020 &nbsp;&nbsp;스테프니 메이어<br>평점 : 3.7</p> 
<p class="card cardImg" ><img src="./img/rich.jpg" alt="부자의 공식">부자의 공식<br>2020 &nbsp;&nbsp;이정윤<br>평점 : 3.9</p> 
<p class="card cardImg" ><img src="./img/rotate.jpg"  alt="주술회전">주술회전 <br>2021 &nbsp;&nbsp;아쿠타미 게게<br>평점 : 3.6</p>    
    </div>
    <div class="carousel-item">
      <p class="card cardImg"><img src="./img/delusion.jpg"  alt="공정하다는착각" >공정하다는 착각<br>2020 &nbsp;&nbsp;마이클 샌델<br>평점 : 3.9</p> 
 <p class="card cardImg"><img src="./img/classic.jpg"  alt="1일1클래식1기쁨" >1일 1클래식 1기쁨<br>2020 &nbsp;&nbsp;클레먼시 버턴힐<br>평점 : 3.5</p> 
<p class="card cardImg" ><img src="./img/hiq.jpg" alt="하이큐45" >하이큐!!45<br>2020 &nbsp;&nbsp;후루다테 하루이치<br>평점 : 4.1</p> 
<p class="card cardImg" ><img src="./img/midnight.jpg" alt="미드나잇 선" >미드나잇 선<br>2020 &nbsp;&nbsp;스테프니 메이어<br>평점 : 3.7</p>  
<p class="card cardImg" ><img src="./img/rotate.jpg"  alt="주술회전">주술회전 <br>2021 &nbsp;&nbsp;아쿠타미 게게<br>평점 : 3.6</p>
    </div>
  </div>

   <a class="carousel-control-prev" href="#carouselExample" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExample" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<br>
<br>
<div id="carouselControls" class="carousel slide" data-ride="carousel" data-pause="hover"> 
<div class="tit" style="margin-left:10px;">가장 많이 검색된 책</div>
  <div class="carousel-inner"> 
    <div class="carousel-item active"> 
     <p class="card cardImg"><img src="./img/delusion.jpg"  alt="공정하다는착각" >공정하다는 착각<br>2020 &nbsp;&nbsp;마이클 샌델<br>평점 : 3.9</p> 
  <p class="card cardImg"><img src="./img/dream.jpg" alt="달러구트꿈백화점">달러구트 꿈 백화점<br>2020 &nbsp;&nbsp;이미예<br>평점 : 3.8</p>
<p class="card cardImg" ><img src="./img/hiq.jpg" alt="하이큐45" >하이큐!!45<br>2020 &nbsp;&nbsp;후루다테 하루이치<br>평점 : 4.1</p> 
<p class="card cardImg" ><img src="./img/poem.jpg" alt="마음챙김의시">마음챙김의 시<br>2020 &nbsp;&nbsp;류시화<br>평점 : 3.9</p> 
<p class="card cardImg" ><img src="./img/rotate.jpg"  alt="주술회전">주술회전 <br>2021 &nbsp;&nbsp;아쿠타미 게게<br>평점 : 3.6</p>  
    </div>
    <div class="carousel-item">
       <p class="card cardImg"><img src="./img/classic.jpg"  alt="1일1클래식1기쁨" >1일 1클래식 1기쁨<br>2020 &nbsp;&nbsp;클레먼시 버턴힐<br>평점 : 3.5</p> 
  <p class="card cardImg"><img src="./img/fiveyears.jpg" alt="앞으로 5년">앞으로 5년, 집을 사고팔 타이밍은 정해져 있다<br>2020 &nbsp;&nbsp;강승우<br>평점 : 5.0</p>
<p class="card cardImg" ><img src="./img/midnight.jpg" alt="미드나잇 선" >미드나잇 선<br>2020 &nbsp;&nbsp;스테프니 메이어<br>평점 : 3.7</p> 
<p class="card cardImg" ><img src="./img/rich.jpg" alt="부자의 공식">부자의 공식<br>2020 &nbsp;&nbsp;이정윤<br>평점 : 3.9</p> 
<p class="card cardImg" ><img src="./img/rotate.jpg"  alt="주술회전">주술회전 <br>2021 &nbsp;&nbsp;아쿠타미 게게<br>평점 : 3.6</p>    
    </div>
    <div class="carousel-item">
      <p class="card cardImg"><img src="./img/delusion.jpg"  alt="공정하다는착각" >공정하다는 착각<br>2020 &nbsp;&nbsp;마이클 샌델<br>평점 : 3.9</p> 
 <p class="card cardImg"><img src="./img/classic.jpg"  alt="1일1클래식1기쁨" >1일 1클래식 1기쁨<br>2020 &nbsp;&nbsp;클레먼시 버턴힐<br>평점 : 3.5</p> 
<p class="card cardImg" ><img src="./img/hiq.jpg" alt="하이큐45" >하이큐!!45<br>2020 &nbsp;&nbsp;후루다테 하루이치<br>평점 : 4.1</p> 
<p class="card cardImg" ><img src="./img/midnight.jpg" alt="미드나잇 선" >미드나잇 선<br>2020 &nbsp;&nbsp;스테프니 메이어<br>평점 : 3.7</p>  
<p class="card cardImg" ><img src="./img/rotate.jpg"  alt="주술회전">주술회전 <br>2021 &nbsp;&nbsp;아쿠타미 게게<br>평점 : 3.6</p>
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselControls" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<%@ include file = "footer.jsp" %>
</body>
</html>