package Mysql2.sec07_bbs.service;

import java.util.List;

import Mysql2.sec07_bbs.entity.Board;

public interface BoardService {
	public static final int COUNT_PER_PAGE = 10;

	List<Board> getBoardList(int page, String field, String query);
	
	Board getBoard(int bid);
	
	void insertBoard(Board board);
	
	void updateBoard(Board board);
	
	void deleteBoard(int bid);
	
	void close();
	
}