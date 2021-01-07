package servlet;

import dao.UserDAO_Mariadb;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.UserServiceimpl;
import servlet.DispatcherServlet;
import vo.UserVO;

@WebServlet({"*.do"})
public class DispatcherServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");
    String url = request.getRequestURI();
    String action = url.substring(url.lastIndexOf('/'));
    if (action.equals("/tvshow.do")) {
      getServletContext().getRequestDispatcher("/tvshow.jsp").forward((ServletRequest)request, (ServletResponse)response);
      return;
    } 
    if (action.equals("/book.do")) {
      getServletContext().getRequestDispatcher("/book.jsp").forward((ServletRequest)request, (ServletResponse)response);
      return;
    } 
    if (action.equals("/register.do")) {
      UserDAO_Mariadb dao = new UserDAO_Mariadb();
      UserServiceimpl userServiceimpl = new UserServiceimpl(dao);
      String name = request.getParameter("name");
      String email = request.getParameter("email");
      String password = request.getParameter("password");
      String role = request.getParameter("role");
      String pwd = testSHA256(password);
      UserVO vo = new UserVO();
      vo.setName(name);
      vo.setEmail(email);
      vo.setPassword(pwd);
      vo.setRole(role);
      userServiceimpl.userAdd(vo);
      response.sendRedirect("/");
      return;
    } 
    if (action.equals("/login.do")) {
      String email = request.getParameter("email");
      String password = request.getParameter("password");
      String pwd = testSHA256(password);
      UserDAO_Mariadb dao = new UserDAO_Mariadb();
      UserServiceimpl userServiceimpl = new UserServiceimpl(dao);
      UserVO login = userServiceimpl.login(email, pwd);
      if (login != null) {
        HttpSession session = request.getSession();
        session.setAttribute("login", login);
        response.sendRedirect("/");
      } else {
        PrintWriter out = response.getWriter();
        out.println("<script>alert('location.href='/';</script>");
        out.flush();
        out.close();
      } 
      return;
    } 
  }
  
  public static String testSHA256(String pwd) {
    try {
      MessageDigest digest = MessageDigest.getInstance("SHA-256");
      byte[] hash = digest.digest(pwd.getBytes("UTF-8"));
      StringBuffer hexString = new StringBuffer();
      for (int i = 0; i < hash.length; i++) {
        String hex = Integer.toHexString(0xFF & hash[i]);
        if (hex.length() == 1)
          hexString.append('0'); 
        hexString.append(hex);
      } 
      return hexString.toString();
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    } 
  }
}