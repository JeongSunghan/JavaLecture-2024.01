package Mysql2.sec07_bbs.dao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.View;

import Mysql2.sec07_bbs.entity.Board;

public class BoardDaoTest {
	
	public static void main(String[] args) {
		BoardDao bDao = new BoardDao();
		String sessionUid = "james";	//제임스(	본인)이 로그인한 것으로 가정
		
		Board b = bDao.getBoard(10);
		if (!b.getUid().equals(sessionUid))		//제임스(본인)이 작성한 글이 아니면 
			bDao.increaseCount("view", 12);
		System.out.println(b);
		
//		Board b = bDao.getBoard(1);
//		System.out.println(b);
		
//		b = new Board("제목 11", "본문 11", "james");
//		bDao.insertBoard(b);
//		b = new Board("제목 12", "본문 12", "james");
//		bDao.insertBoard(b);
//		b = new Board("제목 13", "본문 13", "maria");
//		bDao.insertBoard(b);
//		b = new Board("제목 14", "본문 14", "sarah");
//		bDao.insertBoard(b);
//		b = new Board("제목 15", "본문 15", "brian");
//		bDao.insertBoard(b);
		
		List<Board> list = bDao.getBoardsList("title", "%", 20, 0);
		list.forEach(x -> System.out.println(x.listForm()));
		System.out.println("==============================");
		
		
//		list = bDao.getBoardsList("b.uid", "james", 10, 0);
//		list.forEach(x -> System.out.println(x.listForm()));
//		System.out.println("==============================");
//		
//		list = bDao.getBoardsList("uname", "마리아", 10, 0);
//		list.forEach(x -> System.out.println(x.listForm()));
//		System.out.println("==============================");
		
		bDao.close();
	}

}
