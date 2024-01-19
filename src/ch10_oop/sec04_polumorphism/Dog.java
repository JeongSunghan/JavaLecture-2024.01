package ch10_oop.sec04_polumorphism;

public class Dog extends Animal {
	// @Override 생략 가능
	void sound() {
		System.out.println("멍멍!!");
	}
	
	void walk() { }
}