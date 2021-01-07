package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import util.JDBCUtil;
import vo.TvVO;
import vo.UserVO;

public class TvDAO_Mariadb {
	
	public List<TvVO> tvList() {
		List<TvVO> list = new ArrayList<TvVO>();
		String sql = "select * from tv order by title desc";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				TvVO vo = new TvVO();
				vo.setTvId(rs.getInt("tvId"));
				vo.setTitle(rs.getString("title"));
				vo.setDate(rs.getString("date"));
				vo.setScore(rs.getFloat("score"));
				vo.setContext(rs.getString("context"));
				
				list.add(vo);
			}
		} catch(Exception e) {
			System.out.println("error" + e);
		} finally {
			JDBCUtil.close(conn, ps, rs);
		}
		
		return list;
	}
	
	public void tvAdd(TvVO vo) {
		String sql = "insert into tv (title, date, context, score) values (?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getDate());
			ps.setString(3, vo.getContext());
			ps.setFloat(4, vo.getScore());
			
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
	
	public void tvDelete(int tvId) {
		String sql = "delete from tv where tvId = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, tvId);
			
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
	
	public void tvUpdate(TvVO vo) {
		String sql = "update tv set title = ?, date = ?, score = ?, context = ? where tvId = ?";
		
		Connection conn = null;
		PreparedStatement ps = null; // SQL 관리
		ResultSet rs = null;
		int row = 0; // 결과 int 값으로 도출
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getDate()); // ?
			ps.setFloat(3, vo.getScore());
			ps.setString(4, vo.getContext());
			ps.setInt(5, vo.getTvId());
			
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
	
	public List<TvVO> tvSearch(String condition, String keyword) {
		int row = 0;
		
		String sql = "select * from tv where " + condition + " like ? order by title desc";
		// select * from tv where title like '%펜%';
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<TvVO> list = new ArrayList<TvVO>();
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + keyword + "%");
					
			rs = ps.executeQuery();
			
			while(rs.next()) {
				TvVO vo = new TvVO();
				
				vo.setTvId(rs.getInt("tvId"));
				vo.setTitle(rs.getString("title"));
				vo.setDate(rs.getString("date"));
				vo.setScore(rs.getFloat("score"));
				vo.setContext(rs.getString("context"));
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
	
	public TvVO getTv(int tvId) {
		String sql = "select * from tv where tvId = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		TvVO vo = null;
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, tvId);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				vo = new TvVO();
				vo.setTvId(rs.getInt("tvId"));
				vo.setTitle(rs.getString("title"));
				vo.setDate(rs.getString("date"));
				vo.setScore(rs.getFloat("score"));
				vo.setContext(rs.getString("context"));
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
