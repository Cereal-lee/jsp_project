package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import dao.UserDAO_Mariadb;
import service.UserService;
import service.UserServiceimpl;
import vo.UserVO;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String url = request.getRequestURI();
        String action = url.substring(url.lastIndexOf('/'));

        if(action.equals("/tvshow.do")) {
            getServletContext().getRequestDispatcher("/tvshow.jsp").forward(request, response);
        }
        if(action.equals("/book.do")) {
            getServletContext().getRequestDispatcher("/book.jsp").forward(request, response);
        }
        if(action.equals("/register.do")) {
        	UserDAO_Mariadb dao = new UserDAO_Mariadb();
        	UserService service = new UserServiceimpl(dao);
        	
        	String name =request.getParameter("name");
        	String email =request.getParameter("email");
        	String password =request.getParameter("password");
        	
        	UserVO vo = new UserVO();
        	
        	vo.setName(name);
        	vo.setEmail(email);
        	vo.setPassword(password);
        	
        	service.userAdd(vo);
        	
        	response.sendRedirect("/");
        }
	}
}
