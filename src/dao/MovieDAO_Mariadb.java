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
				vo.setDate(rs.getString("date"));
				vo.setScore(rs.getFloat("score"));
				vo.setContext(rs.getString("context"));
				vo.setImage(rs.getString("image"));
				
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
		String sql = "insert into movie(title, date, context, image) values(?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql); 
			
			ps.setString(1, vo.getTitle() );
			ps.setString(2, vo.getDate() );
			ps.setString(3, vo.getContext() );
			ps.setString(4, vo.getImage());
			
			row = ps.executeUpdate();
			
			if(row == 0) {
				throw new Exception("��Ͻ���");
			}
			
		} catch (Exception e) {
			System.out.println("Error : " + e);
		} finally {
			JDBCUtil.close(conn, ps, rs);
		}
	}
	
	public MovieVO getMovie(int i) {
		String sql = "select * from movie where movieId = ?";
		
		Connection con = null;
		PreparedStatement ps = null; // SQL ����
		ResultSet rs = null;
		MovieVO vo = null;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, i);
			rs = ps.executeQuery(); // �������ִ°� ����Ҷ� ���
			
			// ����� ó��
			while(rs.next()) {
				vo = new MovieVO();
				vo.setMovieId(rs.getInt("movieId"));
				vo.setTitle(rs.getString("title"));
				vo.setDate(rs.getString("date"));
				vo.setScore(rs.getFloat("score"));
				vo.setContext(rs.getString("context"));
				vo.setImage(rs.getString("image"));
				
			} 

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error :" + e);
		} finally {

			JDBCUtil.close(con, ps, rs); // �ڿ��ݳ� �ʼ�
		}
		return vo;
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
				throw new Exception("���� ����");
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
			
			rs = ps.executeQuery(); // �������ִ°� ����Ҷ� ���
			
			while(rs.next() ) {
				MovieVO vo = new MovieVO();
				
				vo.setMovieId(rs.getInt("movieId"));
				vo.setTitle(rs.getString("title"));
				vo.setDate(rs.getString("date"));
				vo.setScore(rs.getFloat("score"));
				vo.setContext(rs.getString("context"));
				vo.setImage(rs.getString("image"));
				
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error :" + e);
		} finally {

			JDBCUtil.close(con, ps, rs); // �ڿ��ݳ� �ʼ�
		}
		return list;
	}
	
	public void movieUpdate(MovieVO vo) {
		
		String sql = "update movie set title = ?, date = ?, score = ?, context = ?, image = ? where movieId = ?";
		
		Connection con = null;
		PreparedStatement ps = null; // SQL ����
		ResultSet rs = null;
		int row = 0; // ��� int ������ ����

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getDate() );
			ps.setDouble(3, vo.getScore() );
			ps.setString(4, vo.getContext());
			ps.setString(5, vo.getImage());
			ps.setInt(6, vo.getMovieId());
			
			

			// sql�� ����
			// ps.executeQuery(); // �������ִ°� ����Ҷ� ���

			row = ps.executeUpdate(); // ���� ��ȭ �Ҷ� ���

			// ����� ó��

			if (row == 0) {
				throw new Exception("���� ����"); // ���� ��ü ����
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error :" + e);
		} finally {

			JDBCUtil.close(con, ps, rs); // �ڿ��ݳ� �ʼ�
		}
	}
	
	
}