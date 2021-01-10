<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>왓챠피디아</title>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<style>
        * { line-height: 1.63; }
    </style>
    
    <link rel="stylesheet" href="/css/info.css">
</head>
<body>
	<%@ include file="common/header.jsp"%>
	<div class="container">
	<input type="hidden" name="bookId" value="${ book.bookId }">
	        <div class="wrap">
	            <div id="side">
	                <div class="box-bookcover col-4 d-flex flex-column">
	                        <!-- TODO : box -->
	                        <div class="bookcover">
	                            <img src="/upload/${book.image }" style="width: 300px; height: 450px;" class="card-img" alt="amond">
	                        </div>
	                    </div>
	            </div>
	            <div id="contents">
	                <div class="con">
	                    <div class="con-header">
	                        <h1 id="conTitle">${book.title }</h1>
	                        <p style="float:right; font-size:20px;">${book.writer }</p>
	                        <div style="padding-top: 20px; font-size:15px;">
	 	                       <hr>${book.context }
	                        </div>
	                    </div>
	                </div>
	            </div>
	            <div id="contents2">
	                    <div class="card-review" style="padding-left: 50px; padding-right: 50px;">
	                            <div class="review-score" style="float:right;">
	                                <span class="review-score-icon">review score</span> 
	                                <span class="reviewScoreNum">${book.score }</span>
	                            </div>
	                            <h4 class="reviewUserId sm-text gray-text">메뚜리언</h4>
	                            <span class="reviewDate sm-text gray-text"><br>2019.12.28<hr></span>
	                        <p class="reviewContent sm-text">“다른 단일 영화에서는 결코 느낄 수 없는, 22편의 서사와 함께 흐른 10년의 시간이라는 가치. 그동안 서로 지켜봐 줘서 고마웠다는 의미로 되짚어보는 지나간 옛일들과 추억들, 그리고 우리를 위해 바치는 마지막 선물들. 완벽하진 않더라도 이다지도 우리에게 완전한 영화.”</p>
	                </div>
	            </div>
	        </div>
	</div>
	<%@ include file="common/footer.jsp"%>
</body>
</html>