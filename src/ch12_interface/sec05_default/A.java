package ch12_interface.sec05_default;

public interface A {

	void abc();
	
	// 고객사 요구에 의해서 갑자기 def() 메소드를 추가해야 함
	public default void def() {
		System.out.println("Interface A에서 공통된 메소드를 추가하였음.");
	}
	
	public static void ghi() {
		System.out.println("Interface A에서 실행하는 정적 메소드.");
	}
	
}