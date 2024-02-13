package Mysql2.sec07_bbs.service;

import java.util.List;

import Mysql2.sec07_bbs.dao.BoardDao;
import Mysql2.sec07_bbs.dao.ReplyDao;
import Mysql2.sec07_bbs.entity.Board;
import Mysql2.sec07_bbs.entity.Reply;

public class BoardServiceMySQLImpl implements BoardService {
	private String sessionUid = "james";	// james로 로그인 하였다고 가정
	private BoardDao bDao = new BoardDao();
	private ReplyDao rDao = new ReplyDao();

	@Override
	public List<Board> getBoardList(int page, String field, String query) {
		int offset = (page - 1) * COUNT_PER_PAGE;
		if (field == null || field.equals("")) {
			field = "title"; query = "%";
		}
		List<Board> list = bDao.getBoardList(field, query, COUNT_PER_PAGE, offset);
		return list;
	}

	@Override
	public Board getBoard(int bid) {
		Board board = bDao.getBoard(bid);
		if (!board.getUid().equals(sessionUid)) {
			bDao.increaseCount("view", bid);
			board.setViewCount(board.getViewCount() + 1);
		}
		List<Reply> list = rDao.getReplyList(bid);
		if (list.size() > 0)
			board.setReplyList(list);
		return board;
	}

	@Override
	public void insertBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(int bid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		bDao.close();
		rDao.close();
	}

}