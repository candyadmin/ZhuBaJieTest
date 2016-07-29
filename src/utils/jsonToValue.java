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
	//{"datas":{"ProjectName":"1","Area":"1","ExpectWorkTime":"1","Location":"1","ProjectRate":"1","Summary":"1","OtherRequire":"1"}}
	public static InputStream inputStream = null;
	private static JSONObject obj;
	public static void setinput(HttpServletRequest request){
		try {
			inputStream = request.getInputStream();
			String stringdatas="";
			byte[] bs = new byte[1024];
			int i = 0;
			while ((i = inputStream.read(bs)) != -1) {
				stringdatas = new String(bs, 0, i);
			}
			inputStream.close();
			obj = new JSONObject(stringdatas);  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String jsonToJsonValue(String name) {
		try {
				return (String) obj.getJSONObject("datas").get(name);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
