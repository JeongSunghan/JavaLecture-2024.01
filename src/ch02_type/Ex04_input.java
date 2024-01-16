package ch02_type;

import java.io.IOException;
import java.util.Scanner;

public class Ex04_input {

	public static void main(String[] args) throws IOException {
//		하나의 문자를 읽을 떄 사용하나, 빈번하게 사용되지 않음!		
//		int KeyCode = System.in.read();		//'5'
//		System.out.println("KeyCode" + KeyCode);		//0x35 => 3*16 + 5 = 53
		
		Scanner scan = new Scanner(System.in);			//new가 scanner라는 객체를 만들어 줘라(type = Scanner)
		System.out.print("입력하세요> ");
		String inputText = scan.nextLine();		//엔터를 칠때까지의 문자열을 읽음
		System.out.println(inputText);


	}

}
