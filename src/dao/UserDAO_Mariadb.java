package dao;

import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vo.UserVO;
import util.JDBCUtil;

public class UserDAO_Mariadb {
	public List<UserVO> userList() {
		List<UserVO> list = new ArrayList<UserVO>();
		String sql = "select * from user";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next() ) {
				UserVO vo = new UserVO();
				vo.setId(rs.getString("userId") );
				vo.setName(rs.getString("name") );
				vo.setEmail(rs.getString("email") );
				vo.setPassword(rs.getString("password") );
				
				list.add(vo);
			}
		} catch(Exception e) {
			System.out.println("error" + e);
		}	finally {
			JDBCUtil.close(conn, ps, rs);
		}
		
		return list;
	}
	
	public void userAdd(UserVO vo) {
		String sql = "insert into user(name, email, password) values(?,?,?)";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql); 
			
			ps.setString(1, vo.getName() );
			ps.setString(2, vo.getEmail() );
			ps.setString(3, vo.getPassword() );
			
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
	public void userDelete(String email) {
		String sql = "delete from user where email = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			
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
	
	public UserVO login(String email, String password) {
		UserVO vo = null;
		String sql = "select * from user where email = ? and password = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				vo = new UserVO();
				vo.setId(rs.getString("userId") );
				vo.setEmail(rs.getString("email"));
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
			}
			
		} catch(Exception e) {
			System.out.println("Error : " + e);
		} finally {
			JDBCUtil.close(conn, ps, rs);
		}
		
		return vo;
	}
	
}