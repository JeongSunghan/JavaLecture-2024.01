package ch10_oop.sec04_polumorphism;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		cat.jump();
		Dog dog = new Dog();
		dog.sound();
		dog.walk();

		// 다형성, 자식은 부모 타입으로 자동 타입 변환이 이루어짐
		Animal animal = new Cat();
		animal.sound(); // 야옹~~
//			animal.jump();				// Animal class에 없는 메소드는 사용 불가
		animal = dog;
		animal.sound(); // 멍멍!!
//			animal.walk(); 				// Animal class에 없는 메소드는 사용 불가

		animal = cat;
		cat = (Cat) animal; // 강제 타입 변환
		cat.jump();

//			dog = (Dog) animal; dog.walk();		// 강제 타입 변환은 주의깊게 해야 함

//			animal = cat;
//			animal = dog;
		animal = new Animal();
		if (animal instanceof Cat) {
			cat = (Cat) animal;
			cat.sound();
			cat.jump();
		} else if (animal instanceof Dog) {
			dog = (Dog) animal;
			dog.sound();
			dog.walk();
		} else {
			System.out.println("cat.sound()/dog.sound() 등을 사용할 수 없음.");
		}

	}

}