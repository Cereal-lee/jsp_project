package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import dao.BookDAO_Mariadb;
import dao.MovieDAO_Mariadb;
import dao.TvDAO_Mariadb;
import dao.UserDAO_Mariadb;
import service.BookService;
import service.BookServiceimpl;
import service.MovieService;
import service.MovieServiceimpl;
import service.TvService;
import service.TvServiceimpl;
import service.UserService;
import service.UserServiceimpl;
import vo.BookVO;
import vo.MovieVO;
import vo.TvVO;
import vo.UserVO;

@WebServlet("*.do")
@MultipartConfig(location = "jsp_project/upload/",maxFileSize = 1024*1024*5)
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String url = request.getRequestURI();
		String action = url.substring(url.lastIndexOf('/'));
		
		if(action.equals("/movie.do")) {
			MovieDAO_Mariadb dao = new MovieDAO_Mariadb();
			MovieService service = new MovieServiceimpl(dao);
			List<MovieVO> list = service.movieList();
			
			request.setAttribute("movieList", list);
			
			getServletContext().getRequestDispatcher("/movie.jsp").forward(request, response);
			return;
		}
		
		if(action.equals("/tvshow.do")) {
			TvDAO_Mariadb dao = new TvDAO_Mariadb();
			TvService service = new TvServiceimpl(dao);
			List<TvVO> list = service.tvList();
			
			request.setAttribute("tvList", list);
			
			getServletContext().getRequestDispatcher("/tvshow.jsp").forward(request, response);
			return;
		}
		
		if(action.equals("/book.do")) {
			BookDAO_Mariadb dao = new BookDAO_Mariadb();
			BookService service = new BookServiceimpl(dao);
			List<BookVO> list = service.bookList();
			
			request.setAttribute("bookList", list);
			
			getServletContext().getRequestDispatcher("/book.jsp").forward(request, response);
			return;
		}
		
		if(action.equals("/register.do")) {
			UserDAO_Mariadb dao = new UserDAO_Mariadb();
			UserService service = new UserServiceimpl(dao);
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String role = request.getParameter("role");
			String condition = "email";
			String keyword = request.getParameter("email");
			
			List<UserVO> list = service.searchUser(condition, keyword);
			
			String pwd = testSHA256(password);
			
			UserVO vo = new UserVO();
			
			vo.setName(name);
			vo.setEmail(email);
			vo.setPassword(pwd);
			vo.setRole(role);

			PrintWriter out = response.getWriter();
			
			if(list.isEmpty()) {
				service.userAdd(vo);
				out.println("<script>alert('회원가입이 완료되었습니다.'); location.href='/';</script>");
				out.flush();
				out.close();
			}
			else {
				out.println("<script>alert('이미 등록된 이메일입니다.'); location.href='/';</script>");
				out.flush();
				out.close();
			}
			
			return;
		}
		
		if(action.equals("/login.do")) {
			
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			String pwd = testSHA256(password);
			
			UserDAO_Mariadb dao = new UserDAO_Mariadb();
			UserService service = new UserServiceimpl(dao);
			
			UserVO login = service.login(email, pwd);
			
			if (login != null) {
				HttpSession session = request.getSession();
				session.setAttribute("login", login);
				response.sendRedirect("/");

			} else {
				PrintWriter out = response.getWriter();
				 
				out.println("<script>alert('로그인 정보를 확인해주세요.'); location.href='/';</script>");
				out.flush();
				out.close();
				
			}
			
			return;
		}
		
		if(action.equals("/logout.do")) {
			HttpSession session = request.getSession();
			if (session != null) { 
				session.invalidate(); 
			}
			response.sendRedirect("/");

			return;
		}
		
		if (action.equals("/addmovie.do")) {

			MovieDAO_Mariadb dao = new MovieDAO_Mariadb();
			MovieService service = new MovieServiceimpl(dao);

			String title = request.getParameter("title");
			String year = request.getParameter("year");
			String month = request.getParameter("month");
			String day = request.getParameter("day");
			String context = request.getParameter("context");
			String image = request.getParameter("image");
			
			String date = year+"-"+month+"-"+day;
			
			MovieVO vo = new MovieVO();

			vo.setTitle(title);
			vo.setDate(date);
			vo.setContext(context);
			vo.setImage(image);
			
			String path = request.getSession().getServletContext().getRealPath("/upload/");
			System.out.println(path);
			
			Collection<Part> p = request.getParts();
			for(Part data :p) {
				if(data.getContentType() != null ) {
					String fileName = data.getSubmittedFileName();	
					if(fileName != null && fileName.length() != 0) {
						vo.setImage(fileName);
						data.write(path + fileName);
					}
				}
			}
			
			service.movieAdd(vo);

			response.sendRedirect("/");

			return;
		}
		
		if (action.equals("/addtv.do")) {

			TvDAO_Mariadb dao = new TvDAO_Mariadb();
			TvService service = new TvServiceimpl(dao);

			String title = request.getParameter("title");
			String year = request.getParameter("year");
			String month = request.getParameter("month");
			String day = request.getParameter("day");
			String context = request.getParameter("context");
			String image = request.getParameter("image");
			
			String date = year+"-"+month+"-"+day;
			
			TvVO vo = new TvVO();

			vo.setTitle(title);
			vo.setDate(date);
			vo.setContext(context);
			vo.setImage(image);
			
			String path = request.getSession().getServletContext().getRealPath("/upload/");
			System.out.println(path);
			
			Collection<Part> p = request.getParts();
			for(Part data :p) {
				if(data.getContentType() != null ) {
					String fileName = data.getSubmittedFileName();	
					if(fileName != null && fileName.length() != 0) {
						vo.setImage(fileName);
						data.write(path + fileName);
					}
				}
			}
			
			service.tvAdd(vo);

			response.sendRedirect("/tvshow.jsp");

			return;
		}
		
		if (action.equals("/addbook.do")) {

			BookDAO_Mariadb dao = new BookDAO_Mariadb();
			BookService service = new BookServiceimpl(dao);

			String title = request.getParameter("title");
			String writer = request.getParameter("writer");
			String context = request.getParameter("context");
			String image = request.getParameter("image");
			
			BookVO vo = new BookVO();

			vo.setTitle(title);
			vo.setWriter(writer);
			vo.setContext(context);
			vo.setImage(image);
			
			String path = request.getSession().getServletContext().getRealPath("/upload/");
			System.out.println(path);
			
			Collection<Part> p = request.getParts();
			for(Part data :p) {
				if(data.getContentType() != null ) {
					String fileName = data.getSubmittedFileName();	
					if(fileName != null && fileName.length() != 0) {
						vo.setImage(fileName);
						data.write(path + fileName);
					}
				}
			}
			
			service.bookAdd(vo);

			response.sendRedirect("/book.jsp");

			return;
		}
		
		if(action.equals("/search.do")) {
			String condition = "title";
			String keyword = request.getParameter("keyword");
			
			if(keyword.isEmpty()) {
				PrintWriter out = response.getWriter();
				 
				out.println("<script>alert('한 글자 이상 입력해주세요.'); location.href='/';</script>");
				out.flush();
				out.close();
			}
			else {
			UserDAO_Mariadb dao = new UserDAO_Mariadb();
			UserService service = new UserServiceimpl(dao);
			
			BookDAO_Mariadb bookDao = new BookDAO_Mariadb();
			BookService bookService = new BookServiceimpl(bookDao);
			
			TvDAO_Mariadb tvDao = new TvDAO_Mariadb();
			TvService tvService = new TvServiceimpl(tvDao);
			
			MovieDAO_Mariadb movieDao = new MovieDAO_Mariadb();
			MovieService movieService = new MovieServiceimpl(movieDao);
			
			List<UserVO> userListName = service.searchUser("name", keyword);
			List<UserVO> userListEmail = service.searchUser("email", keyword);
			
			List<BookVO> bookListTitle = bookService.bookSearch(condition, keyword);
			List<BookVO> bookListWriter = bookService.bookSearch("writer", keyword);
			
			List<TvVO> tvList = tvService.tvSearch(condition, keyword);
			List<MovieVO> movieList = movieService.movieSearch(condition, keyword);
			
			request.setAttribute("userListName", userListName);
			request.setAttribute("userListEmail", userListEmail);
			request.setAttribute("bookListTitle", bookListTitle);
			request.setAttribute("bookListWriter", bookListWriter);
			request.setAttribute("tvList", tvList);
			request.setAttribute("movieList", movieList);
			
			getServletContext().getRequestDispatcher("/search.jsp").forward(request, response);
			}
			
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