package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import factory.BasicFactory;
import service.UserService;
public class loginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserService service = BasicFactory.getFactory().getService(UserService.class);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+"::"+password);
		User user = service.getUserByNameAndPsw(username,password);
		if(user == null){
			request.setAttribute("msg", "用户名密码错误");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}else{
			request.getSession().setAttribute("user", user);
		}
		response.sendRedirect(request.getContextPath()+"/index.jsp");
	}
}
