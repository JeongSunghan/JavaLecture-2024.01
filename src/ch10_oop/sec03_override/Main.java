package ch10_oop.sec03_override;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.parentField = 1000;
		parent.parentMethod();
		
		Child child = new Child();
		child.childField = 300;
		child.parentField = 600;
		child.childMethod();
		child.parentMethod();

//		Parent p = new Child();
//		Child c = (Child)new Parent();
	}

}
