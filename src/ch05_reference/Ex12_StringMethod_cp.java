package ch05_reference;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;

public class Ex12_StringMethod_cp {

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
		
		/*
		System.out.println("주민번호를 주세요(-포함)> ");
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
		*/		
		
		
		
//		System.out.println(str1.indexOf("Java") + ", " + str2.indexOf('반'));
//		//찾고자 하는 문자열이 대상 문자열에 있는지 확인
//		//str2일시 값을 찾을 수 없어서 출력이 안됨
//		//해석 :
//		
//		if (str1.toLowerCase().indexOf("Java") >= 0)
//			//toLowerCase : 소문자로 변경
//		System.out.println("문장 안에 java라는 글자가 있습니다.");
//		
//		System.out.println("apple pineapple".lastindexOf("pp"));
		
		//문자열 변환
		boolean a = true; int b = 123; double c = 3.14; char d = 'a';
		//명시적(explicit) 변환
		
		System.out.println(String.valueOf(a) + ", " + String.valueOf(b) + ", " +
							String.valueOf(c) + ", " + String.valueOf(d));		//암묵적(implicit) 변환
		
		System.out.println(a + ", " + b + ", " + c + ", " + d);		//위에와 동일한 결과 출력

		//문자열 배열 변환, 문자열 --> byte[], char[]
		byte[] byteStr1 = str1.getBytes();
		byte[] byteStr2 = str2.getBytes(Charset.defaultCharset());
		System.out.println(Arrays.toString(byteStr1));
		System.out.println(Arrays.toString(byteStr2));	//UTF-8 초성+중성+종성 각 1바이트
		System.out.println(Arrays.toString(str2.toCharArray()));
		
		/*문자열 내용 비교*/
		System.out.println(str1.equals("hello java"));
		System.out.println(str1.equalsIgnoreCase("hello java"));
		// 문자열 비교시 == 사용금지, equals 사용
		
		

		
				
	}	

}
