package ch10_oop.sec02_constructor;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person("제임스", 27);
		person.eat(); person.sleep();
		
		Student studnet = new Student("마리아", 23, 1234);
		studnet.eat(); studnet.sleep();
		studnet.study();
	}

}
