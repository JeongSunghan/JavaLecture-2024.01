package Mysql2.sec07_bbs.appl;

import java.time.LocalDate;
import java.util.List;

import Mysql2.sec07_bbs.entity.User;
import Mysql2.sec07_bbs.service.UserService;
import Mysql2.sec07_bbs.service.UserServiceMySQLImpl;

public class UserTest {

	public static void main(String[] args) {
		UserService userSvc = new UserServiceMySQLImpl();
		User user = null;
		
		
		//유저추가
//		user = new User("admin", "1234", "관리자", "admin@naver.com");
//		userSvc.registerUser(user);
//		
//		user = new User("james", "1234", "제임스", "james@naver.com");
//		userSvc.registerUser(user);
//		
//		user = new User("maria", "1234", "마리아", "maria@naver.com");
//		userSvc.registerUser(user);
//		
//		user = new User("brian", "1234", "브라이언", "brian@naver.com");
//		userSvc.registerUser(user);
//		
//		user = new User("sarah", "1234", "사라", "sarah@naver.com");
//		userSvc.registerUser(user);
		
//		user = userSvc.getUserByUid("admin");
//		System.out.println(user);
//		
//		
//		user = userSvc.getUserByUid("james");
//		System.out.println(user);
	
//		//올바르게 입력한거
//		System.out.println(userSvc.login("admin", "1234"));
//				
//		//비밀번호 오류
//		System.out.println(userSvc.login("admin", "asdf"));
//		
//		//없는 아이디
//		System.out.println(userSvc.login("james", "1234"));
		
//		List<User> list = userSvc.getUserList(1);
//		list.forEach(x -> System.out.println(x));
		//제임스 마리아가 출력
		
		userSvc.close();		
		
	}

}
