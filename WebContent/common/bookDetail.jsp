<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>


<link rel="stylesheet" href="../style/bookDetailStyle.css">
<link rel="stylesheet" href="../style/typo.css">
</head>

<body>

	<div class="container">
		<section id="sec-book-info">
			<div class="row">


				<div class="box-bookcover col-4 d-flex flex-column">
					<!-- TODO : box -->
					<div class="bookcover">
						<img src="../img/bookThumnail/amond-cover.jpg" class="card-img" alt="amond">
					</div>
					<div class="bookcover-options">
						<button type="button" class="btn btn-light" data-toggle="modal" data-target="#bigviewModal">크게보기</button>
						<button type="button" class="btn btn-light" data-toggle="modal" data-target="#previewModal">미리보기</button>
					</div>
				</div>

				<div class="col box-dec">
					<div class="box-dec-header">
						<h1 id="bookTitle">아몬드</h1>
						<p id="bookInfo sm-text">손원평 지음 | 창비 | 2017년 03월 31일 출간</p>
						<div class="review-score">
							<span class="review-score-icon">review score</span> <span class="review-score-num">4.0</span>
						</div>
					</div>

					<dl class="purchase-info">
						<dt>배송비</dt>
						<dd class="sm-text">3000</dd>
					</dl>

					<dl class="purchase-info">
						<dt>가격</dt>
						<dd>
							<span id="ori-price" class="gray-text">19,000</span> <span id="sale-price">15,000</span>
						</dd>
					</dl>

					<div class="option_btnbox d-flex flex-row">
						<button type="button" class="btn btnCart flex-fill" data-toggle="modal" data-target="#cartModal">CART</button>
						<button type="button" class="btn btnBuy flex-fill" data-toggle="modal" data-target="#buyModal">BUY</button>
					</div>
				</div>
			</div>

		</section>

		<section class="sec-book-dec top-divider">
			<h2 class="sec-title">품목 정보</h2>
			<p id="bookDetail">
				2017년 03월 31일 출간<br> 264쪽 | 388g | 134*195*20mm
			</p>

			<h2 class="sec-title">책 소개</h2>
			<p id="bookStory">열여섯 살 소년 선윤재는 ‘감정 표현 불능증’을 앓고 있다. ‘아몬드’라 불리는 편도체가 작아 분노도 공포도 잘 느끼지 못한다. 타고난 침착성, 엄마와 할머니의 지극한 사랑 덕에 별 탈 없이 지냈지만, 크리스마스이브이던 열여섯 번째 생일날 비극적인 사고가 일어나 가족을 잃는다. 세상에 홀로 남겨진 윤재 앞에 ‘곤이’가 나타난다. 13년 만에 가족의 품으로 돌아오게 된 곤이는 분노로 가득 찬 아이다. 곤이는 윤재에게 화를 쏟아 내지만, 감정의 동요가 없는 윤재 앞에서 오히려 쩔쩔매고 만다. 윤재는 어쩐지 곤이가 밉지 않고, 오히려 궁금해진다. 두 소년은 남들이 이해할 수 없는 특별한 우정을 쌓아 간다. 윤재는 조금씩 내면의 변화를 겪는데... 서로 다른 이유로 ‘괴물’이라 불리는 두 소년은 세상으로 한 발짝 나아갈 수 있을까?</p>
		</section>

		<section class="sec-reviews top-divider">

			<div class="sec-header d-flex flex-row align-items-center">
				<h2 class="sec-title">전체 리뷰</h2>

				<div class="review-score">
					<span class="review-score-icon">review score</span> <span class="review-score-num">4.0</span>
				</div>

				<span>(all)</span>
			</div>

			<div class="sec-review">

				<div class="card-review">
					<div class="card-review-header d-flex flex-row align-items-center">
						<div class="review-score">
							<span class="review-score-icon">review score</span> <span class="reviewScoreNum">4.0</span>
						</div>
						<h3 class="reviewUserId sm-text gray-text">@kkkk6810</h3>
						<span class="reviewDate sm-text gray-text">2000.12.28</span>
					</div>

					<p class="reviewContent sm-text">베스트셀러 에 꽤 오랫동안 올라온 책이라 유심히 지켜보고 있었어요. 적립금 이 많아서 구입하게 되었는데 최근 읽었던 소설책 중에서 이렇게 흥미있고 궁금 해서 술술 읽 혔던 책은 아몬드가 유일해요. 아이의 마음 엄마의 마음이 고스란히 느껴지고 내가 그 아이라면 어땠을까? 심경을 읽지 못하는 건 어떤 기분일지 아이 키우는 엄마이다 보니 감정이입이 되어서 페이지가 훅훅 넘어 갔어요. 코로나.19 이후로 경제 자기계발 서적이 요즘 인기가 많은데 아몬드 통해 다시금 소설 의 재미를 다시 금 느꼈어요. 프리즘 읽고싶어서 곧 주문하1려고 합니다.신인작가들의 기발한 창작소설이 흥행하는 때가 오기를 간절히 기대하고 바래봅니다</p>

				</div>

			</div>

		</section>
	</div>

	<!-- Cart Modal -->
	<div class="modal fade" id="cartModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">장바구니에 담았습니다.</h5>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">장바구니 바로가기</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-dark">Yes</button>
				</div>
			</div>
		</div>
	</div>

	<!-- Buy Modal -->
	<div class="modal fade" id="buyModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">구매하시겠습니까?</h5>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">'아몬드 | 손원평 지음 | 창비' 1권 맞습니까?</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
					<button type="button" class="btn btn-dark">Yes</button>
				</div>
			</div>
		</div>
	</div>

	<!-- Big View Modal -->
	<div class="modal fade" id="bigviewModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-xl modal-dialog-centered">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="btn btn-secondary" data-dismiss="modal">&#215;</button>
				</div>
				<div class="modal-body">
					<img src="./amond-cover.jpg" alt="amond's book cover">
				</div>
			</div>
		</div>
	</div>

	<!-- PreView Modal -->
	<div class="modal fade " id="previewModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-xl modal-dialog-centered">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="btn btn-secondary" data-dismiss="modal">&#215;</button>
				</div>
				<div class="modal-body">
					<div id="carouselExampleInterval" class="carousel slide" data-ride="carousel">
						<div class="carousel-inner">
							<div class="carousel-item active" data-interval="10000">
								<img src="inner1.jpg" class="d-block w-100" alt="...">
							</div>
							<div class="carousel-item" data-interval="2000">
								<img src="inner2.jpg" class="d-block w-100" alt="...">
							</div>
							<div class="carousel-item">
								<img src="inner3.jpg" class="d-block w-100" alt="...">
							</div>
						</div>
						<a class="carousel-control-prev" href="#carouselExampleInterval" role="button" data-slide="prev">
							<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span class="sr-only">Previous</span>
						</a>
						<a class="carousel-control-next" href="#carouselExampleInterval" role="button" data-slide="next">
							<span class="carousel-control-next-icon" aria-hidden="true"></span> <span class="sr-only">Next</span>
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>


	<%@ include file="../layout/script.jsp"%>
	<%@ include file="../layout/bottom.jsp"%>