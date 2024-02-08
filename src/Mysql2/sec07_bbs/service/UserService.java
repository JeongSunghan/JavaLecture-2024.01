package Mysql2.sec07_bbs.service;

import java.util.List;

import Mysql2.sec07_bbs.entity.User;

public interface UserService {
	public static final int CORRECT_LOGIN = 0;
	public static final int WRONG_PASSWORD = 1;
	public static final int USER_NOT_EXIST = 2;
	public static final int COUNT_PER_PAGE = 10;

	User getUserByUid(String uid);

	List<User> getUserList(int page);

	void registerUser(User user);

	void updateUser(User user);

	void deleteUser(String uid);

	int login(String uid, String pwd);

	void close();
}
