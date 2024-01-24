package ch14_exception;

public class Ex08_Throws {

	public static void main(String[] args) throws Exception {
//		try {
//			findClass();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("클래스를 찾지 못하였습니다.");
//		}
		findClass();
	}

	static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
	
}
