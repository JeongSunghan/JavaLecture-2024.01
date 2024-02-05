package Mysql2.ERD.sec02_kcity;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/*
 * City DAO(Data Access Object) - DB Table을 다루는 라이브러리
 * 		Select, Insert, Update, Delete 를 처리하는 프로그램
 * */
public class CityDao {
	private String connStr;
	private String user;
	private String password;
	
	public CityDao() {
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection myConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(connStr, user, password);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	//id값을 주면 city값을 반환
	public City getCityById(int id) {
		Connection conn = myConnection();
		String sql = "select * from kcity where id=?";
		City city = new City();
		try {
			//파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			//셀렉트 실행하고 결과 받기
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				city.setId(rs.getInt(1));
				city.setName(rs.getString(2));
				city.setCountryCode(rs.getString(3));
				city.setDistrict(rs.getString(4));
				city.setPopulation(rs.getInt(5));
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return city;
	}
}
