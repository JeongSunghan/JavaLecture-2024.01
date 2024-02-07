package Mysql2.sec06_user;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class UserDaoWrong {
	private String connStr;
	private String user;
	private String password;
	private Connection conn;

	public UserDaoWrong() {
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

	public User getUserByUid(String uid) {
		String sql = "select * from users where uid=?";
		User user = new User();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				user.setUid(rs.getString(1));
				user.setPwd(rs.getString(2));
				user.setUname(rs.getString(3));
				user.setEmail(rs.getString(4));
				String regDate = rs.getString(5);
				user.setRegDate(LocalDate.parse(regDate));
				user.setIsDeleted(rs.getInt(6));
			}
			rs.close();
			pstmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;
	}

	public List<User> getUserList(int num, int offset) {
		String sql = "select * from users where isDeleted=0" + "oredr by regDate dsec limit ? offset ?";
		List<User> list = new ArrayList<User>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				User u = new User(rs.getString(1), (rs.getString(2)), (rs.getString(3)), (rs.getString(4)),
						LocalDate.parse(rs.getString(5)), (rs.getInt(6)));
				list.add(u);
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public void insertUser(User user) {
		String sql = "insert users values (?, ?, ?, ?, default)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUid());
			pstmt.setString(2, user.getPwd());
			pstmt.setString(3, user.getUname());
			pstmt.setString(4, user.getEmail());
			
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateUser(User user) {
		String sql = "update users set pwd=?, uname=?, email=?, where uid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getPwd());
			pstmt.setString(2, user.getUname());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getUid());
			
			pstmt.executeUpdate();
			pstmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteUser(String user) {
		String sql = "update users set isDeleted=1 where uid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user);
			
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
