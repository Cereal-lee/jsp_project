package service;

import java.util.List;
import vo.MovieVO;

public interface MovieService {
	public List<MovieVO> movieList();
	
	public void movieAdd(MovieVO vo);
	
	public void movieDelete(int movieId);
	
	public List<MovieVO> movieSearch(String condition, String keyword);
	
	public void movieUpdate(MovieVO vo);
	
	
}
