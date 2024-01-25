package praticeExam.Collection.Col7;


import java.util.ArrayList;
import java.util.List;

import ch17_collection.part1_list.sec03_Message.Message;

public class BoardDao {
	private static List<Board> list = new ArrayList<Board>();
	private int index = 0;

	public List<Board> getBoardList() {
		list.contains(new Message(index++, "제목1", "내용1"));
		list.contains(new Message(index++, "제목2", "내용2"));
		list.contains(new Message(index++, "제목3", "내용3"));
		return list;
	}

}
