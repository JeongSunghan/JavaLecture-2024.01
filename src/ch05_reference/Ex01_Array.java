package ch05_reference;

import java.util.Arrays;

public class Ex01_Array {

	public static void main(String[] args) {
		//배열 생성
		//배열을 생성하면서 값을 지정하는 경우
		int[] score = {80, 90, 78, 93, 65};
		char grade[] = {'B', 'A', 'C', 'A', 'D'} ;
		//배열을 생성하면서 크기를 지정하는 경우
		int[] newArray = new int[10];
		
		//배열 인덱싱
		System.out.println(score[0] + ", " + score[4]);
		for (int i = 0; i < score.length; i++)
			System.out.print(score[i] + " ");
		System.out.println();
		
		//값을 할당하는 방법
		score[0] = 90; grade[0] = 'A';
		for (int i = 0; i < newArray.length; i++)
			newArray[i] = 1 + (int) (Math.random() *6);
		System.out.println(Arrays.toString(newArray));
		System.out.println(Arrays.toString(score));
	}

}
