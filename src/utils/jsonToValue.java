package utils;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import org.json.JSONArray;
import org.json.JSONObject;
public class jsonToValue {
	/**
	 * @throws Exception 
	 * 
	 * */
	//{datas:{a,a}}
	public static String jsonToJsonValue(HttpServletRequest request,String name) {
		try {
			String stringdatas="";
			InputStream inputStream = request.getInputStream();
			byte[] bs = new byte[1024];
			int i = 0;
			while ((i = inputStream.read(bs)) != -1) {
				stringdatas = new String(bs, 0, i);
			}
			inputStream.close();
			JSONObject json = new JSONObject(stringdatas);
			System.out.println(json.get("datas"));
			JSONObject obj = new JSONObject(stringdatas);  
			return (String) obj.getJSONObject("datas").get(name);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
