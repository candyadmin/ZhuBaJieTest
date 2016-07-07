package dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import domain.User;
import utils.SourceUtils;

public class UserDaoImpl implements UserDao{
	@Override
	public User getUserByNameAndPsw(String username, String password) {
		String sql = "select * from users where user_username = ? and user_password = ?";
		try{
			QueryRunner runner = new QueryRunner(SourceUtils.getSource());
			return runner.query(sql, new BeanHandler<User>(User.class),username,password);
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
