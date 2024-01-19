package ch09_modifier.sec03_static;

public class Sample {
	int intstanceField;
	public static final int STATIC_FIELD = 1234;

	void instanceMethod() {
		System.out.println("instance method");

	}

	static void staticMethod() {
		System.out.println("static method");

	}
}
