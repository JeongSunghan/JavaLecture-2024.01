package Mysql2.sec03_song;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SongDao {
	private String connStr;
	private String user;
	private String password;
	private Connection conn;
	
	public SongDao() {
		String path = "C:/Workspace/Java/lesson/src/Mysql2/SQL/Mysql.properties";
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream(path));
			
			String host = prop.getProperty("host");
			String port = prop.getProperty("port");
			String database = prop.getProperty("database");
			this.connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			this.user = prop.getProperty("user");
			this.password = prop.getProperty("password");
			this.conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Song getSongBySid(int sid) {
		String sql = "select * from song where sid=?";
		Song song = null;
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sid);
			
			// SQL 실행 후 결과를 ResultSet에 받기
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				sid = rs.getInt(1);
				String title = rs.getString(2);
				String lyrics = rs.getString(3);
				song = new Song(sid, title, lyrics);
			}
			rs.close(); pstmt.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return song;
	}

	public Song getSongByTitle(String title) {
		String sql = "select * from song where title like ?";
		Song song = null;
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + title + "%");			// %별빛% - 제목에 별빛 검색
			
			// SQL 실행 후 결과를 ResultSet에 받기
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int sid = rs.getInt(1);
				title = rs.getString(2);
				String lyrics = rs.getString(3);
				song = new Song(sid, title, lyrics);
			}
			rs.close(); pstmt.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return song;
	}
	
	public List<Song> getSongListAll() {
		String sql = "select * from song";
		List<Song> list = new ArrayList<Song>();
		try {
			Statement stmt = conn.createStatement();
			// SQL 실행 후 결과를 ResultSet에 받기
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int sid = rs.getInt(1);
				String title = rs.getString(2);
				String lyrics = rs.getString(3);
				Song song = new Song(sid, title, lyrics);
				list.add(song);
			}
			rs.close(); stmt.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void insertSong(Song song) {
		String sql = "insert song values(default, ?, ?)";
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, song.getTitle());
			pstmt.setString(2, song.getLyrics());
			
			// SQL 실행
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateSong(Song song) {
		String sql = "update song set title=?, lyrics=? where sid=?";
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, song.getTitle());
			pstmt.setString(2, song.getLyrics());
			pstmt.setInt(3, song.getSid());
			
			// SQL 실행
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
	public void deleteSong(int sid) {
		String sql = "delete from song where sid=?";
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sid);
			
			// SQL 실행
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}