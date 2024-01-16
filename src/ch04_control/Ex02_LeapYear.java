package ch04_control;

import java.util.Scanner;

public class Ex02_LeapYear {

	public static void main(String[] args) {
		System.out.print("연도 입력> ");
		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		int year = Integer.parseInt(inputStr);
		scan.close();
		
		if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0)
		    System.out.println(year + "년은 윤년입니다.");
		else   
			System.out.println(year + "년은 평년입니다.");
	}
	
}
