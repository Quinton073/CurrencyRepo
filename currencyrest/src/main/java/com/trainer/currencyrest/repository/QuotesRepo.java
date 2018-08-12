package com.trainer.currencyrest.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javafx.collections.ObservableList;
import com.trainer.currencyrest.dbUtil.dbConnection;
import com.trainer.currencyrest.model.Currency;
import com.trainer.currencyrest.model.Quotes;


public class QuotesRepo {
	
	
	Quotes quotes = new Quotes();
	Connection conn = null;
	
	public void setQuotes(Quotes quotes) {
		this.quotes = quotes;
		
		storeCurrency(this.quotes);
	}
	
	public void storeCurrency(Quotes quotes){
		
		String sql = "insert into quotes(Source_currency_code, Source_currency_name) values(?,?)";
		
		try
		{
			
		conn = dbConnection.getConnection();
		
		PreparedStatement st = conn.prepareStatement(sql);
		
		st.setString(1, quotes.getSourceCurrencyCode());
		st.setString(2, quotes.getSourceCurrencyName());
		
		st.executeUpdate();
		}catch(Exception e){
			System.out.print(e);
		}		
	}
	private ArrayList<Quotes> data;
	
	public List<Quotes> getAllQuotes(){
		 
		List<Quotes> quotes = new ArrayList<>();
		 String sql = "SELECT * FROM quotes";

	        try {
	        	conn = dbConnection.getConnection();

	            PreparedStatement pst = conn.prepareStatement(sql);
	            ResultSet rs = pst.executeQuery();

	           while(rs.next()){
	        	   Quotes quote = new Quotes();
	        	   quote.setQuoteId(rs.getInt(1));
	        	   quote.setSourceCurrencyCode(rs.getString(2));
	        	   quote.setSourceCurrencyName((rs.getString(3)));
	        	   
	        	   quotes.add(quote);
	        	   
	           }
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		return quotes;
	}

		
	
}
