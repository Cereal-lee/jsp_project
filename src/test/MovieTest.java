package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import dao.MovieDAO_Mariadb;
import service.MovieService;
import service.MovieServiceimpl;
import vo.MovieVO;

class MovieTest {
	
	MovieService service = null;
	
	@BeforeEach
	void setUp() throws Exception {
		
		MovieDAO_Mariadb dao = new MovieDAO_Mariadb();
		service = new MovieServiceimpl(dao);
		
	}
	
//	@Test						//여기부분만 주석처리해도 안돌아감
	void list() {
		service.movieList().forEach(i-> {System.out.println(i); } );
	}
	
	@Test
	void add() {
		MovieVO vo = new MovieVO();
		vo.setTitle("TestTitle");
		vo.setDate("2010-01-02");
		vo.setScore((float)4.5);
		vo.setContext("이건 연습용");
		
		service.movieAdd(vo);
		System.out.println("등록 되었습니다.");
	}
}
