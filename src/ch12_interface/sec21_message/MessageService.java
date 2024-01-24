package ch12_interface.sec21_message;

public interface MessageService {
	int DELETED = 1;

	Message findByMid(int mid);

	void messageList();

	void messageListByWriter(String writer);

	void insertMessage(Message message);

	void updateMessage(Message message);

	void deleteMessage(int mid);

}
