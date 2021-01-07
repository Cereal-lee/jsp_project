package service;

import java.util.List;

import dao.BookDAO_Mariadb;
import vo.BookVO;

public class BookServiceimpl implements BookService {
	private BookDAO_Mariadb dao = null; //DB연동
	
	public BookServiceimpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookServiceimpl(BookDAO_Mariadb dao) { //using fields
		super();
		this.dao = dao;
	}


	@Override
	public List<BookVO> bookList() {
		// TODO Auto-generated method stub
		return dao.bookList();
	}

	@Override
	public void bookAdd(BookVO vo) {
		// TODO Auto-generated method stub
		dao.bookAdd(vo);
	}

	@Override
	public void bookDelete(int bookId) {
		// TODO Auto-generated method stub
		dao.bookDelete(bookId);
	}

	@Override
	public void bookUpdate(BookVO vo) {
		// TODO Auto-generated method stub
		dao.bookUpdate(vo);
	}

	@Override
	public List<BookVO> bookSearch(String condition, String keyword) {
		// TODO Auto-generated method stub
		return dao.bookSearch(condition, keyword);
	}

	@Override
	public BookVO getBook(int bookId) {
		// TODO Auto-generated method stub
		return dao.getBook(bookId);
	}

	public BookDAO_Mariadb getDao() { //get
		return dao;
	}

	public void setDao(BookDAO_Mariadb dao) { //set
		this.dao = dao;
	}
	
	
}
