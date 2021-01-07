package test;

import static org.junit.jupiter.api.Assertions.*; //??

import junit.framework.*;
import junit.textui.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import junit.extensions.*;

import dao.TvDAO_Mariadb;
import service.TvService;
import service.TvServiceimpl;
import vo.TvVO;

class tvTest {
	TvService service = null;
	
	@BeforeEach
	void setUp() throws Exception {
		
		TvDAO_Mariadb dao = new TvDAO_Mariadb();
		service = new TvServiceimpl(dao);
	}
	
//	@Test
	void list() {
		service.tvList().forEach(i-> {System.out.println(i);} );
	}
	
//	@Test
	void add() {
		TvVO vo = new TvVO();
		vo.setTitle("펜트하우스");
		vo.setDate("2020-11-12");
		vo.setContext("펜트하우스 재밌어요 <br> 막장드라마지만 재밌음~");
		vo.setScore((float) 3.5);
		
		service.tvAdd(vo);
		System.out.println("TV정보 등록 완료");
	}
	
//	@Test
	void update() {
		TvVO vo = service.getTv(1);
		if (vo != null) {
			System.out.println(vo); //먼저 8번 책정보 보여주기
			vo.setTitle("스위트홈");
			vo.setDate("2021-01-01");
			vo.setContext("수정 테스트 펜트하우스 -> 스위트홈");
			vo.setScore((float) 3.5);
			service.tvUpdate(vo); //업데이트(가격 바꿈)
			System.out.println( service.getTv(vo.getTvId()) ); //바뀐 가격으로 정보 업데이트되어 보여짐
		}
		
	}
	
//	@Test
	void delete() {
		TvVO vo = service.getTv(7);
		if (vo != null) {
			System.out.println(vo);
			service.tvDelete(vo.getTvId());
			System.out.println("----삭제완료----");
			System.out.println(vo);
		}
	}
	
//	@Test
	void getTv() { 
		System.out.println(service.getTv(8)); //8번 tv를 출력해라
	}
	
//	@Test
	void search() {
	System.out.println("+++검색+++");
	
	List<TvVO> list = service.tvSearch("title", "스위"); //title에서 '스위'가 포함된 걸 검색한다
	//검색결과가 list 안에 들어 있음...
	
	list.forEach(i -> {System.out.println(i);} ); //lambda
	
//	for(BookVO data : list) { //list 안에 들어간 데이터가 BookVO 타입이야
//		System.out.println(data.getTitle());
//		System.out.printf("%s:%d:%s %n", data.getTitle(), data.getPrice(), data.getPublisher());
//	}					//문자열:정수:문자열 줄바꿈 형태로 출력하겠다 - 가격이 정수형이니까 %d 써줌
}
	
}