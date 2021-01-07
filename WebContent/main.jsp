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
margin-left:100px;
margin-right:50px;
margin-bottom:50px;
 float: left;
 

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
<div class="tit">영화</div>
  <div class="carousel-inner"> 
    <div class="carousel-item active"> 
      <a class="card"><img src="./img/harrystone.jpg" width="170" height="220" alt="해리포터" >해리포터와 마법사의 돌<br>2001</a> 
  <a class="card"><img src="..." alt="...">만나서</a>
<a class="card" ><img src="..." alt="...">반가워요</a> 
<a class="card" ><img src="..." alt="...">잘</a> 
<a class="card" ><img src="..." alt="...">부탁드려용</a>  
    </div>
    <div class="carousel-item">
       <a class="card"><img src="..." alt="...">안녕하세요</a> 
  <a class="card"><img src="..." alt="...">만나서</a>
<a class="card" ><img src="..." alt="...">반가워요</a> 
<a class="card" ><img src="..." alt="...">잘</a> 
<a class="card" ><img src="..." alt="...">부탁드려용</a>  
    </div>
    <div class="carousel-item">
       <a class="card"><img src="..." alt="...">안녕하세요</a> 
  <a class="card"><img src="..." alt="...">만나서</a>
<a class="card" ><img src="..." alt="...">반가워요</a> 
<a class="card" ><img src="..." alt="...">잘</a> 
<a class="card" ><img src="..." alt="...">부탁드려용</a> 
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
<div class="tit">TV 프로그램</div>
  <div class="carousel-inner"> 
    <div class="carousel-item active"> 
      <a class="card"><img src="./img/sweethome.jpg" width="150" height="200" alt="스위트홈">스위트홈<br>2020</a> 
  <a class="card"><img src="..." alt="...">만나서</a>
<a class="card" ><img src="..." alt="...">반가워요</a> 
<a class="card" ><img src="..." alt="...">잘</a> 
<a class="card" ><img src="..." alt="...">부탁드려용</a>  
    </div>
    <div class="carousel-item">
       <a class="card"><img src="..." alt="...">안녕하세요</a> 
  <a class="card"><img src="..." alt="...">만나서</a>
<a class="card" ><img src="..." alt="...">반가워요</a> 
<a class="card" ><img src="..." alt="...">잘</a> 
<a class="card" ><img src="..." alt="...">부탁드려용</a>  
    </div>
    <div class="carousel-item">
       <a class="card"><img src="..." alt="...">안녕하세요</a> 
  <a class="card"><img src="..." alt="...">만나서</a>
<a class="card" ><img src="..." alt="...">반가워요</a> 
<a class="card" ><img src="..." alt="...">잘</a> 
<a class="card" ><img src="..." alt="...">부탁드려용</a> 
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
<div id="carouselControls" class="carousel slide" data-ride="carousel"> 
<div class="tit">책</div>
  <div class="carousel-inner"> 
    <div class="carousel-item active"> 
      <a class="card"><img src="./img/harrystonebook.jpg" alt="해리포터책">해리포터와 마법사의 돌<br>1997</a> 
  <a class="card"><img src="..." alt="...">만나서</a>
<a class="card" ><img src="..." alt="...">반가워요</a> 
<a class="card" ><img src="..." alt="...">잘</a> 
<a class="card" ><img src="..." alt="...">부탁드려용</a>  
    </div>
    <div class="carousel-item">
       <a class="card"><img src="..." alt="...">안녕하세요</a> 
  <a class="card"><img src="..." alt="...">만나서</a>
<a class="card" ><img src="..." alt="...">반가워요</a> 
<a class="card" ><img src="..." alt="...">잘</a> 
<a class="card" ><img src="..." alt="...">부탁드려용</a>  
    </div>
    <div class="carousel-item">
       <a class="card"><img src="..." alt="...">안녕하세요</a> 
  <a class="card"><img src="..." alt="하이큐">하이큐45</a>
<a class="card" ><img src="..." alt="...">반가워요</a> 
<a class="card" ><img src="..." alt="...">잘</a> 
<a class="card" ><img src="..." alt="...">부탁드려용</a> 
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