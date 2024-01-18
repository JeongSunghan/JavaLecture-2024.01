package praticeExam;

import java.util.Arrays;

public class Q01_NumberCount {

	public static void main(String[] args) {
		String numStr = "";
		// 해석 : numStr의 문자열은 = ""(빈 문자열)
		for (int i = 1; i <= 1000; i++)
			numStr += i;

		// 정규표현식 사용
		// [^3] : 3이 아닌 글자
		for (int i = 0; i <= 9; i++) {
			String numbers = numStr.replaceAll("[^" + i + "]", "");
			// reaplce는 정규 표현식 사용불가, ALL은 사용가능
			// 문자열 number는 = 위에 반복문을 통한 numStr을 
			int count = numbers.length();
			System.out.println(i + ":" + count);
		}
		// 배열을 사용해서 숫자를 일일이 카운트
		int[] countArray = new int[10];	 	// {배열의 크기지정} {0,0,0,0,0 ... 0(10번쨰})

		for (int i = 1; i <= numStr.length(); i++) {
			char num = numStr.charAt(i);		//'1', '2' ..., '0' 중에 하나의 값이 됨 => 왜?
			//
			int numValue = num -'0';	// 1, 2 ..., 0 숫자 값
			//
			countArray[numValue]++;		//증감식 = 
			//
			}
		System.out.println(Arrays.toString(countArray));
		}
	}

