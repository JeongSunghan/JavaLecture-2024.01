package Mysql2.sec05_message;

import java.time.LocalDateTime;

public class Message {
	private int mid;
	private String content;
	private String writer;
	private LocalDateTime modTime;
	private int isDeleted;
	
	public Message() { }
	// for Insert
	public Message(String content, String writer) {
		this.content = content;
		this.writer = writer;
	}
	// for Update
	public Message(int mid, String content, String writer) {
		this.mid = mid;
		this.content = content;
		this.writer = writer;
	}
	// for Read
	public Message(int mid, String content, String writer, LocalDateTime modTime) {
		this.mid = mid;
		this.content = content;
		this.writer = writer;
		this.modTime = modTime;
	}
	public Message(int mid, String content, String writer, LocalDateTime modTime, int isDeleted) {
		this.mid = mid;
		this.content = content;
		this.writer = writer;
		this.modTime = modTime;
		this.isDeleted = isDeleted;
	}
	
	
	
	
	public Message(String string, LocalDateTime now, int i) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("%d  %s  %s  %s", mid, content, writer, 
							modTime.toString().replaceAll("T", " ").substring(0, 16));
	}
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public LocalDateTime getModTime() {
		return modTime;
	}
	public void setModTime(LocalDateTime modTime) {
		this.modTime = modTime;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
}
