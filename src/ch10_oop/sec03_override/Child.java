package ch10_oop.sec03_override;

public class Child extends Parent{
	int childField;
	
	void childMethod() {
		System.out.println("childMethod():" + childField);
	}
	
	
	
	//메소드 재정의 - 부모가 정의한 메소드를 자식이 새롭게 재정의하는 것을 의미
	@Override 
	void parentMethod() {
//		System.out.println("Child가 새롭게 정의한 parentMethod(): " + parentField);
		System.out.print("Child가 새롭게 정의한 ");
		super.parentMethod();
		
	}
}
