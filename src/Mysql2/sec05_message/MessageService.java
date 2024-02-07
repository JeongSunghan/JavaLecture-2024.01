package Mysql2.sec05_message;

import java.util.List;

public interface MessageService {
	int DELETED = 1;
	
	Message findByMid(int mid);
	
	List<Message> getMessageListAll();
	
	List<Message> getMessageListByWriter(String writer);
	
	void insertMessage(Message message);
	
	void updateMessage(Message message);
	
	void deleteMessage(int mid);
	
	//앱은 dao가 아닌 interface method를 사용
}
