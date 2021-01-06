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
	
	@Test
	void list() {
		service.tvList().forEach(i-> {System.out.println(i);} );
	}
	
	//@Test
	void add() {
		TvVO vo = new TvVO();
		vo.setTitle("펜트하우스");
		vo.setDate("");
		vo.setContext("펜트하우스 재밌어요 <br> 막장드라마지만 재밌음~");
		
		service.tvAdd(vo);
		System.out.println("TV정보 등록 완료");
	}
}
