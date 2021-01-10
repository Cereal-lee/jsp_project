package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.TvVO;

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
	
	public void tvAdd(TvVO vo) {
		String sql = "insert into tv (title, date, context, image) values (?, ?, ?, ?)";
		
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
			ps.setString(4, vo.getImage());
			
			row = ps.executeUpdate();
			
			if (row == 0) {
				throw new Exception("��� ����");
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
				throw new Exception("���� ����");
			}
		} catch (Exception e) {
			System.out.println("error" + e);
		} finally {
			JDBCUtil.close(conn, ps, rs);
		}
	}
	
	public void tvUpdate(TvVO vo) {
		String sql = "update tv set title = ?, date = ?, score = ?, context = ?, image = ? where tvId = ?";
		
		Connection conn = null;
		PreparedStatement ps = null; // SQL ����
		ResultSet rs = null;
		int row = 0; // ��� int ������ ����
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getDate()); // ?
			ps.setFloat(3, vo.getScore());
			ps.setString(4, vo.getContext());
			ps.setString(5, vo.getImage());
			ps.setInt(6, vo.getTvId());
			
			row = ps.executeUpdate();
			
			if (row == 0) {
				throw new Exception("���� ����"); 
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error :" + e);
		} finally {
			JDBCUtil.close(conn, ps, rs);
		}
	}
	
	public List<TvVO> tvSearch(String condition, String keyword) {
		
		String sql = "select * from tv where " + condition + " like ? order by title desc";
		// select * from tv where title like '%��%';
		
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