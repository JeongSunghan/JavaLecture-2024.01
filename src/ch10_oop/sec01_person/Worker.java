package ch10_oop.sec01_person;

public class Worker extends Person {
	int workerId;
	
	void work() {
		System.out.println(name + "이/가 열심히 일을 합시다.");
	}
}
