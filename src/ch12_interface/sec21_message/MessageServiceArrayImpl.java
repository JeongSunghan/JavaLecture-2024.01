package ch12_interface.sec21_message;

import java.time.LocalDateTime; 

public class MessageServiceArrayImpl implements MessageService {
	private Message[] messageArray = new Message[100];
	private int index = 0;
	
	public MessageServiceArrayImpl() {
		messageArray[index++] = new Message(101, "자바 세계의 오신걸 환영합니다.", "제임스")
		messageArray[index++] = new Message(102, "안녕하세요? 반갑습니다.", "마리아")
		messageArray[index++] = new Message(103, "좋은 하루 되세요.", "브라이언")
		messageArray[index++] = new Message(104, "휴먼교육센터에서 강의를 들어보세요.", "엠마")
		messageArray[index++] = new Message(105, "스프링부트도 함꼐 배워요.", "제임스")
	}
	
	
	
}
