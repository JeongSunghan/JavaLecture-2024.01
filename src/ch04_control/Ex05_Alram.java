package ch04_control;

import java.util.Scanner;

public class Ex05_Alram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시간 입력> ");
		int hour = Integer.parseInt(scan.nextLine());
		System.out.println("분 입력> ");
		int minute = Integer.parseInt(scan.nextLine());
		scan.close();
		
		int newHour = hour, newMin = minute;
			if(minute >= 45)
				newMin = minute - 45;
			else {
				if (hour % 24 == 0) {
					newHour = 23;
					newMin = minute + 60 - 45;
				}else {
					newHour = hour - 1;
					newMin = minute + 60 - 45;
				}
			}
			// 2d = 정수 두 자리로 집어넣겠다.
			// 02d = 자리가 비면 0으로 채워라
			System.out.printf("%02d:%02d%n", newHour, newMin);

			//Refactoring
			newHour = hour; newMin = minute - 45;
				if (minute < 45) {
				newMin = minute + 60 - 45;
				newHour = (hour % 24 == 0) ? 23 : hour - 1;
			}
			System.out.printf("%02d:%02d%n", newHour, newMin);
	}

}
