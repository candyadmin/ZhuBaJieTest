package web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import domain.Project;
import domain.User;
import domain.msg;
import factory.BasicFactory;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import service.ProjectService;
import service.UserService;
import utils.jsonToValue;

public class SubPro extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 发布项目
		 * 
		 * {"datas":{"ProjectName":"1","Area":"1","ExpectWorkTime":"1",
		 * "Location":"1","ProjectRate":"1","Summary":"1","OtherRequire":"1"}}
		 */
		//调用工具设置requst
		jsonToValue.setinput(request);
		Project project = new Project();
		project.setProjectName(jsonToValue.jsonToJsonValue( "ProjectName"));
		project.setArea(Integer.parseInt(jsonToValue.jsonToJsonValue( "Area")));
		project.setExpectWorkTime(new Date(Integer.parseInt(jsonToValue.jsonToJsonValue( "ExpectWorkTime"))));
		project.setLocation(jsonToValue.jsonToJsonValue( "Location"));
		project.setProjectRate(Integer.parseInt(jsonToValue.jsonToJsonValue( "ProjectRate")));
		project.setSummary(jsonToValue.jsonToJsonValue( "Summary"));
		project.setOtherRequire(jsonToValue.jsonToJsonValue( "OtherRequire"));
		
		ProjectService service =
				 BasicFactory.getFactory().getService(ProjectService.class);
		 service.subProject(project);//发布商品
		 msg msg = new msg();
		 msg.setStatus(1);
		 response.getWriter().println( new JSONObject().fromObject(msg).toString());

	}
}
