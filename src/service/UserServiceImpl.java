package service;

import dao.UserDao;
import domain.User;
import factory.BasicFactory;

public class UserServiceImpl implements UserService{
	private UserDao dao = BasicFactory.getFactory().getDao(UserDao.class);
	@Override
	public User getUserByNameAndPsw(String username, String password) {
		return dao.getUserByNameAndPsw(username,password);
	}
}
