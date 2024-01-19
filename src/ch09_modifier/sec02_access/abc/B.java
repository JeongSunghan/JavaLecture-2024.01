package ch09_modifier.sec02_access.abc;

public class B {
	void abc( ) {
		A a = new A();
		System.out.println(a.a + a.b + a.c);
		//A 클래스의 d는 사용 불가 => private는 다른 클래스에서 사용이 안됨
	}
	
}
