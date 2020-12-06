package com.ss.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {

	public Connection getConnect() throws Exception {
		//1. DB연결정보
		String user="hr";
		String pw="tiger";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		
		//2. driver를 메모리에 로딩
		Class.forName(driver);
		
		System.out.println("드라이버 연결성공");
		
		//3. DB로그인 Connection 객체반환
		Connection con = DriverManager.getConnection(url, user, pw);
		System.out.println(con);
				
		return con;
		
	}
}
