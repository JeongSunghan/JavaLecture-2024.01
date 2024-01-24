package ch14_exception;

public class Ex05_MultiCatch {

	public static void main(String[] args) {
		int value = 0;
		
		try {
			value = Integer.parseInt(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("매개변수를 입력해야 합니다.");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("올바른 숫자를 입력해야 합니다.");
		}
		System.out.println(value);
	}

}
