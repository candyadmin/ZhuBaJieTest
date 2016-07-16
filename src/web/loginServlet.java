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
import com.thoughtworks.xstream.io.json.JsonWriter;
import domain.User;
import domain.msg;
import factory.BasicFactory;
import net.sf.json.JSONArray;
import service.UserService;

public class loginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 登录成功状态码为1
		 * 登录失败状态码为0
		 * 			失败了需要写提示信息
		 * **/
		String username	 = request.getParameter("name");
		String password = request.getParameter("pwd");
		 UserService service =
		 BasicFactory.getFactory().getService(UserService.class);
		 User user = service.getUserByNameAndPsw(username,password);
		 if(user == null){
			 System.out.println(username+""+password);
			 msg msg = new msg();
			 msg.setStatus(0);
			 msg.setErrMsg("用户名密码错误");
			 response.getWriter().println( new JSONArray().fromObject(msg).toString());
			 return;
		 }else{
			 request.getSession().setAttribute("user", user);
			 Cookie autologinC = new
			 Cookie("autologin",URLEncoder.encode(user.getUser_username()+":"+user.getUser_password(),"utf-8"));
			 autologinC.setPath("/");
			 autologinC.setMaxAge(3600*24*30);
			 response.addCookie(autologinC);
			 msg msg = new msg();
			 msg.setStatus(1);
			 response.getWriter().println( new JSONArray().fromObject(msg).toString());
			 return;
		 }
	}
}
