package test;

import static org.junit.jupiter.api.Assertions.*; //??

import junit.framework.*;
import junit.textui.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dao.BookDAO_Mariadb;
import junit.extensions.*;

import service.BookService;
import service.BookServiceImpl;
import vo.BookVO;

class bookTest {
	BookService service = null;
	
	@BeforeEach
	void setUp() throws Exception {
		
		BookDAO_Mariadb dao = new BookDAO_Mariadb();
		service = new BookServiceImpl(dao);
	}
	
//	@Test
	void list() {
		service.bookList().forEach(i-> {System.out.println(i);} );
	}
	
//	@Test
	void add() {
		BookVO vo = new BookVO();
		vo.setTitle("두근두근 내 인생");
		vo.setWriter("김애란");
		vo.setContext("강동원 송혜교 출연 영화로도 제작되었어요~");
		vo.setScore((float) 4.5);
		
		service.bookAdd(vo);
		System.out.println("Book 등록 완료");
	}
	
//	@Test
	void update() {
		BookVO vo = service.getBook(1);
		if (vo != null) {
			System.out.println(vo); //먼저 1번 책정보 보여주기
			vo.setTitle("달콤한 인생");
			vo.setWriter("정하연");
			vo.setContext("수정 테스트 -> 달콤한 인생으로 수정 테스트입니다.");
			vo.setScore((float) 3.5);
			service.bookUpdate(vo); //업데이트(가격 바꿈)
			System.out.println( service.getBook(vo.getBookId()) ); //바뀐 가격으로 정보 업데이트되어 보여짐
		}
	}
	
//	@Test
	void delete() {
		BookVO vo = service.getBook(3);
		if (vo != null) {
			System.out.println(vo);
			service.bookDelete(vo.getBookId());
			System.out.println("----삭제완료----");
			System.out.println(vo);
		}
	}
	
//	@Test
	void getBook() { 
		System.out.println(service.getBook(4)); //8번 tv를 출력해라
	}
	
//	@Test
	void search() {
		System.out.println("+++검색+++");
		
		List<BookVO> list = service.bookSearch("title", "달콤"); //title에서 '달콤'이 포함된 걸 검색한다
		//검색결과가 list 안에 들어 있음...
		
		list.forEach(i -> {System.out.println(i);} ); //lambda
		
	//	for(BookVO data : list) { //list 안에 들어간 데이터가 BookVO 타입이야
	//		System.out.println(data.getTitle());
	//		System.out.printf("%s:%d:%s %n", data.getTitle(), data.getPrice(), data.getPublisher());
	//	}					//문자열:정수:문자열 줄바꿈 형태로 출력하겠다 - 가격이 정수형이니까 %d 써줌
	}
	
}