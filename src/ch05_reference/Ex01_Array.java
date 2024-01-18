package ch05_reference;

import java.util.Arrays;

public class Ex01_Array {

	public static void main(String[] args) {
		//배열 생성
		//배열을 생성하면서 값을 지정하는 경우
		int[] score = {80, 90, 78, 93, 65};
		//정수타입-배열-배열명 = [안에 숫자를 담음]
		
		char[] grade = {'B', 'A', 'C', 'A', 'D'} ;
		//문자타입 배열명 배열 = [안에 문자를 담음]
		
		//배열을 생성하면서 크기를 지정하는 경우
		int[] newArray = new int[10];
		//정수타입 배열 배열명 = new int배열의 크기는 10
		
		//배열 인덱싱
		System.out.println(score[0] + ", " + score[4]);
		//배열명-스코어에서 0번 index와 4번 index을 출력
		
		for (int i = 0; i < score.length; i++)		//lenght는 몇개냐 = 인덱스 갯수(스트링의 갯수)
		//반복문 - int i는 0이고 i가 배열스코의 인덱스갯수보다 작을 때 i를 +1씩 증감
			System.out.print(score[i] + " ");
			//배열스코어에서 반복문을 통한 i값을 문자열로 출력
			//출력 결과 i = 1일때 80, 2=>90, 3=>78 ... 5=>65 끝
		
		System.out.println();
		
		//값을 할당하는 방법
		score[0] = 90; grade[0] = 'A';
		//스코어배열에서 0번째는 90으로, 그레이드배열에서 0번째는 A로 할당
		
		for (int i = 0; i < newArray.length; i++)
			//반복문 - i는 0이고, i가 newarray배열의 인덱스갯수보다 작을 때, i를 +1씩 증감
			
			newArray[i] = 1 + (int) (Math.random() *6);
			//반복문을 통한 newArray배열 i는 = 1 + 정수타입 math.random()*6
			//i는 1일때 1*math.ranodm으로 나온 *6 정수의 값
		System.out.println(Arrays.toString(newArray));
		System.out.println(Arrays.toString(score));
	}

}
