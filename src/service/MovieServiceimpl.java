package service;

import java.util.List;

import dao.MovieDAO_Mariadb;
import vo.MovieVO;

public class MovieServiceimpl implements MovieService{
	private MovieDAO_Mariadb dao = null;
	
	public MovieServiceimpl() {
		
	}
	
	public MovieServiceimpl(MovieDAO_Mariadb dao) {
		super();
		this.dao = dao;
	}
	
	public MovieDAO_Mariadb getDao() {
		return dao;
	}

	public void setDao(MovieDAO_Mariadb dao) {
		this.dao = dao;
	}

	@Override
	public List<MovieVO> movieList() {
		return dao.movieList();
	}

	@Override
	public void movieAdd(MovieVO vo) {
		dao.movieAdd(vo);
	}

	@Override
	public void movieDelete(int movieId) {
		dao.movieDelete(movieId);
	}

	@Override
	public List<MovieVO> movieSearch(String condition, String keyword) {
		return dao.movieSearch(condition, keyword);
	}

	@Override
	public void movieUpdate(MovieVO vo) {
		dao.movieUpdate(vo);
	}

	@Override
	public MovieVO getMovie(int i) {
		return dao.getMovie(i);
	}

	

}
