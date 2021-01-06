package service;

import java.util.List;
import vo.UserVO;

public interface UserService {
	public List<UserVO> userList();
	
	public void userAdd(UserVO vo);
	
	public void userDelete(String email);
	
	public UserVO login(String email, String password);
	
}
