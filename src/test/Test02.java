package test;

import dao.TvDAO_Mariadb;
import vo.TvVO;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvDAO_Mariadb b = new TvDAO_Mariadb();

		TvVO vo = new TvVO();
		vo.setTitle("펜트하우스");
		vo.setDate("2020-01-06");
		vo.setContext("매우매우 재밌습니다. <br>별점 5점");	

		b.TvAdd(vo);
		b.bookList().forEach(i->{System.out.println(i);});

		// vo.setBookno(6);
		// b.bookUpdate(vo);
		// b.bookDelete(8);

		// System.out.println("=====================================================");
		// b.bookList().forEach(i->{System.out.println(i);});
		// System.out.println("=====================================================");
		BookVO book = b.getBook(5);
		if (book != null) {
			System.out.println(book);
			book.setPrice(book.getPrice() * 2);
			b.bookUpdate(book);
			BookVO book2 = b.getBook(book.getBookno());
			System.out.println(book2);
			b.bookDelete(book2.getBookno());
			System.out.println(b.getBook(book2.getBookno()));
		}

		System.out.println("==================목록 보기====================");
		b.bookList().forEach(i -> {
			System.out.println(i);
		});
//		
//		System.out.println("=================== 검 색 =====================");
//		b.bookSearch("title", "on").forEach(i -> {System.out.println(i);});
//		
//		System.out.println("=================== 검 색 =====================");
//		b.bookSearch("publisher", "한").forEach(i -> {System.out.println(i);});
	}

}
