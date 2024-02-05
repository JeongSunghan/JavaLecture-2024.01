package Mysql2.ERD.sec01_basic;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Ex04_Properties {

	public static void main(String[] args) {
		//절대경로
		Properties prop = new Properties();			//Map<String, String>
				String path = "C:/Workspace/Java/lesson/src/Mysql2/SQL/Mysql.properties";
				try {
					InputStream is = new FileInputStream(path);
					prop.load(is);
					is.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				String host = prop.getProperty("host");
				String port = prop.getProperty("port");
				String database = prop.getProperty("database");
				String user = prop.getProperty("user");
				String password = prop.getProperty("password");
						
				String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
				System.out.println(connStr);
				System.out.println("DriverManger.GetConnection(connStr, user, password);");
	}

	//국내 테이블 생성
//	CREATE TABLE if NOT EXISTS kcity like city
//	INSERT INTO kcity
//	SELECT * FROM city WHERE countrycode = 'KOR'

}
