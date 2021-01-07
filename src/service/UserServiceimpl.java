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
		return dao.userList();
	}

	@Override
	public void userAdd(UserVO vo) {
		dao.userAdd(vo);
	}



	@Override
	public UserVO login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public UserVO getUser(int id) {
		return dao.getUser(id);
	}

	@Override
	public void userDelete(int id) {
			dao.userDelete(id);
	}

	@Override
	public List<UserVO> searchUser(String condition, String keyword) {
		return dao.userSearch(condition, keyword);
	}



}