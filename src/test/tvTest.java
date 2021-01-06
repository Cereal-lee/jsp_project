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
import service.TvServiceImpl;
import vo.TvVO;

class tvTest {
	TvService service = null;
	
	@BeforeEach
	void setUp() throws Exception {
		
		TvDAO_Mariadb dao = new TvDAO_Mariadb();
		service = new TvServiceImpl(dao);
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
		
		service.tvAdd(vo);
		System.out.println("TV정보 등록 완료");
	}
	
	@Test
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
		TvVO vo = service.getTv(1);
		if (vo != null) {
			System.out.println(vo);
			service.bookDelete(vo.getBookno());
			System.out.println("===변경 후=+=");
			System.out.println(vo);
		}
		
		
	}
	
}
