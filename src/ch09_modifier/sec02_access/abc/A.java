package ch09_modifier.sec02_access.abc;

public class A {
	public int a;
	protected int b;
	int c;
	private int d;
	
	void abc() {
		System.out.println(a + b + c + d);		//a,b,c,d 모두 사용 가능
	}
}
