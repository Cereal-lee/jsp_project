package service;

import java.util.List;

import vo.BookVO;
import vo.MovieVO;

public interface BookService {

	public List<BookVO> bookList();
	
	public void bookAdd(BookVO vo);
	
	public void bookDelete(int bookId);
	
	public void bookUpdate(BookVO vo);
	
	public List<BookVO> bookSearch(String condition, String keyword);
	
	public BookVO getBook(int bookId);
	
	public void scoreAdd(BookVO vo);
}