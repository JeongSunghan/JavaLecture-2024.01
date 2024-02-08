package Mysql2.sec07_bbs.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import Mysql2.sec07_bbs.entity.Reply;

public class ReplyDao {
	private String connStr;
	private String user;
	private String password;
	private Connection conn;

	public ReplyDao() {
		String path = "C:/Workspace/Java/lesson/src/Mysql2/sec07_bbs/Mysql.properties";
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

	public Reply getReply(int rid) {

		return null;
	}

	public List<Reply> getReplyList(int bid) {
		String sql = "SELECT r.*, u.uname FROM reply r"
				+ "	JOIN users u ON r.uid=u.uid"
				+ "	WHERE r.bid=?"
				+ "	ORDER BY rid";
		List<Reply>	list = new ArrayList<Reply>();
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, bid);
				
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					Reply r = new Reply(rs.getInt(1), rs.getString(2),
							LocalDateTime.parse(rs.getString(3).replace(" ", "T")),
							rs.getString(4), rs.getInt(5), rs.getString(6));
					
					list.add(r);
				}				
				rs.close(); pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		return list;
	}
	
	public void insertReply(Reply reply) {
		String sql = "INSERT INTO reply VALUES (DEFAULT, ?, DEFAULT, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, reply.getComment());
			pstmt.setString(2, reply.getUid());
			pstmt.setInt(3, reply.getBid());
			
			pstmt.executeUpdate();
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
