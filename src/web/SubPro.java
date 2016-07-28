package web;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.json.JSONArray;
import org.json.JSONObject;

import com.thoughtworks.xstream.io.json.JsonWriter;
import domain.User;
import domain.msg;
import factory.BasicFactory;
import service.UserService;
import utils.jsonToValue;

public class SubPro extends HttpServlet {
	private String stringdatas;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 发布项目
		 */
		System.out.println("Location:::"+jsonToValue.jsonToJsonValue(request,"Location"));
	}
}
