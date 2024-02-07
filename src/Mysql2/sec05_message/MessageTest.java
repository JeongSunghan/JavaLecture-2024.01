package Mysql2.sec05_message;

import java.util.List;

public class MessageTest {
			//MessageDao 테스트

	public static void main(String[] args) {
		
		//기본 메세지 출력
		MessageDao msgDao = new MessageDao() ;
		Message msg = msgDao.getMessageByMid(101);
		System.out.println(msg);
		System.out.println("=============================");
		
		//메세지 추가		
//		msg = new Message("집에 가고싶다.", "브라이언");
//		msgDao.insertMessage(msg);
		
		//메세지 업데이트
//		msg = msgDao.getMessageByMid(108);
//		msg.setContent("MessageDao 프로그램을 완성시키고 싶어요.");
//		msgDao.updateMessage(msg);
		
//		msgDao.deleteMessage(109);
				
		//메세지 나열
		List<Message> list = msgDao.getMessaListByWriter("브라이언");
		list.forEach(x -> System.out.println(x));
		
		msgDao.close();


	}

}
