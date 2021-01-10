<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="/css/abcd.css">
	<style>
        * { line-height: 1.63; }
    </style>
</head>
<body>
	<%@ include file="common/header.jsp"%>
	<div class="container">
	        <div class="wrap">
	            <div id="side">
	                <div class="box-bookcover col-4 d-flex flex-column">
	                        <!-- TODO : box -->
	                        <div class="bookcover">
	                            <img src="../img/avengers_endgame_1382.jpg" style="width: 300px; height: 450px;" class="card-img" alt="amond">
	                        </div>
	                    </div>
	            </div>
	            <div id="contents">
	                <div class="con">
	                    <div class="con-header">
	                        <h1 id="conTitle">어벤져스: 엔드게임</h1>
	                        <p id="con-text">2019 | 액션 | 미국</p>
	                        <div>인피니티 워 이후 절반만 살아남은 지구, 마지막 희망이 된 어벤져스, 먼저 떠난 그들을 위해 모든 것을 걸었다. 위대한 어벤져스, 운명을 바꿀 최후의 전쟁이 펼쳐진다.
	                        </div>
	                    </div>
	                </div>
	            </div>
	            <div id="contents2">
	                    <div class="card-review">
	                        <div class="card-review-header d-flex flex-row align-items-center">
	                            <div class="review-score">
	                                <span class="review-score-icon">review score</span> <span class="reviewScoreNum">4.0</span>
	                            </div>
	                            <h3 class="reviewUserId sm-text gray-text">메뚜리언</h3>
	                            <span class="reviewDate sm-text gray-text">2019.12.28</span>
	                        </div>
	                        <p class="reviewContent sm-text">“다른 단일 영화에서는 결코 느낄 수 없는, 22편의 서사와 함께 흐른 10년의 시간이라는 가치. 그동안 서로 지켜봐 줘서 고마웠다는 의미로 되짚어보는 지나간 옛일들과 추억들, 그리고 우리를 위해 바치는 마지막 선물들. 완벽하진 않더라도 이다지도 우리에게 완전한 영화.”</p>
	                </div>
	            </div>
	        </div>
	</div>
	<%@ include file="common/footer.jsp"%>
</body>
</html>