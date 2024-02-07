package Mysql2.sec06_user;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptExample {
	
	/*	암호화
	  
			평문 		=>	 		비문
		plain text				Cipher text
		
		복원 가능 ==>
							    <== 비복원						
	 */
	
	
	public static void main(String[] args) {
		String pwd = "1234qwerty";
		String hashedPwd = BCrypt.hashpw(pwd, BCrypt.gensalt());
		System.out.println(hashedPwd.length());
		System.out.println(hashedPwd);
		
		//패스워드가 동일한지 확인
		boolean result = BCrypt.checkpw(pwd, hashedPwd);
		System.out.println(result);
		
	}

}
