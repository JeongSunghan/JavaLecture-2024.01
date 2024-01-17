package ch05_reference;

import java.util.function.Function;

public class Ex99_240117 {

	public static void main(String[] args) {
		//Q1. 1에서 1000사이에 0은 몇번, 1은 몇번, ... 9는 몇번 사용되었는지
		int[] Counts = new int[10];

		for (int number = 1; number <= 1000; number++) {
			char[] digits = Integer.toString(number).toCharArray();
			for (char digitChar : digits) {
				int digit = digitChar - '0';
				Counts[digit]++;
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i + "의 개수: " + Counts[i]);

			//Q2. 00:00 ~ 23:59 하루동안 3이 표시되는 시간은?
			int displayTime = 0;
			for (int hour = 0; hour <= 23; hour++) {
				for (int minute = 0; minute <= 59; minute++) {
					String clock = hour + ":" + minute;
					if (clock.indexOf('3') >= 0)
						displayTime += 60;
				}
				System.out.println("하루동안 3이 표시되는 시간은" + displayTime + "초 입니다.");
				
				// 3. 두개의 세자리수를 곱해서 나온 결과가 palindrome일때
				// 가장 큰 palindrome 수와 어떤 수를 곱해서 나온 결과인가?
				
					
						
					}
				}
				
				
					
				
				
				

				// 4. C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js
				// 에서 파일명(04.String연습.js)만 출력하세요.
				
				String pathStr = "C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js";
				int fileIndex = pathStr.lastIndexOf("/");
				System.out.println(pathStr.substring(fileIndex) +1);
						
					}
				
			}

