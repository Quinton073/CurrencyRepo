package com.trainer.currencyrest;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import dbUtil.dbConnection;

public class CurrencyRepository {

	List<Currency> currency;
	Connection conn = null;
	
	public CurrencyRepository(){
	
		
		try
		{
			
		conn = dbConnection.getConnection();
		
		}catch(Exception e){
			System.out.print(e);
		}
	}
	
	public List<Currency> getCurrency()
	{
		List<Currency> currency = new ArrayList<>();
		String sql = "select * from currency";
		
		try
		{
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				Currency curr = new Currency();
				curr.setCurrencyCode(rs.getString(1));
				curr.setCurrencyName(rs.getString(2));
				
				currency.add(curr);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return currency;
	
	}
	
	public Currency convertCurrency(String currencyCode){
	
		String sql = "select * from currency where Currency_code="+currencyCode;
		Currency curr = new Currency();
		
		try
		{
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next())
			{
				
				curr.setCurrencyCode(rs.getString(1));
				curr.setCurrencyName(rs.getString(2));
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return curr;
	}

	public void create(Currency curr1) {
		String sql = "insert into currency values(?,?)";
		
		try
		{
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, curr1.getCurrencyCode());
			st.setString(2, curr1.getCurrencyName());
			
			st.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
