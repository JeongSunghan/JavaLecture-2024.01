package praticeExam.Collection.Col7;


import java.util.ArrayList;
import java.util.List;

import ch17_collection.part1_list.sec03_Message.Message;

public class BoardDao {
			Board boadr1 = new Board("제목1", "내용1");
			Board boadr2 = new Board("제목1", "내용1");
			Board boadr3 = new Board("제목1", "내용1");
			

	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		list.add(boadr1);
		list.add(boadr2);
		list.add(boadr3);
		return list;
	}

}
