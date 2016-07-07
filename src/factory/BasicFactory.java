package factory;

import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Properties;
import service.Service;

import dao.Dao;
public class BasicFactory {
	private static BasicFactory factory = new BasicFactory();
	private static Properties prop = null;
	private BasicFactory(){}
	static{
		try {
			prop = new Properties();
			prop.load(BasicFactory.class.getClassLoader().getResourceAsStream("config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	public static BasicFactory getFactory(){
		return factory;
	}
	public <T extends Dao> T getDao(Class<T> clazz){
		try{
			String infName = clazz.getSimpleName();
			String implName = prop.getProperty(infName);
			return (T) Class.forName(implName).newInstance();
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	public <T extends Service> T getService(Class<T> clazz){
		try{
			String infName = clazz.getSimpleName();
			String implName = prop.getProperty(infName);
			return (T) Class.forName(implName).newInstance();
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
