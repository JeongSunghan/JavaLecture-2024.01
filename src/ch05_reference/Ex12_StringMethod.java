package ch05_reference;

import java.util.Scanner;

public class Ex12_StringMethod {

	public static void main(String[] args) {
		String str1 = "Hello Java";
		String str2 = "안녕하세요? 반갑습니다.";
		
		//스트링의 길이 - 속성이 아닌 메소드 타입임 = 속성은 변수/메소드는 함수이다
		System.out.println(str1.length() + ", " + str2.length());	//10과 13이 출력
		//str1과 2의 lenght = 스트링 글자수 혹은 배열일 경우 배열수를 출력해달라는 코드
		
		//문자열 검색
		System.out.println(str2.charAt(0) + ", " + str2.charAt(7));  //안 과 반이 출력
		
		//주민등록번호를 입력받아서 남자인지, 여자인지를 구별
		Scanner scan = new Scanner(System.in);
		//
		
		System.out.println("주민번호를 주세요> ");
		String inputText = scan.nextLine();
		scan.close();
		System.out.println();
		char gender = inputText.charAt(7);
		switch(gender) {
		case '1' : case '3' :
			System.out.println("남자"); break;
		case '2' : case '4' :
			System.out.println("여자"); break;
		}		
					
	}	

}
