package ch06_class.sec04_tmoney;

import java.util.Scanner;

public class TmoneyMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("나이> ");
		int age = Integer.parseInt(scan.nextLine());
		System.out.println("금액> ");
		int cash = scan.nextInt();		//= Integer.parseInt(scan.nextLine()); 같은 의미
										//= next int는 여러번 걸치면 불안하으므로 line 선호
		scan.close();
		
		Tmoney tm = new Tmoney(age, cash); 	//객체를 생성
		System.out.println(tm);
		
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if (!tm.ride())
				break;
			System.out.print(i + "회 탑승 후");
			System.out.println(tm);
		}
	}

}
