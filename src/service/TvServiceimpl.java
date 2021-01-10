package service;

import java.util.List;

import dao.TvDAO_Mariadb;
import vo.TvVO;

public class TvServiceimpl implements TvService {
	private TvDAO_Mariadb dao = null; //DB연동
	

	public TvServiceimpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TvServiceimpl(TvDAO_Mariadb dao) { //using fields
		super();
		this.dao = dao;
	}


	@Override
	public List<TvVO> tvList() {
		// TODO Auto-generated method stub
		return dao.tvList();
	}

	@Override
	public void tvAdd(TvVO vo) {
		// TODO Auto-generated method stub
		dao.tvAdd(vo);
	}

	@Override
	public void tvDelete(int tvId) {
		// TODO Auto-generated method stub
		dao.tvDelete(tvId);
	}

	@Override
	public void tvUpdate(TvVO vo) {
		// TODO Auto-generated method stub
		dao.tvUpdate(vo);
	}

	@Override
	public List<TvVO> tvSearch(String condition, String keyword) {
		// TODO Auto-generated method stub
		return dao.tvSearch(condition, keyword);
	}

	
	public TvDAO_Mariadb getDao() {
		return dao;
	}

	public void setDao(TvDAO_Mariadb dao) {
		this.dao = dao;
	}

	@Override
	public TvVO getTv(int tvId) {
		// TODO Auto-generated method stub
		return dao.getTv(tvId);
	}

	@Override
	public void scoreAdd(TvVO vo) {
		// TODO Auto-generated method stub
		dao.scoreAdd(vo);
	}

	
	
	
}
	