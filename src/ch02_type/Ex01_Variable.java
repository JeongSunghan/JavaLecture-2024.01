package ch02_type;

public class Ex01_Variable {
	private static int num = 2;
	public static void main(String[] args) {
		int age;		//int = 정수
		age = 21;
		
		int score = 88;	//변수를 선언하면서 초기화를 동시에 해주는 것을 권장.
		var value = age * score;	//Java 8에서는 구동X
		System.out.println("age:" + age + ", score:" + score + ", value:" + value);
		
		/*
		 * 변수이름 규칙
		 * 	1. 영문대소문자 및 한글 사용 가능
		 * 	2. 특수문자는 두 가지만 표현가능 '_', '$'
		 * 	3. 숫자사용간으 단, 변수의 첫번째는 올 수 없음.
		 * 	4. 자바에서 사용중인 키워드 사용 불가
		 * 
		 * 권고사항
		 * 	1. 변수의 일므은 소문자로 시작
		 * 	2. 두개 이상의 단어가 결합된 경우 새 단어는 대문자로 시작(camel notation) 
		 * 상수(Constant) 이름 규칙
		 * 	1. 상수는 모든 글자를 대문자로
		 * 	2. 두개 이상의 단어가 결합된 경우 사이에 _(언더바) (Snake notation)
		 * 
		 * 변수 라이프 사이클
		 * 	- 변수는 자신이 선언된 블록({	}) 안에서만 유효
		 * 	
		 */
		if (age >= 19) {
			System.out.println("음주허용");
			int num = 5;
			System.out.println(num);		//블록 안에 있는 num출력 = 5
		}
		System.out.println(num);		//클래스 선언 밑에 있는 num출력 = 2
	}

}
