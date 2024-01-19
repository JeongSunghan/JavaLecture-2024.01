package ch10_oop.sec04_polumorphism;

public class Cat extends Animal {
	
	@Override
	void sound() {
		System.out.println("야옹~");
	}
	
	void jump() {}
}
