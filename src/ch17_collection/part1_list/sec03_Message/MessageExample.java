package ch17_collection.part1_list.sec03_Message;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageExample {

	public static void main(String[] args) {
		List<Message> list = new ArrayList<>();

		// 객체 추가
		Message message = new Message(1, "Hello", "James", LocalDateTime.now(), 0);
		list.add(message);
		list.add(new Message(2, "World", "Maria", LocalDateTime.now(), 0));
		
		for (int i = 1; i <= 3; i++) {
			Message msg = new Message(2+i, "내용"+i, "저자"+i, LocalDateTime.now(), 0);
			list.add(msg);
		}
		
		list = generateMessage();
		for (Message m: list)
			System.out.println(m);
		
		// 이름이 3글자 이상인 사람의 글
		List<Message> newList = new ArrayList<Message>();
		for (Message msg: list) {
			if (msg.getWriter().length() >= 3)
				newList.add(msg);
		}
		for (Message m: newList)
			System.out.println(m);
	}
	
	// 메세지 객체를 3개 생성해서 리스트로 반환
	static List<Message> generateMessage() {
		List<Message> list = new ArrayList<Message>();
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.print("저자> ");
			String writer = scan.nextLine();
			System.out.print("내용> ");
			String content = scan.nextLine();
			Message msg = new Message(i, content, writer, LocalDateTime.now(), 0);
			list.add(msg);
		}
		scan.close();
		return list;
	}
	
}