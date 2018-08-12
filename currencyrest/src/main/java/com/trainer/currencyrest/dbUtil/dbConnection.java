package com.trainer.currencyrest.dbUtil;

import java.sql.*;

public class dbConnection
{
	

	private static final String url ="jdbc:mysql://localhost:3307/currencyrest";
	private static final String uname = "trainer";
	private static final String pass = "1234";
	
	//String sql = "select Country_name from currency where Currency_code=98";
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
	return DriverManager.getConnection(url,uname,pass);
	}
	
	//Statement st = con.createStatement();
	//ResultSet rs = st.executeQuery(sql);
	
	//rs.next();
	//String name = rs.getString("Country_name");
	
	 //System.out.println(name);
	
	//st.close();
	//con.close();
	

}