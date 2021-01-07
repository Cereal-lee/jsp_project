package servlet;

import java.io.IOException;
import java.security.MessageDigest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO_Mariadb;
import service.UserService;
import service.UserServiceimpl;
import vo.UserVO;

@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String url = request.getRequestURI();
		String action = url.substring(url.lastIndexOf('/'));
		
		if(action.equals("/tvshow.do")) {
			getServletContext().getRequestDispatcher("/tvshow.jsp").forward(request, response);
			return;
		}
		
		if(action.equals("/book.do")) {
			getServletContext().getRequestDispatcher("/book.jsp").forward(request, response);
			return;
		}
		
		if(action.equals("/register.do")) {
			UserDAO_Mariadb dao = new UserDAO_Mariadb();
			UserService service = new UserServiceimpl(dao);
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			String pwd = testSHA256(password);
			
			UserVO vo = new UserVO();
			
			vo.setName(name);
			vo.setEmail(email);
			vo.setPassword(pwd);
			
			service.userAdd(vo);
			
			response.sendRedirect("/");
			return;
		}
	}
	
	public static String testSHA256(String pwd) {
		try{

			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(pwd.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();

			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}

			//출력
			return hexString.toString();
			
		} catch(Exception ex){
			throw new RuntimeException(ex);
		}
	}
}
