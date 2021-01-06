package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		}
		
		if(action.equals("/book.do")) {
			getServletContext().getRequestDispatcher("/book.jsp").forward(request, response);
		}
	}

}
