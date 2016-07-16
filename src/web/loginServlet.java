package web;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import factory.BasicFactory;
import service.UserService;

public class loginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("name"));
		// UserService service =
		// BasicFactory.getFactory().getService(UserService.class);
		// User user = service.getUserByNameAndPsw(username,password);
		// if(user == null){
		// request.setAttribute("msg", "用户名密码错误");
		// request.getRequestDispatcher("/login.jsp").forward(request,
		// response);
		// return;
		// }else{
		// request.getSession().setAttribute("user", user);
		// Cookie autologinC = new
		// Cookie("autologin",URLEncoder.encode(user.getUser_username()+":"+user.getUser_password(),"utf-8"));
		// autologinC.setPath("/");
		// autologinC.setMaxAge(3600*24*30);
		// response.addCookie(autologinC);
		// }
		// response.sendRedirect(request.getContextPath()+"/index.jsp");
	}
}
