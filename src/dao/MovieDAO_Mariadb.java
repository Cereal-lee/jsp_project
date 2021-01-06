package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.MovieVO;
import vo.UserVO;


public class MovieDAO_Mariadb {
	public List<MovieVO> movieList() {
		List<MovieVO> list = new ArrayList<MovieVO>();
		String sql = "select * from movie";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next() ) {
				MovieVO vo = new MovieVO();
				
				vo.setMovieId(rs.getInt("movieId"));
				vo.setTitle(rs.getString("title") );
				vo.setDate(rs.getDate("date"));
				vo.setScore(rs.getFloat("score"));
				vo.setContext(rs.getString("context"));
				
				list.add(vo);
			}
		} catch(Exception e) {
			System.out.println("error" + e);
		}	finally {
			JDBCUtil.close(conn, ps, rs);
		}
		
		return list;
	}
	
	public void movieAdd(MovieVO vo) {
		String sql = "insert into movie(title, date, context) values(?,?,?)";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql); 
			
			ps.setString(1, vo.getTitle() );
			ps.setDate(2, (Date) vo.getDate() );
			ps.setString(3, vo.getContext() );
			
			row = ps.executeUpdate();
			
			if(row == 0) {
				throw new Exception("등록실패");
			}
			
		} catch (Exception e) {
			System.out.println("Error : " + e);
		} finally {
			JDBCUtil.close(conn, ps, rs);
		}
	}
	
	
	public void movieDelete(int movieId) {
		String sql = "delete from movie where movieId = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, movieId);
			
			row = ps.executeUpdate();
			
			if(row == 0) {
				throw new Exception("삭제 실패");
			}
			
		} catch(Exception e) {
			System.out.println("Error : " + e);
		} finally {
			JDBCUtil.close(conn, ps, rs);
		}
	}
	
	public List<MovieVO> movieSearch(String condition, String keyword) {
		int row = 0;
		
		String sql = "select * from movie where " + condition + " like ?";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<MovieVO> list = new ArrayList<MovieVO>();
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, "%" + keyword + "%");
			
			rs = ps.executeQuery(); // 가지고있는거 사용할때 사용
			
			while(rs.next() ) {
				MovieVO vo = new MovieVO();
				
				vo.setMovieId(rs.getInt("movieId"));
				vo.setTitle(rs.getString("title"));
				vo.setDate(rs.getDate("date"));
				vo.setScore(rs.getFloat("score"));
				vo.setContext(rs.getString("context"));
				
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error :" + e);
		} finally {

			JDBCUtil.close(con, ps, rs); // 자원반납 필수
		}
		return list;
	}
	
	public void movieUpdate(MovieVO vo) {
		
		String sql = "update movie set title = ?, date = ?, score = ?, context = ? where movieId = ?";
		
		Connection con = null;
		PreparedStatement ps = null; // SQL 관리
		ResultSet rs = null;
		int row = 0; // 결과 int 값으로 도출

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setDate(2, (Date)vo.getDate() );
			ps.setFloat(3, vo.getScore() );
			ps.setString(4, vo.getContext());
			ps.setInt(5, vo.getMovieId());
			

			// sql문 실행
			// ps.executeQuery(); // 가지고있는거 사용할때 사용

			row = ps.executeUpdate(); // 상태 변화 할때 사용

			// 결과값 처리

			if (row == 0) {
				throw new Exception("수정 실패"); // 예외 객체 생성
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error :" + e);
		} finally {

			JDBCUtil.close(con, ps, rs); // 자원반납 필수
		}
	}
	
	
}
