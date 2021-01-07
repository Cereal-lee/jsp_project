package test;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dao.UserDAO_Mariadb;
import service.UserService;
import service.UserServiceimpl;
import vo.UserVO;

public class userTest_yoon {
	
	UserService service = null;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		UserDAO_Mariadb dao = new UserDAO_Mariadb();
		service = new UserServiceimpl(dao);
	}
	
//	@Test
	void list() {
		service.userList().forEach(i -> {System.out.println(i);} );
	}
	
	@Test
	void add() {
		UserVO vo = new UserVO();
		vo.setEmail("admin@test.com");
		vo.setName("관리자");
		vo.setPassword("qwer1234");
		vo.setRole("admin");
		
		service.userAdd(vo);
		System.out.println("등록 되었습니다.");
	}
	
//	@Test
	void getUser() {
		System.out.println(service.getUser(1));
	}
	
//	@Test
	void delete() {
		UserVO vo = service.getUser(10);
		if(vo != null) {
			System.out.println(vo);
			service.userDelete(10);
//			service.userDelete(vo.getId());
			System.out.println("삭제 되었습니다.");
		} else {
			System.out.println("존재 하지 않습니다.");
		}
	}
	
//	@Test
	void search() {
		
		List<UserVO> list = service.searchUser("email", "test");
		
		System.out.println("=====================");
		
		for(UserVO data:list) {
			System.out.printf("%s|%s|%s|%s %n", data.getId(), data.getName(), data.getEmail(), data.getPassword());
		}
	}
}
