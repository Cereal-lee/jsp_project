package service;

import java.util.List;

import dao.TvDAO_Mariadb;
import vo.TvVO;

public class TvServiceImpl implements TvService {
	private TvDAO_Mariadb dao = null; //DB연동
	

	public TvServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TvServiceImpl(TvDAO_Mariadb dao) { //using fields
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
}
	