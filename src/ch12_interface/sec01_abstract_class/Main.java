package ch12_interface.sec01_abstract_class;

public class Main {

	public static void main(String[] args) {
		//추상 클래스는 객체 생성 안됨
//		Animla animal = new Animal();
		
		Cat cat = new Cat();
		cat.cry();
		
		Dog dog = new Dog();
		dog.cry();
		
		Animal animal = new Cat();
		
		
	}

}
