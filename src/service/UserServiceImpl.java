package service;

import dao.UserDao;
import domain.User;
import factory.BasicFactory;
import utils.MD5Utils;

public class UserServiceImpl implements UserService{
	private UserDao dao = BasicFactory.getFactory().getDao(UserDao.class);
	@Override
	public User getUserByNameAndPsw(String username, String password) {
		return dao.getUserByNameAndPsw(username,MD5Utils.md5(password));
	}
}
