package Mysql2.ERD.sec01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex03_UpdateWithParameter {

	public static void main(String[] args) {
		update(2340, "수원", 1200000);
	}

	static void update(int id, String name, int population) {
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world", "hmuser", "hmpass");
			String sql = "update city set name=?, population=? where id=?";
			// Parameter setting
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, population);
			pstmt.setInt(3, id);
			
			// Update 실행 - 반환값이 없는 쿼리
			pstmt.executeUpdate();			// Insert, Delete query도 이렇게 사용
			
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}