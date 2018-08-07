package com.trainer.currencyrest;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class CurrencyRepository {

	List<Currency> currency;
	Connection con = null;
	
	public CurrencyRepository(){
		String url = "jdbc:mysql://localhost:3306/currencyrest";
		String username="root";
		String password = "0";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url,username,password);
		}catch(Exception e){
			System.out.print(e);
		}
		
	}
	
	public List<Currency> getCurrency(){
		return currency;
	}
	
	public Currency convertCurrency(String currencyCode){
		for(Currency c : currency)
		{
			if(c.getCurrencyCode()==currencyCode)
				return c;
		}
		return new Currency();
	}

	public void create(Currency curr1) {
		currency.add(curr1);
		
	}
}
