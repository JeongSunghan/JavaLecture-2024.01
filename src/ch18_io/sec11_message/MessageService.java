package ch18_io.sec11_message;

import java.util.List;

public interface MessageService {
	int DELETED = 1;
	
	Message findByMid(int mid);
	
	List<Message> getMessageListAll();
	
	List<Message> getMessageListByWriter(String writer);
	
	void insertMessage(Message message);
	
	void updateMessage(Message message);
	
	void deleteMessage(int mid);
	
	void close();
	
}