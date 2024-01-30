package ch18_io.sec11_message;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MessageServiceFileImpl implements MessageService {
	private List<Message> list = new ArrayList<>();
	private int index = 101;
	private String saveFilename = "c:/Temp/message.ser";
	
	public MessageServiceFileImpl() {
		File saveFile = new File(saveFilename);
		if (saveFile.exists()) {
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(saveFile));
				list = (List<Message>) ois.readObject();
				index += list.size();
				Message msg = list.get(list.size() - 1);
				index = msg.getMid() + 1;
				ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			list.add(new Message(index++, "자바 세계에 오신걸 환영합니다.", "제임스", LocalDateTime.now()));
			list.add(new Message(index++, "안녕하세요? 반갑습니다.", "마리아", LocalDateTime.now()));
			list.add(new Message(index++, "좋은 하루 되세요.", "브라이언", LocalDateTime.now()));
			list.add(new Message(index++, "휴먼교육센터에서 강의를 들어보세요.", "엠마", LocalDateTime.now()));
			list.add(new Message(index++, "스프링부트도 함께 배워요.", "제임스", LocalDateTime.now()));
		}
	}
	
	@Override
	public Message findByMid(int mid) {
		for (Message msg: list)
			if (msg.getMid() == mid)
				return msg;
		return null;
	}

	@Override
	public List<Message> getMessageListAll() {
		List<Message> mList = new ArrayList<>();
		for (Message msg: list) {
			if (msg.getIsDeleted() != MessageService.DELETED)
				mList.add(msg);
		}
		return mList;
	}

	@Override
	public List<Message> getMessageListByWriter(String writer) {
		List<Message> mList = new ArrayList<>();
		for (Message msg: list) {
			if (msg.getIsDeleted() != MessageService.DELETED && msg.getWriter().equals(writer))
				mList.add(msg);
		}
		return mList;
	}

	@Override
	public void insertMessage(Message message) {
		message.setMid(index++);
		message.setModTime(LocalDateTime.now());
		list.add(message);
	}

	@Override
	public void updateMessage(Message message) {
		int index = 0;
		for (Message msg: list) {
			if (msg.getMid() == message.getMid()) {
				index = list.indexOf(msg);
				break;
			}
		}
		message.setModTime(LocalDateTime.now());
		list.set(index, message);
	}

	@Override
	public void deleteMessage(int mid) {
		Message message = null;
		for (Message msg: list) {
			if (msg.getMid() == mid) {
				message = msg;
				break;
			}
		}
		list.remove(message);
	}

	@Override
	public void close() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(saveFilename));
			oos.writeObject(list);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}