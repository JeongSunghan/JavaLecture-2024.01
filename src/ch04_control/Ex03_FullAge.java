package ch04_control;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex03_FullAge {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
//		System.out.println(today);
		
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
//		System.out.printf("%d, %d, %d/n" , year, month, day);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("생년> ");
		int bYear = Integer.parseInt(scan.nextLine());
		
		System.out.print("생월> ");
		int bMonth = Integer.parseInt(scan.nextLine());
		
		System.out.print("생일> ");
		int bDay = Integer.parseInt(scan.nextLine());
		
		System.out.print("저의 생년월일은 " + bYear + "년 " + bMonth + "월 " + bDay + "일 입니다.");
		
		int age = 0;
		if(month > bMonth)
			age = year - bYear;
		else if(month <bMonth)
			age = year - bYear -1;
		else {
			if (day >= bDay)
				age = year - bYear;
			else
				age = year - bYear -1;
		}
		System.out.print(" 그리고 나의 만나이는 " + age + "살 입니다.");
			
			//리펙토링
//			int fullAge = year - bYear;
//			if (month < bMonth || (month == bMonth && day < bDay))
//				fullAge--;
//			System.out.print(" 그리고 나의 만나이는 " + fullAge + "살 입니다.");
//			
//			int age2 = (month < bMonth || (month == bMonth && day < bDay)) ? 
//						year - bYear -1 : year - bYear;
//			System.out.print(" 그리고 나의 만나이는 " + age2 + "살 입니다.");
	}

}
