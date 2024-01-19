package ch05_reference;

import java.util.Arrays;

public class Ex03_MultiDimArray {

	public static void main(String[] args) {
		//2차원 배열(matrix)
		int[][] matrix = new int[2][3];
		int score[][] = {{80, 80, 70}, {85,88,72}};
		System.out.println(Arrays.toString(score));		//score의 주소출력
		System.out.println(Arrays.toString(score[0]));		//score의 값 출력
		System.out.println(Arrays.toString(score[1]));		//score의 값 출력
		
		//인덱싱
		System.out.println(score[0][0] + ", " + score[1][1]);
		
		//톱니바퀴 모양
		int gear[][] = {{1, 3, 5, 9}, {2,6}, {8, 5, 3}};
		
		//실력향상 연습문제
		//두 개의 행렬에 dot product 구해보기
		int[][] a = {{1, 2, 3}, {4, 5, 6}};		// 2*3
		int[][] b = {{1, 2,}, {3, 4}, {5, 6}};	// 3*2
		int[][] c = new int[2][2];
	
		//지뢰찾기
			//1. 지뢰칸 만들기
		char[][] mines = new char[8][8];
		for (int i = 0; i < mines.length; i++) {
			for(int k = 0; k < mines[i].length; k++) {
				mines[i][k] = (Math.random() > 0.7) ? '*' : '.';
			}
		}
		printMines(mines);
		
	}
	
			//2. 출력하는 지뢰판함수
			static void printMines(char[][] arr) {
				for (int i = 0; i < arr.length; i++) {
					for (int k = 0; k < arr[i].length; k++) {
						System.out.print(arr[i][k] +" ");
					}
					System.out.println();
				}
			}
}
