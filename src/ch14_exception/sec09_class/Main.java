package ch14_exception.sec09_class;

public class Main {

	public static void main(String[] args) {
		MyException me1 = new MyException();
		MyException me2 = new MyException("내가 만든 예외 클래스");

//		throw me1;
//		throw me2;
//		throw new MyException("의도적 예외 발생");
		
//		throw new MyRunTimeException("의도적 런타임 예외 발생");
		
		try {
			for (int i = 0; i <= 100000; i++) {
				for (int k = 0; k <= 1000000; k++) {
					if (i == 100 && k == 100)
						throw new MyException("의도적 예외 발생");
				}
			}
		} catch(MyException e) {
//			e.printStackTrace();
		}
		System.out.println("이중 루프 탈출");
	}

}
