package ch18_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q21_Grep {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("찾을 문자열> ");
		String search = scan.nextLine();
		//찾을 문자열을 입력 후 다음
		System.out.println("찾을 파일명> ");
		String filename = scan.nextLine();
		//찾을 파일명 입력 후 다음
		scan.close();
		//검색 닫기
		
		grep(search, filename);
		
	}
	
	static void grep(String search, String filename) {		//찾을려고 하는 문자열
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			//버퍼리더란 = 키보드의 입력이 있을 떄마다 한 문자씩 버퍼로 전달.
			int lineNo = 1;		// 라인번호
			
			while (true) {
				String line = br.readLine();		//한줄 단위로 읽겠다.
				if(line == null)		//줄을 다 읽고 없으면 반복문 탈출
					break;	
				String newLine = line.toLowerCase();		
				//나는 줄(라인)에 나오는 글을 대/소문자 구분없이 읽고싶다. 
				//전부 소문자로 바꾸기
				if (newLine.contains(search.toLowerCase()))
					System.out.printf("%4d:\t%s", lineNo, line);
				lineNo++;				
				//찾을려고 하는 문자열을 알고 싶을 때 index.of 혹은 contains
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
