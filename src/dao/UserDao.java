package dao;

import domain.User;

public interface UserDao extends Dao{

	User getUserByNameAndPsw(String username, String password);

}
