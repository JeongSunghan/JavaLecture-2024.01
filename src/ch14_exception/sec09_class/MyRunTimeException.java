package ch14_exception.sec09_class;

public class MyRunTimeException extends RuntimeException {

	public MyRunTimeException() {
	}

	public MyRunTimeException(String message) {
		super(message);
	}

}
