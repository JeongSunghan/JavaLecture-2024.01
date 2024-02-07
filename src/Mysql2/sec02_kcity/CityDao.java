package Mysql2.sec02_kcity;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * City DAO(Data Access Object) - DB table을 다루는 라이브러리
 * 		Select, Insert, Update, Delete 를 처리하는 프로그램
 */
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
	
	private Connection myConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public City getCityById(int id) {
		Connection conn = myConnection();
		String sql = "select * from kcity where id=?";
		City city = new City();			// 방법 1
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			// 셀렉트 실행하고 결과 받기
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				city.setId(rs.getInt(1));				// 방법 1
				city.setName(rs.getString(2));			// 방법 1
				city.setCountryCode(rs.getString(3));	// 방법 1
				city.setDistrict(rs.getString(4));		// 방법 1
				city.setPopulation(rs.getInt(5));		// 방법 1
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return city;
	}
	
	public City getCityByName(String name) {
		Connection conn = myConnection();
		String sql = "select * from kcity where name=?";
		City city = null;				// 방법 2
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			// Select 실행하고 결과를 ResultSet으로 받기
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				city = new City(rs.getInt(1), rs.getString(2), rs.getString(3), 
								rs.getString(4), rs.getInt(5));		// 방법 2
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return city;
	}
	
	public List<City> getCityListAll() {
		Connection conn = myConnection();
		String sql = "select * from kcity";
		List<City> list = new ArrayList<City>();
		try {
			Statement stmt = conn.createStatement();
			// Select 실행하고 결과를 ResultSet으로 받기
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				City city = new City(rs.getInt(1), rs.getString(2), rs.getString(3), 
									 rs.getString(4), rs.getInt(5));
				list.add(city);
			}
			rs.close(); stmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<City> getCityListByDistrict(String district) {
		Connection conn = myConnection();
		String sql = "select * from kcity where district=?";
		List<City> list = new ArrayList<City>();
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, district);
			// Select 실행하고 결과를 ResultSet에 담기
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				City city = new City(rs.getInt(1), rs.getString(2), rs.getString(3), 
						 rs.getString(4), rs.getInt(5));
				list.add(city);			
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void insertCity(City city) {
		Connection conn = myConnection();
		String sql = "insert into kcity values(default, ?, ?, ?, ?)";
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, city.getName());
			pstmt.setString(2, city.getCountryCode());
			pstmt.setString(3, city.getDistrict());
			pstmt.setInt(4, city.getPopulation());
			
			// SQL 실행
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateCity(City city) {
		Connection conn = myConnection();
		String sql = "update kcity set name=?, countrycode=?, district=?, population=? where id=?";
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, city.getName());
			pstmt.setString(2, city.getCountryCode());
			pstmt.setString(3, city.getDistrict());
			pstmt.setInt(4, city.getPopulation());
			pstmt.setInt(5, city.getId());
			
			// SQL 실행
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteCity(int id) {
		Connection conn = myConnection();
		String sql = "delete from kcity where id=?";
		try {
			// 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			// SQL 실행
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}