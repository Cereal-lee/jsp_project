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
				vo.setId(rs.getInt("userId") );
				vo.setName(rs.getString("name") );
				vo.setEmail(rs.getString("email") );
				vo.setPassword(rs.getString("password") );
				vo.setRole(rs.getString("role") );
				
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
		String sql = "insert into user(name, email, password, role) values(?,?,?,?)";
		
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
			ps.setString(4, vo.getRole() );
			
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
	
	public UserVO getUser(int id) {
		String sql = "select * from user where userId=?";
		
		
		Connection con = null;
		PreparedStatement ps = null; // SQL ����
		ResultSet rs = null;
		UserVO vo = null;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery(); // �������ִ°� ����Ҷ� ���
		 
			while(rs.next() ) {
				vo = new UserVO();
				vo.setId(rs.getInt("userId"));
				vo.setEmail(rs.getString("email"));
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				vo.setRole(rs.getString("role") );
				
			}
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error :" + e);
		} finally {

			JDBCUtil.close(con, ps, rs); // �ڿ��ݳ� �ʼ�
		}
		return vo;
	}
	
	
	public void userDelete(int id) {
		String sql = "delete from user where userId = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
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
				vo.setId(rs.getInt("userId") );
				vo.setEmail(rs.getString("email"));
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				vo.setRole(rs.getString("role") );
			}
			
		} catch(Exception e) {
			System.out.println("Error : " + e);
		} finally {
			JDBCUtil.close(conn, ps, rs);
		}
		
		return vo;
	}
	
	public List<UserVO> userSearch(String condition, String keyword) {
		int row = 0;
		String sql = "select * from user where " + condition + " like ?";
		
		// select * from book where publisher like '%��%';
		Connection con = null;
		PreparedStatement ps = null; // SQL ����
		ResultSet rs = null;
		List<UserVO> list = new ArrayList<UserVO>();		// is a ����
															// 
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, "%" + keyword + "%");
			
			rs = ps.executeQuery(); // �������ִ°� ����Ҷ� ���
			
			while(rs.next() ) {
				UserVO vo = new UserVO();
				
				vo.setId(rs.getInt("userId"));
				vo.setEmail(rs.getString("email"));
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				vo.setRole(rs.getString("role") );

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
} 
		
	
	
