# jsp_project
비전공자 프로젝트

## 2021.01.05 시작
  환경세팅

## 2021.01.06
  페이지 생성<br>
  DispatcherServlet으로 페이지 이동<br>
  ```
  //.do로 요청되는 페이지는 모두 받음
  @WebServlet("*.do")
  ```
  ```
  request.setCharacterEncoding("UTF-8");
  response.setContentType("text/html;charset=UTF-8");

  String url = request.getRequestURI();
  String action = url.substring(url.lastIndexOf('/'));

  if (action.equals("/url.do")) {
  url에 따라서 내용 추가
  }
  ```
  Bootstrap4 modal창으로 login/regist<br>
  MariaDB연동<br>
  login/regist 유효성 검사
  ```
  <script type="text/javascript">
	function isEmail(value) {
		let regExp = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
		return regExp.test(value); // 형식에 맞는 경우 true 리턴	
	}
      
        $('#btnSign').on('click', function(e) {
		e.preventDefault();
        	let email = $.trim($('input[name="email"]').val());
        
        	if (!isEmail(email)) {
			alert('올바른 형식의 이메일을 입력해주세요');
			$('input[name="email"]').focus();
			return false;
		}
        });
  </script>
  ```
  
## 2021.01.07
  login시 session 추가<br>
  ```
  if (login != null) {
	HttpSession session = request.getSession();
	session.setAttribute("login", login);
	response.sendRedirect("movie.do");
	} else {
	PrintWriter out = response.getWriter();
	out.println("<script>alert('로그인 정보를 확인해주세요.'); location.href='movie.do';</script>");
	out.flush();
	out.close();
  }
  ```
  jstl로 login상태와 !login상태에서 보이는 페이지에 차이가 있게함<br>
  ```
  <c:choose>
	<c:when test="${not empty login }">
      	내용
    	</c:when>
	<c:otherwise>
      	내용
   	</c:otherwise>
  </c:choose>
  ```
  jstl로 user와 admin차이를 두어 관리자 페이지 생성<br>
  ```
  <c:if test="${login.role eq 'admin' }">
    내용
  </c:if>
  ```
  css merge(header/footer)
  
## 2021.01.09
  email 중복체크<br>
  ```
  //Servlet에서 check
  if (list.isEmpty()) {
	회원가입성공
  } else {
	회원가입실패	
  }
  ```
  관리자 페이지에서 DB upload(영화,TV프로그램,책)<br>
  Servlet과 jstl이용해서 db에서 list를 가지고 와서 보이게 함 <br>
  ```
  <c:forEach var="data" items="${movieList}">
    <a class="card cardImg" href="/movieinfo.do?movieId=${data.movieId}">
	<img src="/upload/${data.image }">${data.title }<br>${data.date }</a>
  </c:forEach>
  ```
  jstl 이용해서 carousel안에 5개씩만 보이게 함<br>
  ```
  <c:if test="${data.movieId <= '5' }">
    내용
  </c:if>
  ```
  search 추가(유저 이름, 이메일, 책 이름, 저자, tv프로그램 이름, 영화 이름)<br>
  ```
  request.setAttribute("userListName", userListName);
  request.setAttribute("userListEmail", userListEmail);
  request.setAttribute("bookListTitle", bookListTitle);
  request.setAttribute("bookListWriter", bookListWriter);
  request.setAttribute("tvList", tvList);
  request.setAttribute("movieList", movieList);
  ```
  css merge(font/footer)
  
## 2021.01.10
