package test;

import dao.MovieDAO_Mariadb;
import vo.MovieVO;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieDAO_Mariadb m = new MovieDAO_Mariadb();
		
		MovieVO vo = new MovieVO();
		vo.setTitle("TestTitle");
		vo.setDate("2010-01-02");
		vo.setScore((float)4.5);
		vo.setContext("이건 연습용");
		
		m.movieAdd(vo);
		System.out.println("등록 되었습니다.");
	}

}
