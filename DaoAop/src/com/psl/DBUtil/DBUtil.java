package com.psl.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection con = null;
	public static Connection getConnection() throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/test";
		String Driver="com.mysql.jdbc.Driver";
		String username="root";
		String password="root";
		Class.forName(Driver);
		con=DriverManager.getConnection(url,username,password);
		return con;
	}
	public void closeConnection() throws SQLException {
		// TODO Auto-generated method stub
		con.close();
	}
}
