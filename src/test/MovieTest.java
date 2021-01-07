package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import dao.MovieDAO_Mariadb;
import service.MovieService;
import service.MovieServiceimpl;
import vo.MovieVO;
import vo.UserVO;

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
	
//	@Test
	void add() {
		MovieVO vo = new MovieVO();
		vo.setTitle("TestTitle");
		vo.setDate("2010-01-02");
		vo.setScore((float)4.5);
		vo.setContext("이건 연습용");
		
		service.movieAdd(vo);
		System.out.println("등록 되었습니다.");
	}
	
//	@Test
	void getMovie() {
		System.out.println(service.getMovie(3));
	}
	
//	@Test
	void search() {
		
		List<MovieVO> list = service.movieSearch("title", "Test");
		
		System.out.println("=====================");
		
		for(MovieVO data:list) {
			System.out.printf("%s|%s|%3.2f|%s %n", data.getTitle(), data.getDate(), data.getScore(), data.getContext());
		}
	}
	
	@Test
	void delete() {
		MovieVO vo = service.getMovie(2);
		if(vo != null) {
			System.out.println(vo);
			service.movieDelete(2);
			System.out.println("삭제 되었습니다.");
		} else {
			System.out.println("존재 하지 않습니다.");
		}
	}
	
//	@Test
	void update() {
		MovieVO vo = service.getMovie(3);
		if(vo != null) {
			System.out.println(vo);
			vo.setContext("수정테스트3");
			vo.setScore((float)4.3);
			
			service.movieUpdate(vo);
			System.out.println(service.getMovie(3));
		} else {
			System.out.println("존재 하지 않습니다");
		}
	}
}
