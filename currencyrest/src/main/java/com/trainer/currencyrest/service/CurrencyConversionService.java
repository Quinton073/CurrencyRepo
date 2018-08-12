package com.trainer.currencyrest.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyConversionService {
	
	public static void main(String[] args){
		try{
			CurrencyConversionService.currencyConversion();
		}catch (Exception e){
				System.out.println(e);
			}
		}
	
	
	public static void currencyConversion() throws Exception{
		
		String key = "0e5fc512f4e8a02dc7a7a5b185a24e09";
		
		String url = "http://apilayer.net/api/live?access_key="+key+"&format=1";
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", "Mozilla/5.0");
		int responseCode = con.getResponseCode();
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while((inputLine = in.readLine()) != null){
			response.append(inputLine);
		}
	}
}
