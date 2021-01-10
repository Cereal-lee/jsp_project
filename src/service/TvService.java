package service;

import java.util.List;

import vo.MovieVO;
import vo.TvVO;

public interface TvService {
	public List<TvVO> tvList();
	
	public void tvAdd(TvVO vo);
	
	public void tvDelete(int tvId);
	
	public void tvUpdate(TvVO vo);
	
	public List<TvVO> tvSearch(String condition, String keyword);
	
	public TvVO getTv(int tvId);
	
	public void scoreAdd(TvVO vo);
}