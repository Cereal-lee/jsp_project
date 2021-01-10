# jsp_project
비전공자 프로젝트

## 2021.01.05 시작
  환경세팅

## 2021.01.06
  User,Movie,Tv테이블 설정 및 데이터베이스 환경구축<br>
 
## 2021.01.07
  Tv 테이블 구축 및 junit를 이용하여 데이터베이스 테스트 진행<br>
  header.jsp 파일 데이터베이스 연동 및 로그인 연동<br>
  1)프로젝트를 우클릭 하여 Properties를 선택
  2)Java Build Path를 선택
  3)Libraries 탭에서 Add Library를 선택
  4)선택하는 곳에서 JUnit 선택하여 라이브러리 추가
  ```
  @Before
  public void setUp() {
  }
  ```
  이용하여 테스트 클래스 안의 메소드들이 테스트를 진행할 코드를 정의할 수 있다.
  ```
  @Test
  public void 클래스명{
  }
  ```
  @Test 어노테이션을 메도스뒤에 선언하여 해당 메소드를 테스트 대상으로 지정한다.  
## 2021.01.09
  각 테이블에 이미지 파일 들어갈 수 있도록 수정<br>
  각 테이블에 데이터가 들어 갈 수 있도록 설정
   ```
  <% @taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
  header에 넣어 core를 추가해준다.
  ```
## 2021.01.10
  header 및 footer Css이미지 처리<br>
  각 테이블에 점수 들어갈 수 있도록 수정할 예정
