package ch05_reference;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Ex13_StringMethood2 {

	public static void main(String[] args) {
		String str1 = "Hello Java";
		String str2 = "안녕하세요? 반갑습니다.";
		
		/*대소문자 변경*/
		System.out.println(str1.toUpperCase());
		
		/*문자열 대치(replace)*/
		String str3 = str2.replace("안녕하세요", "안녕").replace("반갑습니다", "방가방가");
		System.out.println(str3);	//안녕? 방가방가
		System.out.println(str3.replace("방가", "하이"));
		
		//정규 표현식 사용가능
		String regExp = str2.replaceAll("[?.]", "*");			//? 또는 .을 *로 변경해라
		System.out.println(regExp);

		/*문자열 일부 발췌*/
		String dateTime = "2024-01-17 14:20:05";
		String date = dateTime.substring(0, 10);
		String time = dateTime.substring(11);
		System.out.println(date + ", " + time);
		
		String now = LocalDateTime.now().toString();
		System.out.println(str3);
		date = now.substring(0, 10);
		time = now.substring(11, 11+8);
		System.out.println(date + ", " + time);
		
		/*주민등록번호로부터 생년월일(YYYY-MM-DD) 표시하기*/
		String ssn1 = "880927-1234567", ssn2 = "010117-4123456";
			//1988년 09월 27일로 표기 , 2001년 01월 17일로 표기
		
		String year = ssn1.substring(0,2);
		String month = ssn1.substring(2,4);
		String day = ssn1.substring(4,6);
		
		String sYear = ssn2.substring(0,2);
		String sMonth = ssn2.substring(2,4);
		String sDay = ssn2.substring(4,6);
		
		System.out.println(year + "년 " + month +"월 " + day + "일");
		System.out.println(sYear + "년 " + sMonth +"월 " + sDay + "일");
		
		//강사 해답
		String ymd1 ="";
		if (ssn1.charAt(7) == '1' || ssn1.charAt(7) == '2')
			ymd1 = "19";
		else
			ymd1 = "20";
		ymd1 += ssn1.substring(0,2) + "-"  + ssn1.substring(2,4) + "-" + ssn1.substring(4,6);
		System.out.println(ymd1);
		String ymd2 = (ssn2.charAt(7) == '1' || ssn2.charAt(7) == '2') ? "19" : "20";
		ymd2 += ssn2.substring(0,2) + "-"  + ssn2.substring(2,4) + "-" + ssn2.substring(4,6);
		System.out.println(ymd2);
		
		/* 문자열을 분할해서 배열로 반환 = split */
		String fruitStr = "감, 배, 귤, 밤";
		String[] fruits = fruitStr.split(", ");
		System.out.println(Arrays.toString(fruits));
		
		fruitStr = "감, 배; 귤: 밤";
		fruits = fruitStr.split("[,;:] ");	//정규표현식 사용 가능
		System.out.println(Arrays.toString(fruits));
		
		//PATH
		String pathStr = "C:\\Program Files\\Common Files\\Oracle\\Java\\javapath";
		String[] pathArray = pathStr.split(";");
		for (String path: pathArray)
			System.out.println(path.replace("\\", "/"));
		
		/* 문자열 배열을 하나의 문자열로 생성 = join */
		System.out.println(String.join(" -:- ", "감, 배; 귤: 밤".split("[,;:] ") ));
		//문자열을 배열로 만드는 것 = join
		
		/*문자열 좌우의 공백 제거 =  trim*/
		String dirtyText = " \t 자바 프로그래밍 \t \r\n";
		String cleanText = dirtyText.trim();
		System.out.println(cleanText + ", " +cleanText.length());
		
		
	}

}
