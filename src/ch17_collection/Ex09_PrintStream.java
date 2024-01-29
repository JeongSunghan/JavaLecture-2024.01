package ch17_collection;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex09_PrintStream {

	public static void main(String[] args) throws Exception {
		// 파라메터에 true 가 있으면 append mode
		// 없으면 overwrite mode
		PrintStream ps = new PrintStream(new FileOutputStream("c:/Temp/print.txt", true));

		ps.print("마치 ");
		ps.println("System.out이 출력하는 것 처럼");
		ps.println("데이터를 출력합니다.");
		ps.println("아래와 같이 포맷티드 출력도 가능합니다.");
		ps.printf("%-6s%,8d%n", "딸기", 12000);
		ps.printf("%-6s%,8d%n", "사과", 3000);
		
		ps.flush(); ps.close();
	}

}