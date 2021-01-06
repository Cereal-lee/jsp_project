package service;

import java.util.List;

import dao.UserDAO_Mariadb;
import vo.UserVO;

public class UserServiceimpl implements UserService {
	private UserDAO_Mariadb dao = null;
	
	public UserServiceimpl() {
	}
	
	public UserServiceimpl(UserDAO_Mariadb dao) {
		super();
		this.dao = dao;
	}
	
	public UserDAO_Mariadb getDao() {
		return dao;
	}

	public void setDao(UserDAO_Mariadb dao) {
		this.dao = dao;
	}

	@Override
	public List<UserVO> userList() {
		// TODO Auto-generated method stub
		return dao.userList();
	}

	@Override
	public void userAdd(UserVO vo) {
		// TODO Auto-generated method stub
		dao.userAdd(vo);
	}

	@Override
	public void userDelete(String email) {
		// TODO Auto-generated method stub
		dao.userDelete(email);
	}

	@Override
	public UserVO login(String email, String password) {
		// TODO Auto-generated method stub
		return dao.login(email, password);
	}

}
