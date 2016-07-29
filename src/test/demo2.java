package test;

import java.util.Date;

import org.junit.Test;

import domain.User;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import service.UserService;

public class demo2 {
	@Test
	public void demo1() {
		User user = new User();
		user.setUser_id(1);
		user.setUser_idcard(1);
		JSONArray jsonArray = new JSONArray();
		// System.out.println(new JSONArray().fromObject(user).toString());
		JSONObject jsonObject = new JSONObject();
		System.out.println(jsonObject.fromObject(user).toString());
	}
	@Test
	public void demo2(){
		new Date(1);
	}
	
}
class person {
	public person(){
		System.out.println("pok");
		
	}
	
}
