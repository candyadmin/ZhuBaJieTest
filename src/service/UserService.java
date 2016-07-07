package service;

import domain.User;

public interface UserService  extends Service{
	/**
	 * 根据用户名密码查找用户
	 * @param username
	 * @param password
	 */
	User getUserByNameAndPsw(String username, String password);
}
