package ch12_interface.sec21_message;

import java.time.LocalDateTime;

public class MessageServiceArrayImpl implements MessageService {
	private Message[] messageArray = new Message[100];
	private int index = 0;

	public MessageServiceArrayImpl() {
		messageArray[index++] = new Message(101, "자바 세계의 오신걸 환영합니다.", "제임스", LocalDateTime.now());
		messageArray[index++] = new Message(102, "안녕하세요? 반갑습니다.", "마리아", LocalDateTime.now());
		messageArray[index++] = new Message(103, "좋은 하루 되세요.", "브라이언", LocalDateTime.now());
		messageArray[index++] = new Message(104, "휴먼교육센터에서 강의를 들어보세요.", "엠마", LocalDateTime.now());
		messageArray[index++] = new Message(105, "스프링부트도 함꼐 배워요.", "제임스", LocalDateTime.now());
	}

	@Override
	public Message findByMid(int mid) {
		for (Message msg : messageArray) {
			if (msg == null)
				break;
			if (mid == msg.getMid())
				return msg;
		}
		return null;
	}

	@Override
	public void messageList() {
		for (Message msg : messageArray) {
			if (msg == null)
				break;
			if (msg.getIsDeleted() != MessageService.DELETED)
				System.out.println(msg);
		}

	}

	@Override
	public void messageListByWriter(String writer) {
		for (Message msg : messageArray) {
			if (msg == null)
				break;
			if (msg.getWriter().equals(writer) && msg.getIsDeleted() != MessageService.DELETED)
				System.out.println(msg);
		}

	}

	@Override
	public void insertMessage(Message message) {
		int mid = 101 + index;
		message.setMid(mid);
		message.setGenTime(LocalDateTime.now());
		messageArray[index++] = message;

	}

	@Override
	public void updateMessage(Message message) {
		for (int i = 0; i < messageArray.length; i++) {
			if (messageArray[i] == null)
				break;
			if (messageArray[i].getMid() == message.getMid()) {
				messageArray[i] = message;
				return;
			}
		}
	}

	@Override
	public void deleteMessage(int mid) {
		Message msg = findByMid(mid);
		if (msg != null)
			msg.setIsDeleted(MessageService.DELETED);
	}

}
