package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.BookVO;
import vo.TvVO;

public class BookDAO_Mariadb {
	
	public List<BookVO> bookList() {
		List<BookVO> list = new ArrayList<BookVO>();
		String sql = "select * from book order by title desc";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				BookVO vo = new BookVO();
				vo.setBookId(rs.getInt("bookId"));
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setScore(rs.getFloat("score"));
				vo.setContext(rs.getString("context"));
				vo.setImage(rs.getString("image"));
				
				list.add(vo);
			}
		} catch(Exception e) {
			System.out.println("error" + e);
		} finally {
			JDBCUtil.close(conn, ps, rs);
		}
		
		return list;
	}
		
	public void bookAdd(BookVO vo) {
		String sql = "insert into book (title, writer, context, image) values (?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getWriter());
			ps.setString(3, vo.getContext());
			ps.setString(4, vo.getImage());
			
			row = ps.executeUpdate();
			
			if (row == 0) {
				throw new Exception("등록 실패");
			}
		} catch(Exception e) {
			System.out.println("error" + e);
		} finally {
			JDBCUtil.close(conn, ps, rs);
		}		
	}
	
	public void bookDelete(int bookId) {
		String sql = "delete from book where bookId = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bookId);
			
			row = ps.executeUpdate();
			
			if (row == 0) {
				throw new Exception("삭제 실패");
			}
		} catch (Exception e) {
			System.out.println("error" + e);
		} finally {
			JDBCUtil.close(conn, ps, rs);
		}		
	}
	
	public void bookUpdate(BookVO vo) {
		String sql = "update book set title = ?, writer = ?, score = ?, context = ?, image = ? where bookId = ?";
		
		Connection conn = null;
		PreparedStatement ps = null; // SQL 관리
		ResultSet rs = null;
		int row = 0; // 결과 int 값으로 도출
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getWriter()); 
			ps.setFloat(3, vo.getScore());
			ps.setString(4, vo.getContext());
			ps.setString(5, vo.getImage());
			ps.setInt(6, vo.getBookId());
			
			row = ps.executeUpdate();
			
			if (row == 0) {
				throw new Exception("수정 실패"); 
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error :" + e);
		} finally {
			JDBCUtil.close(conn, ps, rs);
		}		
	}
	
	public List<BookVO> bookSearch(String condition, String keyword) {
		int row = 0;
		
		String sql = "select * from book where " + condition + " like ? order by title desc";
		// select * from book where title like '%달%';
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<BookVO> list = new ArrayList<BookVO>();
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + keyword + "%");
					
			rs = ps.executeQuery();
			
			while(rs.next()) {
				BookVO vo = new BookVO();
				
				vo.setBookId(rs.getInt("bookId"));
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setScore(rs.getFloat("score"));
				vo.setContext(rs.getString("context"));
				vo.setImage(rs.getString("image"));
				list.add(vo);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error :" + e);			
		} finally {
			JDBCUtil.close(conn, ps, rs);
		} 
		return list;		
	}
	
	public BookVO getBook(int bookId) {
		String sql = "select * from book where bookId = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;	
		BookVO vo = null;
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bookId);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				vo = new BookVO();
				vo.setBookId(rs.getInt("bookId"));
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setScore(rs.getFloat("score"));
				vo.setContext(rs.getString("context"));
				vo.setImage(rs.getString("image"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error :" + e);			
		} finally {
			JDBCUtil.close(conn, ps, rs);
		}
		return vo;
	}
	
		
}