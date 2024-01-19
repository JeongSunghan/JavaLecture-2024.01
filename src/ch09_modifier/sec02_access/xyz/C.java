package ch09_modifier.sec02_access.xyz;

import ch09_modifier.sec02_access.abc.A;

public class C {
	void xyz() {
		A a = new A();
		System.out.println(a.a);		//다른 패키지의 A클래스의 a변수만 사용가능
	}
}
