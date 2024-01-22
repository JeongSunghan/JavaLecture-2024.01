package ch12_interface.sec05_default;

public class C implements A {

	@Override
	public void abc() {
		System.out.println("C에서 abc()를 실행합니다.");
	}

	@Override
	public void def() {
		A.super.def();
		System.out.println("C에서 def()를 수정하였음.");
	}
	

}