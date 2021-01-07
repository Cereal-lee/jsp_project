package service;

import java.util.List;
import vo.UserVO;

public interface UserService {
	public List<UserVO> userList();
	
	public void userAdd(UserVO vo);
	
	public void userDelete(int id);
	
	public UserVO login(String email, String password);
	
	public UserVO getUser(int id);

	public List<UserVO> searchUser(String condition, String keyword);
}
